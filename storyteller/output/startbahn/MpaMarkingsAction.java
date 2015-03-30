package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

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


public class MpaMarkingsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(MpaMarking.class);
                
if(StringUtils.isNotBlank(req.getParameter("actual"))){   if(req.getParameter("actual").equals("true")){
      criteria.add(Restrictions.eq("actual",true));
   }else{
      criteria.add(Restrictions.eq("actual",false));
   }
}





		req.setAttribute("mpaMarkings",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			MpaMarking mpaMarking = (MpaMarking) iter.next();
//			vector.add(mpaMarking);
//		}
		MpaMarking mpaMarking = new MpaMarkingImpl();
		MpaMarkingForm mpaMarkingform = new MpaMarkingForm();
		criteria = session.createCriteria(MpaMarking.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			mpaMarking = (MpaMarking) criteria.uniqueResult();
			new CopyProperties(mpaMarking,mpaMarkingform);
		} else if(req.getAttribute("form")!=null){
                        mpaMarkingform = (MpaMarkingForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(mpaMarkingform.getId()));
			mpaMarking = (MpaMarking) criteria.uniqueResult();
		}
		

		req.setAttribute("model",mpaMarking);
		req.setAttribute("form",mpaMarkingform);
		
		


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}