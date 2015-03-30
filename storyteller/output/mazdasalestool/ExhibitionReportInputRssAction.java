package net.mazdasalestool.web;

import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import net.mazdasalestool.model.*;
import net.mazdasalestool.model.crud.*;

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

import net.enclosing.util.HibernateSession;



public class ExhibitionReportInputRssAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		String urlstr = req.getParameter("url");
        try {
           URL url = new URL(urlstr);
		HttpClient client = new HttpClient();
       		URL url = new URL(urlstr);
		GetMethod method = new GetMethod(url.toString());
		client.executeMethod(method);

		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		RssDocument doc = RssParser.parseRss(method.getResponseBodyAsString());
		Enumeration enum = doc.channels();
		while(enum.hasMoreElements()){
		  RssChannel channel = (RssChannel)enum.nextElement();
		  System.out.println("Channel: "+channel.getChannelTitle());
		  Enumeration items = channel.items();
		  while(items.hasMoreElements()){
                  	RssChannelItem item = (RssChannelItem) items.nextElement();	     		                ExhibitionReport exhibitionReport = new ExhibitionReportImpl();
			exhibitionReport.setContent(item.getItemDescription());
			exhibitionReport.setTitle(itemIf.getItemTitle());
		//	##EDITSNIP## textStr = this.nl2br(textStr);
			StringFullfiller.fullfil(exhibitionReport);
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(exhibitionReport);
			transaction.commit();
		  }
		session.flush();


        } catch (Exception e) {
            e.printStackTrace();
        }
		return mapping.findForward("success");
	}	
}