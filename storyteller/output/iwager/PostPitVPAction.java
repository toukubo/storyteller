package net.iwager.web.app;

import net.iwager.model.*;
import net.iwager.beans.*;

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


public class PostPitVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Pit pit = new PitImpl();
		PitForm pitform = (PitForm) form;

                String error = "";


                		Integer shopInt = pitform.getShop();
		pitform.setShop(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(pitform.getId() == null || pitform.getId().intValue() == 0){
			pit.setId(null);
			pitform.setId(null);
		}else{
			pit.setId(pitform.getId());
			Criteria criteria = session.createCriteria(Pit.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			pit = (Pit) criteria.uniqueResult();

		}
                		pit.setName(pitform.getName());


		
		StringFullfiller.fullfil(pit);
                		Criteria criteria2 = session.createCriteria(Shop.class);
		criteria2.add(Restrictions.idEq(shopInt));
		Shop shop = (Shop) criteria2.uniqueResult();
		pit.setShop(shop);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(pit);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostPitDetail.do", pit.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Pits.do", pit.getId().toString());
		return null;

		
	}
	
	
}