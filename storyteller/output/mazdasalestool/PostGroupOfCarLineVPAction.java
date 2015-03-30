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


public class PostGroupOfCarLineVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		GroupOfCarLine groupOfCarLine = new GroupOfCarLineImpl();
		GroupOfCarLineForm groupOfCarLineform = (GroupOfCarLineForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(groupOfCarLineform.getId() == null || groupOfCarLineform.getId().intValue() == 0){
			groupOfCarLine.setId(null);
			groupOfCarLineform.setId(null);
		}else{
			groupOfCarLine.setId(groupOfCarLineform.getId());
			Criteria criteria = session.createCriteria(GroupOfCarLine.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			groupOfCarLine = (GroupOfCarLine) criteria.uniqueResult();

		}
                		groupOfCarLine.setName(groupOfCarLineform.getName());


		
		StringFullfiller.fullfil(groupOfCarLine);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(groupOfCarLine);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostGroupOfCarLineDetail.do", groupOfCarLine.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "GroupOfCarLines.do", groupOfCarLine.getId().toString());
		return null;

		
	}
	
	
}