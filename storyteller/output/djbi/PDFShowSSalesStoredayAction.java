package net.djbi.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.djbi.model.*;
import net.djbi.model.crud.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;



import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.pdf.codec.PngImage;


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

public class PDFShowSSalesStoredayAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{

                  int block = 25;


		NumberFormat numberFormat = NumberFormat.getIntegerInstance(Locale.US);
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();

		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		SSalesStoreday sSalesStoreday = new SSalesStoredayImpl();
		Criteria criteria = session.createCriteria(SSalesStoreday.class);




		if (req.getParameter("id") != null
				&& !req.getParameter("id").equals("")) {
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			sSalesStoreday = (SSalesStoreday) criteria.uniqueResult();

		} else if (req.getAttribute("id") != null
				&& !req.getAttribute("id").equals("")) {
			criteria.add(Restrictions.idEq(req.getAttribute("id")));
			sSalesStoreday = (SSalesStoreday) criteria.uniqueResult();
		}

		Document document = new  Document();

		
		try {
		       Font font = new Font(BaseFont.createFont("HeiseiMin-W3", "UniJIS-UCS2-HW-H",
		    	          BaseFont.NOT_EMBEDDED));
		       
		       Font font_header =
		    	    new Font(BaseFont.createFont("HeiseiMin-W3","UniJIS-UCS2-H",
		    	    BaseFont.NOT_EMBEDDED),18,Font.BOLD);

			
    		res.setContentType("application/pdf");
    		PdfWriter writer = PdfWriter.getInstance(document,byteOut);

            document.open();
            
            Image ci = PngImage.getImage(this.getServlet().getServletContext().getRealPath("ci.png"));
            ci.scalePercent(11);
            ci.setAbsolutePosition(365,this.max -(this.yoffset + 200));
            document.add(ci);

            PdfContentByte cb = writer.getDirectContent();

            
            java.awt.Graphics2D g =
                cb.createGraphicsShapes(PageSize.A4.width(), PageSize.A4.height());
            

            // you need to draw all the lines and circles first. then, after writing all the text content. later in this class....

            // line for data
			cb.setLineWidth((float)0.2);
            cb.moveTo(this.xoffset + 400,this.max  - ( this.yoffset + 12 ));
            cb.lineTo(this.xoffset+500,this.max - (this.yoffset + 12));
            cb.stroke();
            
            //line 2
            cb.moveTo(this.xoffset,this.max -  (this.yoffset + 50));
            cb.lineTo(this.xoffset+250,this.max - ( this.yoffset + 50));
            cb.moveTo(this.xoffset,this.max -  (this.yoffset + 51));
            cb.lineTo(this.xoffset+250,this.max - ( this.yoffset + 51));
            cb.moveTo(this.xoffset,this.max -  ( this.yoffset + 70));
            cb.lineTo(this.xoffset+250,this.max -  (this.yoffset + 70));


                    g.drawRoundRect(xoffset,yoffset + 20,300,20,8,8);
                    g.drawLine(xoffset+90,yoffset + 20,xoffset + 90,yoffset + 40);
                    g.drawRoundRect(xoffset,yoffset + 50,300,20,8,8);
                    g.drawLine(xoffset+90,yoffset + 50,xoffset + 90,yoffset + 70);
                    g.drawRoundRect(xoffset,yoffset + 80,300,20,8,8);
                    g.drawLine(xoffset+90,yoffset + 80,xoffset + 90,yoffset + 100);


            g.drawRoundRect(xoffset,yoffset + 80,300,20,8,8);
            g.drawLine(xoffset+90,yoffset + 80,xoffset + 90,yoffset + 100);
            
            //印影のボックス
            g.drawRoundRect(xoffset+320,yoffset + 160,200,70,8,8);
            g.drawLine(xoffset+320,yoffset + 180,xoffset + 520,yoffset + 180);
                       
            cb.moveTo(this.xoffset + 370,this.max - (this.yoffset + 239));
            cb.lineTo(this.xoffset + 370,this.max -  (this.yoffset + 288) );
            cb.moveTo(this.xoffset + 420,this.max -  ( this.yoffset + 219));
            cb.lineTo(this.xoffset + 420,this.max - ( this.yoffset + 288));
            cb.moveTo(this.xoffset + 470,this.max -  ( this.yoffset + 219));
            cb.lineTo(this.xoffset + 470,this.max - ( this.yoffset + 288));


            g.drawRoundRect(xoffset,yoffset + 110,300,120,8,8);
            g.drawLine(xoffset+90,yoffset + 110,xoffset + 90,yoffset + 230);
            cb.moveTo(this.xoffset,this.max - (this.yoffset + 200));
            cb.lineTo(this.xoffset + 300,this.max - (this.yoffset + 200));
	   cb.moveTo(this.xoffset,this.max - (this.yoffset + 230));
	   cb.lineTo(this.xoffset + 300,this.max - ( this.yoffset + 230));
	   cb.moveTo(this.xoffset,this.max - (this.yoffset + 260));
	   cb.lineTo(this.xoffset + 300,this.max - (this.yoffset + 260));

            
            // this strokes everything above. 
            cb.stroke();

            //then we starts drawing texts.
            BaseFont bf = BaseFont.createFont( "HeiseiMin-W3","UniJIS-UCS2-H",BaseFont.NOT_EMBEDDED);

            ///////////////////////////////////////////////////////////////////////////
            cb.beginText();
            
            cb.setFontAndSize(bf, 12);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(sSalesStoreday.getSubmissiondate());
            
            cb.setFontAndSize(bf,19);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"御見積書",this.xoffset + 230,this.max  - (this.yoffset),0);
            cb.setFontAndSize(bf, 12);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"見積No:　　" + sSalesStoreday.getId(),this.xoffset + 400,this.max - (this.yoffset + 10) ,0);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"平成" + String.valueOf(calendar.get(Calendar.YEAR) - 1988)+ "年" + String.valueOf(calendar.get(Calendar.MONTH) + 1)+ "月" +calendar.get(Calendar.DATE) + "日",this.xoffset + 400,this.max  - (this.yoffset + 35),0);



            if(sSalesStoreday.getCustomer()!=null){
            	cb.showTextAligned(PdfContentByte.ALIGN_LEFT,sSalesStoreday.getCustomer().getName(),this.xoffset ,this.max - (this.yoffset + 45) ,0);
            	cb.showTextAligned(PdfContentByte.ALIGN_LEFT,sSalesStoreday.getCustomer().getTitle() ,this.xoffset +200  ,this.max - (this.yoffset + 45) ,0);
            }
            if(sSalesStoreday.getQuickresponsible() !=null){
                cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"ご担当　　　" +sSalesStoreday.getQuickresponsible() ,this.xoffset ,this.max - (this.yoffset + 65) ,0);
            }
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"ご担当　　　" +sSalesStoreday.getCustomerresponsible() ,this.xoffset ,this.max - (this.yoffset + 65) ,0);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"様　　　" ,this.xoffset + 200,this.max - (this.yoffset + 65) ,0);


                    cb.setFontAndSize(bf,11);
                    cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"御見積合計金額" ,this.xoffset +5 ,this.max - (this.yoffset + 92) ,0);
                    cb.setFontAndSize(bf,16);
                    cb.showTextAligned(PdfContentByte.ALIGN_RIGHT,"￥"+String.valueOf(numberFormat.format( totalwithtax)) ,this.xoffset+270 ,this.max - (this.yoffset + 95) ,0);
                    cb.setFontAndSize(bf,11);
                    cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"NET" ,this.xoffset +5 ,this.max - (this.yoffset + 122) ,0);
                    cb.showTextAligned(PdfContentByte.ALIGN_RIGHT,"￥"+String.valueOf(numberFormat.format( sSalesStoreday.getNet().intValue() )) ,this.xoffset+270 ,this.max - (this.yoffset + 125) ,0);
                    cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"内消費税額" ,this.xoffset +5 ,this.max - (this.yoffset + 152) ,0);
                    cb.showTextAligned(PdfContentByte.ALIGN_RIGHT,"￥"+String.valueOf(numberFormat.format( tax )) ,this.xoffset+270 ,this.max - (this.yoffset + 155) ,0);


            cb.setFontAndSize(bf,12);
            //工事件名文字列
            String[] strarray2 = new String[4];
            strarray2[0] = "工事件名";
            strarray2[1] = "現場住所";
            strarray2[2] = "御見積有効期限";
            strarray2[3] = "お支払条件";


            StringTokenizer stringTokenizer = new StringTokenizer(sSalesStoreday.getName(),"\r\n");
            if(stringTokenizer.countTokens()!=1){
            	cb.setFontAndSize(bf,10);
            	int i = 0;
            	while(stringTokenizer.hasMoreTokens()){
                	cb.showTextAligned(PdfContentByte.ALIGN_LEFT,stringTokenizer.nextToken(),this.xoffset + 95,this.max - (this.yoffset + 182 + i * 10) ,0);
                	i++;
            	}
            	cb.setFontAndSize(bf,11);
            }else{
            	cb.showTextAligned(PdfContentByte.ALIGN_LEFT,sSalesStoreday.getName(),this.xoffset + 95,this.max - (this.yoffset + 190) ,0);
            }

            cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "名称",this.xoffset + 103,this.max - (this.yoffset + 320),0);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "数量",this.xoffset + 277,this.max - (this.yoffset + 320),0);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "金額",this.xoffset + 366,this.max - (this.yoffset + 320),0);



            cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "compCd",this.xoffset + 103,this.max - (this.yoffset + 350),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, ssalesstoreday.getCompCd(),this.xoffset + 103,this.max - (this.yoffset + 350),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "sRcvStoredays",this.xoffset + 103,this.max - (this.yoffset + 365),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "janCd",this.xoffset + 103,this.max - (this.yoffset + 380),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, ssalesstoreday.getJanCd(),this.xoffset + 103,this.max - (this.yoffset + 380),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "smrDayYmd",this.xoffset + 103,this.max - (this.yoffset + 395),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, ssalesstoreday.getSmrDayYmd(),this.xoffset + 103,this.max - (this.yoffset + 395),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "inpDayYmd",this.xoffset + 103,this.max - (this.yoffset + 410),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, ssalesstoreday.getInpDayYmd(),this.xoffset + 103,this.max - (this.yoffset + 410),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "actDayYmd",this.xoffset + 103,this.max - (this.yoffset + 425),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, ssalesstoreday.getActDayYmd(),this.xoffset + 103,this.max - (this.yoffset + 425),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "divCd",this.xoffset + 103,this.max - (this.yoffset + 440),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, ssalesstoreday.getDivCd(),this.xoffset + 103,this.max - (this.yoffset + 440),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "storCd",this.xoffset + 103,this.max - (this.yoffset + 455),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, ssalesstoreday.getStorCd(),this.xoffset + 103,this.max - (this.yoffset + 455),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "mstSellprc",this.xoffset + 103,this.max - (this.yoffset + 470),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "mstSellprcIntax",this.xoffset + 103,this.max - (this.yoffset + 485),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "mstCostprc",this.xoffset + 103,this.max - (this.yoffset + 500),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "lmstSellprc",this.xoffset + 103,this.max - (this.yoffset + 515),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "lmstSellprcIntax",this.xoffset + 103,this.max - (this.yoffset + 530),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "lmstCostprc",this.xoffset + 103,this.max - (this.yoffset + 545),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "posSellprc",this.xoffset + 103,this.max - (this.yoffset + 560),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "buyQty",this.xoffset + 103,this.max - (this.yoffset + 575),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "salesQty",this.xoffset + 103,this.max - (this.yoffset + 590),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "salesMny",this.xoffset + 103,this.max - (this.yoffset + 605),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "inSalesRtnQty",this.xoffset + 103,this.max - (this.yoffset + 620),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "inSalesRtnMny",this.xoffset + 103,this.max - (this.yoffset + 635),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "brgnDiscMny",this.xoffset + 103,this.max - (this.yoffset + 650),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "otherDiscMny",this.xoffset + 103,this.max - (this.yoffset + 665),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "brgnKbn",this.xoffset + 103,this.max - (this.yoffset + 680),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, ssalesstoreday.getBrgnKbn(),this.xoffset + 103,this.max - (this.yoffset + 680),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "edlpKbn",this.xoffset + 103,this.max - (this.yoffset + 695),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, ssalesstoreday.getEdlpKbn(),this.xoffset + 103,this.max - (this.yoffset + 695),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "lposSellprc",this.xoffset + 103,this.max - (this.yoffset + 710),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "lbuyQty",this.xoffset + 103,this.max - (this.yoffset + 725),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "lsalesQty",this.xoffset + 103,this.max - (this.yoffset + 740),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "lsalesMny",this.xoffset + 103,this.max - (this.yoffset + 755),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "mShn",this.xoffset + 103,this.max - (this.yoffset + 770),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "term",this.xoffset + 103,this.max - (this.yoffset + 785),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "company",this.xoffset + 103,this.max - (this.yoffset + 800),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "id",this.xoffset + 103,this.max - (this.yoffset + 815),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, ssalesstoreday.getId().toString(),this.xoffset + 103,this.max - (this.yoffset + 815),0);




            cb.endText();
    		document.close();
		
		res.setContentType("application/pdf");
		res.setContentLength(byteOut.size());
	    OutputStream out = res.getOutputStream();
	    out.write(byteOut.toByteArray());
	    out.close();
		res.setStatus(HttpServletResponse.SC_OK);
	    
        g.dispose();
		} catch (DocumentException de) {
			System.err.println(de.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
		return mapping.findForward("success");
	}
	private int xoffset = 20;
	private int yoffset = 100;
	private int max = 900;

	public void priintInJustified(String[] strarray,PdfContentByte cb,Font font,BaseFont bf,int width,int xoffset,int yoffset,int linespan){
		for (int i = 0; i < strarray.length; i++) {
			float xspan = width /   (strarray[i].length() -1);
			for (int j = 0; j < strarray[i].length(); j++) {
				cb.showTextAligned(PdfContentByte.ALIGN_LEFT,String.valueOf(strarray[i].charAt(j)),xoffset + j * xspan,yoffset - i * linespan,0);
			}
		}
		
//		cb.showTextAligned()
		
	}

}