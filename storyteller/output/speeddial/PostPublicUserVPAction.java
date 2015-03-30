package net.speeddial.web.app;

import net.speeddial.model.*;
import net.speeddial.beans.*;

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
                		publicUser.setPhone(publicUserform.getPhone());
		publicUser.setDeliverydate(publicUserform.getDeliverydate());
		publicUser.setZipthree(publicUserform.getZipthree());
		publicUser.setRemoved(publicUserform.isRemoved());
		publicUser.setAddress(publicUserform.getAddress());
		publicUser.setName(publicUserform.getName());
		publicUser.setPassword(publicUserform.getPassword());
		publicUser.setDeliveryblocknumber(publicUserform.getDeliveryblocknumber());
		publicUser.setDeliverykana(publicUserform.getDeliverykana());
		publicUser.setDeliveryphone(publicUserform.getDeliveryphone());
		publicUser.setDevliveryhour(publicUserform.getDevliveryhour());
		publicUser.setKana(publicUserform.getKana());
		publicUser.setZipfour(publicUserform.getZipfour());
		publicUser.setMail(publicUserform.getMail());
		publicUser.setDeliveryaddress(publicUserform.getDeliveryaddress());
		publicUser.setDeliveryname(publicUserform.getDeliveryname());
		publicUser.setDeliveryzipfour(publicUserform.getDeliveryzipfour());
		publicUser.setDeliveryzipthree(publicUserform.getDeliveryzipthree());
		publicUser.setDeliverypref(publicUserform.getDeliverypref());
		publicUser.setDelivertodifferentaddress(publicUserform.isDelivertodifferentaddress());
		publicUser.setBlocknumber(publicUserform.getBlocknumber());
		publicUser.setMale(publicUserform.isMale());
		publicUser.setBrithday(publicUserform.getBrithday());
		publicUser.setMailforconfirm(publicUserform.getMailforconfirm());
		publicUser.setBirthmonth(publicUserform.getBirthmonth());
		publicUser.setMunicipality(publicUserform.getMunicipality());
		publicUser.setBirthyear(publicUserform.getBirthyear());
		publicUser.setKeitai(publicUserform.getKeitai());
		publicUser.setBuildingname(publicUserform.getBuildingname());
		publicUser.setPref(publicUserform.getPref());
		publicUser.setAdmin(publicUserform.isAdmin());
		publicUser.setTumblraccount(publicUserform.getTumblraccount());
		publicUser.setTumblrpassword(publicUserform.getTumblrpassword());
		publicUser.setDeliciousaccount(publicUserform.getDeliciousaccount());


		
		StringFullfiller.fullfil(publicUser);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(publicUser);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostPublicUserDetail.do", publicUser.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PublicUsers.do", publicUser.getId().toString());
		return null;

		
	}
	
	
}