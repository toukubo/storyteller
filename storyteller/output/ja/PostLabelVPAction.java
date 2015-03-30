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


public class PostLabelVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Label label = new LabelImpl();
		LabelForm labelform = (LabelForm) form;

                String error = "";


                		Integer componentInt = labelform.getComponent();
		labelform.setComponent(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(labelform.getId() == null || labelform.getId().intValue() == 0){
			label.setId(null);
			labelform.setId(null);
		}else{
			label.setId(labelform.getId());
			Criteria criteria = session.createCriteria(Label.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			label = (Label) criteria.uniqueResult();

		}
                		label.setValue(labelform.getValue());


		
		StringFullfiller.fullfil(label);
                		Criteria criteria2 = session.createCriteria(Component.class);
		criteria2.add(Restrictions.idEq(componentInt));
		Component component = (Component) criteria2.uniqueResult();
		label.setComponent(component);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(label);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostLabelDetail.do", label.getId().toString());
		return null;

		
	}
	
	
}