package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

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


public class ArtistCommentsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(ArtistComment.class);
                
		if(StringUtils.isNotBlank(req.getParameter("artistThread"))) {
			Criteria criteria2 = session.createCriteria(ArtistThread.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("artistThread"))));
			ArtistThread artistThread = (ArtistThread) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("artistThread", artistThread));
		}
 


		if(StringUtils.isNotBlank(req.getParameter("datestartdate")) && StringUtils.isNotBlank(req.getParameter("dateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("datestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("dateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}


		req.setAttribute("artistComments",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			ArtistComment artistComment = (ArtistComment) iter.next();
//			vector.add(artistComment);
//		}
		ArtistComment artistComment = new ArtistCommentImpl();
		ArtistCommentForm artistCommentform = new ArtistCommentForm();
		criteria = session.createCriteria(ArtistComment.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			artistComment = (ArtistComment) criteria.uniqueResult();
			new CopyProperties(artistComment,artistCommentform);
		} else if(req.getAttribute("form")!=null){
                        artistCommentform = (ArtistCommentForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(artistCommentform.getId()));
			artistComment = (ArtistComment) criteria.uniqueResult();
		}
		

		req.setAttribute("model",artistComment);
		req.setAttribute("form",artistCommentform);
		
		


                  Criteria criteriaArtistThread= session.createCriteria(ArtistThread.class);
			req.setAttribute("ArtistThreads", criteriaArtistThread.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}