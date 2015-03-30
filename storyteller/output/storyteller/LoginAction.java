package net.storyteller.web.app;
import net.storyteller.model.*;
import net.storyteller.model.crud.*;


import java.util.Calendar;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;
import net.pmcsm.model.IntraUser;

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

import filters.pmcsm.HibernateSession;

public class LoginAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());

		
		IntraUserForm intraUserForm = (IntraUserForm)form;


		Criteria criteria = session.createCriteria(IntraUser.class);
		criteria.add(Restrictions.eq("account",intraUserForm.getAccount()));
		criteria.add(Restrictions.eq("password",intraUserForm.getPassword()));

		IntraUser intraUser = null;
		if(criteria.uniqueResult() !=null){
			intraUser = (IntraUser)criteria.uniqueResult();
			
			/*
			if(intraUser.isRemoved()){
				req.setAttribute("message","そのユーザはメールアドレスの認証が済んでいません。");
				return mapping.findForward("error");
			}
			*/
			
			Calendar calendarnum = Calendar.getInstance();
			Cookie cookie = new Cookie("",intraUser.getMail());
			cookie.setValue(intraUser.getMail());
			cookie.setComment("hoge");
			cookie.setMaxAge(60 * 60 * 168);

			res.addCookie(cookie); 
			res.flushBuffer();
			
		}else{

			if(intraUserForm.getAccount()!=null){
				req.setAttribute("message","ユーザが存在しないか、パスワードが間違っています。");
			}
			return mapping.findForward("error");
		}
		session.flush();
		new HTTPGetRedirection(req,res,"index.jsp","");
		return null;
	}
	
	
}
