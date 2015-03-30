package net.ja.web.app;

import net.ja.model.*;
import net.ja.beans.*;

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


public class PostPageLayoutVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		PageLayout pageLayout = new PageLayoutImpl();
		PageLayoutForm pageLayoutform = (PageLayoutForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(pageLayoutform.getId() == null || pageLayoutform.getId().intValue() == 0){
			pageLayout.setId(null);
			pageLayoutform.setId(null);
		}else{
			pageLayout.setId(pageLayoutform.getId());
			Criteria criteria = session.createCriteria(PageLayout.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			pageLayout = (PageLayout) criteria.uniqueResult();

		}
                		pageLayout.setRequesturi(pageLayoutform.getRequesturi());


		
		StringFullfiller.fullfil(pageLayout);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(pageLayout);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostPageLayoutDetail.do", pageLayout.getId().toString());
		return null;

		
	}
	
	
}