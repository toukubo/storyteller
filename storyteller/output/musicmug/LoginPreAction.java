package net.musicmug.web.app;

import java.net.URL;
import java.util.Enumeration;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import net.musicmug.model.*;
import net.musicmug.model.crud.*;

import net.enclosing.util.HibernateSession;
import net.enclosing.util.StringFullfiller;


import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import churchillobjects.rss4j.RssChannel;
import churchillobjects.rss4j.RssChannelItem;
import churchillobjects.rss4j.RssDocument;
import churchillobjects.rss4j.parser.RssParser;


public class LoginPreAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		
		
		
		
		return mapping.findForward("success");
	}
	
	
}
