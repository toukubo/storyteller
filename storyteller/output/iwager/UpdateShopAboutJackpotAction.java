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


public class UpdateShopAboutJackpotAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Shop shop = new ShopImpl();
		ShopForm shopform = new ShopForm();
		Criteria criteria = session.createCriteria(Shop.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			shop = (Shop) criteria.uniqueResult();
			new CopyProperties(shop,shopform);
		} else if(req.getAttribute("form")!=null){
                        shopform = (ShopForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(shopform.getId()));
			shop = (Shop) criteria.uniqueResult();
		}
                   
                execute(shop,session);


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateShopAboutJackpotAction action = new UpdateShopAboutJackpotAction();
				Criteria criteria = session.createCriteria(Shop.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				Shop shop = (Shop) criteria.uniqueResult();
				action.execute(shop, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void execute(Shop shop,Session session){
		
	}

}