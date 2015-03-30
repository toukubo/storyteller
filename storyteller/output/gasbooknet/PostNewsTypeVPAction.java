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


public class PostNewsTypeVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		NewsType newsType = new NewsTypeImpl();
		NewsTypeForm newsTypeform = (NewsTypeForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(newsTypeform.getId() == null || newsTypeform.getId().intValue() == 0){
			newsType.setId(null);
			newsTypeform.setId(null);
		}else{
			newsType.setId(newsTypeform.getId());
			Criteria criteria = session.createCriteria(NewsType.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			newsType = (NewsType) criteria.uniqueResult();

		}
                		newsType.setName(newsTypeform.getName());


		
		StringFullfiller.fullfil(newsType);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(newsType);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostNewsTypeDetail.do", newsType.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "NewsTypes.do", newsType.getId().toString());
		return null;

		
	}
	
	
}