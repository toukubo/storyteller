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


public class PostDialVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Dial dial = new DialImpl();
		DialForm dialform = (DialForm) form;

                String error = "";


                		Integer serviceInt = dialform.getService();
		dialform.setService(null);
		Integer publicUserInt = dialform.getPublicUser();
		dialform.setPublicUser(null);
		Integer dialThumnailFileInt = dialform.getDialThumnailFile();
		dialform.setDialThumnailFile(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(dialform.getId() == null || dialform.getId().intValue() == 0){
			dial.setId(null);
			dialform.setId(null);
		}else{
			dial.setId(dialform.getId());
			Criteria criteria = session.createCriteria(Dial.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			dial = (Dial) criteria.uniqueResult();

		}
                		dial.setCurrent(dialform.isCurrent());
		dial.setClickedtimes(dialform.getClickedtimes());
		dial.setDialnum(dialform.getDialnum());


		
		StringFullfiller.fullfil(dial);
                		Criteria criteria2 = session.createCriteria(Service.class);
		criteria2.add(Restrictions.idEq(serviceInt));
		Service service = (Service) criteria2.uniqueResult();
		dial.setService(service);
		criteria2 = session.createCriteria(PublicUser.class);
		criteria2.add(Restrictions.idEq(publicUserInt));
		PublicUser publicuser = (PublicUser) criteria2.uniqueResult();
		dial.setPublicUser(publicuser);
		criteria2 = session.createCriteria(DialThumnailFile.class);
		criteria2.add(Restrictions.idEq(dialThumnailFileInt));
		DialThumnailFile dialthumnailfile = (DialThumnailFile) criteria2.uniqueResult();
		dial.setDialThumnailFile(dialthumnailfile);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(dial);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostDialDetail.do", dial.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Dials.do", dial.getId().toString());
		return null;

		
	}
	
	
}