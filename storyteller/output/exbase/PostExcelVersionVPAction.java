package net.exbase.web.app;

import net.exbase.model.*;
import net.exbase.beans.*;

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


public class PostExcelVersionVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ExcelVersion excelVersion = new ExcelVersionImpl();
		ExcelVersionForm excelVersionform = (ExcelVersionForm) form;

                String error = "";


                		Integer excelInt = excelVersionform.getExcel();
		excelVersionform.setExcel(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(excelVersionform.getId() == null || excelVersionform.getId().intValue() == 0){
			excelVersion.setId(null);
			excelVersionform.setId(null);
		}else{
			excelVersion.setId(excelVersionform.getId());
			Criteria criteria = session.createCriteria(ExcelVersion.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			excelVersion = (ExcelVersion) criteria.uniqueResult();

		}
                		excelVersion.setUploaddate(excelVersionform.getUploaddate());
		excelVersion.setName(excelVersionform.getName());


		
		StringFullfiller.fullfil(excelVersion);
                		Criteria criteria2 = session.createCriteria(Excel.class);
		criteria2.add(Restrictions.idEq(excelInt));
		Excel excel = (Excel) criteria2.uniqueResult();
		excelVersion.setExcel(excel);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(excelVersion);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostExcelVersionDetail.do", excelVersion.getId().toString());
		return null;

		
	}
	
	
}