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


public class UpdateInvitationSetCreatingInvitationsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		InvitationSet invitationSet = new InvitationSetImpl();
		InvitationSetForm invitationSetform = new InvitationSetForm();
		Criteria criteria = session.createCriteria(InvitationSet.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			invitationSet = (InvitationSet) criteria.uniqueResult();
			new CopyProperties(invitationSet,invitationSetform);
		} else if(req.getAttribute("form")!=null){
                        invitationSetform = (InvitationSetForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(invitationSetform.getId()));
			invitationSet = (InvitationSet) criteria.uniqueResult();
		}
                   
                execute(invitationSet,session);


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateInvitationSetCreatingInvitationsAction action = new UpdateInvitationSetCreatingInvitationsAction();
				Criteria criteria = session.createCriteria(InvitationSet.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				InvitationSet invitationSet = (InvitationSet) criteria.uniqueResult();
				action.execute(invitationSet, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void execute(InvitationSet invitationSet,Session session){
		
	}

}