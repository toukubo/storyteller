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


public class PostExhibitionReportVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ExhibitionReport exhibitionReport = new ExhibitionReportImpl();
		ExhibitionReportForm exhibitionReportform = (ExhibitionReportForm) form;

                String error = "";


                		Integer exhibitionInt = exhibitionReportform.getExhibition();
		exhibitionReportform.setExhibition(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(exhibitionReportform.getId() == null || exhibitionReportform.getId().intValue() == 0){
			exhibitionReport.setId(null);
			exhibitionReportform.setId(null);
		}else{
			exhibitionReport.setId(exhibitionReportform.getId());
			Criteria criteria = session.createCriteria(ExhibitionReport.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			exhibitionReport = (ExhibitionReport) criteria.uniqueResult();

		}
                		exhibitionReport.setDemo(exhibitionReportform.getDemo());
		exhibitionReport.setEngenderabhotcustomer(exhibitionReportform.getEngenderabhotcustomer());
		exhibitionReport.setEngenderabhotstock(exhibitionReportform.getEngenderabhotstock());
		exhibitionReport.setEngenderabhotfree(exhibitionReportform.getEngenderabhotfree());
		exhibitionReport.setVisitorsabcustomer(exhibitionReportform.getVisitorsabcustomer());
		exhibitionReport.setVisitorsabnewother(exhibitionReportform.getVisitorsabnewother());
		exhibitionReport.setVisitorsnonabcustomer(exhibitionReportform.getVisitorsnonabcustomer());
		exhibitionReport.setVisitorsnonabstock(exhibitionReportform.getVisitorsnonabstock());
		exhibitionReport.setVisitorsnonabfree(exhibitionReportform.getVisitorsnonabfree());
		exhibitionReport.setQuestionnairecollected(exhibitionReportform.getQuestionnairecollected());
		exhibitionReport.setVip(exhibitionReportform.getVip());
		exhibitionReport.setAppraisalowncars(exhibitionReportform.getAppraisalowncars());
		exhibitionReport.setAppraisalothercars(exhibitionReportform.getAppraisalothercars());
		exhibitionReport.setCommitment(exhibitionReportform.getCommitment());
		exhibitionReport.setScramble(exhibitionReportform.getScramble());
		exhibitionReport.setOrderdetailabcustomer(exhibitionReportform.getOrderdetailabcustomer());
		exhibitionReport.setOrderdetailabnewother(exhibitionReportform.getOrderdetailabnewother());
		exhibitionReport.setOrderdetailnonabcustomer(exhibitionReportform.getOrderdetailnonabcustomer());
		exhibitionReport.setOrderdetailnonabstock(exhibitionReportform.getOrderdetailnonabstock());
		exhibitionReport.setOrderdetailnonabfree(exhibitionReportform.getOrderdetailnonabfree());
		exhibitionReport.setOrderdetailcarothers(exhibitionReportform.getOrderdetailcarothers());
		exhibitionReport.setOrderdetaillightcarothers(exhibitionReportform.getOrderdetaillightcarothers());
		exhibitionReport.setVisitmotivationcarothers(exhibitionReportform.getVisitmotivationcarothers());
		exhibitionReport.setVisitmotivationlightcarothers(exhibitionReportform.getVisitmotivationlightcarothers());
		exhibitionReport.setVisitmotivationdm(exhibitionReportform.getVisitmotivationdm());
		exhibitionReport.setVisitmotivationleaflet(exhibitionReportform.getVisitmotivationleaflet());
		exhibitionReport.setVisitmotivationnewspaperad(exhibitionReportform.getVisitmotivationnewspaperad());
		exhibitionReport.setVisitmotivationinpassing(exhibitionReportform.getVisitmotivationinpassing());
		exhibitionReport.setVisitmotivationtvradio(exhibitionReportform.getVisitmotivationtvradio());
		exhibitionReport.setVisitmotivationothers(exhibitionReportform.getVisitmotivationothers());
		exhibitionReport.setDatetime(exhibitionReportform.getDatetime());


		
		StringFullfiller.fullfil(exhibitionReport);
                		Criteria criteria2 = session.createCriteria(Exhibition.class);
		criteria2.add(Restrictions.idEq(exhibitionInt));
		Exhibition exhibition = (Exhibition) criteria2.uniqueResult();
		exhibitionReport.setExhibition(exhibition);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(exhibitionReport);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostExhibitionReportDetail.do", exhibitionReport.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "ExhibitionReports.do", exhibitionReport.getId().toString());
		return null;

		
	}
	
	
}