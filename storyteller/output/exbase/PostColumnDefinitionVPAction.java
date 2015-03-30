package net.exbase.web.app;

import net.exbase.model.*;
import net.exbase.beans.*;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.StringFullfiller;
import net.enclosing.util.HTTPGetRedirection;
import net.enclosing.util.HibernateSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class PostColumnDefinitionVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		ColumnDefinition columnDefinition = new ColumnDefinitionImpl();
		ColumnDefinitionForm columnDefinitionform = (ColumnDefinitionForm) form;

                String error = "";


                		Integer tableDefinitionInt = columnDefinitionform.getTableDefinition();
		columnDefinitionform.setTableDefinition(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(columnDefinitionform.getId() == null || columnDefinitionform.getId().intValue() == 0){
			columnDefinition.setId(null);
			columnDefinitionform.setId(null);
		}else{
			columnDefinition.setId(columnDefinitionform.getId());
			Criteria criteria = session.createCriteria(ColumnDefinition.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			columnDefinition = (ColumnDefinition) criteria.uniqueResult();

		}
                		columnDefinition.setName(columnDefinitionform.getName());
		columnDefinition.setType(columnDefinitionform.getType());


		
		StringFullfiller.fullfil(columnDefinition);
                		Criteria criteria2 = session.createCriteria(TableDefinition.class);
		criteria2.add(Restrictions.idEq(tableDefinitionInt));
		TableDefinition tabledefinition = (TableDefinition) criteria2.uniqueResult();
		columnDefinition.setTableDefinition(tabledefinition);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(columnDefinition);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostColumnDefinitionDetail.do", columnDefinition.getId().toString());
		return null;

		
	}
	
	
}