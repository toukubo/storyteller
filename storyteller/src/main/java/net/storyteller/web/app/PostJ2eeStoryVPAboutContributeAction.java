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


public class PostJ2eeStoryVPAboutContributeAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		J2eeStory j2eeStory = new J2eeStoryImpl();
		J2eeStoryForm j2eeStoryform = (J2eeStoryForm) form;

                String error = "";
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",j2eeStoryform);
	return mapping.findForward("error");
}


                		Integer contributeInt = j2eeStoryform.getContribute();
		j2eeStoryform.setContribute(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(j2eeStoryform.getId() == null || j2eeStoryform.getId().intValue() == 0){
			j2eeStory.setId(null);
			j2eeStoryform.setId(null);
		}else{
			j2eeStory.setId(j2eeStoryform.getId());
			Criteria criteria = session.createCriteria(J2eeStory.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			j2eeStory = (J2eeStory) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(j2eeStory);
                		Criteria criteria2 = session.createCriteria(Contribute.class);
		criteria2.add(Restrictions.idEq(contributeInt));
		Contribute contribute = (Contribute) criteria2.uniqueResult();
		j2eeStory.setContribute(contribute);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(j2eeStory);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostJ2eeStoryDetail.do", j2eeStory.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "J2eeStorys.do", j2eeStory.getId().toString());
		return null;

		
	}
	
	
}