package net.speeddial.web.app;

import net.speeddial.model.*;
import net.speeddial.beans.*;

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


public class PostRelationShipVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		RelationShip relationShip = new RelationShipImpl();
		RelationShipForm relationShipform = (RelationShipForm) form;

                String error = "";


                		Integer frompublicuserInt = relationShipform.getFrompublicuser();
		relationShipform.setFrompublicuser(null);
		Integer topublicuserInt = relationShipform.getTopublicuser();
		relationShipform.setTopublicuser(null);
		Integer relationShipStatusInt = relationShipform.getRelationShipStatus();
		relationShipform.setRelationShipStatus(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(relationShipform.getId() == null || relationShipform.getId().intValue() == 0){
			relationShip.setId(null);
			relationShipform.setId(null);
		}else{
			relationShip.setId(relationShipform.getId());
			Criteria criteria = session.createCriteria(RelationShip.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			relationShip = (RelationShip) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(relationShip);
                		Criteria criteria2 = session.createCriteria(Frompublicuser.class);
		criteria2.add(Restrictions.idEq(frompublicuserInt));
		Frompublicuser frompublicuser = (Frompublicuser) criteria2.uniqueResult();
		relationShip.setFrompublicuser(frompublicuser);
		criteria2 = session.createCriteria(Topublicuser.class);
		criteria2.add(Restrictions.idEq(topublicuserInt));
		Topublicuser topublicuser = (Topublicuser) criteria2.uniqueResult();
		relationShip.setTopublicuser(topublicuser);
		criteria2 = session.createCriteria(RelationShipStatus.class);
		criteria2.add(Restrictions.idEq(relationShipStatusInt));
		RelationShipStatus relationshipstatus = (RelationShipStatus) criteria2.uniqueResult();
		relationShip.setRelationShipStatus(relationshipstatus);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(relationShip);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostRelationShipDetail.do", relationShip.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "RelationShips.do", relationShip.getId().toString());
		return null;

		
	}
	
	
}