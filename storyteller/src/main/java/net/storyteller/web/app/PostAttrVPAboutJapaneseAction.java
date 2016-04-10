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


public class PostAttrVPAboutJapaneseAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Attr attr = new AttrImpl();
		AttrForm attrform = (AttrForm) form;

                String error = "";
if(StringUtils.isBlank(attrform.getJapanese())){
   error += "�͋�ɂ͂ł��܂���B<br />"; 
}

if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",attrform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(attrform.getId() == null || attrform.getId().intValue() == 0){
			attr.setId(null);
			attrform.setId(null);
		}else{
			attr.setId(attrform.getId());
			Criteria criteria = session.createCriteria(Attr.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			attr = (Attr) criteria.uniqueResult();

		}
                		attr.setJapanese(attrform.getJapanese());


		
		StringFullfiller.fullfil(attr);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(attr);
		transaction.commit();
		session.flush();
if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		new HTTPGetRedirection(req, res, "PostAttrDetail.do", attr.getId().toString());

}
		
		new HTTPGetRedirection(req, res, "ShowJ2eeStoryAboutNouns.do", attr.getNoun().getJ2eeStory().getId().toString());
		return null;

		
	}
	
	
}