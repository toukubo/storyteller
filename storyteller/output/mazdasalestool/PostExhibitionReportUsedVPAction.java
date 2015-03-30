package net.mazdasalestool.web.app;

import net.mazdasalestool.model.*;
import net.mazdasalestool.beans.*;

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


public class PostExhibitionReportUsedVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ExhibitionReportUsed exhibitionReportUsed = new ExhibitionReportUsedImpl();
		ExhibitionReportUsedForm exhibitionReportUsedform = (ExhibitionReportUsedForm) form;

                String error = "";


                		Integer exhibitionInt = exhibitionReportUsedform.getExhibition();
		exhibitionReportUsedform.setExhibition(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(exhibitionReportUsedform.getId() == null || exhibitionReportUsedform.getId().intValue() == 0){
			exhibitionReportUsed.setId(null);
			exhibitionReportUsedform.setId(null);
		}else{
			exhibitionReportUsed.setId(exhibitionReportUsedform.getId());
			Criteria criteria = session.createCriteria(ExhibitionReportUsed.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			exhibitionReportUsed = (ExhibitionReportUsed) criteria.uniqueResult();

		}
                		exhibitionReportUsed.setDate(exhibitionReportUsedform.getDate());
		exhibitionReportUsed.setEstimation(exhibitionReportUsedform.getEstimation());
		exhibitionReportUsed.setVisitaffirmation(exhibitionReportUsedform.getVisitaffirmation());
		exhibitionReportUsed.setVisitorsabnewother(exhibitionReportUsedform.getVisitorsabnewother());
		exhibitionReportUsed.setVisitorsnonabcustomer(exhibitionReportUsedform.getVisitorsnonabcustomer());
		exhibitionReportUsed.setVisitorsnonabstock(exhibitionReportUsedform.getVisitorsnonabstock());
		exhibitionReportUsed.setVisitorsnonabfree(exhibitionReportUsedform.getVisitorsnonabfree());
		exhibitionReportUsed.setQuestionnairecollected(exhibitionReportUsedform.getQuestionnairecollected());
		exhibitionReportUsed.setOrderdetailabcustomer(exhibitionReportUsedform.getOrderdetailabcustomer());
		exhibitionReportUsed.setOrderdetailabnewother(exhibitionReportUsedform.getOrderdetailabnewother());
		exhibitionReportUsed.setOrderdetailnonabcustomer(exhibitionReportUsedform.getOrderdetailnonabcustomer());
		exhibitionReportUsed.setOrderdetailnonabstock(exhibitionReportUsedform.getOrderdetailnonabstock());
		exhibitionReportUsed.setOrderdetailnonabfree(exhibitionReportUsedform.getOrderdetailnonabfree());
		exhibitionReportUsed.setVisitmotivationdm(exhibitionReportUsedform.getVisitmotivationdm());
		exhibitionReportUsed.setVisitmotivationleaflet(exhibitionReportUsedform.getVisitmotivationleaflet());
		exhibitionReportUsed.setVisitmotivationinpassing(exhibitionReportUsedform.getVisitmotivationinpassing());
		exhibitionReportUsed.setVisitmotivationothers(exhibitionReportUsedform.getVisitmotivationothers());
		exhibitionReportUsed.setTelephoneappointment(exhibitionReportUsedform.getTelephoneappointment());
		exhibitionReportUsed.setHaveacall(exhibitionReportUsedform.getHaveacall());
		exhibitionReportUsed.setVisitmotivationvisitaffirmation(exhibitionReportUsedform.getVisitmotivationvisitaffirmation());
		exhibitionReportUsed.setVisitmotivationintroduction(exhibitionReportUsedform.getVisitmotivationintroduction());
		exhibitionReportUsed.setVisitmotivationmagazines(exhibitionReportUsedform.getVisitmotivationmagazines());
		exhibitionReportUsed.setVisitmotivationinternet(exhibitionReportUsedform.getVisitmotivationinternet());
		exhibitionReportUsed.setSeated(exhibitionReportUsedform.getSeated());
		exhibitionReportUsed.setDemotrycar(exhibitionReportUsedform.getDemotrycar());
		exhibitionReportUsed.setSearchimages(exhibitionReportUsedform.getSearchimages());
		exhibitionReportUsed.setEngenderabhot(exhibitionReportUsedform.getEngenderabhot());
		exhibitionReportUsed.setOrderdetailownpassenger(exhibitionReportUsedform.getOrderdetailownpassenger());
		exhibitionReportUsed.setOrderdetailowndemio(exhibitionReportUsedform.getOrderdetailowndemio());
		exhibitionReportUsed.setOrderdetailownmpv(exhibitionReportUsedform.getOrderdetailownmpv());
		exhibitionReportUsed.setOrderdetailownpremacy(exhibitionReportUsedform.getOrderdetailownpremacy());
		exhibitionReportUsed.setOrderdetailownlightcar(exhibitionReportUsedform.getOrderdetailownlightcar());
		exhibitionReportUsed.setOrderdetailownvantrack(exhibitionReportUsedform.getOrderdetailownvantrack());
		exhibitionReportUsed.setOrderdetailotherpassenger(exhibitionReportUsedform.getOrderdetailotherpassenger());
		exhibitionReportUsed.setOrderdetailotherrv(exhibitionReportUsedform.getOrderdetailotherrv());
		exhibitionReportUsed.setOrderdetailotherlightcar(exhibitionReportUsedform.getOrderdetailotherlightcar());
		exhibitionReportUsed.setOrderdetailothervantrack(exhibitionReportUsedform.getOrderdetailothervantrack());
		exhibitionReportUsed.setVisitorsabcustomer(exhibitionReportUsedform.getVisitorsabcustomer());


		
		StringFullfiller.fullfil(exhibitionReportUsed);
                		Criteria criteria2 = session.createCriteria(Exhibition.class);
		criteria2.add(Restrictions.idEq(exhibitionInt));
		Exhibition exhibition = (Exhibition) criteria2.uniqueResult();
		exhibitionReportUsed.setExhibition(exhibition);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(exhibitionReportUsed);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostExhibitionReportUsedDetail.do", exhibitionReportUsed.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "ExhibitionReportUseds.do", exhibitionReportUsed.getId().toString());
		return null;

		
	}
	
	
}