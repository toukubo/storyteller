package net.speeddial.web.app;

import net.speeddial.model.*;
import net.speeddial.beans.*;

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


public class PostClickHistoryVPAsNonPubAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ClickHistory clickHistory = new ClickHistoryImpl();
		ClickHistoryForm clickHistoryform = (ClickHistoryForm) form;

                String error = "";


                		Integer dialInt = clickHistoryform.getDial();
		clickHistoryform.setDial(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(clickHistoryform.getId() == null || clickHistoryform.getId().intValue() == 0){
			clickHistory.setId(null);
			clickHistoryform.setId(null);
		}else{
			clickHistory.setId(clickHistoryform.getId());
			Criteria criteria = session.createCriteria(ClickHistory.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			clickHistory = (ClickHistory) criteria.uniqueResult();

		}
                		clickHistory.setPub(clickHistoryform.isPub());


		
		StringFullfiller.fullfil(clickHistory);
                		Criteria criteria2 = session.createCriteria(Dial.class);
		criteria2.add(Restrictions.idEq(dialInt));
		Dial dial = (Dial) criteria2.uniqueResult();
		clickHistory.setDial(dial);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(clickHistory);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostClickHistoryDetail.do", clickHistory.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "ClickHistorys.do", clickHistory.getId().toString());
		return null;

		
	}
	
	
}