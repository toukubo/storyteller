package filters;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import net.enclosing.util.HibernateSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.StaleObjectStateException;
import org.hibernate.criterion.Restrictions;


public class PrivilegeManageFilter implements Filter {
	public static final ThreadLocal thread = new ThreadLocal();
    private static Log log = LogFactory.getLog(PrivilegeManageFilter.class);
    private  ServletContext context = null;

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req2 = (HttpServletRequest)req;
		if(req2.getRequestURI().replaceAll(".do","").endsWith("Login") || !req2.getRequestURI().contains(".do")){
			chain.doFilter(req, res);
		}else if(req.getParameter("login") == null || req.getParameter("ajax") == null){
			try {

				synchronized (thread) {

					Session session = new HibernateSession().currentSession(this.context);

	            	String mailstr = null;
	            	boolean cookieexists = false;
	            	if(req2.getCookies()!=null){

		            	for (int i = 0; i < req2.getCookies().length; i++) {
			    			if(req2.getCookies()[i].getName().equals("nameofproject")){
			    				cookieexists = true;
			    				mailstr = req2.getCookies()[i].getValue();
			    				break;
			    			}
						}
	            	}
	            	if(!cookieexists){
	            		res.setContentType("text/html");
	            		res.getWriter().print("<html><head>	" +
	            				"<meta http-equiv=\"refresh\" content=\"0;url=" + req2.getContextPath() +  "/Login.do?login=true&ajax=true\">" +
	            						"</head><body>Access Denied " +
	            						"<a href=\"/Login.do?login=true&ajax=true\">Login" +
	            						"</a></body></html>");
	            		return;
	            	}

	            	boolean  allowed = true;

	            	Criteria criteria = session.createCriteria(IntraUser.class);
	            	criteria.add(Restrictions.eq("mail",mailstr));
	            	IntraUser intraUser = (IntraUser)criteria.uniqueResult();
	            	req.setAttribute("u",intraUser);
//	            	req.setAttribute("p",intraUser.getPrivilege());
	            	session.refresh(intraUser);
	            	criteria = null;
	            	chain.doFilter(req, res);
	            	log.debug("Committing the database transaction");
	            }
	        } catch (StaleObjectStateException staleEx) {
	            log.error("This interceptor does not implement optimistic concurrency control!");
	            log.error("Your application will not work until you add compensation actions!");
	            // Rollback, close everything, possibly compensate for any permanent changes
	            // during the conversation, and finally restart business conversation. Maybe
	            // give the user of the application a chance to merge some of his work with
	            // fresh data... what you do here depends on your applications design.
	            throw staleEx;
	        } catch (Throwable ex) {
	            // Rollback only
	            ex.printStackTrace();
	            try {
	/*                if (sf.getCurrentSession().getTransaction().isActive()) {
	                    log.debug("Trying to rollback database transaction after exception");
	                    sf.getCurrentSession().getTransaction().rollback();
	                }*/
	            } catch (Throwable rbEx) {
	                log.error("Could not rollback transaction after exception!", rbEx);
	            }

	            // Let others handle it... maybe another interceptor for exceptions?
	            throw new ServletException(ex);
	        }


		}else{
			chain.doFilter(req, res);
		}

	}
	public void init(FilterConfig arg0) throws ServletException {
		context = arg0.getServletContext();

	}


}
