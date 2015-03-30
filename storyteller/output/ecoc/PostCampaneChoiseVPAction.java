package net.ecoc.web.app;

import net.ecoc.model.*;
import net.ecoc.beans.*;

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


public class PostCampaneChoiseVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		CampaneChoise campaneChoise = new CampaneChoiseImpl();
		CampaneChoiseForm campaneChoiseform = (CampaneChoiseForm) form;

                String error = "";


                		Integer productInt = campaneChoiseform.getProduct();
		campaneChoiseform.setProduct(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(campaneChoiseform.getId() == null || campaneChoiseform.getId().intValue() == 0){
			campaneChoise.setId(null);
			campaneChoiseform.setId(null);
		}else{
			campaneChoise.setId(campaneChoiseform.getId());
			Criteria criteria = session.createCriteria(CampaneChoise.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			campaneChoise = (CampaneChoise) criteria.uniqueResult();

		}
                		campaneChoise.setTitle(campaneChoiseform.getTitle());
		campaneChoise.setDescription(campaneChoiseform.getDescription());


		
		StringFullfiller.fullfil(campaneChoise);
                		Criteria criteria2 = session.createCriteria(Product.class);
		criteria2.add(Restrictions.idEq(productInt));
		Product product = (Product) criteria2.uniqueResult();
		campaneChoise.setProduct(product);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(campaneChoise);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostCampaneChoiseDetail.do", campaneChoise.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "CampaneChoises.do", campaneChoise.getId().toString());
		return null;

		
	}
	
	
}