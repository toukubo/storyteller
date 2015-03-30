package net.autolink.web.app;

import net.autolink.model.*;
import net.autolink.beans.*;

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


public class PostQuoteVPToBanItAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Quote quote = new QuoteImpl();
		QuoteForm quoteform = (QuoteForm) form;

                String error = "";


                		Integer keywordInt = quoteform.getKeyword();
		quoteform.setKeyword(null);
		Integer postInt = quoteform.getPost();
		quoteform.setPost(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(quoteform.getId() == null || quoteform.getId().intValue() == 0){
			quote.setId(null);
			quoteform.setId(null);
		}else{
			quote.setId(quoteform.getId());
			Criteria criteria = session.createCriteria(Quote.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			quote = (Quote) criteria.uniqueResult();

		}
                		quote.setSentence(quoteform.getSentence());
		quote.setStudiovoice(quoteform.isStudiovoice());
		quote.setSource(quoteform.getSource());
		quote.setImage(quoteform.isImage());
		quote.setBanned(quoteform.isBanned());


		
		StringFullfiller.fullfil(quote);
                		Criteria criteria2 = session.createCriteria(Keyword.class);
		criteria2.add(Restrictions.idEq(keywordInt));
		Keyword keyword = (Keyword) criteria2.uniqueResult();
		quote.setKeyword(keyword);
		criteria2 = session.createCriteria(Post.class);
		criteria2.add(Restrictions.idEq(postInt));
		Post post = (Post) criteria2.uniqueResult();
		quote.setPost(post);

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(quote);
		transaction.commit();

		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostQuoteDetail.do", quote.getId().toString(),"success=true");
		return null;

		
	}
	
	
}