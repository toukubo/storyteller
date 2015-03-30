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


public class PostAdminVPForReportingConfigAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Admin admin = new AdminImpl();
		AdminForm adminform = (AdminForm) form;

                String error = "";
if(StringUtils.isBlank(req.getParameter("pagesize"))){
    error += "1ページあたりの最大表示行数は空にはできません。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("pagesize"))){
    error += "1ページあたりの最大表示行数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("pagesize"))){
    error += "1ページあたりの最大表示行数には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("decimallevel"))){
    error += "小数点以下表示桁数には数値のみを入れてください。<br />";
}
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",adminform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(adminform.getId() == null || adminform.getId().intValue() == 0){
			admin.setId(null);
			adminform.setId(null);
		}else{
			admin.setId(adminform.getId());
			Criteria criteria = session.createCriteria(Admin.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			admin = (Admin) criteria.uniqueResult();

		}
                		admin.setPagesize(adminform.getPagesize());
		admin.setDecimallevel(adminform.getDecimallevel());
		admin.setDisplayssummery(adminform.isDisplayssummery());


		
		StringFullfiller.fullfil(admin);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(admin);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostAdminDetail.do", admin.getId().toString());
		return null;

		
	}
	
	
}