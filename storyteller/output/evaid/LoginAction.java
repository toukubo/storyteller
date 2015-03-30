package net.evaid.web.app;
import net.evaid.model.*;
import net.evaid.model.crud.*;


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


		PublicUserForm publicUserForm = (PublicUserForm)form;


		Criteria criteria = session.createCriteria(PublicUser.class);
		criteria.add(Restrictions.eq("account",publicUserForm.getAccount()));
		criteria.add(Restrictions.eq("password",publicUserForm.getPassword()));

		PublicUser publicUser = null;
		if(criteria.uniqueResult() !=null){
			publicUser = (PublicUser)criteria.uniqueResult();

			/*
			if(publicUser.isRemoved()){
				req.setAttribute("message","そのユーザはメールアドレスの認証が済んでいません。");
				return mapping.findForward("error");
			}
			*/

			Calendar calendarnum = Calendar.getInstance();
			Cookie cookie = new Cookie("evaid",publicUser.getMail());
			cookie.setValue(publicUser.getMail());
			cookie.setComment("hoge");
			cookie.setMaxAge(60 * 60 * 168);

			res.addCookie(cookie); 
			res.flushBuffer();

		}else{

			if(publicUserForm.getAccount()!=null){
				req.setAttribute("message","ユーザが存在しないか、パスワードが間違っています。");
			}
			return mapping.findForward("error");
		}
		session.flush();
		new HTTPGetRedirection(req,res,"index.jsp","");
		return null;
	}


}
