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


public class UpdateInvitationForRegistrationAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Invitation invitation = new InvitationImpl();
		InvitationForm invitationform = new InvitationForm();
		Criteria criteria = session.createCriteria(Invitation.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			invitation = (Invitation) criteria.uniqueResult();
			new CopyProperties(invitation,invitationform);
		} else if(req.getAttribute("form")!=null){
                        invitationform = (InvitationForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(invitationform.getId()));
			invitation = (Invitation) criteria.uniqueResult();
		}
                   
                execute(invitation,session);


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateInvitationForRegistrationAction action = new UpdateInvitationForRegistrationAction();
				Criteria criteria = session.createCriteria(Invitation.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				Invitation invitation = (Invitation) criteria.uniqueResult();
				action.execute(invitation, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void execute(Invitation invitation,Session session){
		
	}

}