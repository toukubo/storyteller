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


public class PostMugFavoriteVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		MugFavorite mugFavorite = new MugFavoriteImpl();
		MugFavoriteForm mugFavoriteform = (MugFavoriteForm) form;

                String error = "";


                		Integer topublicuserInt = mugFavoriteform.getTopublicuser();
		mugFavoriteform.setTopublicuser(null);
		Integer frompublicuserInt = mugFavoriteform.getFrompublicuser();
		mugFavoriteform.setFrompublicuser(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(mugFavoriteform.getId() == null || mugFavoriteform.getId().intValue() == 0){
			mugFavorite.setId(null);
			mugFavoriteform.setId(null);
		}else{
			mugFavorite.setId(mugFavoriteform.getId());
			Criteria criteria = session.createCriteria(MugFavorite.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			mugFavorite = (MugFavorite) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(mugFavorite);
                		Criteria criteria2 = session.createCriteria(Topublicuser.class);
		criteria2.add(Restrictions.idEq(topublicuserInt));
		Topublicuser topublicuser = (Topublicuser) criteria2.uniqueResult();
		mugFavorite.setTopublicuser(topublicuser);
		criteria2 = session.createCriteria(Frompublicuser.class);
		criteria2.add(Restrictions.idEq(frompublicuserInt));
		Frompublicuser frompublicuser = (Frompublicuser) criteria2.uniqueResult();
		mugFavorite.setFrompublicuser(frompublicuser);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(mugFavorite);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostMugFavoriteDetail.do", mugFavorite.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "MugFavorites.do", mugFavorite.getId().toString());
		return null;

		
	}
	
	
}