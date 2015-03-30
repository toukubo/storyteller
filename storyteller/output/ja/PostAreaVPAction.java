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


public class PostAreaVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Area area = new AreaImpl();
		AreaForm areaform = (AreaForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(areaform.getId() == null || areaform.getId().intValue() == 0){
			area.setId(null);
			areaform.setId(null);
		}else{
			area.setId(areaform.getId());
			Criteria criteria = session.createCriteria(Area.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			area = (Area) criteria.uniqueResult();

		}
                		area.setCode(areaform.getCode());
		area.setJacode(areaform.getJacode());
		area.setName(areaform.getName());


		
		StringFullfiller.fullfil(area);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(area);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostAreaDetail.do", area.getId().toString());
		return null;

		
	}
	
	
}