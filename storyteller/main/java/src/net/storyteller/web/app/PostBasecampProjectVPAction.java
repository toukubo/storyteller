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


public class PostBasecampProjectVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		BasecampProject basecampProject = new BasecampProjectImpl();
		BasecampProjectForm basecampProjectform = (BasecampProjectForm) form;

                String error = "";


                		Integer basecampAccountInt = basecampProjectform.getBasecampAccount();
		basecampProjectform.setBasecampAccount(null);
		Integer j2eeStoryInt = basecampProjectform.getJ2eeStory();
		basecampProjectform.setJ2eeStory(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(basecampProjectform.getId() == null || basecampProjectform.getId().intValue() == 0){
			basecampProject.setId(null);
			basecampProjectform.setId(null);
		}else{
			basecampProject.setId(basecampProjectform.getId());
			Criteria criteria = session.createCriteria(BasecampProject.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			basecampProject = (BasecampProject) criteria.uniqueResult();

		}
                		basecampProject.setName(basecampProjectform.getName());


		
		StringFullfiller.fullfil(basecampProject);
                		Criteria criteria2 = session.createCriteria(BasecampAccount.class);
		criteria2.add(Restrictions.idEq(basecampAccountInt));
		BasecampAccount basecampaccount = (BasecampAccount) criteria2.uniqueResult();
		basecampProject.setBasecampAccount(basecampaccount);
		criteria2 = session.createCriteria(J2eeStory.class);
		criteria2.add(Restrictions.idEq(j2eeStoryInt));
		J2eeStory j2eestory = (J2eeStory) criteria2.uniqueResult();
		basecampProject.setJ2eeStory(j2eestory);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(basecampProject);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostBasecampProjectDetail.do", basecampProject.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "BasecampProjects.do", basecampProject.getId().toString());
		return null;

		
	}
	
	
}