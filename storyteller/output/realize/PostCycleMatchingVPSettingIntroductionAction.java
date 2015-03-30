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


public class PostCycleMatchingVPSettingIntroductionAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		CycleMatching cycleMatching = new CycleMatchingImpl();
		CycleMatchingForm cycleMatchingform = (CycleMatchingForm) form;

                String error = "";


                		Integer cycleInt = cycleMatchingform.getCycle();
		cycleMatchingform.setCycle(null);
		Integer userInt = cycleMatchingform.getUser();
		cycleMatchingform.setUser(null);
		Integer commitionPaymentInt = cycleMatchingform.getCommitionPayment();
		cycleMatchingform.setCommitionPayment(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(cycleMatchingform.getId() == null || cycleMatchingform.getId().intValue() == 0){
			cycleMatching.setId(null);
			cycleMatchingform.setId(null);
		}else{
			cycleMatching.setId(cycleMatchingform.getId());
			Criteria criteria = session.createCriteria(CycleMatching.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			cycleMatching = (CycleMatching) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(cycleMatching);
                		Criteria criteria2 = session.createCriteria(Cycle.class);
		criteria2.add(Restrictions.idEq(cycleInt));
		Cycle cycle = (Cycle) criteria2.uniqueResult();
		cycleMatching.setCycle(cycle);
		criteria2 = session.createCriteria(User.class);
		criteria2.add(Restrictions.idEq(userInt));
		User user = (User) criteria2.uniqueResult();
		cycleMatching.setUser(user);
		criteria2 = session.createCriteria(CommitionPayment.class);
		criteria2.add(Restrictions.idEq(commitionPaymentInt));
		CommitionPayment commitionpayment = (CommitionPayment) criteria2.uniqueResult();
		cycleMatching.setCommitionPayment(commitionpayment);

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(cycleMatching);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostCycleMatchingDetail.do", cycleMatching.getId().toString(),"success=true");
		return null;

		
	}
	
	
}