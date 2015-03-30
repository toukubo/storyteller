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


public class PostArtistVPInPublicAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Artist artist = new ArtistImpl();
		ArtistForm artistform = (ArtistForm) form;

                String error = "";


                		Integer publicUserInt = artistform.getPublicUser();
		artistform.setPublicUser(null);
		Integer portraitInt = artistform.getPortrait();
		artistform.setPortrait(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(artistform.getId() == null || artistform.getId().intValue() == 0){
			artist.setId(null);
			artistform.setId(null);
		}else{
			artist.setId(artistform.getId());
			Criteria criteria = session.createCriteria(Artist.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			artist = (Artist) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(artist);
                		Criteria criteria2 = session.createCriteria(PublicUser.class);
		criteria2.add(Restrictions.idEq(publicUserInt));
		PublicUser publicuser = (PublicUser) criteria2.uniqueResult();
		artist.setPublicUser(publicuser);
		criteria2 = session.createCriteria(Portrait.class);
		criteria2.add(Restrictions.idEq(portraitInt));
		Portrait portrait = (Portrait) criteria2.uniqueResult();
		artist.setPortrait(portrait);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(artist);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostArtistDetail.do", artist.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Artists.do", artist.getId().toString());
		return null;

		
	}
	
	
}