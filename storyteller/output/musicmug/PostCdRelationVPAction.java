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


public class PostCdRelationVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		CdRelation cdRelation = new CdRelationImpl();
		CdRelationForm cdRelationform = (CdRelationForm) form;

                String error = "";


                		Integer fromcdInt = cdRelationform.getFromcd();
		cdRelationform.setFromcd(null);
		Integer tocdInt = cdRelationform.getTocd();
		cdRelationform.setTocd(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(cdRelationform.getId() == null || cdRelationform.getId().intValue() == 0){
			cdRelation.setId(null);
			cdRelationform.setId(null);
		}else{
			cdRelation.setId(cdRelationform.getId());
			Criteria criteria = session.createCriteria(CdRelation.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			cdRelation = (CdRelation) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(cdRelation);
                		Criteria criteria2 = session.createCriteria(Fromcd.class);
		criteria2.add(Restrictions.idEq(fromcdInt));
		Fromcd fromcd = (Fromcd) criteria2.uniqueResult();
		cdRelation.setFromcd(fromcd);
		criteria2 = session.createCriteria(Tocd.class);
		criteria2.add(Restrictions.idEq(tocdInt));
		Tocd tocd = (Tocd) criteria2.uniqueResult();
		cdRelation.setTocd(tocd);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(cdRelation);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostCdRelationDetail.do", cdRelation.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "CdRelations.do", cdRelation.getId().toString());
		return null;

		
	}
	
	
}