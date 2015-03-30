package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

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


public class PostActionHistoryVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ActionHistory actionHistory = new ActionHistoryImpl();
		ActionHistoryForm actionHistoryform = (ActionHistoryForm) form;

                String error = "";


                		Integer artistInt = actionHistoryform.getArtist();
		actionHistoryform.setArtist(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(actionHistoryform.getId() == null || actionHistoryform.getId().intValue() == 0){
			actionHistory.setId(null);
			actionHistoryform.setId(null);
		}else{
			actionHistory.setId(actionHistoryform.getId());
			Criteria criteria = session.createCriteria(ActionHistory.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			actionHistory = (ActionHistory) criteria.uniqueResult();

		}
                		actionHistory.setDescription(actionHistoryform.getDescription());
		actionHistory.setDate(actionHistoryform.getDate());


		
		StringFullfiller.fullfil(actionHistory);
                		Criteria criteria2 = session.createCriteria(Artist.class);
		criteria2.add(Restrictions.idEq(artistInt));
		Artist artist = (Artist) criteria2.uniqueResult();
		actionHistory.setArtist(artist);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(actionHistory);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostActionHistoryDetail.do", actionHistory.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "ActionHistorys.do", actionHistory.getId().toString());
		return null;

		
	}
	
	
}