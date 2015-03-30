package net.GKNJR003.web.app;

import net.GKNJR003.model.*;
import net.GKNJR003.model.crud.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
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

public class MS_COPsambadasAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		BeanFactory factory = WebApplicationContextUtils
				.getWebApplicationContext(this.getServlet().getServletContext());
		SessionFactory sessionFactory = (SessionFactory) factory
				.getBean("sessionFactory");
		Session session = sessionFactory.openSession();
                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(MS_COP.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			MS_COP mS_COP = (MS_COP) iter.next();
			vector.add(mS_COP);
		}
		MS_COP mS_COP = new MS_COPImpl();
		Criteria criteria2 = session.createCriteria(MS_COP.class);

		if (req.getParameter("id") != null
				&& !req.getParameter("id").equals("")) {
			criteria2.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			mS_COP = (MS_COP) criteria2.uniqueResult();

		} else if (req.getAttribute("id") != null
				&& !req.getAttribute("id").equals("")) {
			criteria2.add(Restrictions.idEq(req.getAttribute("id")));
			mS_COP = (MS_COP) criteria2.uniqueResult();
		}

		req.setAttribute("mS_COP",mS_COP);

		
		req.setAttribute("mS_COPs",vector);
		
		return mapping.findForward("success");
	}
	
	
}