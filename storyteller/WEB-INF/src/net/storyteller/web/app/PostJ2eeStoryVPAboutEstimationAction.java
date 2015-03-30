package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

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


public class PostJ2eeStoryVPAboutEstimationAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		J2eeStory j2eeStory = new J2eeStoryImpl();
		J2eeStoryForm j2eeStoryform = (J2eeStoryForm) form;

                String error = "";
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",j2eeStoryform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(j2eeStoryform.getId() == null || j2eeStoryform.getId().intValue() == 0){
			j2eeStory.setId(null);
			j2eeStoryform.setId(null);
		}else{
			j2eeStory.setId(j2eeStoryform.getId());
			Criteria criteria = session.createCriteria(J2eeStory.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			j2eeStory = (J2eeStory) criteria.uniqueResult();

		}
                		j2eeStory.setContiuningbusiness(j2eeStoryform.isContiuningbusiness());
		j2eeStory.setConsultingrate(j2eeStoryform.getConsultingrate());
		j2eeStory.setOffshorable(j2eeStoryform.isOffshorable());
		j2eeStory.setSalerequired(j2eeStoryform.isSalerequired());
		j2eeStory.setDificulty(j2eeStoryform.getDificulty());
		j2eeStory.setTellerapp(j2eeStoryform.isTellerapp());
		j2eeStory.setAdvertisingrate(j2eeStoryform.getAdvertisingrate());
		int discountrate = 0;
		if(j2eeStory.isContiuningbusiness())
			discountrate += 15;
		if(j2eeStory.isSalerequired())
			discountrate +=20;
		if(j2eeStory.isOffshorable())
			discountrate += 5;
		
		discountrate += j2eeStory.getConsultingrate();
		
		discountrate += j2eeStory.getDificulty();
		
		discountrate += j2eeStory.getAdvertisingrate();
		
		j2eeStory.setDiscountpercentage(discountrate);

		
		StringFullfiller.fullfil(j2eeStory);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(j2eeStory);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostJ2eeStoryDetail.do", j2eeStory.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "J2eeStorys.do", j2eeStory.getId().toString());
		return null;

		
	}
	
	
}