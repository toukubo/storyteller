package net.photo.web.app;

import net.photo.model.*;
import net.photo.beans.*;

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


public class PostWorkVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Work work = new WorkImpl();
		WorkForm workform = (WorkForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(workform.getId() == null || workform.getId().intValue() == 0){
			work.setId(null);
			workform.setId(null);
		}else{
			work.setId(workform.getId());
			Criteria criteria = session.createCriteria(Work.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			work = (Work) criteria.uniqueResult();

		}
                		work.setClient(workform.getClient());
		work.setName(workform.getName());
		work.setDescription(workform.getDescription());
		work.setDate(workform.getDate());


		
		StringFullfiller.fullfil(work);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(work);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostWorkDetail.do", work.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Works.do", work.getId().toString());
		return null;

		
	}
	
	
}