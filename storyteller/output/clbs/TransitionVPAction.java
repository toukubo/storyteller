package net.clbs.web;

import net.clbs.model.*;
import net.clbs.model.crud.*;

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

public class TransitionVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Transition transition = new TransitionImpl();
		TransitionForm transitionform = (TransitionForm) form;
		
                		Integer operationInt = transitionform.getOperation();
		transitionform.setOperation(null);

		
		BeanUtils.copyProperties(transition,transitionform);
		StringFullfiller.fullfil(transition);
		if(transitionform.getId() == null || transitionform.getId().intValue() == 0){
			transition.setId(null);
		}else{
			transition.setId(transitionform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Operation.class);
		criteria2.add(Restrictions.idEq(operationInt));
		Operation operation = (Operation) criteria2.uniqueResult();
		transition.setOperation(operation);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(transition);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "TransitionDetail.do", transition.getId().toString());
		return null;

		
	}
	
	
}