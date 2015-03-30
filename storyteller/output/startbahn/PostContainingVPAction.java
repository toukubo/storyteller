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


public class PostContainingVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Containing containing = new ContainingImpl();
		ContainingForm containingform = (ContainingForm) form;

                String error = "";


                		Integer workInt = containingform.getWork();
		containingform.setWork(null);
		Integer folderInt = containingform.getFolder();
		containingform.setFolder(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(containingform.getId() == null || containingform.getId().intValue() == 0){
			containing.setId(null);
			containingform.setId(null);
		}else{
			containing.setId(containingform.getId());
			Criteria criteria = session.createCriteria(Containing.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			containing = (Containing) criteria.uniqueResult();

		}
                		containing.setTag(containingform.getTag());
		containing.setModel(containingform.getModel());
		containing.setDate(containingform.getDate());


		
		StringFullfiller.fullfil(containing);
                		Criteria criteria2 = session.createCriteria(Work.class);
		criteria2.add(Restrictions.idEq(workInt));
		Work work = (Work) criteria2.uniqueResult();
		containing.setWork(work);
		criteria2 = session.createCriteria(Folder.class);
		criteria2.add(Restrictions.idEq(folderInt));
		Folder folder = (Folder) criteria2.uniqueResult();
		containing.setFolder(folder);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(containing);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostContainingDetail.do", containing.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Containings.do", containing.getId().toString());
		return null;

		
	}
	
	
}