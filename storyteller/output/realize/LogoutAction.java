package net.realize.web.app;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HTTPGetRedirection;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LogoutAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		req.getSession().setAttribute("u",null);
		Cookie cookie = new Cookie("realize","");
		cookie.setMaxAge(0);
		cookie.setComment("hogehoge");
		res.addCookie(cookie); 
		res.flushBuffer();
		new HTTPGetRedirection(req, res, "Login.do?login=true&ajax=true", "");
		return null;
	}
	
	
}
