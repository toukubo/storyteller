package net.storyteller.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.storyteller.model.*;
import net.storyteller.model.crud.*;

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


public class PostAttrDetailAboutJapaneseAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Attr attr = new AttrImpl();
		AttrForm attrform = new AttrForm();
		Criteria criteria = session.createCriteria(Attr.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			attr = (Attr) criteria.uniqueResult();
			new CopyProperties(attr,attrform);
		} else if(req.getAttribute("form")!=null){
                        attrform = (AttrForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(attrform.getId()));
			attr = (Attr) criteria.uniqueResult();
		}
		

		req.setAttribute("model",attr);
		req.setAttribute("form",attrform);


                   
		
		return mapping.findForward("success");
	}
	
	
}