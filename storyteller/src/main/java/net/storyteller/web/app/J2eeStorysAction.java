package net.storyteller.web.app;

import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.model.J2eeStory;
import net.storyteller.model.J2eeStoryImpl;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class J2eeStorysAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(J2eeStory.class);
		criteria.addOrder(Order.desc("id"));
//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			J2eeStory j2eestory = (J2eeStory) iter.next();
//			vector.add(j2eestory);
//		}
//		J2eeStory j2eestory = new J2eeStoryImpl();
//		Criteria criteria2 = session.createCriteria(J2eeStory.class);
//
//		if (req.getParameter("id") != null
//				&& !req.getParameter("id").equals("")) {
//			criteria2.add(Restrictions.idEq(Integer.valueOf(req
//					.getParameter("id"))));
//			j2eestory = (J2eeStory) criteria2.uniqueResult();
//
//		} else if (req.getAttribute("id") != null
//				&& !req.getAttribute("id").equals("")) {
//			criteria2.add(Restrictions.idEq(req.getAttribute("id")));
//			j2eestory = (J2eeStory) criteria2.uniqueResult();
//		}
//
//		req.setAttribute("j2eestory",j2eestory);

		
		req.setAttribute("j2eestorys",criteria.list());
		
		
		if (StringUtils.isNotBlank(req.getParameter("export"))) {
			res.setHeader("Pragma", "");
			res.setHeader("Cache-Control", "");
			res.setHeader("Content-Disposition",
					"attachment; filename=XlsExportOfJ2eeStoryAction.xls");
			XlsExportOfJ2eeStoryAction action = new XlsExportOfJ2eeStoryAction(vector, res.getOutputStream(), session);
			return null;
		}


		
		return mapping.findForward("success");
	}
	
	
}
