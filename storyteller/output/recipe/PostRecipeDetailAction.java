package net.recipe.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.recipe.model.*;
import net.recipe.beans.*;


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


public class PostRecipeDetailAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Recipe recipe = new RecipeImpl();
		RecipeForm recipeform = new RecipeForm();
		Criteria criteria = session.createCriteria(Recipe.class);

		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			recipe = (Recipe) criteria.uniqueResult();
			new CopyProperties(recipe,recipeform);
		} else if(req.getAttribute("form")!=null){
                        recipeform = (RecipeForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(recipeform.getId()));
			recipe = (Recipe) criteria.uniqueResult();
		}
		

		req.setAttribute("model",recipe);
		req.setAttribute("form",recipeform);


                   
		
		return mapping.findForward("success");
	}
	
	
}