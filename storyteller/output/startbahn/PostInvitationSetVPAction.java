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


public class PostInvitationSetVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		InvitationSet invitationSet = new InvitationSetImpl();
		InvitationSetForm invitationSetform = (InvitationSetForm) form;

                String error = "";
if(StringUtils.isBlank(req.getParameter("mail2"))){
    error += "は空にはできません。<br />";
}
if(StringUtils.isBlank(req.getParameter("mail1"))){
    error += "は空にはできません。<br />";
}
if(StringUtils.isBlank(req.getParameter("mail3"))){
    error += "は空にはできません。<br />";
}
if(StringUtils.isBlank(req.getParameter("mail4"))){
    error += "は空にはできません。<br />";
}
if(StringUtils.isBlank(req.getParameter("mail5"))){
    error += "は空にはできません。<br />";
}
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",invitationSetform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(invitationSetform.getId() == null || invitationSetform.getId().intValue() == 0){
			invitationSet.setId(null);
			invitationSetform.setId(null);
		}else{
			invitationSet.setId(invitationSetform.getId());
			Criteria criteria = session.createCriteria(InvitationSet.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			invitationSet = (InvitationSet) criteria.uniqueResult();

		}
                		invitationSet.setMail2(invitationSetform.getMail2());
		invitationSet.setMail1(invitationSetform.getMail1());
		invitationSet.setMail3(invitationSetform.getMail3());
		invitationSet.setMail4(invitationSetform.getMail4());
		invitationSet.setMail5(invitationSetform.getMail5());


		
		StringFullfiller.fullfil(invitationSet);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(invitationSet);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostInvitationSetDetail.do", invitationSet.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "InvitationSets.do", invitationSet.getId().toString());
		return null;

		
	}
	
	
}