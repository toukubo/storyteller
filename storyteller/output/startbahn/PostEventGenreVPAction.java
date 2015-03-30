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


public class PostEventGenreVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		EventGenre eventGenre = new EventGenreImpl();
		EventGenreForm eventGenreform = (EventGenreForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(eventGenreform.getId() == null || eventGenreform.getId().intValue() == 0){
			eventGenre.setId(null);
			eventGenreform.setId(null);
		}else{
			eventGenre.setId(eventGenreform.getId());
			Criteria criteria = session.createCriteria(EventGenre.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			eventGenre = (EventGenre) criteria.uniqueResult();

		}
                		eventGenre.setName(eventGenreform.getName());


		
		StringFullfiller.fullfil(eventGenre);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(eventGenre);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostEventGenreDetail.do", eventGenre.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "EventGenres.do", eventGenre.getId().toString());
		return null;

		
	}
	
	
}