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


public class PostGameTableVPAddingToShopAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		GameTable gameTable = new GameTableImpl();
		GameTableForm gameTableform = (GameTableForm) form;

                String error = "";


                		Integer gameInt = gameTableform.getGame();
		gameTableform.setGame(null);
		Integer shopInt = gameTableform.getShop();
		gameTableform.setShop(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(gameTableform.getId() == null || gameTableform.getId().intValue() == 0){
			gameTable.setId(null);
			gameTableform.setId(null);
		}else{
			gameTable.setId(gameTableform.getId());
			Criteria criteria = session.createCriteria(GameTable.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			gameTable = (GameTable) criteria.uniqueResult();

		}
                		gameTable.setJackpot(gameTableform.getJackpot());
		gameTable.setName(gameTableform.getName());


		
		StringFullfiller.fullfil(gameTable);
                		Criteria criteria2 = session.createCriteria(Game.class);
		criteria2.add(Restrictions.idEq(gameInt));
		Game game = (Game) criteria2.uniqueResult();
		gameTable.setGame(game);
		criteria2 = session.createCriteria(Shop.class);
		criteria2.add(Restrictions.idEq(shopInt));
		Shop shop = (Shop) criteria2.uniqueResult();
		gameTable.setShop(shop);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(gameTable);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostGameTableDetail.do", gameTable.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "GameTables.do", gameTable.getId().toString());
		return null;

		
	}
	
	
}