package net.secretarize.web.app;

import net.secretarize.model.*;
import net.secretarize.beans.*;

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
                		publicUser.setBank(publicUserform.getBank());
		publicUser.setBankaccount(publicUserform.getBankaccount());
		publicUser.setName(publicUserform.getName());
		publicUser.setAddress(publicUserform.getAddress());
		publicUser.setDate(publicUserform.getDate());
		publicUser.setSuperuser(publicUserform.isSuperuser());
		publicUser.setBranchname(publicUserform.getBranchname());
		publicUser.setPassword(publicUserform.getPassword());
		publicUser.setKana(publicUserform.getKana());
		publicUser.setBankbranch(publicUserform.getBankbranch());
		publicUser.setBankaccountname(publicUserform.getBankaccountname());
		publicUser.setAccount(publicUserform.getAccount());
		publicUser.setMail(publicUserform.getMail());


		
		StringFullfiller.fullfil(publicUser);
                

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