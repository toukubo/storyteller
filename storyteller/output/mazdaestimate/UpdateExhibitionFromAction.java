package net.mazdaestimate.web.app;

import net.mazdaestimate.model.*;
import net.mazdaestimate.beans.*;

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


public class UpdateExhibitionFromAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Exhibition exhibition = new ExhibitionImpl();
		ExhibitionForm exhibitionform = new ExhibitionForm();
		Criteria criteria = session.createCriteria(Exhibition.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			exhibition = (Exhibition) criteria.uniqueResult();
			new CopyProperties(exhibition,exhibitionform);
		} else if(req.getAttribute("form")!=null){
                        exhibitionform = (ExhibitionForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(exhibitionform.getId()));
			exhibition = (Exhibition) criteria.uniqueResult();
		}
                   
                execute(exhibition,session);


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateExhibitionFromAction action = new UpdateExhibitionFromAction();
				Criteria criteria = session.createCriteria(Exhibition.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				Exhibition exhibition = (Exhibition) criteria.uniqueResult();
				action.exectute(exhibition, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void execute(##modlclass## exhibition,Session session){
		
	}

}