package net.exbase.web.app;

import net.exbase.model.*;
import net.exbase.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import java.util.Date;

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


public class ColumnDefinitionsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

//<snippet sentence="ColumnDefinitionsAction">


//                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(ColumnDefinition.class);
                
		req.setAttribute("columnDefinitions",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			ColumnDefinition columnDefinition = (ColumnDefinition) iter.next();
//			vector.add(columnDefinition);
//		}
		ColumnDefinition columnDefinition = new ColumnDefinitionImpl();
		ColumnDefinitionForm columnDefinitionform = new ColumnDefinitionForm();
		criteria = session.createCriteria(ColumnDefinition.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			columnDefinition = (ColumnDefinition) criteria.uniqueResult();
			new CopyProperties(columnDefinition,columnDefinitionform);
		} else if(req.getAttribute("form")!=null){
                        columnDefinitionform = (ColumnDefinitionForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(columnDefinitionform.getId()));
			columnDefinition = (ColumnDefinition) criteria.uniqueResult();
		}
		

		req.setAttribute("model",columnDefinition);
		req.setAttribute("form",columnDefinitionform);
		
		
//</snippet>

                  Criteria criteriaTableDefinition= session.createCriteria(TableDefinition.class);
			req.setAttribute("TableDefinitions", criteriaTableDefinition.list());

 

		

//                if(req.getParameter("displayexport") !=null){
//     		    return mapping.findForward("displayexport");
//                }
//                if(req.getParameter("csv") !=null){
//     		    CsvExportColumnDefinitionsAction csvExportColumnDefinitionsAction 
//                               = new CsvExportColumnDefinitionsAction(req,session,Collection  collection);
//                }


		return mapping.findForward("success");
	}
	
	
}