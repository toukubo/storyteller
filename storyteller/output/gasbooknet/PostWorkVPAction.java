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


public class PostWorkVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Work work = new WorkImpl();
		WorkForm workform = (WorkForm) form;

                String error = "";


                		Integer intraUserInt = workform.getIntraUser();
		workform.setIntraUser(null);
		Integer artistInt = workform.getArtist();
		workform.setArtist(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(workform.getId() == null || workform.getId().intValue() == 0){
			work.setId(null);
			workform.setId(null);
		}else{
			work.setId(workform.getId());
			Criteria criteria = session.createCriteria(Work.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			work = (Work) criteria.uniqueResult();

		}
                		work.setName(workform.getName());
		work.setDate(workform.getDate());
		work.setYear(workform.getYear());
		work.setDescription(workform.getDescription());
		work.setPoplular(workform.isPoplular());
		work.setPoplularity(workform.getPoplularity());
		work.setClient(workform.isClient());
		work.setProjectname(workform.getProjectname());
		work.setCopywrite(workform.getCopywrite());
		work.setProductionpurpose(workform.getProductionpurpose());
		work.setExposurehistory(workform.getExposurehistory());
		work.setCredit(workform.getCredit());
		work.setClientname(workform.getClientname());
		work.setCilentrequest(workform.getCilentrequest());
		work.setTitle(workform.getTitle());
		work.setExpiredate(workform.getExpiredate());
		work.setLicensed(workform.isLicensed());
		work.setParticulars(workform.getParticulars());
		work.setComments(workform.getComments());
		work.setLicensingpossibleafterexpired(workform.isLicensingpossibleafterexpired());


		
		StringFullfiller.fullfil(work);
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		work.setIntraUser(intrauser);
		criteria2 = session.createCriteria(Artist.class);
		criteria2.add(Restrictions.idEq(artistInt));
		Artist artist = (Artist) criteria2.uniqueResult();
		work.setArtist(artist);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(work);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostWorkDetail.do", work.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Works.do", work.getId().toString());
		return null;

		
	}
	
	
}