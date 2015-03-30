package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

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


public class PostWorkVPForFolderAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Work work = new WorkImpl();
		WorkForm workform = (WorkForm) form;

                String error = "";
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",workform);
	return mapping.findForward("error");
}


                		Integer folderInt = workform.getFolder();
		workform.setFolder(null);

		
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
                

		
		StringFullfiller.fullfil(work);
                		Criteria criteria2 = session.createCriteria(Folder.class);
		criteria2.add(Restrictions.idEq(folderInt));
		Folder folder = (Folder) criteria2.uniqueResult();
		work.setFolder(folder);


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