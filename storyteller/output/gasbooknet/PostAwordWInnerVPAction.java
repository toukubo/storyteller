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


public class PostAwordWInnerVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		AwordWInner awordWInner = new AwordWInnerImpl();
		AwordWInnerForm awordWInnerform = (AwordWInnerForm) form;

                String error = "";


                		Integer awardInt = awordWInnerform.getAward();
		awordWInnerform.setAward(null);
		Integer artistInt = awordWInnerform.getArtist();
		awordWInnerform.setArtist(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(awordWInnerform.getId() == null || awordWInnerform.getId().intValue() == 0){
			awordWInner.setId(null);
			awordWInnerform.setId(null);
		}else{
			awordWInner.setId(awordWInnerform.getId());
			Criteria criteria = session.createCriteria(AwordWInner.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			awordWInner = (AwordWInner) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(awordWInner);
                		Criteria criteria2 = session.createCriteria(Award.class);
		criteria2.add(Restrictions.idEq(awardInt));
		Award award = (Award) criteria2.uniqueResult();
		awordWInner.setAward(award);
		criteria2 = session.createCriteria(Artist.class);
		criteria2.add(Restrictions.idEq(artistInt));
		Artist artist = (Artist) criteria2.uniqueResult();
		awordWInner.setArtist(artist);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(awordWInner);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostAwordWInnerDetail.do", awordWInner.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "AwordWInners.do", awordWInner.getId().toString());
		return null;

		
	}
	
	
}