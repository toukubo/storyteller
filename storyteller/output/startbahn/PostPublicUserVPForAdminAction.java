package net.startbahn.web.app;

import net.startbahn.model.*;
import net.startbahn.beans.*;

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


public class PostPublicUserVPForAdminAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		PublicUser publicUser = new PublicUserImpl();
		PublicUserForm publicUserform = (PublicUserForm) form;

                String error = "";


                		Integer artistInt = publicUserform.getArtist();
		publicUserform.setArtist(null);
		Integer collectorInt = publicUserform.getCollector();
		publicUserform.setCollector(null);
		Integer reviewerInt = publicUserform.getReviewer();
		publicUserform.setReviewer(null);
		Integer attachmentInt = publicUserform.getAttachment();
		publicUserform.setAttachment(null);
		Integer mpaMarkingInt = publicUserform.getMpaMarking();
		publicUserform.setMpaMarking(null);
		Integer invitationInt = publicUserform.getInvitation();
		publicUserform.setInvitation(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(publicUserform.getId() == null || publicUserform.getId().intValue() == 0){
			publicUser.setId(null);
			publicUserform.setId(null);
		}else{
			publicUser.setId(publicUserform.getId());
			Criteria criteria = session.createCriteria(PublicUser.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			publicUser = (PublicUser) criteria.uniqueResult();

		}
                		publicUser.setPassword(publicUserform.getPassword());
		publicUser.setUrl(publicUserform.getUrl());
		publicUser.setPoplularity(publicUserform.getPoplularity());
		publicUser.setRecentlyadded(publicUserform.isRecentlyadded());
		publicUser.setKana(publicUserform.getKana());
		publicUser.setMail(publicUserform.getMail());
		publicUser.setAccount(publicUserform.getAccount());
		publicUser.setPoplular(publicUserform.isPoplular());
		publicUser.setContact(publicUserform.getContact());
		publicUser.setBlogrss(publicUserform.getBlogrss());
		publicUser.setDelicious(publicUserform.getDelicious());
		publicUser.setFlickraccount(publicUserform.getFlickraccount());
		publicUser.setProfile(publicUserform.getProfile());
		publicUser.setIninterview(publicUserform.getIninterview());
		publicUser.setHistory(publicUserform.getHistory());
		publicUser.setBirthdate(publicUserform.getBirthdate());
		publicUser.setCity(publicUserform.getCity());
		publicUser.setCountrystr(publicUserform.getCountrystr());
		publicUser.setClients(publicUserform.getClients());
		publicUser.setBank(publicUserform.getBank());
		publicUser.setBankbranch(publicUserform.getBankbranch());
		publicUser.setBrankname(publicUserform.getBrankname());
		publicUser.setBankaccount(publicUserform.getBankaccount());
		publicUser.setBankaccountname(publicUserform.getBankaccountname());
		publicUser.setBranchaddress(publicUserform.getBranchaddress());
		publicUser.setTopimageid(publicUserform.getTopimageid());
		publicUser.setFavoritegenre(publicUserform.getFavoritegenre());
		publicUser.setBelonging(publicUserform.getBelonging());
		publicUser.setBirthplace(publicUserform.getBirthplace());
		publicUser.setName(publicUserform.getName());
		publicUser.setDate(publicUserform.getDate());
		publicUser.setAddress(publicUserform.getAddress());
		publicUser.setMale(publicUserform.isMale());
		publicUser.setOnewordmessage(publicUserform.getOnewordmessage());
		publicUser.setDisplayname(publicUserform.getDisplayname());
		publicUser.setCss(publicUserform.getCss());
		publicUser.setSuperuser(publicUserform.isSuperuser());


		
		StringFullfiller.fullfil(publicUser);
                		Criteria criteria2 = session.createCriteria(Artist.class);
		criteria2.add(Restrictions.idEq(artistInt));
		Artist artist = (Artist) criteria2.uniqueResult();
		publicUser.setArtist(artist);
		criteria2 = session.createCriteria(Collector.class);
		criteria2.add(Restrictions.idEq(collectorInt));
		Collector collector = (Collector) criteria2.uniqueResult();
		publicUser.setCollector(collector);
		criteria2 = session.createCriteria(Reviewer.class);
		criteria2.add(Restrictions.idEq(reviewerInt));
		Reviewer reviewer = (Reviewer) criteria2.uniqueResult();
		publicUser.setReviewer(reviewer);
		criteria2 = session.createCriteria(Attachment.class);
		criteria2.add(Restrictions.idEq(attachmentInt));
		Attachment attachment = (Attachment) criteria2.uniqueResult();
		publicUser.setAttachment(attachment);
		criteria2 = session.createCriteria(MpaMarking.class);
		criteria2.add(Restrictions.idEq(mpaMarkingInt));
		MpaMarking mpamarking = (MpaMarking) criteria2.uniqueResult();
		publicUser.setMpaMarking(mpamarking);
		criteria2 = session.createCriteria(Invitation.class);
		criteria2.add(Restrictions.idEq(invitationInt));
		Invitation invitation = (Invitation) criteria2.uniqueResult();
		publicUser.setInvitation(invitation);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(publicUser);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostPublicUserDetail.do", publicUser.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PublicUsers.do", publicUser.getId().toString());
		return null;

		
	}
	
	
}