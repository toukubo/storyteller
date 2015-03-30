package net.gasaccounting.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.gasaccounting.model.*;
import net.gasaccounting.model.crud.*;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import net.enclosing.util.HibernateSession;
import net.storyteller.desktop.CopyProperties;


public class PostBuyingDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Buying buying = new BuyingImpl();
		BuyingForm buyingform = new BuyingForm();
		Criteria criteria = session.createCriteria(Buying.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			buying = (Buying) criteria.uniqueResult();
			new CopyProperties(buying,buyingform);
		} else if(req.getAttribute("form")!=null){
                        buyingform = (BuyingForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(buyingform.getId()));
			buying = (Buying) criteria.uniqueResult();
		}
		

		req.setAttribute("model",buying);
		req.setAttribute("form",buyingform);


                  Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

Criteria criteriaJob= session.createCriteria(Job.class);
			req.setAttribute("Jobs", criteriaJob.list());

Criteria criteriaAccountTitle= session.createCriteria(AccountTitle.class);
			req.setAttribute("AccountTitles", criteriaAccountTitle.list());

Criteria criteriaOrganization= session.createCriteria(Organization.class);
			req.setAttribute("Organizations", criteriaOrganization.list());

 
		
		return mapping.findForward("success");
	}
	
	
}