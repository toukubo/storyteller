package net.ars.web.app;

import net.ars.model.*;
import net.ars.beans.*;

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


public class PostAccidentVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Accident accident = new AccidentImpl();
		AccidentForm accidentform = (AccidentForm) form;

                String error = "";


                		Integer attachmentInt = accidentform.getAttachment();
		accidentform.setAttachment(null);
		Integer staffInt = accidentform.getStaff();
		accidentform.setStaff(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(accidentform.getId() == null || accidentform.getId().intValue() == 0){
			accident.setId(null);
			accidentform.setId(null);
		}else{
			accident.setId(accidentform.getId());
			Criteria criteria = session.createCriteria(Accident.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			accident = (Accident) criteria.uniqueResult();

		}
                		accident.setDay(accidentform.getDay());
		accident.setSex(accidentform.getSex());
		accident.setNumber(accidentform.getNumber());
		accident.setWeather(accidentform.getWeather());
		accident.setAccidentcategory(accidentform.getAccidentcategory());
		accident.setRoadname(accidentform.getRoadname());
		accident.setResponsibility(accidentform.getResponsibility());
		accident.setRoadcategory(accidentform.getRoadcategory());
		accident.setRoadcurve(accidentform.getRoadcurve());
		accident.setRoadview(accidentform.isRoadview());
		accident.setIntersection(accidentform.isIntersection());
		accident.setSignal(accidentform.isSignal());
		accident.setRoadgrade(accidentform.getRoadgrade());
		accident.setRoadwidth(accidentform.getRoadwidth());
		accident.setLimitingspeed(accidentform.getLimitingspeed());
		accident.setRoadcondition(accidentform.getRoadcondition());
		accident.setCarline(accidentform.getCarline());
		accident.setCargo(accidentform.isCargo());
		accident.setDeath(accidentform.getDeath());
		accident.setSeriousinjury(accidentform.getSeriousinjury());
		accident.setMinorinjury(accidentform.getMinorinjury());
		accident.setHazardperceptionspeed(accidentform.getHazardperceptionspeed());
		accident.setHazardperceptiondistance(accidentform.getHazardperceptiondistance());
		accident.setRegistrationplate(accidentform.getRegistrationplate());
		accident.setCarname(accidentform.getCarname());
		accident.setModelyear(accidentform.getModelyear());
		accident.setCostofinsurancebypersonalinjury(accidentform.getCostofinsurancebypersonalinjury());
		accident.setCostofcompanybypersonalinjury(accidentform.getCostofcompanybypersonalinjury());
		accident.setCostofinsurancebypropertydamage(accidentform.getCostofinsurancebypropertydamage());
		accident.setCostofcompanybypropatydamage(accidentform.getCostofcompanybypropatydamage());
		accident.setCostofinsurancebyautomobilephysicaldamage(accidentform.getCostofinsurancebyautomobilephysicaldamage());
		accident.setCostofcompanybyautomobilephysicaldamage(accidentform.getCostofcompanybyautomobilephysicaldamage());
		accident.setActionofsaftydriving(accidentform.isActionofsaftydriving());
		accident.setProblemdescription(accidentform.getProblemdescription());
		accident.setDatepfholdingsaftygroup(accidentform.getDatepfholdingsaftygroup());
		accident.setActionofsafy(accidentform.getActionofsafy());
		accident.setDateofholdingaccidentcommittee(accidentform.getDateofholdingaccidentcommittee());
		accident.setPenaltyofaccident(accidentform.getPenaltyofaccident());
		accident.setNumberofinssurance(accidentform.getNumberofinssurance());
		accident.setAge(accidentform.getAge());
		accident.setYearofemplyment(accidentform.getYearofemplyment());
		accident.setYearofexperience(accidentform.getYearofexperience());
		accident.setDivision(accidentform.getDivision());
		accident.setBranch(accidentform.getBranch());
		accident.setBranchcode(accidentform.getBranchcode());
		accident.setSection(accidentform.getSection());
		accident.setTelnumber(accidentform.getTelnumber());
		accident.setAccidenttype(accidentform.getAccidenttype());
		accident.setActionbeforeaccident(accidentform.getActionbeforeaccident());
		accident.setCauseofaccident(accidentform.getCauseofaccident());
		accident.setStaffcategory(accidentform.getStaffcategory());
		accident.setReportcode(accidentform.getReportcode());
		accident.setSubmittedstatus(accidentform.getSubmittedstatus());
		accident.setReportname(accidentform.getReportname());
		accident.setSubmitteddate(accidentform.getSubmitteddate());
		accident.setTime(accidentform.getTime());
		accident.setDate(accidentform.getDate());
		accident.setAddress(accidentform.getAddress());


		
		StringFullfiller.fullfil(accident);
                		Criteria criteria2 = session.createCriteria(Attachment.class);
		criteria2.add(Restrictions.idEq(attachmentInt));
		Attachment attachment = (Attachment) criteria2.uniqueResult();
		accident.setAttachment(attachment);
		criteria2 = session.createCriteria(Staff.class);
		criteria2.add(Restrictions.idEq(staffInt));
		Staff staff = (Staff) criteria2.uniqueResult();
		accident.setStaff(staff);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(accident);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostAccidentDetail.do", accident.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Accidents.do", accident.getId().toString());
		return null;

		
	}
	
	
}