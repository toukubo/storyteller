package net.musicmug.web.app;

import net.musicmug.model.*;
import net.musicmug.beans.*;

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


public class PostBbsThreadVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		BbsThread bbsThread = new BbsThreadImpl();
		BbsThreadForm bbsThreadform = (BbsThreadForm) form;

                String error = "";


                		Integer artistInt = bbsThreadform.getArtist();
		bbsThreadform.setArtist(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(bbsThreadform.getId() == null || bbsThreadform.getId().intValue() == 0){
			bbsThread.setId(null);
			bbsThreadform.setId(null);
		}else{
			bbsThread.setId(bbsThreadform.getId());
			Criteria criteria = session.createCriteria(BbsThread.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			bbsThread = (BbsThread) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(bbsThread);
                		Criteria criteria2 = session.createCriteria(Artist.class);
		criteria2.add(Restrictions.idEq(artistInt));
		Artist artist = (Artist) criteria2.uniqueResult();
		bbsThread.setArtist(artist);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(bbsThread);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostBbsThreadDetail.do", bbsThread.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "BbsThreads.do", bbsThread.getId().toString());
		return null;

		
	}
	
	
}