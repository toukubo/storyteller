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


public class PostPageLayoutDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		PageLayout pageLayout = new PageLayoutImpl();
		PageLayoutForm pageLayoutform = new PageLayoutForm();
		Criteria criteria = session.createCriteria(PageLayout.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			pageLayout = (PageLayout) criteria.uniqueResult();
			new CopyProperties(pageLayout,pageLayoutform);
		} else if(req.getAttribute("form")!=null){
                        pageLayoutform = (PageLayoutForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(pageLayoutform.getId()));
			pageLayout = (PageLayout) criteria.uniqueResult();
		}
		

		req.setAttribute("model",pageLayout);
		req.setAttribute("form",pageLayoutform);


                   
		
		return mapping.findForward("success");
	}
	
	
}