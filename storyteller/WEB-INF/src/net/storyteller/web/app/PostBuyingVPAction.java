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


public class PostBuyingVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Buying buying = new BuyingImpl();
		BuyingForm buyingform = (BuyingForm) form;

                String error = "";


                		Integer j2eeStoryInt = buyingform.getJ2eeStory();
		buyingform.setJ2eeStory(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(buyingform.getId() == null || buyingform.getId().intValue() == 0){
			buying.setId(null);
			buyingform.setId(null);
		}else{
			buying.setId(buyingform.getId());
			Criteria criteria = session.createCriteria(Buying.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			buying = (Buying) criteria.uniqueResult();

		}
                		buying.setValue(buyingform.getValue());


		
		StringFullfiller.fullfil(buying);
                		Criteria criteria2 = session.createCriteria(J2eeStory.class);
		criteria2.add(Restrictions.idEq(j2eeStoryInt));
		J2eeStory j2eestory = (J2eeStory) criteria2.uniqueResult();
		buying.setJ2eeStory(j2eestory);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(buying);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostBuyingDetail.do", buying.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "AjaxDisplayBuyings.do", null);
		return null;

		
	}
	
	
}