package net.gasaccounting.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.gasaccounting.model.*;
import net.gasaccounting.model.crud.*;

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


public class PostComponeyDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Componey componey = new ComponeyImpl();
		ComponeyForm componeyform = new ComponeyForm();
		Criteria criteria = session.createCriteria(Componey.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			componey = (Componey) criteria.uniqueResult();
			new CopyProperties(componey,componeyform);
		} else if(req.getAttribute("form")!=null){
                        componeyform = (ComponeyForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(componeyform.getId()));
			componey = (Componey) criteria.uniqueResult();
		}
		

		req.setAttribute("model",componey);
		req.setAttribute("form",componeyform);


                   
		
		return mapping.findForward("success");
	}
	
	
}