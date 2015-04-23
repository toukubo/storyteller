package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

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


public class PostNounVPAboutJapaneseAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Noun noun = new NounImpl();
		NounForm nounform = (NounForm) form;

                String error = "";
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",nounform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(nounform.getId() == null || nounform.getId().intValue() == 0){
			noun.setId(null);
			nounform.setId(null);
		}else{
			noun.setId(nounform.getId());
			Criteria criteria = session.createCriteria(Noun.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			noun = (Noun) criteria.uniqueResult();

		}
                		noun.setJapanese(nounform.getJapanese());


		
		StringFullfiller.fullfil(noun);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(noun);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "J2eeStoryDetail.do.do", noun.getJ2eeStory().getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "ShowJ2eeStoryAboutNouns.do", noun.getJ2eeStory().getId().toString());
		return null;

		
	}
	
	
}