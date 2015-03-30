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
import org.hibernate.criterion.Restrictions;


public class PostExcelVPSettingDoneAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Excel excel = new ExcelImpl();
		ExcelForm excelform = (ExcelForm) form;

                String error = "";
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",excelform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(excelform.getId() == null || excelform.getId().intValue() == 0){
			excel.setId(null);
			excelform.setId(null);
		}else{
			excel.setId(excelform.getId());
			Criteria criteria = session.createCriteria(Excel.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			excel = (Excel) criteria.uniqueResult();

		}
                		excel.setDone(excelform.getDone());


		
		StringFullfiller.fullfil(excel);
                
		session.saveOrUpdate(excel);
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostExcelDetail.do", excel.getId().toString());
		return null;

		
	}
	
	
}