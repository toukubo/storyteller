package net.gasbooknet.web;

import net.gasbooknet.model.*;
import net.gasbooknet.model.crud.*;

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

public class ArtistTaggingVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ArtistTagging artistTagging = new ArtistTaggingImpl();
		ArtistTaggingForm artistTaggingform = (ArtistTaggingForm) form;
		
                		Integer tagInt = artistTaggingform.getTag();
		artistTaggingform.setTag(null);
		Integer artistInt = artistTaggingform.getArtist();
		artistTaggingform.setArtist(null);

		
		BeanUtils.copyProperties(artistTagging,artistTaggingform);
		StringFullfiller.fullfil(artistTagging);
		if(artistTaggingform.getId() == null || artistTaggingform.getId().intValue() == 0){
			artistTagging.setId(null);
		}else{
			artistTagging.setId(artistTaggingform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                		Criteria criteria2 = session.createCriteria(Tag.class);
		criteria2.add(Restrictions.idEq(tagInt));
		Tag tag = (Tag) criteria2.uniqueResult();
		artistTagging.setTag(tag);
		criteria2 = session.createCriteria(Artist.class);
		criteria2.add(Restrictions.idEq(artistInt));
		Artist artist = (Artist) criteria2.uniqueResult();
		artistTagging.setArtist(artist);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(artistTagging);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "ArtistTaggingDetail.do", artistTagging.getId().toString());
		return null;

		
	}
	
	
}