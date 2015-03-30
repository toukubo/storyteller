package net.musicmug.web.app;

import net.musicmug.model.*;
import net.musicmug.beans.*;

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


public class PostBbsCommentVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		BbsComment bbsComment = new BbsCommentImpl();
		BbsCommentForm bbsCommentform = (BbsCommentForm) form;

                String error = "";


                		Integer bbsThreadInt = bbsCommentform.getBbsThread();
		bbsCommentform.setBbsThread(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(bbsCommentform.getId() == null || bbsCommentform.getId().intValue() == 0){
			bbsComment.setId(null);
			bbsCommentform.setId(null);
		}else{
			bbsComment.setId(bbsCommentform.getId());
			Criteria criteria = session.createCriteria(BbsComment.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			bbsComment = (BbsComment) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(bbsComment);
                		Criteria criteria2 = session.createCriteria(BbsThread.class);
		criteria2.add(Restrictions.idEq(bbsThreadInt));
		BbsThread bbsthread = (BbsThread) criteria2.uniqueResult();
		bbsComment.setBbsThread(bbsthread);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(bbsComment);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostBbsCommentDetail.do", bbsComment.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "BbsComments.do", bbsComment.getId().toString());
		return null;

		
	}
	
	
}