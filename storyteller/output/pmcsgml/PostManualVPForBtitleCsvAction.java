package net.pmcsgml.web.app;

import net.pmcsgml.model.*;
import net.pmcsgml.beans.*;

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


public class PostManualVPForBtitleCsvAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Manual manual = new ManualImpl();
		ManualForm manualform = (ManualForm) form;

                String error = "";
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",manualform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(manualform.getId() == null || manualform.getId().intValue() == 0){
			manual.setId(null);
			manualform.setId(null);
		}else{
			manual.setId(manualform.getId());
			Criteria criteria = session.createCriteria(Manual.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			manual = (Manual) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(manual);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(manual);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostManualDetail.do", manual.getId().toString());
		return null;

		
	}
	
	
}