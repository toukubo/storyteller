package net.exbase.web.app;

import net.exbase.model.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.enclosing.util.SimpleMail;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class MailAboutNotificationAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		if (req.getParameter("id") != null
				&& !req.getParameter("id").equals("")) {
			this.execute(Integer.valueOf(req.getParameter("id")),this.getServlet().getServletContext());

		}else{
			this.execute(null,this.getServlet().getServletContext());
		}

		return mapping.findForward("success");
	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				MailAboutArtistForApprovalRequestAction action = new MailAboutArtistForApprovalRequestAction();
				action.execute(new Integer(1),context);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void execute(Integer id,ServletContext context){
		BeanFactory factory = WebApplicationContextUtils.getWebApplicationContext(context);
		this.execute(id, factory);
		
	}

        public void execute(Integer id,BeanFactory factory){
		SimpleMail mail = SimpleMail.create(new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml", "applicationContext-localDataSource.xml", "applicationContext-mail.xml" }));

		Session session = new HibernateSession().currentSession(factory);
		Criteria criteria = session.createCriteria(Notification.class);
		criteria.add(Restrictions.eq("id", id));
		Notification notification = (Notification) criteria.uniqueResult();
	        	Map model = new HashMap();
		model.put("notification", notification);
		model.put("dateFormatter", new SimpleDateFormat("yyyy/MM/dd"));
		model.put("timeFormatter", new SimpleDateFormat("hh:mm"));

		Criteria criteriastaticData = session.createCriteria(StaticData.class);
		criteriastaticData.add(Restrictions.eq("id", new Integer(1)));
		StaticData staticData = (StaticData) criteriastaticData.uniqueResult();


		model.put("staticData", staticData);

                //enjoy coding here....




		try {
			mail.send("MailAboutArtistForApprovalRequestAction.eml", "toaddresshere", model);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


        }
	
	
}
