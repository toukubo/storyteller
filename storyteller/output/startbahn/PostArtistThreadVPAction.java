package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

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


public class PostArtistThreadVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ArtistThread artistThread = new ArtistThreadImpl();
		ArtistThreadForm artistThreadform = (ArtistThreadForm) form;

                String error = "";


                		Integer artistInt = artistThreadform.getArtist();
		artistThreadform.setArtist(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(artistThreadform.getId() == null || artistThreadform.getId().intValue() == 0){
			artistThread.setId(null);
			artistThreadform.setId(null);
		}else{
			artistThread.setId(artistThreadform.getId());
			Criteria criteria = session.createCriteria(ArtistThread.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			artistThread = (ArtistThread) criteria.uniqueResult();

		}
                		artistThread.setTitle(artistThreadform.getTitle());
		artistThread.setDate(artistThreadform.getDate());


		
		StringFullfiller.fullfil(artistThread);
                		Criteria criteria2 = session.createCriteria(Artist.class);
		criteria2.add(Restrictions.idEq(artistInt));
		Artist artist = (Artist) criteria2.uniqueResult();
		artistThread.setArtist(artist);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(artistThread);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostArtistThreadDetail.do", artistThread.getId().toString());
		return null;

		
	}
	
	
}