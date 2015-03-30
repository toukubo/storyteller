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


public class PostOrderVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Order order = new OrderImpl();
		OrderForm orderform = (OrderForm) form;

                String error = "";


                		Integer publicUserInt = orderform.getPublicUser();
		orderform.setPublicUser(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(orderform.getId() == null || orderform.getId().intValue() == 0){
			order.setId(null);
			orderform.setId(null);
		}else{
			order.setId(orderform.getId());
			Criteria criteria = session.createCriteria(Order.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			order = (Order) criteria.uniqueResult();

		}
                		order.setTotal(orderform.getTotal());
		order.setCarriage(orderform.getCarriage());
		order.setSubtotal(orderform.getSubtotal());
		order.setTotalordernum(orderform.getTotalordernum());
		order.setShipped(orderform.isShipped());


		
		StringFullfiller.fullfil(order);
                		Criteria criteria2 = session.createCriteria(PublicUser.class);
		criteria2.add(Restrictions.idEq(publicUserInt));
		PublicUser publicuser = (PublicUser) criteria2.uniqueResult();
		order.setPublicUser(publicuser);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(order);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostOrderDetail.do", order.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Orders.do", order.getId().toString());
		return null;

		
	}
	
	
}