package net.mazdasalestool.web.app;

import net.mazdasalestool.model.*;
import net.mazdasalestool.beans.*;

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


public class PostExhibitionIntraUserVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ExhibitionIntraUser exhibitionIntraUser = new ExhibitionIntraUserImpl();
		ExhibitionIntraUserForm exhibitionIntraUserform = (ExhibitionIntraUserForm) form;

                String error = "";


                		Integer intraUserInt = exhibitionIntraUserform.getIntraUser();
		exhibitionIntraUserform.setIntraUser(null);
		Integer exhibitionInt = exhibitionIntraUserform.getExhibition();
		exhibitionIntraUserform.setExhibition(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(exhibitionIntraUserform.getId() == null || exhibitionIntraUserform.getId().intValue() == 0){
			exhibitionIntraUser.setId(null);
			exhibitionIntraUserform.setId(null);
		}else{
			exhibitionIntraUser.setId(exhibitionIntraUserform.getId());
			Criteria criteria = session.createCriteria(ExhibitionIntraUser.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			exhibitionIntraUser = (ExhibitionIntraUser) criteria.uniqueResult();

		}
                		exhibitionIntraUser.setDm(exhibitionIntraUserform.getDm());
		exhibitionIntraUser.setTc(exhibitionIntraUserform.getTc());
		exhibitionIntraUser.setVisitaffirmation(exhibitionIntraUserform.getVisitaffirmation());
		exhibitionIntraUser.setCustomerabaffirmationvisit(exhibitionIntraUserform.getCustomerabaffirmationvisit());
		exhibitionIntraUser.setCustomerabnonaffirmationvisit(exhibitionIntraUserform.getCustomerabnonaffirmationvisit());
		exhibitionIntraUser.setCustomernonabaffirmationvisit(exhibitionIntraUserform.getCustomernonabaffirmationvisit());
		exhibitionIntraUser.setCustomernonabnonaffirmationvisit(exhibitionIntraUserform.getCustomernonabnonaffirmationvisit());
		exhibitionIntraUser.setCustomernonabfreevisit(exhibitionIntraUserform.getCustomernonabfreevisit());
		exhibitionIntraUser.setDemo(exhibitionIntraUserform.getDemo());
		exhibitionIntraUser.setEngenderabhotcustomer(exhibitionIntraUserform.getEngenderabhotcustomer());
		exhibitionIntraUser.setEngenderabhotstock(exhibitionIntraUserform.getEngenderabhotstock());
		exhibitionIntraUser.setEngenderabhotfree(exhibitionIntraUserform.getEngenderabhotfree());
		exhibitionIntraUser.setOrderedcarsabcustomer(exhibitionIntraUserform.getOrderedcarsabcustomer());
		exhibitionIntraUser.setOrderedcarsabnewother(exhibitionIntraUserform.getOrderedcarsabnewother());
		exhibitionIntraUser.setOrderedcarsnonabcustomer(exhibitionIntraUserform.getOrderedcarsnonabcustomer());
		exhibitionIntraUser.setOrderedcarsnonabstock(exhibitionIntraUserform.getOrderedcarsnonabstock());
		exhibitionIntraUser.setOrderedcarsnonabfree(exhibitionIntraUserform.getOrderedcarsnonabfree());


		
		StringFullfiller.fullfil(exhibitionIntraUser);
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		exhibitionIntraUser.setIntraUser(intrauser);
		criteria2 = session.createCriteria(Exhibition.class);
		criteria2.add(Restrictions.idEq(exhibitionInt));
		Exhibition exhibition = (Exhibition) criteria2.uniqueResult();
		exhibitionIntraUser.setExhibition(exhibition);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(exhibitionIntraUser);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostExhibitionIntraUserDetail.do", exhibitionIntraUser.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "ExhibitionIntraUsers.do", exhibitionIntraUser.getId().toString());
		return null;

		
	}
	
	
}