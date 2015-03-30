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


public class PostSkinVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Skin skin = new SkinImpl();
		SkinForm skinform = (SkinForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(skinform.getId() == null || skinform.getId().intValue() == 0){
			skin.setId(null);
			skinform.setId(null);
		}else{
			skin.setId(skinform.getId());
			Criteria criteria = session.createCriteria(Skin.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			skin = (Skin) criteria.uniqueResult();

		}
                		skin.setCode(skinform.getCode());
		skin.setName(skinform.getName());


		
		StringFullfiller.fullfil(skin);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(skin);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostSkinDetail.do", skin.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Skins.do", skin.getId().toString());
		return null;

		
	}
	
	
}