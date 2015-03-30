package net.musicmug.web.app;

import net.musicmug.model.*;
import net.musicmug.beans.*;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.StringFullfiller;
import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class PostMessageVPForAdministrtiveRemovalAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Message message = new MessageImpl();
		MessageForm messageform = (MessageForm) form;

                String error = "";


                		Integer topublicuserInt = messageform.getTopublicuser();
		messageform.setTopublicuser(null);
		Integer frompublicuserInt = messageform.getFrompublicuser();
		messageform.setFrompublicuser(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(messageform.getId() == null || messageform.getId().intValue() == 0){
			message.setId(null);
			messageform.setId(null);
		}else{
			message.setId(messageform.getId());
			Criteria criteria = session.createCriteria(Message.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			message = (Message) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(message);
                		Criteria criteria2 = session.createCriteria(Topublicuser.class);
		criteria2.add(Restrictions.idEq(topublicuserInt));
		Topublicuser topublicuser = (Topublicuser) criteria2.uniqueResult();
		message.setTopublicuser(topublicuser);
		criteria2 = session.createCriteria(Frompublicuser.class);
		criteria2.add(Restrictions.idEq(frompublicuserInt));
		Frompublicuser frompublicuser = (Frompublicuser) criteria2.uniqueResult();
		message.setFrompublicuser(frompublicuser);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(message);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostMessageDetail.do", message.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Messages.do", message.getId().toString());
		return null;

		
	}
	
	
}