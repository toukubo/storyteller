package net.mailmag.web.app;

import net.mailmag.model.*;
import net.mailmag.beans.*;

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


public class PostPublicUserVPFromPublicAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		PublicUser publicUser = new PublicUserImpl();
		PublicUserForm publicUserform = (PublicUserForm) form;

                String error = "";


                		Integer siteInt = publicUserform.getSite();
		publicUserform.setSite(null);

		
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
                		publicUser.setPassword(publicUserform.getPassword());
		publicUser.setMail(publicUserform.getMail());
		publicUser.setZipthree(publicUserform.getZipthree());
		publicUser.setZipfour(publicUserform.getZipfour());
		publicUser.setDeliverydate(publicUserform.getDeliverydate());
		publicUser.setKana(publicUserform.getKana());
		publicUser.setPhone(publicUserform.getPhone());
		publicUser.setDevliveryhour(publicUserform.getDevliveryhour());
		publicUser.setDeliveryphone(publicUserform.getDeliveryphone());
		publicUser.setDeliverykana(publicUserform.getDeliverykana());
		publicUser.setDeliveryblocknumber(publicUserform.getDeliveryblocknumber());
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
		publicUser.setRemoved(publicUserform.isRemoved());
		publicUser.setName(publicUserform.getName());
		publicUser.setAddress(publicUserform.getAddress());
		publicUser.setKeitaimail(publicUserform.getKeitaimail());
		publicUser.setLanguage(publicUserform.getLanguage());
		publicUser.setSubject(publicUserform.getSubject());
		publicUser.setDepartment(publicUserform.getDepartment());
		publicUser.setComponeyname(publicUserform.getComponeyname());
		publicUser.setComment(publicUserform.getComment());


		
		StringFullfiller.fullfil(publicUser);
                		Criteria criteria2 = session.createCriteria(Site.class);
		criteria2.add(Restrictions.idEq(siteInt));
		Site site = (Site) criteria2.uniqueResult();
		publicUser.setSite(site);


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