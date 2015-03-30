package net.mazdaestimate.web.app;

import net.mazdaestimate.model.*;
import net.mazdaestimate.beans.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Iterator;
import java.util.Vector;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;


import net.enclosing.util.HibernateSession;
import net.storyteller.desktop.CopyProperties;


public class BlocksAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Block.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Block block = (Block) iter.next();
			vector.add(block);
		}
		Block block = new BlockImpl();
		BlockForm blockform = new BlockForm();
		criteria = session.createCriteria(Block.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			block = (Block) criteria.uniqueResult();
			new CopyProperties(block,blockform);
		} else if(req.getAttribute("form")!=null){
                        blockform = (BlockForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(blockform.getId()));
			block = (Block) criteria.uniqueResult();
		}
		

		req.setAttribute("model",block);
		req.setAttribute("form",blockform);
		
		
		req.setAttribute("blocks",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}