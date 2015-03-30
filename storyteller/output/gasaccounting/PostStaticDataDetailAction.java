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


public class PostStaticDataDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		StaticData staticdata = new StaticDataImpl();
		StaticDataForm staticdataform = new StaticDataForm();
		Criteria criteria = session.createCriteria(StaticData.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			staticdata = (StaticData) criteria.uniqueResult();
			new CopyProperties(staticdata,staticdataform);
		} else if(req.getAttribute("form")!=null){
                        staticdataform = (StaticDataForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(staticdataform.getId()));
			staticdata = (StaticData) criteria.uniqueResult();
		}
		

		req.setAttribute("model",staticdata);
		req.setAttribute("form",staticdataform);


                   
		
		return mapping.findForward("success");
	}
	
	
}