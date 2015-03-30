package net.recipe.web.app;

import net.recipe.model.*;
import net.recipe.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import java.util.Date;

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


public class ChoisesAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Choise.class);
                
		if(StringUtils.isNotBlank(req.getParameter("recipe"))) {
			Criteria criteria2 = session.createCriteria(Recipe.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("recipe"))));
			Recipe recipe = (Recipe) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("recipe", recipe));
		}
 
		if(StringUtils.isNotBlank(req.getParameter("datestartdate")) && StringUtils.isNotBlank(req.getParameter("dateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("datestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("dateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}


		req.setAttribute("choises",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Choise choise = (Choise) iter.next();
//			vector.add(choise);
//		}
		Choise choise = new ChoiseImpl();
		ChoiseForm choiseform = new ChoiseForm();
		criteria = session.createCriteria(Choise.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			choise = (Choise) criteria.uniqueResult();
			new CopyProperties(choise,choiseform);
		} else if(req.getAttribute("form")!=null){
                        choiseform = (ChoiseForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(choiseform.getId()));
			choise = (Choise) criteria.uniqueResult();
		}
		

		req.setAttribute("model",choise);
		req.setAttribute("form",choiseform);
		
		


                  Criteria criteriaRecipe= session.createCriteria(Recipe.class);
			req.setAttribute("Recipes", criteriaRecipe.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}