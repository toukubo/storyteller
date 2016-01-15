package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.beans.*;

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


public class AccountSnapshotsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(AccountSnapshot.class);
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			AccountSnapshot accountSnapshot = (AccountSnapshot) iter.next();
			vector.add(accountSnapshot);
		}
		AccountSnapshot accountSnapshot = new AccountSnapshotImpl();
		AccountSnapshotForm accountSnapshotform = new AccountSnapshotForm();
		criteria = session.createCriteria(AccountSnapshot.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			accountSnapshot = (AccountSnapshot) criteria.uniqueResult();
			new CopyProperties(accountSnapshot,accountSnapshotform);
		} else if(req.getAttribute("form")!=null){
                        accountSnapshotform = (AccountSnapshotForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(accountSnapshotform.getId()));
			accountSnapshot = (AccountSnapshot) criteria.uniqueResult();
		}
		

		req.setAttribute("model",accountSnapshot);
		req.setAttribute("form",accountSnapshotform);
		
		
		req.setAttribute("accountSnapshots",vector);


                   

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}