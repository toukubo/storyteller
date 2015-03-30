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


public class PostStaffVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Staff staff = new StaffImpl();
		StaffForm staffform = (StaffForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(staffform.getId() == null || staffform.getId().intValue() == 0){
			staff.setId(null);
			staffform.setId(null);
		}else{
			staff.setId(staffform.getId());
			Criteria criteria = session.createCriteria(Staff.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			staff = (Staff) criteria.uniqueResult();

		}
                		staff.setStaffid(staffform.getStaffid());
		staff.setStaffpassword(staffform.getStaffpassword());
		staff.setStaffname(staffform.getStaffname());
		staff.setStaffsex(staffform.getStaffsex());
		staff.setStaffbirthday(staffform.getStaffbirthday());
		staff.setDateofbeginingwork(staffform.getDateofbeginingwork());


		
		StringFullfiller.fullfil(staff);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(staff);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostStaffDetail.do", staff.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Staffs.do", staff.getId().toString());
		return null;

		
	}
	
	
}