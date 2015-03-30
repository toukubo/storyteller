package net.tonersaver.web.app;

import net.tonersaver.model.*;
import net.tonersaver.model.crud.*;
import ;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
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
import net.storyteller.desktop.CopyProperties;


public class DepartmentListAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Criteria criteria = session.createCriteria(Department.class);
		int allsize = criteria.list().size();
		Pagination pagination=new Pagination();
        int pagesize = 6;
        int offset = 0;
        int currentpage = 1;
        
        if(StringUtils.isNotBlank(req.getParameter("pagesize")) && req.getParameter("pagesize")!=null) {
        	//if(NumberUtils.isDigits(req.getParameter("pagesize")))
        		pagesize = Integer.parseInt(req.getParameter("pagesize"));
        }
        
//        if(StringUtils.isNotBlank(req.getParameter("offset")) && req.getParameter("offset")!=null) {
//        	if(NumberUtils.isDigits(req.getParameter("offset")))
//        		offset =  Integer.parseInt(req.getParameter("offset"));
//        }
        
        if(StringUtils.isNotBlank(req.getParameter("currentpage")) && req.getParameter("currentpage")!=null) {
        	if(NumberUtils.isDigits(req.getParameter("currentpage"))){
        		currentpage = Integer.parseInt(req.getParameter("currentpage"));
        		offset = ( currentpage -1 ) * pagesize;
        	}
        	
        }
        
        
		int max=pagination.getMax(criteria.list().size(), pagesize);
		req.setAttribute("max", max);

		criteria.setMaxResults(pagesize);
		criteria.setFirstResult(offset);
		
		
		req.setAttribute("departments",criteria.list());
		
		req.setAttribute("pages", 1 + ( (int ) ( allsize / pagesize ) ));
		



		return mapping.findForward("success");
/*
				
		<c:forEach var="page" begin="1" end="${pages}">
		<a href="DepartmentList.do?currentpage=${page}">
		${page}
		</a>
		</c:forEach>



*/
	}
	
	
}