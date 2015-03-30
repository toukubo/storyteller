package net.mazdasalestool.web.app;

import net.mazdasalestool.model.*;
import net.mazdasalestool.beans.*;

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


import net.enclosing.util.HibernateSession;
import net.storyteller.desktop.CopyProperties;


public class GroupOfCarLinesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(GroupOfCarLine.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			GroupOfCarLine groupOfCarLine = (GroupOfCarLine) iter.next();
			vector.add(groupOfCarLine);
		}
		GroupOfCarLine groupOfCarLine = new GroupOfCarLineImpl();
		GroupOfCarLineForm groupOfCarLineform = new GroupOfCarLineForm();
		criteria = session.createCriteria(GroupOfCarLine.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			groupOfCarLine = (GroupOfCarLine) criteria.uniqueResult();
			new CopyProperties(groupOfCarLine,groupOfCarLineform);
		} else if(req.getAttribute("form")!=null){
                        groupOfCarLineform = (GroupOfCarLineForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(groupOfCarLineform.getId()));
			groupOfCarLine = (GroupOfCarLine) criteria.uniqueResult();
		}
		

		req.setAttribute("model",groupOfCarLine);
		req.setAttribute("form",groupOfCarLineform);
		
		
		req.setAttribute("groupOfCarLines",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}