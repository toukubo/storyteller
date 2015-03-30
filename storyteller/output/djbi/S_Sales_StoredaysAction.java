package net.djbi.web.app;

import net.djbi.model.*;
import net.djbi.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import java.util.Date;

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


public class S_Sales_StoredaysAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="S_Sales_StoredaysAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(S_Sales_Storeday.class);
                




























		req.setAttribute("s_Sales_Storedays",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			S_Sales_Storeday s_Sales_Storeday = (S_Sales_Storeday) iter.next();
//			vector.add(s_Sales_Storeday);
//		}
		S_Sales_Storeday s_Sales_Storeday = new S_Sales_StoredayImpl();
		S_Sales_StoredayForm s_Sales_Storedayform = new S_Sales_StoredayForm();
		criteria = session.createCriteria(S_Sales_Storeday.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			s_Sales_Storeday = (S_Sales_Storeday) criteria.uniqueResult();
			new CopyProperties(s_Sales_Storeday,s_Sales_Storedayform);
		} else if(req.getAttribute("form")!=null){
                        s_Sales_Storedayform = (S_Sales_StoredayForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(s_Sales_Storedayform.getId()));
			s_Sales_Storeday = (S_Sales_Storeday) criteria.uniqueResult();
		}
		

		req.setAttribute("model",s_Sales_Storeday);
		req.setAttribute("form",s_Sales_Storedayform);
		
		
//</snippet>

                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}