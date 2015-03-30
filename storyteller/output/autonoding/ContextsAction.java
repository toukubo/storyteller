package net.autonoding.web.app;

import net.autonoding.model.*;
import net.autonoding.beans.*;

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


public class ContextsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Context.class);
                        sheet.addCell(new Label(x++,y,context.getName()));


if(StringUtils.isNotBlank(req.getParameter("hasenoughnodes"))){   if(req.getParameter("hasenoughnodes").equals("true")){      criteria.add(Restrictions.eq("hasenoughnodes",true));   }else{      criteria.add(Restrictions.eq("hasenoughnodes",false));   }}
autonoding
		req.setAttribute("contexts",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Context context = (Context) iter.next();
//			vector.add(context);
//		}
		Context context = new ContextImpl();
		ContextForm contextform = new ContextForm();
		criteria = session.createCriteria(Context.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			context = (Context) criteria.uniqueResult();
			new CopyProperties(context,contextform);
		} else if(req.getAttribute("form")!=null){
                        contextform = (ContextForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(contextform.getId()));
			context = (Context) criteria.uniqueResult();
		}
		

		req.setAttribute("model",context);
		req.setAttribute("form",contextform);
		
		


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}