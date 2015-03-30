package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;

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


public class PostDisciplineVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Discipline discipline = new DisciplineImpl();
		DisciplineForm disciplineform = (DisciplineForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(disciplineform.getId() == null || disciplineform.getId().intValue() == 0){
			discipline.setId(null);
			disciplineform.setId(null);
		}else{
			discipline.setId(disciplineform.getId());
			Criteria criteria = session.createCriteria(Discipline.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			discipline = (Discipline) criteria.uniqueResult();

		}
                		discipline.setName(disciplineform.getName());


		
		StringFullfiller.fullfil(discipline);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(discipline);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostDisciplineDetail.do", discipline.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Disciplines.do", discipline.getId().toString());
		return null;

		
	}
	
	
}