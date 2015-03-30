package net.mazdaestimate.web.app;

import net.mazdaestimate.model.*;
import net.mazdaestimate.beans.*;

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


public class PostExhibitionVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Exhibition exhibition = new ExhibitionImpl();
		ExhibitionForm exhibitionform = (ExhibitionForm) form;

                String error = "";


                		Integer exhibitionIntraUserInt = exhibitionform.getExhibitionIntraUser();
		exhibitionform.setExhibitionIntraUser(null);
		Integer baseInt = exhibitionform.getBase();
		exhibitionform.setBase(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(exhibitionform.getId() == null || exhibitionform.getId().intValue() == 0){
			exhibition.setId(null);
			exhibitionform.setId(null);
		}else{
			exhibition.setId(exhibitionform.getId());
			Criteria criteria = session.createCriteria(Exhibition.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			exhibition = (Exhibition) criteria.uniqueResult();

		}
                		exhibition.setUsedcar(exhibitionform.isUsedcar());
		exhibition.setFromdate(exhibitionform.getFromdate());
		exhibition.setTodate(exhibitionform.getTodate());
		exhibition.setWeeklyplan(exhibitionform.getWeeklyplan());
		exhibition.setWeekdayactual(exhibitionform.getWeekdayactual());


		
		StringFullfiller.fullfil(exhibition);
                		Criteria criteria2 = session.createCriteria(ExhibitionIntraUser.class);
		criteria2.add(Restrictions.idEq(exhibitionIntraUserInt));
		ExhibitionIntraUser exhibitionintrauser = (ExhibitionIntraUser) criteria2.uniqueResult();
		exhibition.setExhibitionIntraUser(exhibitionintrauser);
		criteria2 = session.createCriteria(Base.class);
		criteria2.add(Restrictions.idEq(baseInt));
		Base base = (Base) criteria2.uniqueResult();
		exhibition.setBase(base);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(exhibition);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostExhibitionDetail.do", exhibition.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Exhibitions.do", exhibition.getId().toString());
		return null;

		
	}
	
	
}