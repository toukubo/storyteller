package net.universe.web.app;

import net.universe.model.*;
import net.universe.beans.*;

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


public class PostPdfCustomerLabelVPAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		PdfCustomerLabel pdfCustomerLabel = new PdfCustomerLabelImpl();
		PdfCustomerLabelForm pdfCustomerLabelform = (PdfCustomerLabelForm) form;

                String error = "";
if(!StringUtils.isNumeric(req.getParameter("nameX"))){
    error += "名前X座標には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("nameY"))){
    error += "名前Y座標には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("positionS"))){
    error += "役職名文字サイズには数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("positionY"))){
    error += "役職名Y座標には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("companyS"))){
    error += "会社名文字サイズには数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("positionX"))){
    error += "役職名X座標には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("addressY"))){
    error += "住所Y座標には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("companyY"))){
    error += "会社名Y座標には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("id"))){
    error += "idには数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("zipcodeS"))){
    error += "郵便番号文字サイズには数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("companyX"))){
    error += "会社名X座標には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("addressS"))){
    error += "住所文字サイズには数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("addressX"))){
    error += "住所X座標には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("zipcodeY"))){
    error += "郵便番号Y座標には数値のみを入れてください。<br />";
}
if(!StringUtils.isNumeric(req.getParameter("zipcodeX"))){
    error += "郵便番号X座標には数値のみを入れてください。<br />";
}
if(StringUtils.isNotBlank(error)){
	req.getSession().setAttribute("error",error);
	req.setAttribute("form",pdfCustomerLabelform);
	return mapping.findForward("error");
}


                
		
		Session session = new HibernateSession().currentSession(this.getServlet().getServletContext());
		if(pdfCustomerLabelform.getId() == null || pdfCustomerLabelform.getId().intValue() == 0){
			pdfCustomerLabel.setId(null);
			pdfCustomerLabelform.setId(null);
		}else{
			pdfCustomerLabel.setId(pdfCustomerLabelform.getId());
			Criteria criteria = session.createCriteria(PdfCustomerLabel.class);
			criteria.add(Restrictions.idEq(Integer.valueOf(req.getParameter("id"))));
			pdfCustomerLabel = (PdfCustomerLabel) criteria.uniqueResult();

		}
                		pdfCustomerLabel.setNameX(pdfCustomerLabelform.getNameX());
		pdfCustomerLabel.setNameY(pdfCustomerLabelform.getNameY());
		pdfCustomerLabel.setPositionS(pdfCustomerLabelform.getPositionS());
		pdfCustomerLabel.setPositionY(pdfCustomerLabelform.getPositionY());
		pdfCustomerLabel.setCompanyS(pdfCustomerLabelform.getCompanyS());
		pdfCustomerLabel.setPositionX(pdfCustomerLabelform.getPositionX());
		pdfCustomerLabel.setAddressY(pdfCustomerLabelform.getAddressY());
		pdfCustomerLabel.setCompanyY(pdfCustomerLabelform.getCompanyY());
		pdfCustomerLabel.setZipcodeS(pdfCustomerLabelform.getZipcodeS());
		pdfCustomerLabel.setCompanyX(pdfCustomerLabelform.getCompanyX());
		pdfCustomerLabel.setAddressS(pdfCustomerLabelform.getAddressS());
		pdfCustomerLabel.setAddressX(pdfCustomerLabelform.getAddressX());
		pdfCustomerLabel.setZipcodeY(pdfCustomerLabelform.getZipcodeY());
		pdfCustomerLabel.setZipcodeX(pdfCustomerLabelform.getZipcodeX());


		
		StringFullfiller.fullfil(pdfCustomerLabel);
                

		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(pdfCustomerLabel);
		transaction.commit();
		session.flush();
		if (StringUtils.isNotBlank(req.getParameter("ajax"))) {
			req.setAttribute("message","success");
			return mapping.findForward("success");
		}

		
		new HTTPGetRedirection(req, res, "PostPdfCustomerLabelDetail.do", pdfCustomerLabel.getId().toString());
		return null;

		
	}
	
	
}