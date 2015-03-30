package net.ja.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.ja.model.*;
import net.ja.beans.*;


import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import net.enclosing.util.HibernateSession;
import net.storyteller.desktop.CopyProperties;


public class PostLabelDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Label label = new LabelImpl();
		LabelForm labelform = new LabelForm();
		Criteria criteria = session.createCriteria(Label.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			label = (Label) criteria.uniqueResult();
			new CopyProperties(label,labelform);
		} else if(req.getAttribute("form")!=null){
                        labelform = (LabelForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(labelform.getId()));
			label = (Label) criteria.uniqueResult();
		}
		

		req.setAttribute("model",label);
		req.setAttribute("form",labelform);


                  Criteria criteriaComponent= session.createCriteria(Component.class);
			req.setAttribute("Components", criteriaComponent.list());

 
		
		return mapping.findForward("success");
	}
	
	
}