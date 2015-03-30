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


public class PostCommunityCommentVPInPublicAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		CommunityComment communityComment = new CommunityCommentImpl();
		CommunityCommentForm communityCommentform = (CommunityCommentForm) form;

                String error = "";


                		Integer communityThreadInt = communityCommentform.getCommunityThread();
		communityCommentform.setCommunityThread(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(communityCommentform.getId() == null || communityCommentform.getId().intValue() == 0){
			communityComment.setId(null);
			communityCommentform.setId(null);
		}else{
			communityComment.setId(communityCommentform.getId());
			Criteria criteria = session.createCriteria(CommunityComment.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			communityComment = (CommunityComment) criteria.uniqueResult();

		}
                		communityComment.setTitle(communityCommentform.getTitle());
		communityComment.setDate(communityCommentform.getDate());


		
		StringFullfiller.fullfil(communityComment);
                		Criteria criteria2 = session.createCriteria(CommunityThread.class);
		criteria2.add(Restrictions.idEq(communityThreadInt));
		CommunityThread communitythread = (CommunityThread) criteria2.uniqueResult();
		communityComment.setCommunityThread(communitythread);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(communityComment);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostCommunityCommentDetail.do", communityComment.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "CommunityComments.do", communityComment.getId().toString());
		return null;

		
	}
	
	
}