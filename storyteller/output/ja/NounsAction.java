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


public class NounsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Noun.class);
                



		req.setAttribute("nouns",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Noun noun = (Noun) iter.next();
//			vector.add(noun);
//		}
		Noun noun = new NounImpl();
		NounForm nounform = new NounForm();
		criteria = session.createCriteria(Noun.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			noun = (Noun) criteria.uniqueResult();
			new CopyProperties(noun,nounform);
		} else if(req.getAttribute("form")!=null){
                        nounform = (NounForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(nounform.getId()));
			noun = (Noun) criteria.uniqueResult();
		}
		

		req.setAttribute("model",noun);
		req.setAttribute("form",nounform);
		
		


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}