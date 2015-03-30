package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;

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


public class ArtistsAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{



		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());

                Vector vector = new Vector();
		Criteria criteria = session.createCriteria(Artist.class);
                
		if(StringUtils.isNotBlank(req.getParameter("datestartdate")) && StringUtils.isNotBlank(req.getParameter("dateenddate"))){
			Date  startDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("datestartdate"));
			Date endDate = (new SimpleDateFormat("yyyy/MM/dd")).parse(req.getParameter("dateenddate"));
			criteria.add(Restrictions.between("date", startDate, endDate));
		}


		if(StringUtils.isNotBlank(req.getParameter("intraUser"))) {
			Criteria criteria2 = session.createCriteria(IntraUser.class);
			criteria2.add(Restrictions.idEq(Integer.valueOf(req.getParameter("intraUser"))));
			IntraUser intraUser = (IntraUser) criteria2.uniqueResult();
			criteria..add(Restrictions.eq("intraUser", intraUser));
		}
 

gasbooknet
		req.setAttribute("artists",criteria.list());


//		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
//			Artist artist = (Artist) iter.next();
//			vector.add(artist);
//		}
		Artist artist = new ArtistImpl();
		ArtistForm artistform = new ArtistForm();
		criteria = session.createCriteria(Artist.class);


		if (req.getAttribute("form")== null && req.getParameter("id")!=null){
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			artist = (Artist) criteria.uniqueResult();
			new CopyProperties(artist,artistform);
		} else if(req.getAttribute("form")!=null){
                        artistform = (ArtistForm)req.getAttribute("form");
			criteria.add(Restrictions.idEq(artistform.getId()));
			artist = (Artist) criteria.uniqueResult();
		}
		

		req.setAttribute("model",artist);
		req.setAttribute("form",artistform);
		
		


                  Criteria criteriaIntraUser= session.createCriteria(IntraUser.class);
			req.setAttribute("IntraUsers", criteriaIntraUser.list());

 

		

                if(req.getParameter("displayexport") !=null){
     		    return mapping.findForward("displayexport");
                }

		return mapping.findForward("success");
	}
	
	
}