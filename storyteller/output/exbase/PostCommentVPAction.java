package net.exbase.web.app;

import net.exbase.model.*;
import net.exbase.beans.*;

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


public class PostCommentVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Comment comment = new CommentImpl();
		CommentForm commentform = (CommentForm) form;

                String error = "";
if(StringUtils.isBlank(commentform.getComment())){
   error += "コメントは空にはできません。<br />"; 
}

if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",commentform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(commentform.getId() == null || commentform.getId().intValue() == 0){
			comment.setId(null);
			commentform.setId(null);
		}else{
			comment.setId(commentform.getId());
			Criteria criteria = session.createCriteria(Comment.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			comment = (Comment) criteria.uniqueResult();

		}
                		comment.setComment(commentform.getComment());


		
		StringFullfiller.fullfil(comment);
                
		session.saveOrUpdate(comment);
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostCommentDetail.do", comment.getId().toString());
		return null;

		
	}
	
	
}