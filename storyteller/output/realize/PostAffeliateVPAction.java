package net.realize.web.app;

import net.realize.model.*;
import net.realize.beans.*;

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


public class PostAffeliateVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Affeliate affeliate = new AffeliateImpl();
		AffeliateForm affeliateform = (AffeliateForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(affeliateform.getId() == null || affeliateform.getId().intValue() == 0){
			affeliate.setId(null);
			affeliateform.setId(null);
		}else{
			affeliate.setId(affeliateform.getId());
			Criteria criteria = session.createCriteria(Affeliate.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			affeliate = (Affeliate) criteria.uniqueResult();

		}
                		affeliate.setPrice(affeliateform.getPrice());
		affeliate.setTag(affeliateform.getTag());
		affeliate.setName(affeliateform.getName());


		
		StringFullfiller.fullfil(affeliate);
                
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(affeliate);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostAffeliateDetail.do", affeliate.getId().toString(),"success=true");
		return null;

		
	}
	
	
}