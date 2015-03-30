package net.startbahn.web;

import net.startbahn.model.*;
import net.startbahn.model.crud.*;

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

public class ActionHistoryVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ActionHistory actionHistory = new ActionHistoryImpl();
		ActionHistoryForm actionHistoryform = (ActionHistoryForm) form;
		
                		Integer artistInt = actionHistoryform.getArtist();
		actionHistoryform.setArtist(null);

		
		BeanUtils.copyProperties(actionHistory,actionHistoryform);
		StringFullfiller.fullfil(actionHistory);
		if(actionHistoryform.getId() == null || actionHistoryform.getId().intValue() == 0){
			actionHistory.setId(null);
		}else{
			actionHistory.setId(actionHistoryform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Artist.class);
		criteria2.add(Restrictions.idEq(artistInt));
		Artist artist = (Artist) criteria2.uniqueResult();
		actionHistory.setArtist(artist);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(actionHistory);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "ActionHistoryDetail.do", actionHistory.getId().toString());
		return null;

		
	}
	
	
}