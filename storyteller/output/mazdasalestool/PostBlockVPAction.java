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


public class PostBlockVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Block block = new BlockImpl();
		BlockForm blockform = (BlockForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(blockform.getId() == null || blockform.getId().intValue() == 0){
			block.setId(null);
			blockform.setId(null);
		}else{
			block.setId(blockform.getId());
			Criteria criteria = session.createCriteria(Block.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			block = (Block) criteria.uniqueResult();

		}
                		block.setName(blockform.getName());


		
		StringFullfiller.fullfil(block);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(block);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostBlockDetail.do", block.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Blocks.do", block.getId().toString());
		return null;

		
	}
	
	
}