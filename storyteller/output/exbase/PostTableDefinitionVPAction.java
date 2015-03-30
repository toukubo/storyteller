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
import org.hibernate.criterion.Restrictions;


public class PostTableDefinitionVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		TableDefinition tableDefinition = new TableDefinitionImpl();
		TableDefinitionForm tableDefinitionform = (TableDefinitionForm) form;

                String error = "";
if(StringUtils.isBlank(tabledefinitionform.getName())){
   error += "は空にはできません。<br />"; 
}

        if(!productform.getTypename().matches("[a-zA-Z0-9&/-]*")){
      	   error += "は半角英数字及び記号(/&-)のみです。<br />";
        }

if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",tableDefinitionform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(tableDefinitionform.getId() == null || tableDefinitionform.getId().intValue() == 0){
			tableDefinition.setId(null);
			tableDefinitionform.setId(null);
		}else{
			tableDefinition.setId(tableDefinitionform.getId());
			Criteria criteria = session.createCriteria(TableDefinition.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			tableDefinition = (TableDefinition) criteria.uniqueResult();

		}
                		tableDefinition.setName(tableDefinitionform.getName());


		
		StringFullfiller.fullfil(tableDefinition);
                
		session.saveOrUpdate(tableDefinition);
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostTableDefinitionDetail.do", tableDefinition.getId().toString());
		return null;

		
	}
	
	
}