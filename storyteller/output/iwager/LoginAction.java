package net.iwager.web.app;
import net.iwager.model.*;
import net.iwager.model.crud.*;


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


		DealerForm dealerForm = (DealerForm)form;


		Criteria criteria = session.createCriteria(Dealer.class);
		criteria.add(Restrictions.eq("account",dealerForm.getAccount()));
		criteria.add(Restrictions.eq("password",dealerForm.getPassword()));

		Dealer dealer = null;
		if(criteria.uniqueResult() !=null){
			dealer = (Dealer)criteria.uniqueResult();

			/*
			if(dealer.isRemoved()){
				req.setAttribute("message","そのユーザはメールアドレスの認証が済んでいません。");
				return mapping.findForward("error");
			}
			*/

			Calendar calendarnum = Calendar.getInstance();
			Cookie cookie = new Cookie("iwager",dealer.getMail());
			cookie.setValue(dealer.getMail());
			cookie.setComment("hoge");
			cookie.setMaxAge(60 * 60 * 168);

			res.addCookie(cookie); 
			res.flushBuffer();

		}else{

			if(dealerForm.getAccount()!=null){
				req.setAttribute("message","ユーザが存在しないか、パスワードが間違っています。");
			}
			return mapping.findForward("error");
		}
		session.flush();
		new HTTPGetRedirection(req,res,"index.jsp","");
		return null;
	}


}
