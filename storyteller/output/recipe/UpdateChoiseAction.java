package net.recipe.web.app;

import net.recipe.model.*;
import net.recipe.beans.*;

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


public class UpdateChoiseAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Choise choise = new ChoiseImpl();
		ChoiseForm choiseform = new ChoiseForm();
		Criteria criteria = session.createCriteria(Choise.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			choise = (Choise) criteria.uniqueResult();
			new CopyProperties(choise,choiseform);
		} else if(req.getAttribute("form")!=null){
                        choiseform = (ChoiseForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(choiseform.getId()));
			choise = (Choise) criteria.uniqueResult();
		}
                   
                execute(choise,session);


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateChoiseAction action = new UpdateChoiseAction();
				Criteria criteria = session.createCriteria(Choise.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				Choise choise = (Choise) criteria.uniqueResult();
				action.execute(choise, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void execute(Choise choise,Session session){
		
	}

}