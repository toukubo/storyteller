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


public class PostPrefectureVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Prefecture prefecture = new PrefectureImpl();
		PrefectureForm prefectureform = (PrefectureForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(prefectureform.getId() == null || prefectureform.getId().intValue() == 0){
			prefecture.setId(null);
			prefectureform.setId(null);
		}else{
			prefecture.setId(prefectureform.getId());
			Criteria criteria = session.createCriteria(Prefecture.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			prefecture = (Prefecture) criteria.uniqueResult();

		}
                		prefecture.setName(prefectureform.getName());


		
		StringFullfiller.fullfil(prefecture);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(prefecture);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostPrefectureDetail.do", prefecture.getId().toString());
		return null;

		
	}
	
	
}