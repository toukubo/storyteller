package net.djbi.web.app;

import net.djbi.model.*;
import ##beanpackage##;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.djbi.beans.SSalesStoredayForm;
import net.djbi.model.SSalesStoreday;
import net.djbi.model.SSalesStoredayImpl;
import net.djbi.model.Term;
import net.djbi.model.TermImpl;
import net.enclosing.util.HibernateSession;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class SummeryListSSalesStoredayAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

		Vector vector = new Vector();
		Criteria criteria = session.createCriteria(SSalesStoreday.class);
		Criteria criteriaTerm =null;
		String error = "";

		if(StringUtils.isNotBlank(req.getParameter("fy")) && StringUtils.isNotBlank(req.getParameter("fm")) && StringUtils.isNotBlank(req.getParameter("fw")) &&
				StringUtils.isNotBlank(req.getParameter("ty")) && StringUtils.isNotBlank(req.getParameter("tm")) && StringUtils.isNotBlank(req.getParameter("tw"))) {
			int fy = Integer.parseInt(req.getParameter("fy"));
			int fm = Integer.parseInt(req.getParameter("fm"));
			int fw = Integer.parseInt(req.getParameter("fw"));
			int ty = Integer.parseInt(req.getParameter("ty"));
			int tm = Integer.parseInt(req.getParameter("tm"));
			int tw = Integer.parseInt(req.getParameter("tw"));
			boolean applicable = true;			
			if(ty < fy) {
				applicable = false;
				error += "to-year cannot be less than from-year <br/>";
			}
			if(ty == fy && tm < fm) {
				applicable = false;
				error += "to-month cannot be less than from-month <br/>";
			}
			if(tm == fm && tw < fw) {
				applicable = false;
				error += "to-week cannot be less than from-week <br/>";
			}

			if(applicable) {
				criteriaTerm = session.createCriteria(Term.class);
				criteriaTerm.add(Restrictions.between("year", fy, ty));
				criteriaTerm.add(Restrictions.between("month", fm, tm));
				criteriaTerm.add(Restrictions.between("week", fw, tw));
			}
		}

		Vector ids = new Vector();
		if(StringUtils.isNotBlank(req.getParameter("onlybig")) && StringUtils.isNotBlank(req.getParameter("threshold"))) {
			for(Iterator iter = criteria.list().iterator();iter.hasNext();){
				SSalesStoreday sSalesStoreday = (SSalesStoreday)iter.next();
				if( ( sSalesStoreday.getOrdernum() - sSalesStoreday.getDeliverynum()) > Integer.parseInt(req.getParameter("threshold"))){
					vector.add(sSalesStoreday);
					ids.add(sSalesStoreday.getId());
				}
			}
		}
		if(ids.size()==0) {
			for(Iterator iter = criteria.list().iterator();iter.hasNext();){
				SSalesStoreday rate = (SSalesStoreday)iter.next();
				ids.add(sSalesStoreday.getId());
			}
		}
		Vector vector2 = new Vector();

		SSalesStoreday totalsSalesStoreday = new SSalesStoredayImpl();
		Criteria criteria##Restirictor1## = session.createCriteria(##Restirictor1##.class);
		if(StringUtils.isNotBlank(req.getParameter("##Restirictor1obj##"))) {
			if(!req.getParameter("##Restirictor1obj##").equals("0")) {
				criteria##Restirictor1##.add(Restrictions.idEq(Integer.valueOf(req.getParameter("##Restirictor1obj##"))));
			}
		}

		for (Iterator iter = criteria##Restirictor1##.list().iterator(); iter.hasNext();) {
			 ##Restirictor1obj## = (##Restirictor1##) iter.next();
			SSalesStoreday ##Restirictor1obj##total = new SSalesStoredayImpl();
			HashMap ##Restirictor2obj##Map = new HashMap();
			Criteria criteria##Restirictor2##= session.createCriteria(##Restirictor2##.class);
			Vector vector3 = new Vector();
			if(StringUtils.isNotBlank(req.getParameter("##Restirictor2obj##"))) {
					criteria##Restirictor2##.add(Restrictions.idEq(Integer.valueOf(req.getParameter("##Restirictor2obj##"))));
			}
			for (Iterator iterator = criteria##Restirictor2##.list().iterator(); iterator.hasNext();) {
				##Restirictor2## ##Restirictor2obj## = (##Restirictor2##) iterator.next();

				Criteria criteriaSSalesStoreday = session.createCriteria(SSalesStoreday.class);
				criteriaSSalesStoreday.add(Restrictions.eq("##Restirictor1obj##", ##Restirictor1obj##));
				criteriaSSalesStoreday.add(Restrictions.eq("##Restirictor2obj##", ##Restirictor2obj##));
				if(criteriaTerm!=null){
					criteriaSSalesStoreday.add(Restrictions.in("term", criteriaTerm.list()) );
				}
				boolean summerised = false;
				SSalesStoreday sSalesStoreday = new SSalesStoredayImpl();
				SSalesStoreday ##Restirictor2obj##Total = new SSalesStoredayImpl();
				for (Iterator iterator2 = criteriaSSalesStoreday.list().iterator(); iterator2.hasNext();) {
					SSalesStoreday element = (SSalesStoreday)iterator2.next();
					summerised = true;

					##Restirictor2obj##Total.setOrdertotal(##Restirictor2obj##Total.getOrdertotal() + element.getOrdertotal());
					##Restirictor2obj##Total.setOrdernum(##Restirictor2obj##Total.getOrdernum() + element.getOrdernum());
					##Restirictor2obj##Total.setDeliverytotal(##Restirictor2obj##Total.getDeliverytotal() + element.getDeliverytotal());
					##Restirictor2obj##Total.setDeliverynum(##Restirictor2obj##Total.getDeliverynum() + element.getDeliverynum());

					##Restirictor1obj##total.setOrdertotal(##Restirictor1obj##total.getOrdertotal() + element.getOrdertotal());
					##Restirictor1obj##total.setOrdernum(##Restirictor1obj##total.getOrdernum() + element.getOrdernum());
					##Restirictor1obj##total.setDeliverytotal(##Restirictor1obj##total.getDeliverytotal() + element.getDeliverytotal());
					##Restirictor1obj##total.setDeliverynum(##Restirictor1obj##total.getDeliverynum() + element.getDeliverynum());

					totalsSalesStoreday.setOrdertotal(totalsSalesStoreday.getOrdertotal() + element.getOrdertotal());
					totalsSalesStoreday.setOrdernum(totalsSalesStoreday.getOrdernum() + element.getOrdernum());
					totalsSalesStoreday.setDeliverytotal(totalsSalesStoreday.getDeliverytotal() + element.getDeliverytotal());
					totalsSalesStoreday.setDeliverynum(totalsSalesStoreday.getDeliverynum() + element.getDeliverynum());
				}
				SSalesStoredaysBean bean = new SSalesStoredaysBean();
				bean.set##Restirictor2##(##Restirictor2obj##);
				bean.setType("##Restirictor2obj##");
				bean.setSSalesStoreday(##Restirictor2obj##Total);
				bean.setDrilldownid(##Restirictor1obj##.getId().toString());
				vector3.add(bean);
			}
			SSalesStoredaysBean bean = new SSalesStoredaysBean();
			bean.set##Restirictor1##(##Restirictor1obj##);
			bean.setSSalesStoreday(##Restirictor1obj##total);
			bean.setType("##Restirictor1obj##");
			bean.setDrilldownid(##Restirictor1obj##.getId().toString());
			vector2.add(bean);
			vector2.addAll(vector3);

		}
		req.setAttribute("sSalesStoredays",vector2);

		req.setAttribute("totalsSalesStoreday", totalsSalesStoreday);
		SSalesStoreday SSalesStoreday = new SSalesStoredayImpl();
		SSalesStoredayForm SSalesStoredayform = new SSalesStoredayForm();
		criteria = session.createCriteria(SSalesStoreday.class);
		
		##relatedpreperation## 





		if(req.getParameter("displayexport") !=null){
			return mapping.findForward("displayexport");
		}

		if(StringUtils.isNotBlank(error)) {
			req.setAttribute("error", error);
		}

		return mapping.findForward("success");
	}
}