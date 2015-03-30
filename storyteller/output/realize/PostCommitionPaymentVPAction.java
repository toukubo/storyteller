package net.realize.web.app;

import net.realize.model.*;
import net.realize.beans.*;

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
import org.hibernate.criterion.Restrictions;


public class PostCommitionPaymentVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		CommitionPayment commitionPayment = new CommitionPaymentImpl();
		CommitionPaymentForm commitionPaymentform = (CommitionPaymentForm) form;

                String error = "";


                		Integer userInt = commitionPaymentform.getUser();
		commitionPaymentform.setUser(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(commitionPaymentform.getId() == null || commitionPaymentform.getId().intValue() == 0){
			commitionPayment.setId(null);
			commitionPaymentform.setId(null);
		}else{
			commitionPayment.setId(commitionPaymentform.getId());
			Criteria criteria = session.createCriteria(CommitionPayment.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			commitionPayment = (CommitionPayment) criteria.uniqueResult();

		}
                		commitionPayment.setValue(commitionPaymentform.getValue());
		commitionPayment.setDate(commitionPaymentform.getDate());


		
		StringFullfiller.fullfil(commitionPayment);
                		Criteria criteria2 = session.createCriteria(User.class);
		criteria2.add(Restrictions.idEq(userInt));
		User user = (User) criteria2.uniqueResult();
		commitionPayment.setUser(user);

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(commitionPayment);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostCommitionPaymentDetail.do", commitionPayment.getId().toString(),"success=true");
		return null;

		
	}
	
	
}