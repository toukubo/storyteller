package net.mazdaestimate.web.app;

import net.mazdaestimate.model.*;
import net.mazdaestimate.beans.*;

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


public class PostBaseVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Base base = new BaseImpl();
		BaseForm baseform = (BaseForm) form;

                String error = "";


                		Integer prefectureInt = baseform.getPrefecture();
		baseform.setPrefecture(null);
		Integer blockInt = baseform.getBlock();
		baseform.setBlock(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(baseform.getId() == null || baseform.getId().intValue() == 0){
			base.setId(null);
			baseform.setId(null);
		}else{
			base.setId(baseform.getId());
			Criteria criteria = session.createCriteria(Base.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			base = (Base) criteria.uniqueResult();

		}
                		base.setBasename(baseform.getBasename());
		base.setMemo(baseform.getMemo());
		base.setBasecode(baseform.getBasecode());
		base.setNewcar(baseform.isNewcar());
		base.setUsedcar(baseform.isUsedcar());


		
		StringFullfiller.fullfil(base);
                		Criteria criteria2 = session.createCriteria(Prefecture.class);
		criteria2.add(Restrictions.idEq(prefectureInt));
		Prefecture prefecture = (Prefecture) criteria2.uniqueResult();
		base.setPrefecture(prefecture);
		criteria2 = session.createCriteria(Block.class);
		criteria2.add(Restrictions.idEq(blockInt));
		Block block = (Block) criteria2.uniqueResult();
		base.setBlock(block);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(base);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostBaseDetail.do", base.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Bases.do", base.getId().toString());
		return null;

		
	}
	
	
}