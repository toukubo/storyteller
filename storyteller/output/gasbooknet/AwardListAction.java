package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.model.crud.*;

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


public class AwardListAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Award.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Award award = (Award) iter.next();
			vector.add(award);
		}
		Award award = new AwardImpl();
		AwardForm awardform = new AwardForm();
		criteria = session.createCriteria(Award.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			award = (Award) criteria.uniqueResult();
			new CopyProperties(award,awardform);
		} else if(req.getAttribute("form")!=null){
                        awardform = (AwardForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(awardform.getId()));
			award = (Award) criteria.uniqueResult();
		}
		

		req.setAttribute("model",award);
		req.setAttribute("form",awardform);
		
		
		req.setAttribute("awards",vector);
		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}