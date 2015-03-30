package net.gasbooknet.web.app;

import net.gasbooknet.model.*;
import net.gasbooknet.beans.*;

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


public class UpdateArtistToUpdateWorkFromZipfileAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{


		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Artist artist = new ArtistImpl();
		ArtistForm artistform = new ArtistForm();
		Criteria criteria = session.createCriteria(Artist.class);

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
                   
                execute(artist,session);


	}
	public static void main(String[] args) {
		try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localDataSource.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				UpdateArtistToUpdateWorkFromZipfileAction action = new UpdateArtistToUpdateWorkFromZipfileAction();
				Criteria criteria = session.createCriteria(Artist.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				Artist artist = (Artist) criteria.uniqueResult();
				action.execute(artist, session);
				session.close();
				sessionFactory.close();
				sessionFactory =null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void execute(Artist artist,Session session){
		
	}

}