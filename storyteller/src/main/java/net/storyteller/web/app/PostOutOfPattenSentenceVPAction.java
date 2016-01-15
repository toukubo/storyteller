package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.StringFullfiller;
import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class PostOutOfPattenSentenceVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		OutOfPattenSentence outOfPattenSentence = new OutOfPattenSentenceImpl();
		OutOfPattenSentenceForm outOfPattenSentenceform = (OutOfPattenSentenceForm) form;

                String error = "";


                		Integer j2eeStoryInt = outOfPattenSentenceform.getJ2eeStory();
		outOfPattenSentenceform.setJ2eeStory(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(outOfPattenSentenceform.getId() == null || outOfPattenSentenceform.getId().intValue() == 0){
			outOfPattenSentence.setId(null);
			outOfPattenSentenceform.setId(null);
		}else{
			outOfPattenSentence.setId(outOfPattenSentenceform.getId());
			Criteria criteria = session.createCriteria(OutOfPattenSentence.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			outOfPattenSentence = (OutOfPattenSentence) criteria.uniqueResult();

		}
                		outOfPattenSentence.setName(outOfPattenSentenceform.getName());
		outOfPattenSentence.setEstimatedtime(outOfPattenSentenceform.getEstimatedtime());


		
		StringFullfiller.fullfil(outOfPattenSentence);
                		Criteria criteria2 = session.createCriteria(J2eeStory.class);
		criteria2.add(Restrictions.idEq(j2eeStoryInt));
		J2eeStory j2eestory = (J2eeStory) criteria2.uniqueResult();
		outOfPattenSentence.setJ2eeStory(j2eestory);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(outOfPattenSentence);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostOutOfPattenSentenceDetail.do", outOfPattenSentence.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "OutOfPattenSentences.do", outOfPattenSentence.getId().toString());
		return null;

		
	}
	
	
}