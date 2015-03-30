package net.craftclip.web.app;

import net.craftclip.model.*;
import net.craftclip.beans.*;

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


public class PostMovieVPForItsStatusAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Movie movie = new MovieImpl();
		MovieForm movieform = (MovieForm) form;

                String error = "";
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",movieform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(movieform.getId() == null || movieform.getId().intValue() == 0){
			movie.setId(null);
			movieform.setId(null);
		}else{
			movie.setId(movieform.getId());
			Criteria criteria = session.createCriteria(Movie.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			movie = (Movie) criteria.uniqueResult();

		}
                		movie.setStatus(movieform.getStatus());


		
		StringFullfiller.fullfil(movie);
                
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(movie);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostMovieDetail.do", movie.getId().toString(),"success=true");
		return null;

		
	}
	
	
}