package net.universe.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.universe.model.*;
import net.universe.beans.*;


import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import net.enclosing.util.HibernateSession;
import net.storyteller.desktop.CopyProperties;


public class PostContractDetailDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		ContractDetail contractDetail = new ContractDetailImpl();
		ContractDetailForm contractDetailform = new ContractDetailForm();
		Criteria criteria = session.createCriteria(ContractDetail.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			contractDetail = (ContractDetail) criteria.uniqueResult();
			new CopyProperties(contractDetail,contractDetailform);
		} else if(req.getAttribute("form")!=null){
                        contractDetailform = (ContractDetailForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(contractDetailform.getId()));
			contractDetail = (ContractDetail) criteria.uniqueResult();
		}
		

		req.setAttribute("model",contractDetail);
		req.setAttribute("form",contractDetailform);


                  Criteria criteriaNarrator= session.createCriteria(Narrator.class);
			req.setAttribute("Narrators", criteriaNarrator.list());

 
		
		return mapping.findForward("success");
	}
	
	
}