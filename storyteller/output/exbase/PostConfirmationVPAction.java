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


public class PostConfirmationVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Confirmation confirmation = new ConfirmationImpl();
		ConfirmationForm confirmationform = (ConfirmationForm) form;

                String error = "";


                		Integer activityInt = confirmationform.getActivity();
		confirmationform.setActivity(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(confirmationform.getId() == null || confirmationform.getId().intValue() == 0){
			confirmation.setId(null);
			confirmationform.setId(null);
		}else{
			confirmation.setId(confirmationform.getId());
			Criteria criteria = session.createCriteria(Confirmation.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			confirmation = (Confirmation) criteria.uniqueResult();

		}
                		confirmation.setDescription(confirmationform.getDescription());


		
		StringFullfiller.fullfil(confirmation);
                		Criteria criteria2 = session.createCriteria(Activity.class);
		criteria2.add(Restrictions.idEq(activityInt));
		Activity activity = (Activity) criteria2.uniqueResult();
		confirmation.setActivity(activity);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(confirmation);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostConfirmationDetail.do", confirmation.getId().toString());
		return null;

		
	}
	
	
}