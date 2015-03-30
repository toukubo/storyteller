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


public class PostIntroductionVPSettingIntroductionAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Introduction introduction = new IntroductionImpl();
		IntroductionForm introductionform = (IntroductionForm) form;

                String error = "";


                		Integer commitionPaymentInt = introductionform.getCommitionPayment();
		introductionform.setCommitionPayment(null);
		Integer introducerInt = introductionform.getIntroducer();
		introductionform.setIntroducer(null);
		Integer introducedUserInt = introductionform.getIntroducedUser();
		introductionform.setIntroducedUser(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(introductionform.getId() == null || introductionform.getId().intValue() == 0){
			introduction.setId(null);
			introductionform.setId(null);
		}else{
			introduction.setId(introductionform.getId());
			Criteria criteria = session.createCriteria(Introduction.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			introduction = (Introduction) criteria.uniqueResult();

		}
                		introduction.setDate(introductionform.getDate());


		
		StringFullfiller.fullfil(introduction);
                		Criteria criteria2 = session.createCriteria(CommitionPayment.class);
		criteria2.add(Restrictions.idEq(commitionPaymentInt));
		CommitionPayment commitionpayment = (CommitionPayment) criteria2.uniqueResult();
		introduction.setCommitionPayment(commitionpayment);
		criteria2 = session.createCriteria(Introducer.class);
		criteria2.add(Restrictions.idEq(introducerInt));
		Introducer introducer = (Introducer) criteria2.uniqueResult();
		introduction.setIntroducer(introducer);
		criteria2 = session.createCriteria(IntroducedUser.class);
		criteria2.add(Restrictions.idEq(introducedUserInt));
		IntroducedUser introduceduser = (IntroducedUser) criteria2.uniqueResult();
		introduction.setIntroducedUser(introduceduser);

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(introduction);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostIntroductionDetail.do", introduction.getId().toString(),"success=true");
		return null;

		
	}
	
	
}