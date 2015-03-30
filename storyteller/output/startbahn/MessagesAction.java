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


public class MessagesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Message.class);
                




if(StringUtils.isNotBlank(req.getParameter("system"))){   if(req.getParameter("system").equals("true")){
      criteria.add(Restrictions.eq("system",true));
   }else{
      criteria.add(Restrictions.eq("system",false));
   }
}




		req.setAttribute("messages",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Message message = (Message) iter.next();
//			vector.add(message);
//		}
		Message message = new MessageImpl();
		MessageForm messageform = new MessageForm();
		criteria = session.createCriteria(Message.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			message = (Message) criteria.uniqueResult();
			new CopyProperties(message,messageform);
		} else if(req.getAttribute("form")!=null){
                        messageform = (MessageForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(messageform.getId()));
			message = (Message) criteria.uniqueResult();
		}
		

		req.setAttribute("model",message);
		req.setAttribute("form",messageform);
		
		


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}