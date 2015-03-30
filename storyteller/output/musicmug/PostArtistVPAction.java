package net.musicmug.web.app;

import net.musicmug.model.*;
import net.musicmug.beans.*;

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


public class PostArtistVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Artist artist = new ArtistImpl();
		ArtistForm artistform = (ArtistForm) form;

                String error = "";


                		Integer intraUserInt = artistform.getIntraUser();
		artistform.setIntraUser(null);
		Integer publicUserInt = artistform.getPublicUser();
		artistform.setPublicUser(null);

		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(artistform.getId() == null || artistform.getId().intValue() == 0){
			artist.setId(null);
			artistform.setId(null);
		}else{
			artist.setId(artistform.getId());
			Criteria criteria = session.createCriteria(Artist.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			artist = (Artist) criteria.uniqueResult();

		}
                		artist.setName(artistform.getName());
		artist.setDate(artistform.getDate());
		artist.setAddress(artistform.getAddress());
		artist.setStatus(artistform.getStatus());
		artist.setPassword(artistform.getPassword());
		artist.setUrl(artistform.getUrl());
		artist.setResponsible(artistform.getResponsible());
		artist.setMail(artistform.getMail());
		artist.setAccount(artistform.getAccount());
		artist.setFax(artistform.getFax());
		artist.setContact(artistform.getContact());
		artist.setKana(artistform.getKana());
		artist.setArtistnum(artistform.getArtistnum());
		artist.setBlogrss(artistform.getBlogrss());
		artist.setDelicious(artistform.getDelicious());
		artist.setFlickraccount(artistform.getFlickraccount());
		artist.setLastfmaccount(artistform.getLastfmaccount());
		artist.setProfile(artistform.getProfile());
		artist.setIninterview(artistform.getIninterview());
		artist.setWorksandstyle(artistform.getWorksandstyle());
		artist.setHistory(artistform.getHistory());
		artist.setBirthdate(artistform.getBirthdate());
		artist.setTypeofbusiness(artistform.getTypeofbusiness());
		artist.setCity(artistform.getCity());
		artist.setCountrystr(artistform.getCountrystr());
		artist.setPhone(artistform.getPhone());
		artist.setResponsiblephone(artistform.getResponsiblephone());
		artist.setResponsiblemail(artistform.getResponsiblemail());
		artist.setAwards(artistform.getAwards());
		artist.setExhibitions(artistform.getExhibitions());
		artist.setClients(artistform.getClients());
		artist.setPaymentmethod(artistform.getPaymentmethod());
		artist.setBank(artistform.getBank());
		artist.setBankbranch(artistform.getBankbranch());
		artist.setBrankname(artistform.getBrankname());
		artist.setBankaccount(artistform.getBankaccount());
		artist.setBankaccountname(artistform.getBankaccountname());
		artist.setIbanno(artistform.getIbanno());
		artist.setSwiftbicno(artistform.getSwiftbicno());
		artist.setRecentlyadded(artistform.isRecentlyadded());
		artist.setPoplular(artistform.isPoplular());
		artist.setPoplularity(artistform.getPoplularity());
		artist.setJapanesename(artistform.getJapanesename());
		artist.setBasiclanguage(artistform.getBasiclanguage());
		artist.setJapaneseprofile(artistform.getJapaneseprofile());
		artist.setOrganizer(artistform.getOrganizer());
		artist.setJapaneseexhibitions(artistform.getJapaneseexhibitions());
		artist.setJapanesetypeofbusiness(artistform.getJapanesetypeofbusiness());
		artist.setJapaneseclients(artistform.getJapaneseclients());
		artist.setJapaneseorganizer(artistform.getJapaneseorganizer());
		artist.setJapaneseaddress(artistform.getJapaneseaddress());
		artist.setJapaneseawards(artistform.getJapaneseawards());
		artist.setJapaneseresponsible(artistform.getJapaneseresponsible());
		artist.setJapanesebank(artistform.getJapanesebank());
		artist.setJapanesebranchname(artistform.getJapanesebranchname());
		artist.setJapanesebankaccountname(artistform.getJapanesebankaccountname());


		
		StringFullfiller.fullfil(artist);
                		Criteria criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		artist.setIntraUser(intrauser);
		criteria2 = session.createCriteria(PublicUser.class);
		criteria2.add(Restrictions.idEq(publicUserInt));
		PublicUser publicuser = (PublicUser) criteria2.uniqueResult();
		artist.setPublicUser(publicuser);


		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(artist);
		transaction.commit();
		session.flush();
                if(req.getParameter("from")!=null && req.getParameter("from").equals("detail")){
		   new HTTPGetRedirection(req, res, "PostArtistDetail.do", artist.getId().toString());
                }
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "Artists.do", artist.getId().toString());
		return null;

		
	}
	
	
}