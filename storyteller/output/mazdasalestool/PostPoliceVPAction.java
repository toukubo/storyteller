package net.mazdasalestool.web.app;

import net.mazdasalestool.model.*;
import net.mazdasalestool.beans.*;

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


public class PostPoliceVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Police police = new PoliceImpl();
		PoliceForm policeform = (PoliceForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(policeform.getId() == null || policeform.getId().intValue() == 0){
			police.setId(null);
			policeform.setId(null);
		}else{
			police.setId(policeform.getId());
			Criteria criteria = session.createCriteria(Police.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			police = (Police) criteria.uniqueResult();

		}
                		police.setName(policeform.getName());
		police.setSortorder(policeform.getSortorder());


		
		StringFullfiller.fullfil(police);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(police);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostPoliceDetail.do", police.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Polices.do", police.getId().toString());
		return null;

		
	}
	
	
}