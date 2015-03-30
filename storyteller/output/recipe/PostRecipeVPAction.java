package net.recipe.web.app;

import net.recipe.model.*;
import net.recipe.beans.*;

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


public class PostRecipeVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Recipe recipe = new RecipeImpl();
		RecipeForm recipeform = (RecipeForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(recipeform.getId() == null || recipeform.getId().intValue() == 0){
			recipe.setId(null);
			recipeform.setId(null);
		}else{
			recipe.setId(recipeform.getId());
			Criteria criteria = session.createCriteria(Recipe.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			recipe = (Recipe) criteria.uniqueResult();

		}
                		recipe.setUrl(recipeform.getUrl());
		recipe.setName(recipeform.getName());
		recipe.setDate(recipeform.getDate());


		
		StringFullfiller.fullfil(recipe);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(recipe);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostRecipeDetail.do", recipe.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Recipes.do", recipe.getId().toString());
		return null;

		
	}
	
	
}