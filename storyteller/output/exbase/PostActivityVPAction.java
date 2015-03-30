package net.exbase.web.app;

import net.exbase.model.*;
import net.exbase.beans.*;

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


public class PostActivityVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Activity activity = new ActivityImpl();
		ActivityForm activityform = (ActivityForm) form;

                String error = "";
if(StringUtils.isBlank(activityform.getDone())){
   error += "æ¥æ¬èªは空にはできません。<br />"; 
}

if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",activityform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(activityform.getId() == null || activityform.getId().intValue() == 0){
			activity.setId(null);
			activityform.setId(null);
		}else{
			activity.setId(activityform.getId());
			Criteria criteria = session.createCriteria(Activity.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			activity = (Activity) criteria.uniqueResult();

		}
                		activity.setDone(activityform.getDone());
		activity.setNotified(activityform.getNotified());
		activity.setUpdatedate(activityform.getUpdatedate());


		
		StringFullfiller.fullfil(activity);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(activity);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostActivityDetail.do", activity.getId().toString());
		return null;

		
	}
	
	
}