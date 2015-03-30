package net.simpleandhonest.web.app;

import net.simpleandhonest.model.*;
import net.simpleandhonest.model.crud.*;

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


public class OptionsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Option.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Option option = (Option) iter.next();
			vector.add(option);
		}
		Option option = new OptionImpl();
		OptionForm optionform = new OptionForm();
		criteria = session.createCriteria(Option.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			option = (Option) criteria.uniqueResult();
			new CopyProperties(option,optionform);
		} else if(req.getAttribute("form")!=null){
                        optionform = (OptionForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(optionform.getId()));
			option = (Option) criteria.uniqueResult();
		}
		

		req.setAttribute("model",option);
		req.setAttribute("form",optionform);
		
		
		req.setAttribute("options",vector);
		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}