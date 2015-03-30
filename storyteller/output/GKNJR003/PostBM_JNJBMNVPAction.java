package net.GKNJR003.web.app;

import net.GKNJR003.model.*;
import net.GKNJR003.beans.*;

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


public class PostBM_JNJBMNVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		BM_JNJBMN bM_JNJBMN = new BM_JNJBMNImpl();
		BM_JNJBMNForm bM_JNJBMNform = (BM_JNJBMNForm) form;

                String error = "";


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(bM_JNJBMNform.getId() == null || bM_JNJBMNform.getId().intValue() == 0){
			bM_JNJBMN.setId(null);
			bM_JNJBMNform.setId(null);
		}else{
			bM_JNJBMN.setId(bM_JNJBMNform.getId());
			Criteria criteria = session.createCriteria(BM_JNJBMN.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			bM_JNJBMN = (BM_JNJBMN) criteria.uniqueResult();

		}
                		bM_JNJBMN.setTORKDATETIM(bM_JNJBMNform.getTORKDATETIM());
		bM_JNJBMN.setTORKUSRID(bM_JNJBMNform.getTORKUSRID());
		bM_JNJBMN.setUPDDATETIM(bM_JNJBMNform.getUPDDATETIM());
		bM_JNJBMN.setUPDAP(bM_JNJBMNform.getUPDAP());
		bM_JNJBMN.setUPDUSRID(bM_JNJBMNform.getUPDUSRID());
		bM_JNJBMN.setUPDTNMTNM(bM_JNJBMNform.getUPDTNMTNM());
		bM_JNJBMN.setCopcd(bM_JNJBMNform.getCopcd());
		bM_JNJBMN.setJbjbmncd(bM_JNJBMNform.getJbjbmncd());
		bM_JNJBMN.setBtryukytncd(bM_JNJBMNform.getBtryukytncd());
		bM_JNJBMN.setEgstncd(bM_JNJBMNform.getEgstncd());
		bM_JNJBMN.setBmnnmk(bM_JNJBMNform.getBmnnmk());
		bM_JNJBMN.setBmnnma(bM_JNJBMNform.getBmnnma());
		bM_JNJBMN.setBmnnmrk(bM_JNJBMNform.getBmnnmrk());
		bM_JNJBMN.setBmnnmra(bM_JNJBMNform.getBmnnmra());
		bM_JNJBMN.setHnsaflg(bM_JNJBMNform.getHnsaflg());
		bM_JNJBMN.setDelflg(bM_JNJBMNform.getDelflg());
		bM_JNJBMN.setTorkdatetim(bM_JNJBMNform.getTorkdatetim());
		bM_JNJBMN.setTorkap(bM_JNJBMNform.getTorkap());


		
		StringFullfiller.fullfil(bM_JNJBMN);
                
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(bM_JNJBMN);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostBM_JNJBMNDetail.do", bM_JNJBMN.getId().toString(),"success=true");
		return null;

		
	}
	
	
}