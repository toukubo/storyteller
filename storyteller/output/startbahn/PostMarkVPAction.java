package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

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


public class PostMarkVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Mark mark = new MarkImpl();
		MarkForm markform = (MarkForm) form;

                String error = "";


                		Integer markerpublicuserInt = markform.getMarkerpublicuser();
		markform.setMarkerpublicuser(null);
		Integer markedpublicuserInt = markform.getMarkedpublicuser();
		markform.setMarkedpublicuser(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(markform.getId() == null || markform.getId().intValue() == 0){
			mark.setId(null);
			markform.setId(null);
		}else{
			mark.setId(markform.getId());
			Criteria criteria = session.createCriteria(Mark.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			mark = (Mark) criteria.uniqueResult();

		}
                		mark.setActual(markform.isActual());
		mark.setMarkmodel(markform.getMarkmodel());
		mark.setMarkeemodel(markform.getMarkeemodel());
		mark.setMarkerid(markform.getMarkerid());
		mark.setMakeeid(markform.getMakeeid());


		
		StringFullfiller.fullfil(mark);
                		Criteria criteria2 = session.createCriteria(Markerpublicuser.class);
		criteria2.add(Restrictions.idEq(markerpublicuserInt));
		Markerpublicuser markerpublicuser = (Markerpublicuser) criteria2.uniqueResult();
		mark.setMarkerpublicuser(markerpublicuser);
		criteria2 = session.createCriteria(Markedpublicuser.class);
		criteria2.add(Restrictions.idEq(markedpublicuserInt));
		Markedpublicuser markedpublicuser = (Markedpublicuser) criteria2.uniqueResult();
		mark.setMarkedpublicuser(markedpublicuser);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(mark);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostMarkDetail.do", mark.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Marks.do", mark.getId().toString());
		return null;

		
	}
	
	
}