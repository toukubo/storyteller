package net.ja.web.app;

import net.ja.model.*;
import net.ja.beans.*;

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


public class AttrsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Attr.class);
                
		if(StringUtils.isNotBlank(req.getParameter("noun"))) {
			Criteria criteria2 = session.createCriteria(Noun.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("noun"))));
			Noun noun = (Noun) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("noun", noun));
		}
 



		req.setAttribute("attrs",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Attr attr = (Attr) iter.next();
//			vector.add(attr);
//		}
		Attr attr = new AttrImpl();
		AttrForm attrform = new AttrForm();
		criteria = session.createCriteria(Attr.class);


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
		
		


                  Criteria criteriaNoun= session.createCriteria(Noun.class);
			req.setAttribute("Nouns", criteriaNoun.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}