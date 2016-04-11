package net.storyteller.web;

import static net.storyteller.web.util.HttpUtil.isAcceptJSON;
import static net.storyteller.web.util.JSONResponseUtil.writeResponseAsJSON;

import java.util.Iterator;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.enclosing.util.HibernateSession;
import net.enclosing.util.JSONUtil;
import net.storyteller.model.Noun;
import net.storyteller.model.NounImpl;


public class NounsAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req,
			HttpServletResponse res) throws Exception {

		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());

		Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Noun.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Noun noun = (Noun) iter.next();
			vector.add(noun);
		}
		Noun noun = null;
		Criteria criteria2 = session.createCriteria(Noun.class);

		if (req.getParameter("id") != null && !req.getParameter("id").equals("")) {
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			noun = (Noun) criteria2.uniqueResult();

		} else if (req.getAttribute("id") != null && !req.getAttribute("id").equals("")) {
			criteria2.add(Restrictions.idEq(req.getAttribute("id")));
			noun = (Noun) criteria2.uniqueResult();
		}

		req.setAttribute("noun", noun==null?new NounImpl():noun);

		req.setAttribute("nouns", vector);

		if ( isAcceptJSON(req) ) {
			writeResponseAsJSON(res, noun==null?vector:noun);
			return null;
		}
		
		return mapping.findForward("success");
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml", "applicationContext-localDataSource.xml" });

		Session session = new HibernateSession().currentSession(context);

		Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Noun.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			Noun noun = (Noun) iter.next();
			vector.add(noun);
		}
		String json = JSONUtil.toJSON(vector);
		System.out.println("json:\n" + json);
	}
}
