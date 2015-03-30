package net.realize.web.app;

import net.realize.model.*;
import net.realize.beans.*;

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


public class PostPositionVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Position position = new PositionImpl();
		PositionForm positionform = (PositionForm) form;

                String error = "";


                		Integer cycleInt = positionform.getCycle();
		positionform.setCycle(null);
		Integer userInt = positionform.getUser();
		positionform.setUser(null);
		Integer parentPositionAsLeftInt = positionform.getParentPositionAsLeft();
		positionform.setParentPositionAsLeft(null);
		Integer leftChildPositionInt = positionform.getLeftChildPosition();
		positionform.setLeftChildPosition(null);
		Integer parentPositionAsRightInt = positionform.getParentPositionAsRight();
		positionform.setParentPositionAsRight(null);
		Integer rightChildPositionInt = positionform.getRightChildPosition();
		positionform.setRightChildPosition(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(positionform.getId() == null || positionform.getId().intValue() == 0){
			position.setId(null);
			positionform.setId(null);
		}else{
			position.setId(positionform.getId());
			Criteria criteria = session.createCriteria(Position.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			position = (Position) criteria.uniqueResult();

		}
                		position.setCycled(positionform.isCycled());


		
		StringFullfiller.fullfil(position);
                		Criteria criteria2 = session.createCriteria(Cycle.class);
		criteria2.add(Restrictions.idEq(cycleInt));
		Cycle cycle = (Cycle) criteria2.uniqueResult();
		position.setCycle(cycle);
		criteria2 = session.createCriteria(User.class);
		criteria2.add(Restrictions.idEq(userInt));
		User user = (User) criteria2.uniqueResult();
		position.setUser(user);
		criteria2 = session.createCriteria(ParentPositionAsLeft.class);
		criteria2.add(Restrictions.idEq(parentPositionAsLeftInt));
		ParentPositionAsLeft parentpositionasleft = (ParentPositionAsLeft) criteria2.uniqueResult();
		position.setParentPositionAsLeft(parentpositionasleft);
		criteria2 = session.createCriteria(LeftChildPosition.class);
		criteria2.add(Restrictions.idEq(leftChildPositionInt));
		LeftChildPosition leftchildposition = (LeftChildPosition) criteria2.uniqueResult();
		position.setLeftChildPosition(leftchildposition);
		criteria2 = session.createCriteria(ParentPositionAsRight.class);
		criteria2.add(Restrictions.idEq(parentPositionAsRightInt));
		ParentPositionAsRight parentpositionasright = (ParentPositionAsRight) criteria2.uniqueResult();
		position.setParentPositionAsRight(parentpositionasright);
		criteria2 = session.createCriteria(RightChildPosition.class);
		criteria2.add(Restrictions.idEq(rightChildPositionInt));
		RightChildPosition rightchildposition = (RightChildPosition) criteria2.uniqueResult();
		position.setRightChildPosition(rightchildposition);

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(position);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostPositionDetail.do", position.getId().toString(),"success=true");
		return null;

		
	}
	
	
}