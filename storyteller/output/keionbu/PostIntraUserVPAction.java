package net.keionbu.web.app;

import net.keionbu.model.*;
import net.keionbu.beans.*;

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


public class PostIntraUserVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		IntraUser intraUser = new IntraUserImpl();
		IntraUserForm intraUserform = (IntraUserForm) form;

                String error = "";


                		Integer introductionFromInt = intraUserform.getIntroductionFrom();
		intraUserform.setIntroductionFrom(null);
		Integer introductionToInt = intraUserform.getIntroductionTo();
		intraUserform.setIntroductionTo(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(intraUserform.getId() == null || intraUserform.getId().intValue() == 0){
			intraUser.setId(null);
			intraUserform.setId(null);
		}else{
			intraUser.setId(intraUserform.getId());
			Criteria criteria = session.createCriteria(IntraUser.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			intraUser = (IntraUser) criteria.uniqueResult();

		}
                		intraUser.setPassword(intraUserform.getPassword());
		intraUser.setMail(intraUserform.getMail());
		intraUser.setRemoved(intraUserform.isRemoved());
		intraUser.setUpdatedate(intraUserform.getUpdatedate());
		intraUser.setCity(intraUserform.getCity());
		intraUser.setPrefecture(intraUserform.getPrefecture());
		intraUser.setFirstname(intraUserform.getFirstname());
		intraUser.setZipcode(intraUserform.getZipcode());
		intraUser.setFirstnamekana(intraUserform.getFirstnamekana());
		intraUser.setFamilyname(intraUserform.getFamilyname());
		intraUser.setFamilynamekana(intraUserform.getFamilynamekana());
		intraUser.setNickname(intraUserform.getNickname());
		intraUser.setAffiliation(intraUserform.getAffiliation());
		intraUser.setUtn(intraUserform.getUtn());
		intraUser.setMobileno(intraUserform.getMobileno());
		intraUser.setMobilemail(intraUserform.getMobilemail());
		intraUser.setTelno(intraUserform.getTelno());
		intraUser.setBuilding(intraUserform.getBuilding());
		intraUser.setCreatedate(intraUserform.getCreatedate());
		intraUser.setAddress(intraUserform.getAddress());


		
		StringFullfiller.fullfil(intraUser);
                		Criteria criteria2 = session.createCriteria(IntroductionFrom.class);
		criteria2.add(Restrictions.idEq(introductionFromInt));
		IntroductionFrom introductionfrom = (IntroductionFrom) criteria2.uniqueResult();
		intraUser.setIntroductionFrom(introductionfrom);
		criteria2 = session.createCriteria(IntroductionTo.class);
		criteria2.add(Restrictions.idEq(introductionToInt));
		IntroductionTo introductionto = (IntroductionTo) criteria2.uniqueResult();
		intraUser.setIntroductionTo(introductionto);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(intraUser);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostIntraUserDetail.do", intraUser.getId().toString());
		return null;

		
	}
	
	
}