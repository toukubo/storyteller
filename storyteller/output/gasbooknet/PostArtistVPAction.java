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


public class PostArtistVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Artist artist = new ArtistImpl();
		ArtistForm artistform = (ArtistForm) form;

                String error = "";


                		Integer countryInt = artistform.getCountry();
		artistform.setCountry(null);
		Integer intraUserInt = artistform.getIntraUser();
		artistform.setIntraUser(null);
		Integer profileimageInt = artistform.getProfileimage();
		artistform.setProfileimage(null);
		Integer portraitInt = artistform.getPortrait();
		artistform.setPortrait(null);
		Integer genreInt = artistform.getGenre();
		artistform.setGenre(null);
		Integer artistXlsFileInt = artistform.getArtistXlsFile();
		artistform.setArtistXlsFile(null);

		
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
		artist.setUrl(artistform.getUrl());
		artist.setResponsible(artistform.getResponsible());
		artist.setMail(artistform.getMail());
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
		artist.setAccount(artistform.getAccount());
		artist.setPassword(artistform.getPassword());
		artist.setJapanesename(artistform.getJapanesename());
		artist.setJapaneserepresentativekana(artistform.getJapaneserepresentativekana());
		artist.setJapaneserepresentativename(artistform.getJapaneserepresentativename());
		artist.setRepresentativeenglish(artistform.getRepresentativeenglish());
		artist.setProfilejapanese(artistform.getProfilejapanese());
		artist.setStatus(artistform.getStatus());
		artist.setOrganizer(artistform.getOrganizer());
		artist.setJapaneseorganizer(artistform.getJapaneseorganizer());
		artist.setJapanesetypeofbusiness(artistform.getJapanesetypeofbusiness());
		artist.setJapaneseaddress(artistform.getJapaneseaddress());
		artist.setJapaneseresponsible(artistform.getJapaneseresponsible());
		artist.setJapaneseawards(artistform.getJapaneseawards());
		artist.setJapaneseclients(artistform.getJapaneseclients());
		artist.setJapaneseprofile(artistform.getJapaneseprofile());
		artist.setJapanesebranchname(artistform.getJapanesebranchname());
		artist.setJapanesebank(artistform.getJapanesebank());
		artist.setJapanesebankaccountname(artistform.getJapanesebankaccountname());
		artist.setJapaneseexhibitions(artistform.getJapaneseexhibitions());
		artist.setBasiclanguage(artistform.getBasiclanguage());


		
		StringFullfiller.fullfil(artist);
                		Criteria criteria2 = session.createCriteria(Country.class);
		criteria2.add(Restrictions.idEq(countryInt));
		Country country = (Country) criteria2.uniqueResult();
		artist.setCountry(country);
		criteria2 = session.createCriteria(IntraUser.class);
		criteria2.add(Restrictions.idEq(intraUserInt));
		IntraUser intrauser = (IntraUser) criteria2.uniqueResult();
		artist.setIntraUser(intrauser);
		criteria2 = session.createCriteria(Profileimage.class);
		criteria2.add(Restrictions.idEq(profileimageInt));
		Profileimage profileimage = (Profileimage) criteria2.uniqueResult();
		artist.setProfileimage(profileimage);
		criteria2 = session.createCriteria(Portrait.class);
		criteria2.add(Restrictions.idEq(portraitInt));
		Portrait portrait = (Portrait) criteria2.uniqueResult();
		artist.setPortrait(portrait);
		criteria2 = session.createCriteria(Genre.class);
		criteria2.add(Restrictions.idEq(genreInt));
		Genre genre = (Genre) criteria2.uniqueResult();
		artist.setGenre(genre);
		criteria2 = session.createCriteria(ArtistXlsFile.class);
		criteria2.add(Restrictions.idEq(artistXlsFileInt));
		ArtistXlsFile artistxlsfile = (ArtistXlsFile) criteria2.uniqueResult();
		artist.setArtistXlsFile(artistxlsfile);


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