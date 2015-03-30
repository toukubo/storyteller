package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;

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


public class PostTagVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Tag tag = new TagImpl();
		TagForm tagform = (TagForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(tagform.getId() == null || tagform.getId().intValue() == 0){
			tag.setId(null);
			tagform.setId(null);
		}else{
			tag.setId(tagform.getId());
			Criteria criteria = session.createCriteria(Tag.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			tag = (Tag) criteria.uniqueResult();

		}
                		tag.setWord(tagform.getWord());


		
		StringFullfiller.fullfil(tag);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(tag);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostTagDetail.do", tag.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Tags.do", tag.getId().toString());
		return null;

		
	}
	
	
}