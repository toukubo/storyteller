package net.malta.web.app;

import net.malta.model.*;
import net.malta.beans.*;

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


public class PostCarriageVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Carriage carriage = new CarriageImpl();
		CarriageForm carriageform = (CarriageForm) form;

                String error = "";
if(StringUtils.isBlank(carriageform.getName())){
   error += "名前は空にはできません。<br />"; 
}

if(StringUtils.isBlank(carriageform.getValue())){
   error += "値は空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("value"))){
    error += "値には数値のみを入れてください。<br />";
}
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",carriageform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(carriageform.getId() == null || carriageform.getId().intValue() == 0){
			carriage.setId(null);
			carriageform.setId(null);
		}else{
			carriage.setId(carriageform.getId());
			Criteria criteria = session.createCriteria(Carriage.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			carriage = (Carriage) criteria.uniqueResult();

		}
                		carriage.setName(carriageform.getName());
		carriage.setValue(carriageform.getValue());


		
		StringFullfiller.fullfil(carriage);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(carriage);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostCarriageDetail.do", carriage.getId().toString());
		return null;

		
	}
	
	
}