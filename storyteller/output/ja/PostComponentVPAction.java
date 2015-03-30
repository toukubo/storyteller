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


public class PostComponentVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Component component = new ComponentImpl();
		ComponentForm componentform = (ComponentForm) form;

                String error = "";


                		Integer dataComponentInt = componentform.getDataComponent();
		componentform.setDataComponent(null);
		Integer pageLayoutInt = componentform.getPageLayout();
		componentform.setPageLayout(null);
		Integer labelInt = componentform.getLabel();
		componentform.setLabel(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(componentform.getId() == null || componentform.getId().intValue() == 0){
			component.setId(null);
			componentform.setId(null);
		}else{
			component.setId(componentform.getId());
			Criteria criteria = session.createCriteria(Component.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			component = (Component) criteria.uniqueResult();

		}
                		component.setX(componentform.getX());
		component.setY(componentform.getY());
		component.setWidth(componentform.getWidth());


		
		StringFullfiller.fullfil(component);
                		Criteria criteria2 = session.createCriteria(DataComponent.class);
		criteria2.add(Restrictions.idEq(dataComponentInt));
		DataComponent datacomponent = (DataComponent) criteria2.uniqueResult();
		component.setDataComponent(datacomponent);
		criteria2 = session.createCriteria(PageLayout.class);
		criteria2.add(Restrictions.idEq(pageLayoutInt));
		PageLayout pagelayout = (PageLayout) criteria2.uniqueResult();
		component.setPageLayout(pagelayout);
		criteria2 = session.createCriteria(Label.class);
		criteria2.add(Restrictions.idEq(labelInt));
		Label label = (Label) criteria2.uniqueResult();
		component.setLabel(label);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(component);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostComponentDetail.do", component.getId().toString());
		return null;

		
	}
	
	
}