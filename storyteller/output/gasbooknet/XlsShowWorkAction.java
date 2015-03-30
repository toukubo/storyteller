package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.MergeXls;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import filters.pmcsm.HibernateSession;

public class XlsShowWorkAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Work work = new WorkImpl();
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		Criteria criteria = session.createCriteria(Work.class);

		if (req.getParameter("id") != null
				&& !req.getParameter("id").equals("")) {
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			work = (Work) criteria.uniqueResult();

		} else if (req.getAttribute("id") != null
				&& !req.getAttribute("id").equals("")) {
			criteria.add(Restrictions.idEq(req.getAttribute("id")));
			work = (Work) criteria.uniqueResult();
		}
		
		Map map = new HashMap();
		map.put("work.name",work.getName());
		map.put("work.attr1",work.getAttr1());
		
		
		File file = new File(this.getServlet().getServletContext().getRealPath("XlsShowWork.xls"));
		res.setHeader("Pragma", ""); 
		res.setHeader("Cache-Control", ""); 
		res.setHeader("Content-Disposition","attachment; filename=XlsShowWork.xls");
		MergeXls mergeXls =new MergeXls(file,res.getOutputStream(),map);
		
		for (Iterator iter = map.keySet().iterator(); iter.hasNext();) {
			String element = (String) iter.next();
			System.err.println("key" + element + " : content" + map.get(element));
			
		}
		
		return null;
		
	}
}

