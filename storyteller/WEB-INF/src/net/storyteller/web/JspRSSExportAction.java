package net.storyteller.web;

import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import net.storyteller.model.*;
import net.storyteller.model.crud.*;

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

import churchillobjects.rss4j.RssChannel;
import churchillobjects.rss4j.RssChannelItem;
import churchillobjects.rss4j.RssDocument;
import churchillobjects.rss4j.RssDublinCore;
import churchillobjects.rss4j.generator.RssGenerator;

import net.enclosing.util.HibernateSession;


public class JspRSSExportAction extends Action{

	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		

	        try{
	        	RssDocument objRss=new RssDocument();
	        	objRss.setVersion("1.0");


 		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


	    		Criteria criteria = session.createCriteria(Jsp.class);
	    		criteria.add(Restrictions.idEq(req.getAttribute("id")));
//	    		##secoundclass## ##secoundobj## = jsp.get##secoundclass##();
	    			criteria = session.createCriteria(Jsp.class);
//	    			criteria.addOrder(Order.desc("date"));
//	    			criteria.add(Restrictions.eq("##secoundobj##", ##secoundobj##));
	    			criteria.setMaxResults(30);
	    			if(req.getParameter("q") !=null && !req.getParameter("q").equals("")){
	    				criteria.add(Restrictions.like("##aiueo##","%" + new String(req.getParameter("q").getBytes("8859_1"), "UTF-8")  + "%"));
	    			}

	    			ChannelBuilder builder = new ChannelBuilder();
	    			ChannelIF newChannel = builder.createChannel("Jsps");
	    			newChannel.setFormat(ChannelFormat.RSS_1_0);
	    			newChannel.setLanguage("ja");
	    			newChannel.setSite(new URL("http://"+req.getServerName()+req.getRequestURI()));
	    			newChannel.setLocation(new URL("http://"+req.getServerName()+req.getRequestURI()));
	    			newChannel.setDescription("Jsps");


	    			newChannel.setSite(new URL("http://"+req.getServerName()+req.getRequestURI()));
	    			newChannel.setLocation(new URL("http://"+req.getServerName()+req.getRequestURI()));
		        	newChannel.setDescription("Jsps");
	    			for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
	    				Jsp jsp = (Jsp)iter.next();
					ItemIF item = new Item();
					//item.setDate(new Date());

	    				item.setTitle(jsp.getName());
	    				item.setLink(new URL("http://"+req.getServerName()+req.getRequestURI());
	    				item.setDescription(jsp.getName());
		    			newChannel.addItem(item);
	    			}
	    			StringWriter stringWriter = new StringWriter();
	    			res.setContentType("text/xml;charset=utf-8");
	    			res.setCharacterEncoding("utf-8");
	    			RSS_1_0_Exporter writer = new RSS_1_0_Exporter(stringWriter,"utf-8");
	    			writer.write(newChannel);
	    			res.getWriter().write(stringWriter.toString());
		    			
	    			PrintWriter printWriter = new PrintWriter(new File(this.getServlet().getServletContext().getRealPath("JspRssExport.xml")),"utf-8");
	    			printWriter.write(stringWriter.toString());

	    			session.flush();

	        }catch(IOException e){
	            System.out.println(e.toString());
	        }finally{
	        }



        
		return mapping.findForward("success");
	}
    public String url2link(String string){
    	return string.replaceAll("(http://|https://){1}[\\w\\.\\-/:]+","<a href='$0'>$0</a>");
    }
    public String nl2br(String string){
    	string = string.replaceAll("\\n","<br />");
    	return string.replaceAll("\\n","<br />");
    	
    }


	
}
