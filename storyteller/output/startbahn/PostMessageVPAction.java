package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

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


public class PostMessageVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Message message = new MessageImpl();
		MessageForm messageform = (MessageForm) form;

                String error = "";


                		Integer toPublicUserInt = messageform.getToPublicUser();
		messageform.setToPublicUser(null);
		Integer fromPubilcUserInt = messageform.getFromPubilcUser();
		messageform.setFromPubilcUser(null);

		
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
                		message.setFromid(messageform.getFromid());
		message.setToid(messageform.getToid());
		message.setFrommodel(messageform.getFrommodel());
		message.setTomodel(messageform.getTomodel());
		message.setSystem(messageform.isSystem());
		message.setDescription(messageform.getDescription());
		message.setTitle(messageform.getTitle());
		message.setDate(messageform.getDate());
		message.setDraft(messageform.isDraft());
		message.setDrafts(messageform.isDrafts());


		
		StringFullfiller.fullfil(message);
                		Criteria criteria2 = session.createCriteria(ToPublicUser.class);
		criteria2.add(Restrictions.idEq(toPublicUserInt));
		ToPublicUser topublicuser = (ToPublicUser) criteria2.uniqueResult();
		message.setToPublicUser(topublicuser);
		criteria2 = session.createCriteria(FromPubilcUser.class);
		criteria2.add(Restrictions.idEq(fromPubilcUserInt));
		FromPubilcUser frompubilcuser = (FromPubilcUser) criteria2.uniqueResult();
		message.setFromPubilcUser(frompubilcuser);


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