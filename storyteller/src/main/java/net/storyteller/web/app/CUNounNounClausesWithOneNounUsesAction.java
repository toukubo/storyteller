package net.storyteller.web.app;

import java.util.Iterator;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.enclosing.util.StringFullfiller;
import net.storyteller.model.Noun;
import net.storyteller.model.NounClause;
import net.storyteller.model.NounClauseImpl;
import net.storyteller.model.NounUse;
import net.storyteller.model.NounUseImpl;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CUNounNounClausesWithOneNounUsesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		Criteria criteria = session.createCriteria(Noun.class);
		Vector vector = new Vector();
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Noun noun = (Noun) iter.next();
			
			
			boolean alreadyexists = false;
			Criteria criteria2 = session.createCriteria(NounClause.class);
			for (Iterator iterator = criteria2.list().iterator(); iterator.hasNext();) {
				NounClause clause = (NounClause) iterator.next();
				if(clause.getOfuse().size() ==1 && ((NounUse)clause.getOfuse().toArray()[0]).getNoun().getId().intValue() == noun.getId().intValue()){
					alreadyexists = true;
					break;
				}
			}
			
			if(alreadyexists == false){
				Transaction transaction = session.beginTransaction();
				NounClause newNounClause = new  NounClauseImpl();
				StringFullfiller.fullfil(newNounClause);
				session.saveOrUpdate(newNounClause);
				transaction.commit();
				session.flush();

				
				transaction = session.beginTransaction();
				NounUse nounUse = new NounUseImpl();
				nounUse.setNoun(noun);
				nounUse.setNounClause(newNounClause);
				nounUse.setOforder(1);
				nounUse.setMutiple(true);
				session.save(nounUse);
				transaction.commit();
				session.flush();
				
			}
		}
		req.setAttribute("nouns",vector);
		session.flush();
		
		
		
		return mapping.findForward("success");
	}
	
	
}
