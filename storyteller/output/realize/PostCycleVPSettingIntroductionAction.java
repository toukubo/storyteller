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


public class PostCycleVPSettingIntroductionAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Cycle cycle = new CycleImpl();
		CycleForm cycleform = (CycleForm) form;

                String error = "";


                		Integer userInt = cycleform.getUser();
		cycleform.setUser(null);
		Integer positionInt = cycleform.getPosition();
		cycleform.setPosition(null);
		Integer commitionPaymentInt = cycleform.getCommitionPayment();
		cycleform.setCommitionPayment(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(cycleform.getId() == null || cycleform.getId().intValue() == 0){
			cycle.setId(null);
			cycleform.setId(null);
		}else{
			cycle.setId(cycleform.getId());
			Criteria criteria = session.createCriteria(Cycle.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			cycle = (Cycle) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(cycle);
                		Criteria criteria2 = session.createCriteria(User.class);
		criteria2.add(Restrictions.idEq(userInt));
		User user = (User) criteria2.uniqueResult();
		cycle.setUser(user);
		criteria2 = session.createCriteria(Position.class);
		criteria2.add(Restrictions.idEq(positionInt));
		Position position = (Position) criteria2.uniqueResult();
		cycle.setPosition(position);
		criteria2 = session.createCriteria(CommitionPayment.class);
		criteria2.add(Restrictions.idEq(commitionPaymentInt));
		CommitionPayment commitionpayment = (CommitionPayment) criteria2.uniqueResult();
		cycle.setCommitionPayment(commitionpayment);

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(cycle);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostCycleDetail.do", cycle.getId().toString(),"success=true");
		return null;

		
	}
	
	
}