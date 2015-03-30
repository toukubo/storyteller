package net.autolink.web.app;

import net.autolink.model.*;
import net.autolink.beans.*;

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


public class PostKeywordVPSettingUseAsKeywordNotAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Keyword keyword = new KeywordImpl();
		KeywordForm keywordform = (KeywordForm) form;

                String error = "";
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",keywordform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(keywordform.getId() == null || keywordform.getId().intValue() == 0){
			keyword.setId(null);
			keywordform.setId(null);
		}else{
			keyword.setId(keywordform.getId());
			Criteria criteria = session.createCriteria(Keyword.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			keyword = (Keyword) criteria.uniqueResult();

		}
                		keyword.setUseAsKeyword(keywordform.isUseAsKeyword());


		
		StringFullfiller.fullfil(keyword);
                
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(keyword);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostKeywordDetail.do", keyword.getId().toString(),"success=true");
		return null;

		
	}
	
	
}