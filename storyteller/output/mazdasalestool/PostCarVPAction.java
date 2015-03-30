package net.mazdasalestool.web.app;

import net.mazdasalestool.model.*;
import net.mazdasalestool.beans.*;

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


public class PostCarVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Car car = new CarImpl();
		CarForm carform = (CarForm) form;

                String error = "";


                		Integer groupOfCarLineInt = carform.getGroupOfCarLine();
		carform.setGroupOfCarLine(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(carform.getId() == null || carform.getId().intValue() == 0){
			car.setId(null);
			carform.setId(null);
		}else{
			car.setId(carform.getId());
			Criteria criteria = session.createCriteria(Car.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			car = (Car) criteria.uniqueResult();

		}
                		car.setGroupname(carform.getGroupname());
		car.setSalescost(carform.getSalescost());
		car.setLightcar(carform.getLightcar());
		car.setSortorder(carform.getSortorder());
		car.setShortcarline(carform.getShortcarline());
		car.setBussinesscar(carform.getBussinesscar());


		
		StringFullfiller.fullfil(car);
                		Criteria criteria2 = session.createCriteria(GroupOfCarLine.class);
		criteria2.add(Restrictions.idEq(groupOfCarLineInt));
		GroupOfCarLine groupofcarline = (GroupOfCarLine) criteria2.uniqueResult();
		car.setGroupOfCarLine(groupofcarline);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(car);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostCarDetail.do", car.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Cars.do", car.getId().toString());
		return null;

		
	}
	
	
}