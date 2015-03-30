package net.djbi.web.app;

import net.djbi.model.*;
import net.djbi.beans.*;

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


public class PostStaticDataVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		StaticData staticData = new StaticDataImpl();
		StaticDataForm staticDataform = (StaticDataForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(staticDataform.getId() == null || staticDataform.getId().intValue() == 0){
			staticData.setId(null);
			staticDataform.setId(null);
		}else{
			staticData.setId(staticDataform.getId());
			Criteria criteria = session.createCriteria(StaticData.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			staticData = (StaticData) criteria.uniqueResult();

		}
                		staticData.setCarriage(staticDataform.getCarriage());
		staticData.setFromaddress(staticDataform.getFromaddress());
		staticData.setSitename(staticDataform.getSitename());
		staticData.setBasepath(staticDataform.getBasepath());
		staticData.setUnix(staticDataform.isUnix());
		staticData.setMapeventspan(staticDataform.getMapeventspan());
		staticData.setCreditcardprocesurl(staticDataform.getCreditcardprocesurl());


		
		StringFullfiller.fullfil(staticData);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(staticData);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostStaticDataDetail.do", staticData.getId().toString());
		return null;

		
	}
	
	
}