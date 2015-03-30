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


public class PostUserVPGoingStartedAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		User user = new UserImpl();
		UserForm userform = (UserForm) form;

                String error = "";


                		Integer introductionsAsIntroducedInt = userform.getIntroductionsAsIntroduced();
		userform.setIntroductionsAsIntroduced(null);
		Integer certificationTypeInt = userform.getCertificationType();
		userform.setCertificationType(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(userform.getId() == null || userform.getId().intValue() == 0){
			user.setId(null);
			userform.setId(null);
		}else{
			user.setId(userform.getId());
			Criteria criteria = session.createCriteria(User.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			user = (User) criteria.uniqueResult();

		}
                		user.setPassword(userform.getPassword());
		user.setUsername(userform.getUsername());
		user.setMail(userform.getMail());
		user.setAddeddate(userform.getAddeddate());
		user.setKana(userform.getKana());
		user.setEnglishname(userform.getEnglishname());
		user.setSex(userform.getSex());
		user.setPhonenum(userform.getPhonenum());
		user.setRememberme(userform.isRememberme());
		user.setInfoseekmail(userform.getInfoseekmail());
		user.setZip(userform.getZip());
		user.setBuildingname(userform.getBuildingname());
		user.setBirthdate(userform.getBirthdate());
		user.setMailhp(userform.getMailhp());
		user.setMailpass(userform.getMailpass());
		user.setBankvalid(userform.isBankvalid());
		user.setBank(userform.getBank());
		user.setYuchonum(userform.getYuchonum());
		user.setBanknumber(userform.getBanknumber());
		user.setBankaccountname(userform.getBankaccountname());
		user.setCertificationNumber(userform.getCertificationNumber());
		user.setCurrentcommition(userform.getCurrentcommition());
		user.setPaidcommition(userform.getPaidcommition());
		user.setName(userform.getName());
		user.setFlag(userform.getFlag());
		user.setDescription(userform.getDescription());
		user.setAddress(userform.getAddress());
		user.setBanned(userform.isBanned());
		user.setPaid(userform.isPaid());
		user.setStarted(userform.isStarted());
		user.setStartsWithIntroduction(userform.isStartsWithIntroduction());


		
		StringFullfiller.fullfil(user);
                		Criteria criteria2 = session.createCriteria(IntroductionsAsIntroduced.class);
		criteria2.add(Restrictions.idEq(introductionsAsIntroducedInt));
		IntroductionsAsIntroduced introductionsasintroduced = (IntroductionsAsIntroduced) criteria2.uniqueResult();
		user.setIntroductionsAsIntroduced(introductionsasintroduced);
		criteria2 = session.createCriteria(CertificationType.class);
		criteria2.add(Restrictions.idEq(certificationTypeInt));
		CertificationType certificationtype = (CertificationType) criteria2.uniqueResult();
		user.setCertificationType(certificationtype);

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(user);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostUserDetail.do", user.getId().toString(),"success=true");
		return null;

		
	}
	
	
}