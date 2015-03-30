package net.gasaccounting.web.app;

import net.gasaccounting.model.*;
import net.gasaccounting.beans.*;

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


public class PostTransitVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Transit transit = new TransitImpl();
		TransitForm transitform = (TransitForm) form;

                String error = "";


                		Integer taskInt = transitform.getTask();
		transitform.setTask(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(transitform.getId() == null || transitform.getId().intValue() == 0){
			transit.setId(null);
			transitform.setId(null);
		}else{
			transit.setId(transitform.getId());
			Criteria criteria = session.createCriteria(Transit.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			transit = (Transit) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(transit);
                		Criteria criteria2 = session.createCriteria(Task.class);
		criteria2.add(Restrictions.idEq(taskInt));
		Task task = (Task) criteria2.uniqueResult();
		transit.setTask(task);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(transit);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostTransitDetail.do", transit.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Transits.do", transit.getId().toString());
		return null;

		
	}
	
	
}