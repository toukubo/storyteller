package net.mazdaestimate.web;

import net.mazdaestimate.model.*;
import net.mazdaestimate.model.crud.*;

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

public class BlockVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Block block = new BlockImpl();
		BlockForm blockform = (BlockForm) form;
		
                
		
		BeanUtils.copyProperties(block,blockform);
		StringFullfiller.fullfil(block);
		if(blockform.getId() == null || blockform.getId().intValue() == 0){
			block.setId(null);
		}else{
			block.setId(blockform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(block);
		transaction.commit();
		session.flush();
		
		new HTTPGetRedirection(req, res, "BlockDetail.do", block.getId().toString());
		return null;

		
	}
	
	
}