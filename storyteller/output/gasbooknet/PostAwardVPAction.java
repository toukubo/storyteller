package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;

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


public class PostAwardVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Award award = new AwardImpl();
		AwardForm awardform = (AwardForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(awardform.getId() == null || awardform.getId().intValue() == 0){
			award.setId(null);
			awardform.setId(null);
		}else{
			award.setId(awardform.getId());
			Criteria criteria = session.createCriteria(Award.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			award = (Award) criteria.uniqueResult();

		}
                		award.setName(awardform.getName());
		award.setDate(awardform.getDate());
		award.setDescription(awardform.getDescription());
		award.setRecentlyadded(awardform.isRecentlyadded());
		award.setPoplular(awardform.isPoplular());


		
		StringFullfiller.fullfil(award);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(award);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostAwardDetail.do", award.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Awards.do", award.getId().toString());
		return null;

		
	}
	
	
}