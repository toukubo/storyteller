package net.djbi.web.app;

import net.djbi.model.*;
import net.djbi.beans.*;

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


public class PostRequestVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Request request = new RequestImpl();
		RequestForm requestform = (RequestForm) form;

                String error = "";


                		Integer userInt = requestform.getUser();
		requestform.setUser(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(requestform.getId() == null || requestform.getId().intValue() == 0){
			request.setId(null);
			requestform.setId(null);
		}else{
			request.setId(requestform.getId());
			Criteria criteria = session.createCriteria(Request.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			request = (Request) criteria.uniqueResult();

		}
                		request.setAcknowleged(requestform.isAcknowleged());
		request.setDate(requestform.getDate());


		
		StringFullfiller.fullfil(request);
                		Criteria criteria2 = session.createCriteria(User.class);
		criteria2.add(Restrictions.idEq(userInt));
		User user = (User) criteria2.uniqueResult();
		request.setUser(user);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(request);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostRequestDetail.do", request.getId().toString());
		return null;

		
	}
	
	
}