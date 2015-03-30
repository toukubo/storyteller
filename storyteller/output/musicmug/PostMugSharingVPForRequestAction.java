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


public class PostMugSharingVPForRequestAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		MugSharing mugSharing = new MugSharingImpl();
		MugSharingForm mugSharingform = (MugSharingForm) form;

                String error = "";


                		Integer topublicuserInt = mugSharingform.getTopublicuser();
		mugSharingform.setTopublicuser(null);
		Integer frombugsharingInt = mugSharingform.getFrombugsharing();
		mugSharingform.setFrombugsharing(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(mugSharingform.getId() == null || mugSharingform.getId().intValue() == 0){
			mugSharing.setId(null);
			mugSharingform.setId(null);
		}else{
			mugSharing.setId(mugSharingform.getId());
			Criteria criteria = session.createCriteria(MugSharing.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			mugSharing = (MugSharing) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(mugSharing);
                		Criteria criteria2 = session.createCriteria(Topublicuser.class);
		criteria2.add(Restrictions.idEq(topublicuserInt));
		Topublicuser topublicuser = (Topublicuser) criteria2.uniqueResult();
		mugSharing.setTopublicuser(topublicuser);
		criteria2 = session.createCriteria(Frombugsharing.class);
		criteria2.add(Restrictions.idEq(frombugsharingInt));
		Frombugsharing frombugsharing = (Frombugsharing) criteria2.uniqueResult();
		mugSharing.setFrombugsharing(frombugsharing);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(mugSharing);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostMugSharingDetail.do", mugSharing.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "MugSharings.do", mugSharing.getId().toString());
		return null;

		
	}
	
	
}