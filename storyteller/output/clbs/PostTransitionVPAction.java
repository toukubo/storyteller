package net.clbs.web.app;

import net.clbs.model.*;
import net.clbs.beans.*;

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


public class PostTransitionVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Transition transition = new TransitionImpl();
		TransitionForm transitionform = (TransitionForm) form;

                String error = "";
if(StringUtils.isBlank(req.getParameter("operation"))){
    error += "は空にはできません。<br />";
}
if(StringUtils.isBlank(req.getParameter("bs"))){
    error += "血糖値は空にはできません。<br />";
}
if(StringUtils.isBlank(req.getParameter("datetime"))){
    error += "日時は空にはできません。<br />";
}
if(!transitionform.isdatetimeIsValid()){
   error += "日時 はyyyy/MM/ddにしてください。<br />";
}
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",transitionform);
	return mapping.findForward("error");
}


                		Integer operationInt = transitionform.getOperation();
		transitionform.setOperation(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(transitionform.getId() == null || transitionform.getId().intValue() == 0){
			transition.setId(null);
			transitionform.setId(null);
		}else{
			transition.setId(transitionform.getId());
			Criteria criteria = session.createCriteria(Transition.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			transition = (Transition) criteria.uniqueResult();

		}
                		transition.setBs(transitionform.getBs());
		transition.setDatetime(transitionform.getDatetime());


		
		StringFullfiller.fullfil(transition);
                		Criteria criteria2 = session.createCriteria(Operation.class);
		criteria2.add(Restrictions.idEq(operationInt));
		Operation operation = (Operation) criteria2.uniqueResult();
		transition.setOperation(operation);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(transition);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostTransitionDetail.do", transition.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Transitions.do", transition.getId().toString());
		return null;

		
	}
	
	
}