package net.ars.web.app;

import net.ars.model.*;
import net.ars.beans.*;

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


public class PostDetailAccidentVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		DetailAccident detailAccident = new DetailAccidentImpl();
		DetailAccidentForm detailAccidentform = (DetailAccidentForm) form;

                String error = "";


                		Integer accidentInt = detailAccidentform.getAccident();
		detailAccidentform.setAccident(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(detailAccidentform.getId() == null || detailAccidentform.getId().intValue() == 0){
			detailAccident.setId(null);
			detailAccidentform.setId(null);
		}else{
			detailAccident.setId(detailAccidentform.getId());
			Criteria criteria = session.createCriteria(DetailAccident.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			detailAccident = (DetailAccident) criteria.uniqueResult();

		}
                		detailAccident.setAccidenttime(detailAccidentform.getAccidenttime());
		detailAccident.setAccidentdetail(detailAccidentform.getAccidentdetail());


		
		StringFullfiller.fullfil(detailAccident);
                		Criteria criteria2 = session.createCriteria(Accident.class);
		criteria2.add(Restrictions.idEq(accidentInt));
		Accident accident = (Accident) criteria2.uniqueResult();
		detailAccident.setAccident(accident);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(detailAccident);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostDetailAccidentDetail.do", detailAccident.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "DetailAccidents.do", detailAccident.getId().toString());
		return null;

		
	}
	
	
}