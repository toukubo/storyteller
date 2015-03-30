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


public class PostGameVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Game game = new GameImpl();
		GameForm gameform = (GameForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(gameform.getId() == null || gameform.getId().intValue() == 0){
			game.setId(null);
			gameform.setId(null);
		}else{
			game.setId(gameform.getId());
			Criteria criteria = session.createCriteria(Game.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			game = (Game) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(game);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(game);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostGameDetail.do", game.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Games.do", game.getId().toString());
		return null;

		
	}
	
	
}