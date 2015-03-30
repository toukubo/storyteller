package net.tonersaver.web.app;

import net.tonersaver.model.*;
import net.tonersaver.beans.*;

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


public class PostDepartmentVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Department department = new DepartmentImpl();
		DepartmentForm departmentform = (DepartmentForm) form;

                String error = "";
if(StringUtils.isBlank(departmentform.getName())){
   error += "名前は空にはできません。<br />"; 
}

if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",departmentform);
	return mapping.findForward("error");
}


                		Integer parentDepartmentInt = departmentform.getParentDepartment();
		departmentform.setParentDepartment(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(departmentform.getId() == null || departmentform.getId().intValue() == 0){
			department.setId(null);
			departmentform.setId(null);
		}else{
			department.setId(departmentform.getId());
			Criteria criteria = session.createCriteria(Department.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			department = (Department) criteria.uniqueResult();

		}
                		department.setName(departmentform.getName());


		
		StringFullfiller.fullfil(department);
                		Criteria criteria2 = session.createCriteria(ParentDepartment.class);
		criteria2.add(Restrictions.idEq(parentDepartmentInt));
		ParentDepartment parentdepartment = (ParentDepartment) criteria2.uniqueResult();
		department.setParentDepartment(parentdepartment);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(department);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostDepartmentDetail.do", department.getId().toString());
		return null;

		
	}
	
	
}