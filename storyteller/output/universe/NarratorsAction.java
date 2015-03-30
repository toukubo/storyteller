package net.universe.web.app;

import net.universe.model.*;
import net.universe.beans.*;

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


public class NarratorsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Narrator.class);
                








if(StringUtils.isNotBlank(req.getParameter("male"))){   if(req.getParameter("male").equals("true")){
      criteria.add(Restrictions.eq("male",true));
   }else{
      criteria.add(Restrictions.eq("male",false));
   }
}





if(StringUtils.isNotBlank(req.getParameter("corporation"))){   if(req.getParameter("corporation").equals("true")){
      criteria.add(Restrictions.eq("corporation",true));
   }else{
      criteria.add(Restrictions.eq("corporation",false));
   }
}



if(StringUtils.isNotBlank(req.getParameter("paywithtax"))){   if(req.getParameter("paywithtax").equals("true")){
      criteria.add(Restrictions.eq("paywithtax",true));
   }else{
      criteria.add(Restrictions.eq("paywithtax",false));
   }
}


		req.setAttribute("narrators",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Narrator narrator = (Narrator) iter.next();
//			vector.add(narrator);
//		}
		Narrator narrator = new NarratorImpl();
		NarratorForm narratorform = new NarratorForm();
		criteria = session.createCriteria(Narrator.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			narrator = (Narrator) criteria.uniqueResult();
			new CopyProperties(narrator,narratorform);
		} else if(req.getAttribute("form")!=null){
                        narratorform = (NarratorForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(narratorform.getId()));
			narrator = (Narrator) criteria.uniqueResult();
		}
		

		req.setAttribute("model",narrator);
		req.setAttribute("form",narratorform);
		
		


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}