package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;

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


public class UpdateWorkAttachmentForettingMainImageAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		WorkAttachment workAttachment = new WorkAttachmentImpl();
		WorkAttachmentForm workAttachmentform = new WorkAttachmentForm();
		Criteria criteria = session.createCriteria(WorkAttachment.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			workAttachment = (WorkAttachment) criteria.uniqueResult();
			new CopyProperties(workAttachment,workAttachmentform);
		} else if(req.getAttribute("form")!=null){
                        workAttachmentform = (WorkAttachmentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(workAttachmentform.getId()));
			workAttachment = (WorkAttachment) criteria.uniqueResult();
		}
                   
                execute(workAttachment,session);


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateWorkAttachmentForettingMainImageAction action = new UpdateWorkAttachmentForettingMainImageAction();
				Criteria criteria = session.createCriteria(WorkAttachment.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				WorkAttachment workAttachment = (WorkAttachment) criteria.uniqueResult();
				action.execute(workAttachment, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void execute(WorkAttachment workAttachment,Session session){
		
	}

}