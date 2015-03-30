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


public class PostVictimVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Victim victim = new VictimImpl();
		VictimForm victimform = (VictimForm) form;

                String error = "";


                		Integer accidentInt = victimform.getAccident();
		victimform.setAccident(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(victimform.getId() == null || victimform.getId().intValue() == 0){
			victim.setId(null);
			victimform.setId(null);
		}else{
			victim.setId(victimform.getId());
			Criteria criteria = session.createCriteria(Victim.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			victim = (Victim) criteria.uniqueResult();

		}
                		victim.setVictim(victimform.getVictim());
		victim.setSexofvictim(victimform.getSexofvictim());
		victim.setAgeofvictim(victimform.getAgeofvictim());
		victim.setObjectofaccident(victimform.getObjectofaccident());


		
		StringFullfiller.fullfil(victim);
                		Criteria criteria2 = session.createCriteria(Accident.class);
		criteria2.add(Restrictions.idEq(accidentInt));
		Accident accident = (Accident) criteria2.uniqueResult();
		victim.setAccident(accident);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(victim);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostVictimDetail.do", victim.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Victims.do", victim.getId().toString());
		return null;

		
	}
	
	
}