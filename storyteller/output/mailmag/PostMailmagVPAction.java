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


public class PostMailmagVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Mailmag mailmag = new MailmagImpl();
		MailmagForm mailmagform = (MailmagForm) form;

                String error = "";


                		Integer siteInt = mailmagform.getSite();
		mailmagform.setSite(null);
		Integer tagInt = mailmagform.getTag();
		mailmagform.setTag(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(mailmagform.getId() == null || mailmagform.getId().intValue() == 0){
			mailmag.setId(null);
			mailmagform.setId(null);
		}else{
			mailmag.setId(mailmagform.getId());
			Criteria criteria = session.createCriteria(Mailmag.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			mailmag = (Mailmag) criteria.uniqueResult();

		}
                		mailmag.setKeitai(mailmagform.isKeitai());
		mailmag.setPoplularity(mailmagform.getPoplularity());
		mailmag.setRecentlyadded(mailmagform.isRecentlyadded());
		mailmag.setDevidedlyderivered(mailmagform.isDevidedlyderivered());
		mailmag.setReservationdate(mailmagform.getReservationdate());
		mailmag.setReserved(mailmagform.isReserved());
		mailmag.setTitle(mailmagform.getTitle());
		mailmag.setDescription(mailmagform.getDescription());
		mailmag.setDate(mailmagform.getDate());


		
		StringFullfiller.fullfil(mailmag);
                		Criteria criteria2 = session.createCriteria(Site.class);
		criteria2.add(Restrictions.idEq(siteInt));
		Site site = (Site) criteria2.uniqueResult();
		mailmag.setSite(site);
		criteria2 = session.createCriteria(Tag.class);
		criteria2.add(Restrictions.idEq(tagInt));
		Tag tag = (Tag) criteria2.uniqueResult();
		mailmag.setTag(tag);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(mailmag);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostMailmagDetail.do", mailmag.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Mailmags.do", mailmag.getId().toString());
		return null;

		
	}
	
	
}