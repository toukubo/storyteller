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


public class PostWinningTypeVPFromGameDetailPageAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		WinningType winningType = new WinningTypeImpl();
		WinningTypeForm winningTypeform = (WinningTypeForm) form;

                String error = "";


                		Integer gameInt = winningTypeform.getGame();
		winningTypeform.setGame(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(winningTypeform.getId() == null || winningTypeform.getId().intValue() == 0){
			winningType.setId(null);
			winningTypeform.setId(null);
		}else{
			winningType.setId(winningTypeform.getId());
			Criteria criteria = session.createCriteria(WinningType.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			winningType = (WinningType) criteria.uniqueResult();

		}
                		winningType.setName(winningTypeform.getName());


		
		StringFullfiller.fullfil(winningType);
                		Criteria criteria2 = session.createCriteria(Game.class);
		criteria2.add(Restrictions.idEq(gameInt));
		Game game = (Game) criteria2.uniqueResult();
		winningType.setGame(game);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(winningType);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostWinningTypeDetail.do", winningType.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "WinningTypes.do", winningType.getId().toString());
		return null;

		
	}
	
	
}