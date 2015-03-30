package net.iwager.web.app;

import net.iwager.model.*;
import net.iwager.beans.*;

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


public class UpdateStaticDataAboutJackpotAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		StaticData staticData = new StaticDataImpl();
		StaticDataForm staticDataform = new StaticDataForm();
		Criteria criteria = session.createCriteria(StaticData.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			staticData = (StaticData) criteria.uniqueResult();
			new CopyProperties(staticData,staticDataform);
		} else if(req.getAttribute("form")!=null){
                        staticDataform = (StaticDataForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(staticDataform.getId()));
			staticData = (StaticData) criteria.uniqueResult();
		}
                   
                execute(staticData,session);


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateStaticDataAboutJackpotAction action = new UpdateStaticDataAboutJackpotAction();
				Criteria criteria = session.createCriteria(StaticData.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				StaticData staticData = (StaticData) criteria.uniqueResult();
				action.execute(staticData, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void execute(StaticData staticData,Session session){
		
	}

}