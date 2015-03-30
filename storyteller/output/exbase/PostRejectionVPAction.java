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


public class PostRejectionVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Rejection rejection = new RejectionImpl();
		RejectionForm rejectionform = (RejectionForm) form;

                String error = "";


                		Integer activityInt = rejectionform.getActivity();
		rejectionform.setActivity(null);
		Integer targetActivityInt = rejectionform.getTargetActivity();
		rejectionform.setTargetActivity(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(rejectionform.getId() == null || rejectionform.getId().intValue() == 0){
			rejection.setId(null);
			rejectionform.setId(null);
		}else{
			rejection.setId(rejectionform.getId());
			Criteria criteria = session.createCriteria(Rejection.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			rejection = (Rejection) criteria.uniqueResult();

		}
                		rejection.setDescription(rejectionform.getDescription());


		
		StringFullfiller.fullfil(rejection);
                		Criteria criteria2 = session.createCriteria(Activity.class);
		criteria2.add(Restrictions.idEq(activityInt));
		Activity activity = (Activity) criteria2.uniqueResult();
		rejection.setActivity(activity);
		criteria2 = session.createCriteria(TargetActivity.class);
		criteria2.add(Restrictions.idEq(targetActivityInt));
		TargetActivity targetactivity = (TargetActivity) criteria2.uniqueResult();
		rejection.setTargetActivity(targetactivity);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(rejection);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostRejectionDetail.do", rejection.getId().toString());
		return null;

		
	}
	
	
}