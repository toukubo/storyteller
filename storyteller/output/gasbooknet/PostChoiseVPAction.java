package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;

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


public class PostChoiseVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Choise choise = new ChoiseImpl();
		ChoiseForm choiseform = (ChoiseForm) form;

                String error = "";


                		Integer itemInt = choiseform.getItem();
		choiseform.setItem(null);
		Integer purchaseInt = choiseform.getPurchase();
		choiseform.setPurchase(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(choiseform.getId() == null || choiseform.getId().intValue() == 0){
			choise.setId(null);
			choiseform.setId(null);
		}else{
			choise.setId(choiseform.getId());
			Criteria criteria = session.createCriteria(Choise.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			choise = (Choise) criteria.uniqueResult();

		}
                		choise.setOrdernum(choiseform.getOrdernum());
		choise.setWapping(choiseform.isWapping());
		choise.setPricewithtax(choiseform.getPricewithtax());
		choise.setWrapping(choiseform.isWrapping());


		
		StringFullfiller.fullfil(choise);
                		Criteria criteria2 = session.createCriteria(Item.class);
		criteria2.add(Restrictions.idEq(itemInt));
		Item item = (Item) criteria2.uniqueResult();
		choise.setItem(item);
		criteria2 = session.createCriteria(Purchase.class);
		criteria2.add(Restrictions.idEq(purchaseInt));
		Purchase purchase = (Purchase) criteria2.uniqueResult();
		choise.setPurchase(purchase);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(choise);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostChoiseDetail.do", choise.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Choises.do", choise.getId().toString());
		return null;

		
	}
	
	
}