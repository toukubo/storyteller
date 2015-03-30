package net.ars.web.app;
import net.ars.model.*;
import net.ars.model.crud.*;


import java.util.Calendar;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;

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

public class LoginAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());


		StaffForm staffForm = (StaffForm)form;


		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.eq("account",staffForm.getAccount()));
		criteria.add(Restrictions.eq("password",staffForm.getPassword()));

		Staff staff = null;
		if(criteria.uniqueResult() !=null){
			staff = (Staff)criteria.uniqueResult();

			/*
			if(staff.isRemoved()){
				req.setAttribute("message","そのユーザはメールアドレスの認証が済んでいません。");
				return mapping.findForward("error");
			}
			*/

			Calendar calendarnum = Calendar.getInstance();
			Cookie cookie = new Cookie("ars",staff.getMail());
			cookie.setValue(staff.getMail());
			cookie.setComment("hoge");
			cookie.setMaxAge(60 * 60 * 168);

			res.addCookie(cookie); 
			res.flushBuffer();

		}else{

			if(staffForm.getAccount()!=null){
				req.setAttribute("message","ユーザが存在しないか、パスワードが間違っています。");
			}
			return mapping.findForward("error");
		}
		session.flush();
		new HTTPGetRedirection(req,res,"index.jsp","");
		return null;
	}


}
