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


public class PostIntraUserVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		IntraUser intraUser = new IntraUserImpl();
		IntraUserForm intraUserform = (IntraUserForm) form;

                String error = "";


                		Integer baseInt = intraUserform.getBase();
		intraUserform.setBase(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(intraUserform.getId() == null || intraUserform.getId().intValue() == 0){
			intraUser.setId(null);
			intraUserform.setId(null);
		}else{
			intraUser.setId(intraUserform.getId());
			Criteria criteria = session.createCriteria(IntraUser.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			intraUser = (IntraUser) criteria.uniqueResult();

		}
                		intraUser.setName(intraUserform.getName());
		intraUser.setPassword(intraUserform.getPassword());
		intraUser.setGroupname(intraUserform.getGroupname());
		intraUser.setRemoved(intraUserform.getRemoved());
		intraUser.setEmployeecode(intraUserform.getEmployeecode());
		intraUser.setMailaddr(intraUserform.getMailaddr());
		intraUser.setRecivemail(intraUserform.getRecivemail());


		
		StringFullfiller.fullfil(intraUser);
                		Criteria criteria2 = session.createCriteria(Base.class);
		criteria2.add(Restrictions.idEq(baseInt));
		Base base = (Base) criteria2.uniqueResult();
		intraUser.setBase(base);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(intraUser);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostIntraUserDetail.do", intraUser.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "IntraUsers.do", intraUser.getId().toString());
		return null;

		
	}
	
	
}