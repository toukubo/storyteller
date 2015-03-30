package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

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


public class PostCommunityThreadVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		CommunityThread communityThread = new CommunityThreadImpl();
		CommunityThreadForm communityThreadform = (CommunityThreadForm) form;

                String error = "";


                		Integer communityInt = communityThreadform.getCommunity();
		communityThreadform.setCommunity(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(communityThreadform.getId() == null || communityThreadform.getId().intValue() == 0){
			communityThread.setId(null);
			communityThreadform.setId(null);
		}else{
			communityThread.setId(communityThreadform.getId());
			Criteria criteria = session.createCriteria(CommunityThread.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			communityThread = (CommunityThread) criteria.uniqueResult();

		}
                

		
		StringFullfiller.fullfil(communityThread);
                		Criteria criteria2 = session.createCriteria(Community.class);
		criteria2.add(Restrictions.idEq(communityInt));
		Community community = (Community) criteria2.uniqueResult();
		communityThread.setCommunity(community);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(communityThread);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostCommunityThreadDetail.do", communityThread.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "CommunityThreads.do", communityThread.getId().toString());
		return null;

		
	}
	
	
}