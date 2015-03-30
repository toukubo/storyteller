package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

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


public class PostClientVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Client client = new ClientImpl();
		ClientForm clientform = (ClientForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(clientform.getId() == null || clientform.getId().intValue() == 0){
			client.setId(null);
			clientform.setId(null);
		}else{
			client.setId(clientform.getId());
			Criteria criteria = session.createCriteria(Client.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			client = (Client) criteria.uniqueResult();

		}
                		client.setName(clientform.getName());


		
		StringFullfiller.fullfil(client);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(client);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostClientDetail.do", client.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Clients.do", client.getId().toString());
		return null;

		
	}
	
	
}