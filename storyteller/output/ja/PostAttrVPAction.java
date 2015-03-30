package net.ja.web.app;

import net.ja.model.*;
import net.ja.beans.*;

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


public class PostAttrVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Attr attr = new AttrImpl();
		AttrForm attrform = (AttrForm) form;

                String error = "";


                		Integer nounInt = attrform.getNoun();
		attrform.setNoun(null);

		
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
                		attr.setName(attrform.getName());


		
		StringFullfiller.fullfil(attr);
                		Criteria criteria2 = session.createCriteria(Noun.class);
		criteria2.add(Restrictions.idEq(nounInt));
		Noun noun = (Noun) criteria2.uniqueResult();
		attr.setNoun(noun);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(attr);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostAttrDetail.do", attr.getId().toString());
		return null;

		
	}
	
	
}