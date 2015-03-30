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


public class PostStaticDataVPForAdministrationAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		StaticData staticData = new StaticDataImpl();
		StaticDataForm staticDataform = (StaticDataForm) form;

                String error = "";
if(!StringUtils.isNumeric(req.getParameter("logserverport"))){
    error += "使用ポートには数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(req.getParameter("logserverport"))){
    error += "使用ポートは空にはできません。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("creditcardprocesurl"))){
    error += "には数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(req.getParameter("creditcardprocesurl"))){
    error += "は空にはできません。<br />";
}
if(StringUtils.isBlank(req.getParameter("timetokeeplog"))){
    error += "印刷ログ保存期間は空にはできません。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("timetokeeplog"))){
    error += "印刷ログ保存期間には数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(req.getParameter("timetokeepaccesslog"))){
    error += "アクセス履歴の保存期間設定は空にはできません。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("timetokeepaccesslog"))){
    error += "アクセス履歴の保存期間設定には数値のみを入れてください。<br />";
}
if(StringUtils.isBlank(req.getParameter("lisenceserviceport"))){
    error += "使用ポートは空にはできません。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("lisenceserviceport"))){
    error += "使用ポートには数値のみを入れてください。<br />";
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
                		staticData.setLogserverport(staticDataform.getLogserverport());
		staticData.setCreditcardprocesurl(staticDataform.getCreditcardprocesurl());
		staticData.setTimetokeeplog(staticDataform.getTimetokeeplog());
		staticData.setTimetokeepaccesslog(staticDataform.getTimetokeepaccesslog());
		staticData.setLisenceserviceport(staticDataform.getLisenceserviceport());


		
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