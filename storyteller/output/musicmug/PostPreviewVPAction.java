package net.musicmug.web.app;

import net.musicmug.model.*;
import net.musicmug.beans.*;

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


public class PostPreviewVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Preview preview = new PreviewImpl();
		PreviewForm previewform = (PreviewForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(previewform.getId() == null || previewform.getId().intValue() == 0){
			preview.setId(null);
			previewform.setId(null);
		}else{
			preview.setId(previewform.getId());
			Criteria criteria = session.createCriteria(Preview.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			preview = (Preview) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(preview);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(preview);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostPreviewDetail.do", preview.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Previews.do", preview.getId().toString());
		return null;

		
	}
	
	
}