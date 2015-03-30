package net.realize.web.app;

import net.realize.model.*;
import net.realize.beans.*;

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
import org.hibernate.criterion.Restrictions;


public class PostContactVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Contact contact = new ContactImpl();
		ContactForm contactform = (ContactForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(contactform.getId() == null || contactform.getId().intValue() == 0){
			contact.setId(null);
			contactform.setId(null);
		}else{
			contact.setId(contactform.getId());
			Criteria criteria = session.createCriteria(Contact.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			contact = (Contact) criteria.uniqueResult();

		}
                		contact.setEmail(contactform.getEmail());
		contact.setName(contactform.getName());
		contact.setDescription(contactform.getDescription());


		
		StringFullfiller.fullfil(contact);
                
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(contact);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostContactDetail.do", contact.getId().toString(),"success=true");
		return null;

		
	}
	
	
}