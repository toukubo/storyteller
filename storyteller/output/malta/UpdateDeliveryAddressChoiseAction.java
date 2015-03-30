package net.malta.web.app;

import net.malta.model.*;
import net.malta.beans.*;

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


public class UpdateDeliveryAddressChoiseAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		DeliveryAddressChoise deliveryAddressChoise = new DeliveryAddressChoiseImpl();
		DeliveryAddressChoiseForm deliveryAddressChoiseform = new DeliveryAddressChoiseForm();
		Criteria criteria = session.createCriteria(DeliveryAddressChoise.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			deliveryAddressChoise = (DeliveryAddressChoise) criteria.uniqueResult();
			new CopyProperties(deliveryAddressChoise,deliveryAddressChoiseform);
		} else if(req.getAttribute("form")!=null){
                        deliveryAddressChoiseform = (DeliveryAddressChoiseForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(deliveryAddressChoiseform.getId()));
			deliveryAddressChoise = (DeliveryAddressChoise) criteria.uniqueResult();
		}
                   
                execute(deliveryAddressChoise,session);


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateDeliveryAddressChoiseAction action = new UpdateDeliveryAddressChoiseAction();
				Criteria criteria = session.createCriteria(DeliveryAddressChoise.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				DeliveryAddressChoise deliveryAddressChoise = (DeliveryAddressChoise) criteria.uniqueResult();
				action.execute(deliveryAddressChoise, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void execute(DeliveryAddressChoise deliveryAddressChoise,Session session){
		
	}

}