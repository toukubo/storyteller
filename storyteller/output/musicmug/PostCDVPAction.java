package net.musicmug.web.app;

import net.musicmug.model.*;
import net.musicmug.beans.*;

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


public class PostCDVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		CD cD = new CDImpl();
		CDForm cDform = (CDForm) form;

                String error = "";


                		Integer intraUserInt = cDform.getIntraUser();
		cDform.setIntraUser(null);
		Integer artistInt = cDform.getArtist();
		cDform.setArtist(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(cDform.getId() == null || cDform.getId().intValue() == 0){
			cD.setId(null);
			cDform.setId(null);
		}else{
			cD.setId(cDform.getId());
			Criteria criteria = session.createCriteria(CD.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			cD = (CD) criteria.uniqueResult();

		}
                		cD.setName(cDform.getName());
		cD.setDate(cDform.getDate());
		cD.setYear(cDform.getYear());
		cD.setDescription(cDform.getDescription());
		cD.setTitle(cDform.getTitle());
		cD.setPoplular(cDform.isPoplular());
		cD.setPoplularity(cDform.getPoplularity());
		cD.setProjectname(cDform.getProjectname());
		cD.setCopywrite(cDform.getCopywrite());
		cD.setProductionpurpose(cDform.getProductionpurpose());
		cD.setExposurehistory(cDform.getExposurehistory());
		cD.setCredit(cDform.getCredit());
		cD.setClient(cDform.isClient());
		cD.setClientname(cDform.getClientname());
		cD.setCilentrequest(cDform.getCilentrequest());
		cD.setExpiredate(cDform.getExpiredate());
		cD.setLicensed(cDform.isLicensed());
		cD.setParticulars(cDform.getParticulars());
		cD.setComments(cDform.getComments());
		cD.setLicensingpossibleafterexpired(cDform.isLicensingpossibleafterexpired());


		
		StringFullfiller.fullfil(cD);
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		cD.setIntraUser(intrauser);
		criteria2 = session.createCriteria(Artist.class);
		criteria2.add(Restrictions.idEq(artistInt));
		Artist artist = (Artist) criteria2.uniqueResult();
		cD.setArtist(artist);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(cD);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostCDDetail.do", cD.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "CDs.do", cD.getId().toString());
		return null;

		
	}
	
	
}