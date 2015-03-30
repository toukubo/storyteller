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


public class UpdateCDFromFromWebapiAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		CD cD = new CDImpl();
		CDForm cDform = new CDForm();
		Criteria criteria = session.createCriteria(CD.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			cD = (CD) criteria.uniqueResult();
			new CopyProperties(cD,cDform);
		} else if(req.getAttribute("form")!=null){
                        cDform = (CDForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(cDform.getId()));
			cD = (CD) criteria.uniqueResult();
		}
                   
                execute(cD,session);


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateCDFromFromWebapiAction action = new UpdateCDFromFromWebapiAction();
				Criteria criteria = session.createCriteria(CD.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				CD cD = (CD) criteria.uniqueResult();
				action.exectute(cD, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void execute(CD cD,Session session){
		
	}

}