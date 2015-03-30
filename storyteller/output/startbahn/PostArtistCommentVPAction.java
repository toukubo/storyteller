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


public class PostArtistCommentVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ArtistComment artistComment = new ArtistCommentImpl();
		ArtistCommentForm artistCommentform = (ArtistCommentForm) form;

                String error = "";


                		Integer artistThreadInt = artistCommentform.getArtistThread();
		artistCommentform.setArtistThread(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(artistCommentform.getId() == null || artistCommentform.getId().intValue() == 0){
			artistComment.setId(null);
			artistCommentform.setId(null);
		}else{
			artistComment.setId(artistCommentform.getId());
			Criteria criteria = session.createCriteria(ArtistComment.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			artistComment = (ArtistComment) criteria.uniqueResult();

		}
                		artistComment.setTitle(artistCommentform.getTitle());
		artistComment.setDescription(artistCommentform.getDescription());
		artistComment.setDate(artistCommentform.getDate());


		
		StringFullfiller.fullfil(artistComment);
                		Criteria criteria2 = session.createCriteria(ArtistThread.class);
		criteria2.add(Restrictions.idEq(artistThreadInt));
		ArtistThread artistthread = (ArtistThread) criteria2.uniqueResult();
		artistComment.setArtistThread(artistthread);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(artistComment);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostArtistCommentDetail.do", artistComment.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "ArtistComments.do", artistComment.getId().toString());
		return null;

		
	}
	
	
}