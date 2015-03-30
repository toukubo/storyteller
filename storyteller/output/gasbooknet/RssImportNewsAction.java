package net.gasbooknet.web.app;

import java.net.URL;
import java.util.Enumeration;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import net.gasbooknet.model.*;
import net.gasbooknet.model.crud.*;

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


public class RssImportNewsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		String urlstr = req.getParameter("url");
        try {
           URL url = new URL(urlstr);
		HttpClient client = new HttpClient();
		GetMethod method = new GetMethod(url.toString());
		client.executeMethod(method);

		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		RssDocument doc = RssParser.parseRss(method.getResponseBodyAsString());
		Enumeration enumeration = doc.channels();
		while(enumeration.hasMoreElements()){
	            RssChannel channel = (RssChannel)enumeration.nextElement();
                    Criteria criteria = session.createCriteria(News.class);
//                    criteria.add(Restrictions.eq("##uniqattribute##",new String(item.getItemLink())));
                    if(criteria.list().size() == 0){
                        System.out.println("Channel: "+channel.getChannelTitle());
                        Enumeration items = channel.items();
                        while(items.hasMoreElements()){
                           RssChannelItem item = (RssChannelItem) items.nextElement();
                           News news = new NewsImpl();
                           news.setContent(item.getItemDescription());
                           news.setTitle(item.getItemTitle());
                           //	##EDITSNIP## textStr = this.nl2br(textStr);
                           StringFullfiller.fullfil(news);
                           Transaction transaction = session.beginTransaction();
                           session.saveOrUpdate(news);
                           transaction.commit();
                        }
                    }
                }
		session.flush();


        } catch (Exception e) {
            e.printStackTrace();
        }
		return mapping.findForward("success");
	}	
}