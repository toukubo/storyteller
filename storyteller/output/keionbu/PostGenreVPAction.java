package net.keionbu.web.app;

import net.keionbu.model.*;
import net.keionbu.beans.*;

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


public class PostGenreVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Genre genre = new GenreImpl();
		GenreForm genreform = (GenreForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(genreform.getId() == null || genreform.getId().intValue() == 0){
			genre.setId(null);
			genreform.setId(null);
		}else{
			genre.setId(genreform.getId());
			Criteria criteria = session.createCriteria(Genre.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			genre = (Genre) criteria.uniqueResult();

		}
                		genre.setName(genreform.getName());


		
		StringFullfiller.fullfil(genre);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(genre);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostGenreDetail.do", genre.getId().toString());
		return null;

		
	}
	
	
}