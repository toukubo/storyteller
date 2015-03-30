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


public class PostHistoricalProfileVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		HistoricalProfile historicalProfile = new HistoricalProfileImpl();
		HistoricalProfileForm historicalProfileform = (HistoricalProfileForm) form;

                String error = "";


                		Integer artistInt = historicalProfileform.getArtist();
		historicalProfileform.setArtist(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(historicalProfileform.getId() == null || historicalProfileform.getId().intValue() == 0){
			historicalProfile.setId(null);
			historicalProfileform.setId(null);
		}else{
			historicalProfile.setId(historicalProfileform.getId());
			Criteria criteria = session.createCriteria(HistoricalProfile.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			historicalProfile = (HistoricalProfile) criteria.uniqueResult();

		}
                		historicalProfile.setDescription(historicalProfileform.getDescription());
		historicalProfile.setDate(historicalProfileform.getDate());


		
		StringFullfiller.fullfil(historicalProfile);
                		Criteria criteria2 = session.createCriteria(Artist.class);
		criteria2.add(Restrictions.idEq(artistInt));
		Artist artist = (Artist) criteria2.uniqueResult();
		historicalProfile.setArtist(artist);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(historicalProfile);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostHistoricalProfileDetail.do", historicalProfile.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "HistoricalProfiles.do", historicalProfile.getId().toString());
		return null;

		
	}
	
	
}