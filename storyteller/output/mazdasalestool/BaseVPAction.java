package net.mazdasalestool.web;

import net.mazdasalestool.model.*;
import net.mazdasalestool.model.crud.*;

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

public class BaseVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Base base = new BaseImpl();
		BaseForm baseform = (BaseForm) form;
		
                		Integer prefectureInt = baseform.getPrefecture();
		baseform.setPrefecture(null);
		Integer blockInt = baseform.getBlock();
		baseform.setBlock(null);

		
		BeanUtils.copyProperties(base,baseform);
		StringFullfiller.fullfil(base);
		if(baseform.getId() == null || baseform.getId().intValue() == 0){
			base.setId(null);
		}else{
			base.setId(baseform.getId());
		}

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		
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
		
		new HTTPGetRedirection(req, res, "BaseDetail.do", base.getId().toString());
		return null;

		
	}
	
	
}