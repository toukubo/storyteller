package net.mazdasalestool.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.mazdasalestool.model.*;
import net.mazdasalestool.beans.*;


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


public class PostBaseDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Base base = new BaseImpl();
		BaseForm baseform = new BaseForm();
		Criteria criteria = session.createCriteria(Base.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			base = (Base) criteria.uniqueResult();
			new CopyProperties(base,baseform);
		} else if(req.getAttribute("form")!=null){
                        baseform = (BaseForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(baseform.getId()));
			base = (Base) criteria.uniqueResult();
		}
		

		req.setAttribute("model",base);
		req.setAttribute("form",baseform);


                  Criteria criteriaPrefecture= session.createCriteria(Prefecture.class);
			req.setAttribute("Prefectures", criteriaPrefecture.list());

Criteria criteriaBlock= session.createCriteria(Block.class);
			req.setAttribute("Blocks", criteriaBlock.list());

 
		
		return mapping.findForward("success");
	}
	
	
}