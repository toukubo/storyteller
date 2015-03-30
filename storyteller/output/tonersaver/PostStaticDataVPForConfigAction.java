package net.tonersaver.web.app;

import net.tonersaver.model.*;
import net.tonersaver.beans.*;

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


public class PostStaticDataVPForConfigAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		StaticData staticData = new StaticDataImpl();
		StaticDataForm staticDataform = (StaticDataForm) form;

                String error = "";
if(StringUtils.isBlank(staticdataform.getColorunitcost())){
   error += "カラー印刷は空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("colorunitcost"))){
    error += "カラー印刷には数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(staticdataform.getMonounitcost())){
   error += "モノクロ印刷は空にはできません。<br />"; 
}

if(!StringUtils.isNumeric(req.getParameter("monounitcost"))){
    error += "モノクロ印刷には数値のみを入れてください。<br />";
}
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",staticDataform);
	return mapping.findForward("error");
}


                
		
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
                		staticData.setColorunitcost(staticDataform.getColorunitcost());
		staticData.setMonounitcost(staticDataform.getMonounitcost());


		
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