package net.ja.web.app;

import net.ja.model.*;
import net.ja.beans.*;

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


public class PostDataComponentVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		DataComponent dataComponent = new DataComponentImpl();
		DataComponentForm dataComponentform = (DataComponentForm) form;

                String error = "";


                		Integer attrInt = dataComponentform.getAttr();
		dataComponentform.setAttr(null);
		Integer componentInt = dataComponentform.getComponent();
		dataComponentform.setComponent(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(dataComponentform.getId() == null || dataComponentform.getId().intValue() == 0){
			dataComponent.setId(null);
			dataComponentform.setId(null);
		}else{
			dataComponent.setId(dataComponentform.getId());
			Criteria criteria = session.createCriteria(DataComponent.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			dataComponent = (DataComponent) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(dataComponent);
                		Criteria criteria2 = session.createCriteria(Attr.class);
		criteria2.add(Restrictions.idEq(attrInt));
		Attr attr = (Attr) criteria2.uniqueResult();
		dataComponent.setAttr(attr);
		criteria2 = session.createCriteria(Component.class);
		criteria2.add(Restrictions.idEq(componentInt));
		Component component = (Component) criteria2.uniqueResult();
		dataComponent.setComponent(component);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(dataComponent);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostDataComponentDetail.do", dataComponent.getId().toString());
		return null;

		
	}
	
	
}