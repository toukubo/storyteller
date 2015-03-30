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


public class PostExcludedPrinterVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ExcludedPrinter excludedPrinter = new ExcludedPrinterImpl();
		ExcludedPrinterForm excludedPrinterform = (ExcludedPrinterForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(excludedPrinterform.getId() == null || excludedPrinterform.getId().intValue() == 0){
			excludedPrinter.setId(null);
			excludedPrinterform.setId(null);
		}else{
			excludedPrinter.setId(excludedPrinterform.getId());
			Criteria criteria = session.createCriteria(ExcludedPrinter.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			excludedPrinter = (ExcludedPrinter) criteria.uniqueResult();

		}
                		excludedPrinter.setName(excludedPrinterform.getName());


		
		StringFullfiller.fullfil(excludedPrinter);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(excludedPrinter);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostExcludedPrinterDetail.do", excludedPrinter.getId().toString());
		return null;

		
	}
	
	
}