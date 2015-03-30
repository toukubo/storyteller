package net.keionbu.web.app;

import net.keionbu.model.*;
import net.keionbu.beans.*;

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


public class GenresAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Genre.class);
                



		req.setAttribute("genres",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Genre genre = (Genre) iter.next();
//			vector.add(genre);
//		}
		Genre genre = new GenreImpl();
		GenreForm genreform = new GenreForm();
		criteria = session.createCriteria(Genre.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			genre = (Genre) criteria.uniqueResult();
			new CopyProperties(genre,genreform);
		} else if(req.getAttribute("form")!=null){
                        genreform = (GenreForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(genreform.getId()));
			genre = (Genre) criteria.uniqueResult();
		}
		

		req.setAttribute("model",genre);
		req.setAttribute("form",genreform);
		
		


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}