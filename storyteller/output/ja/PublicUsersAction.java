package net.ja.web.app;

import net.ja.model.*;
import net.ja.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import java.util.Date;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;


import net.enclosing.util.HibernateSession;
import net.storyteller.desktop.CopyProperties;


public class PublicUsersAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(PublicUser.class);
                










		if(StringUtils.isNotBlank(req.getParameter("closurebreakdatestartdate")) && StringUtils.isNotBlank(req.getParameter("closurebreakdateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("closurebreakdatestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("closurebreakdateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}













		if(StringUtils.isNotBlank(req.getParameter("lasttransactiondatestartdate")) && StringUtils.isNotBlank(req.getParameter("lasttransactiondateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("lasttransactiondatestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("lasttransactiondateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}




		if(StringUtils.isNotBlank(req.getParameter("area"))) {
			Criteria criteria2 = session.createCriteria(Area.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("area"))));
			Area area = (Area) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("area", area));
		}
 
		if(StringUtils.isNotBlank(req.getParameter("userInfo"))) {
			Criteria criteria2 = session.createCriteria(UserInfo.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("userInfo"))));
			UserInfo userInfo = (UserInfo) criteria2.uniqueResult();
			criteria.add(Restrictions.eq("userInfo", userInfo));
		}
 



		req.setAttribute("publicUsers",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			PublicUser publicUser = (PublicUser) iter.next();
//			vector.add(publicUser);
//		}
		PublicUser publicUser = new PublicUserImpl();
		PublicUserForm publicUserform = new PublicUserForm();
		criteria = session.createCriteria(PublicUser.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			publicUser = (PublicUser) criteria.uniqueResult();
			new CopyProperties(publicUser,publicUserform);
		} else if(req.getAttribute("form")!=null){
                        publicUserform = (PublicUserForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(publicUserform.getId()));
			publicUser = (PublicUser) criteria.uniqueResult();
		}
		

		req.setAttribute("model",publicUser);
		req.setAttribute("form",publicUserform);
		
		


                  Criteria criteriaArea= session.createCriteria(Area.class);
			req.setAttribute("Areas", criteriaArea.list());

Criteria criteriaUserInfo= session.createCriteria(UserInfo.class);
			req.setAttribute("UserInfos", criteriaUserInfo.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}