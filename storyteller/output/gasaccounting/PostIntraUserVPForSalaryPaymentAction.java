package net.gasaccounting.web.app;

import net.gasaccounting.model.*;
import net.gasaccounting.beans.*;

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


public class PostIntraUserVPForSalaryPaymentAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		IntraUser intraUser = new IntraUserImpl();
		IntraUserForm intraUserform = (IntraUserForm) form;

                String error = "";


                		Integer privilegeInt = intraUserform.getPrivilege();
		intraUserform.setPrivilege(null);

		
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
                		intraUser.setCode(intraUserform.getCode());
		intraUser.setPhonenum(intraUserform.getPhonenum());
		intraUser.setSex(intraUserform.getSex());
		intraUser.setFamilyname(intraUserform.getFamilyname());
		intraUser.setName(intraUserform.getName());
		intraUser.setFlag(intraUserform.getFlag());
		intraUser.setAddress(intraUserform.getAddress());
		intraUser.setPassword(intraUserform.getPassword());
		intraUser.setIcalurl(intraUserform.getIcalurl());
		intraUser.setIcalurlusing(intraUserform.isIcalurlusing());
		intraUser.setC2talkaccount(intraUserform.getC2talkaccount());
		intraUser.setAccount(intraUserform.getAccount());
		intraUser.setMail(intraUserform.getMail());
		intraUser.setCostperhour(intraUserform.getCostperhour());
		intraUser.setRoi(intraUserform.getRoi());
		intraUser.setNetincome(intraUserform.getNetincome());
		intraUser.setC2talkpassword(intraUserform.getC2talkpassword());
		intraUser.setCostperhourformidngith(intraUserform.getCostperhourformidngith());
		intraUser.setCostperhourforholliday(intraUserform.getCostperhourforholliday());
		intraUser.setCostperhourforovertime(intraUserform.getCostperhourforovertime());
		intraUser.setMonthlybasesalary(intraUserform.getMonthlybasesalary());
		intraUser.setFixedsalary(intraUserform.isFixedsalary());
		intraUser.setCurrenttransitbase(intraUserform.getCurrenttransitbase());
		intraUser.setWorkhours(intraUserform.getWorkhours());
		intraUser.setStarthour(intraUserform.getStarthour());


		
		StringFullfiller.fullfil(intraUser);
                		Criteria criteria2 = session.createCriteria(Privilege.class);
		criteria2.add(Restrictions.idEq(privilegeInt));
		Privilege privilege = (Privilege) criteria2.uniqueResult();
		intraUser.setPrivilege(privilege);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(intraUser);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostIntraUserDetail.do", intraUser.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "IntraUsers.do", intraUser.getId().toString());
		return null;

		
	}
	
	
}