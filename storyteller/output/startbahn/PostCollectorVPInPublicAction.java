package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

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


public class PostCollectorVPInPublicAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Collector collector = new CollectorImpl();
		CollectorForm collectorform = (CollectorForm) form;

                String error = "";


                		Integer publicUserInt = collectorform.getPublicUser();
		collectorform.setPublicUser(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(collectorform.getId() == null || collectorform.getId().intValue() == 0){
			collector.setId(null);
			collectorform.setId(null);
		}else{
			collector.setId(collectorform.getId());
			Criteria criteria = session.createCriteria(Collector.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			collector = (Collector) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(collector);
                		Criteria criteria2 = session.createCriteria(PublicUser.class);
		criteria2.add(Restrictions.idEq(publicUserInt));
		PublicUser publicuser = (PublicUser) criteria2.uniqueResult();
		collector.setPublicUser(publicuser);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(collector);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostCollectorDetail.do", collector.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Collectors.do", collector.getId().toString());
		return null;

		
	}
	
	
}