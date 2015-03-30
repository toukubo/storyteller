package net.ja.web.app;

import net.ja.model.*;
import net.ja.beans.*;

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


public class PostPublicUserVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		PublicUser publicUser = new PublicUserImpl();
		PublicUserForm publicUserform = (PublicUserForm) form;

                String error = "";


                		Integer areaInt = publicUserform.getArea();
		publicUserform.setArea(null);
		Integer userInfoInt = publicUserform.getUserInfo();
		publicUserform.setUserInfo(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(publicUserform.getId() == null || publicUserform.getId().intValue() == 0){
			publicUser.setId(null);
			publicUserform.setId(null);
		}else{
			publicUser.setId(publicUserform.getId());
			Criteria criteria = session.createCriteria(PublicUser.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			publicUser = (PublicUser) criteria.uniqueResult();

		}
                		publicUser.setCode(publicUserform.getCode());
		publicUser.setTotalcost(publicUserform.getTotalcost());
		publicUser.setInfocode(publicUserform.getInfocode());
		publicUser.setJacode(publicUserform.getJacode());
		publicUser.setAccountofficecode(publicUserform.getAccountofficecode());
		publicUser.setShopcode(publicUserform.getShopcode());
		publicUser.setDepartmentcode(publicUserform.getDepartmentcode());
		publicUser.setAccountnumber(publicUserform.getAccountnumber());
		publicUser.setAccountstatus(publicUserform.getAccountstatus());
		publicUser.setClosurebreakdate(publicUserform.getClosurebreakdate());
		publicUser.setClosuretype(publicUserform.getClosuretype());
		publicUser.setBranchcode(publicUserform.getBranchcode());
		publicUser.setManagementtype(publicUserform.getManagementtype());
		publicUser.setAreacode(publicUserform.getAreacode());
		publicUser.setVarialblestatscode(publicUserform.getVarialblestatscode());
		publicUser.setVarialblestatscodetwo(publicUserform.getVarialblestatscodetwo());
		publicUser.setDetaileddocumenttype(publicUserform.getDetaileddocumenttype());
		publicUser.setLayoutno(publicUserform.getLayoutno());
		publicUser.setPrintingcontrolcode(publicUserform.getPrintingcontrolcode());
		publicUser.setSorimachitargettype(publicUserform.getSorimachitargettype());
		publicUser.setRemaining(publicUserform.getRemaining());
		publicUser.setTotalincome(publicUserform.getTotalincome());
		publicUser.setLasttransactiondate(publicUserform.getLasttransactiondate());
		publicUser.setNonaccountedatfirst(publicUserform.getNonaccountedatfirst());
		publicUser.setNonaccountedatlast(publicUserform.getNonaccountedatlast());
		publicUser.setName(publicUserform.getName());
		publicUser.setType(publicUserform.getType());


		
		StringFullfiller.fullfil(publicUser);
                		Criteria criteria2 = session.createCriteria(Area.class);
		criteria2.add(Restrictions.idEq(areaInt));
		Area area = (Area) criteria2.uniqueResult();
		publicUser.setArea(area);
		criteria2 = session.createCriteria(UserInfo.class);
		criteria2.add(Restrictions.idEq(userInfoInt));
		UserInfo userinfo = (UserInfo) criteria2.uniqueResult();
		publicUser.setUserInfo(userinfo);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(publicUser);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostPublicUserDetail.do", publicUser.getId().toString());
		return null;

		
	}
	
	
}