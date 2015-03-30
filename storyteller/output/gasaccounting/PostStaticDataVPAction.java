package net.gasaccounting.web.app;

import net.gasaccounting.model.*;
import net.gasaccounting.beans.*;

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
		
		StaticData staticdata = new StaticDataImpl();
		StaticDataForm staticdataform = (StaticDataForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(staticdataform.getId() == null || staticdataform.getId().intValue() == 0){
			staticdata.setId(null);
			staticdataform.setId(null);
		}else{
			staticdata.setId(staticdataform.getId());
			Criteria criteria = session.createCriteria(StaticData.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			staticdata = (StaticData) criteria.uniqueResult();

		}
                		staticdata.setIcalsyncspan(staticdataform.getIcalsyncspan());
		staticdata.setApid(staticdataform.getApid());


		
		StringFullfiller.fullfil(staticdata);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(staticdata);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostStaticDataDetail.do", staticdata.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "StaticDatas.do", staticdata.getId().toString());
		return null;

		
	}
	
	
}