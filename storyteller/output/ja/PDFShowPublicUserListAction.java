package net.ja.web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.ja.model.*;
import net.ja.model.crud.*;

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

public class PDFShowPublicUserListAction extends Action{
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


		PublicUser publicUser = new PublicUserImpl();
		Criteria criteria = session.createCriteria(PublicUser.class);




		if (req.getParameter("id") != null
				&& !req.getParameter("id").equals("")) {
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			publicUser = (PublicUser) criteria.uniqueResult();

		} else if (req.getAttribute("id") != null
				&& !req.getAttribute("id").equals("")) {
			criteria.add(Restrictions.idEq(req.getAttribute("id")));
			publicUser = (PublicUser) criteria.uniqueResult();
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
            calendar.setTime(publicUser.getSubmissiondate());
            
            cb.setFontAndSize(bf,19);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"御見積書",this.xoffset + 230,this.max  - (this.yoffset),0);
            cb.setFontAndSize(bf, 12);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"見積No:　　" + publicUser.getId(),this.xoffset + 400,this.max - (this.yoffset + 10) ,0);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"平成" + String.valueOf(calendar.get(Calendar.YEAR) - 1988)+ "年" + String.valueOf(calendar.get(Calendar.MONTH) + 1)+ "月" +calendar.get(Calendar.DATE) + "日",this.xoffset + 400,this.max  - (this.yoffset + 35),0);



            if(publicUser.getCustomer()!=null){
            	cb.showTextAligned(PdfContentByte.ALIGN_LEFT,publicUser.getCustomer().getName(),this.xoffset ,this.max - (this.yoffset + 45) ,0);
            	cb.showTextAligned(PdfContentByte.ALIGN_LEFT,publicUser.getCustomer().getTitle() ,this.xoffset +200  ,this.max - (this.yoffset + 45) ,0);
            }
            if(publicUser.getQuickresponsible() !=null){
                cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"ご担当　　　" +publicUser.getQuickresponsible() ,this.xoffset ,this.max - (this.yoffset + 65) ,0);
            }
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"ご担当　　　" +publicUser.getCustomerresponsible() ,this.xoffset ,this.max - (this.yoffset + 65) ,0);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"様　　　" ,this.xoffset + 200,this.max - (this.yoffset + 65) ,0);


                    cb.setFontAndSize(bf,11);
                    cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"御見積合計金額" ,this.xoffset +5 ,this.max - (this.yoffset + 92) ,0);
                    cb.setFontAndSize(bf,16);
                    cb.showTextAligned(PdfContentByte.ALIGN_RIGHT,"￥"+String.valueOf(numberFormat.format( totalwithtax)) ,this.xoffset+270 ,this.max - (this.yoffset + 95) ,0);
                    cb.setFontAndSize(bf,11);
                    cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"NET" ,this.xoffset +5 ,this.max - (this.yoffset + 122) ,0);
                    cb.showTextAligned(PdfContentByte.ALIGN_RIGHT,"￥"+String.valueOf(numberFormat.format( publicUser.getNet().intValue() )) ,this.xoffset+270 ,this.max - (this.yoffset + 125) ,0);
                    cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"内消費税額" ,this.xoffset +5 ,this.max - (this.yoffset + 152) ,0);
                    cb.showTextAligned(PdfContentByte.ALIGN_RIGHT,"￥"+String.valueOf(numberFormat.format( tax )) ,this.xoffset+270 ,this.max - (this.yoffset + 155) ,0);


            cb.setFontAndSize(bf,12);
            //工事件名文字列
            String[] strarray2 = new String[4];
            strarray2[0] = "工事件名";
            strarray2[1] = "現場住所";
            strarray2[2] = "御見積有効期限";
            strarray2[3] = "お支払条件";


            StringTokenizer stringTokenizer = new StringTokenizer(publicUser.getName(),"\r\n");
            if(stringTokenizer.countTokens()!=1){
            	cb.setFontAndSize(bf,10);
            	int i = 0;
            	while(stringTokenizer.hasMoreTokens()){
                	cb.showTextAligned(PdfContentByte.ALIGN_LEFT,stringTokenizer.nextToken(),this.xoffset + 95,this.max - (this.yoffset + 182 + i * 10) ,0);
                	i++;
            	}
            	cb.setFontAndSize(bf,11);
            }else{
            	cb.showTextAligned(PdfContentByte.ALIGN_LEFT,publicUser.getName(),this.xoffset + 95,this.max - (this.yoffset + 190) ,0);
            }

            cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "名称",this.xoffset + 103,this.max - (this.yoffset + 320),0);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "数量",this.xoffset + 277,this.max - (this.yoffset + 320),0);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "金額",this.xoffset + 366,this.max - (this.yoffset + 320),0);



            cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "id",this.xoffset + 103,this.max - (this.yoffset + 350),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getId().toString(),this.xoffset + 103,this.max - (this.yoffset + 350),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "ＪＡコード",this.xoffset + 103,this.max - (this.yoffset + 365),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getCode(),this.xoffset + 103,this.max - (this.yoffset + 365),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "受入累計",this.xoffset + 103,this.max - (this.yoffset + 380),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, new Integer(publicuser.getTotalcost()).toString(),this.xoffset + 103,this.max - (this.yoffset + 380),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "情報管理コード",this.xoffset + 103,this.max - (this.yoffset + 395),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getInfocode(),this.xoffset + 103,this.max - (this.yoffset + 395),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "農協コード",this.xoffset + 103,this.max - (this.yoffset + 410),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getJacode(),this.xoffset + 103,this.max - (this.yoffset + 410),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "取引",this.xoffset + 103,this.max - (this.yoffset + 425),0);
for (Iterator iter = criteriaAccountTransaction.list().iterator(); iter.hasNext();) {
AccountTransaction accountTransaction = (AccountTransaction) iter.next();
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "id",this.xoffset + 103,this.max - (this.yoffset + 440),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getId().toString(),this.xoffset + 103,this.max - (this.yoffset + 440),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "一般ユーザー",this.xoffset + 103,this.max - (this.yoffset + 455),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "農協コード",this.xoffset + 103,this.max - (this.yoffset + 470),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getCode(),this.xoffset + 103,this.max - (this.yoffset + 470),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "取明NO",this.xoffset + 103,this.max - (this.yoffset + 485),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getNo(),this.xoffset + 103,this.max - (this.yoffset + 485),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "本体消費税区分",this.xoffset + 103,this.max - (this.yoffset + 500),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getBodytaxtype(),this.xoffset + 103,this.max - (this.yoffset + 500),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "本支所コード",this.xoffset + 103,this.max - (this.yoffset + 515),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getBranch(),this.xoffset + 103,this.max - (this.yoffset + 515),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "組合員コード",this.xoffset + 103,this.max - (this.yoffset + 530),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, dateFormat.format(accounttransaction.getDateinaccount()),this.xoffset + block,this.max - (this.yoffset + 530),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "ＳＥＱＮＯ",this.xoffset + 103,this.max - (this.yoffset + 545),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getSeqno(),this.xoffset + 103,this.max - (this.yoffset + 545),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "取引日",this.xoffset + 103,this.max - (this.yoffset + 560),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getTransactiondate(),this.xoffset + 103,this.max - (this.yoffset + 560),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "起算日",this.xoffset + 103,this.max - (this.yoffset + 575),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, dateFormat.format(accounttransaction.getReckondate()),this.xoffset + block,this.max - (this.yoffset + 575),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "相手科目短縮コード",this.xoffset + 103,this.max - (this.yoffset + 590),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getPeeraccountingcodeinshort(),this.xoffset + 103,this.max - (this.yoffset + 590),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "摘要",this.xoffset + 103,this.max - (this.yoffset + 605),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getAbstraction(),this.xoffset + 103,this.max - (this.yoffset + 605),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "現振判定コード",this.xoffset + 103,this.max - (this.yoffset + 620),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getGenhuricode(),this.xoffset + 103,this.max - (this.yoffset + 620),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "貸借判定",this.xoffset + 103,this.max - (this.yoffset + 635),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getTaishaku(),this.xoffset + 103,this.max - (this.yoffset + 635),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "取引対象者区分",this.xoffset + 103,this.max - (this.yoffset + 650),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getPeertype(),this.xoffset + 103,this.max - (this.yoffset + 650),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "形態コード",this.xoffset + 103,this.max - (this.yoffset + 665),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getTypecode(),this.xoffset + 103,this.max - (this.yoffset + 665),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "任意集計コード１",this.xoffset + 103,this.max - (this.yoffset + 680),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getVariablestatscodeone(),this.xoffset + 103,this.max - (this.yoffset + 680),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "任意集計コード２",this.xoffset + 103,this.max - (this.yoffset + 695),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getVariablestatscodetwo(),this.xoffset + 103,this.max - (this.yoffset + 695),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "消費税区分",this.xoffset + 103,this.max - (this.yoffset + 710),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getTaxtype(),this.xoffset + 103,this.max - (this.yoffset + 710),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "JA用報告書区分",this.xoffset + 103,this.max - (this.yoffset + 725),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getReportingtype(),this.xoffset + 103,this.max - (this.yoffset + 725),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "情報管理コード",this.xoffset + 103,this.max - (this.yoffset + 740),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getInfocode(),this.xoffset + 103,this.max - (this.yoffset + 740),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "データパターン",this.xoffset + 103,this.max - (this.yoffset + 755),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getDatapattern(),this.xoffset + 103,this.max - (this.yoffset + 755),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "UPDATEUSERID",this.xoffset + 103,this.max - (this.yoffset + 770),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getUpdateuserid(),this.xoffset + 103,this.max - (this.yoffset + 770),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "入力日",this.xoffset + 103,this.max - (this.yoffset + 785),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getInputeddate(),this.xoffset + 103,this.max - (this.yoffset + 785),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "旧基本コード",this.xoffset + 103,this.max - (this.yoffset + 800),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getOldbasecode(),this.xoffset + 103,this.max - (this.yoffset + 800),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "旧内訳コード",this.xoffset + 103,this.max - (this.yoffset + 815),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getOlddetailedcode(),this.xoffset + 103,this.max - (this.yoffset + 815),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "営農コード",this.xoffset + 103,this.max - (this.yoffset + 830),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "取引金額",this.xoffset + 103,this.max - (this.yoffset + 845),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, accounttransaction.getValue(),this.xoffset + 103,this.max - (this.yoffset + 845),0);

<br />
    </logic:iterate>
</div>
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "金融機関コード",this.xoffset + 103,this.max - (this.yoffset + 860),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getAccountofficecode(),this.xoffset + 103,this.max - (this.yoffset + 860),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "店舗コード",this.xoffset + 103,this.max - (this.yoffset + 875),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getShopcode(),this.xoffset + 103,this.max - (this.yoffset + 875),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "科目コード",this.xoffset + 103,this.max - (this.yoffset + 890),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getDepartmentcode(),this.xoffset + 103,this.max - (this.yoffset + 890),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "口座番号",this.xoffset + 103,this.max - (this.yoffset + 905),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getAccountnumber(),this.xoffset + 103,this.max - (this.yoffset + 905),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "口座状態",this.xoffset + 103,this.max - (this.yoffset + 920),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getAccountstatus(),this.xoffset + 103,this.max - (this.yoffset + 920),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "閉鎖解除年月日",this.xoffset + 103,this.max - (this.yoffset + 935),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, dateFormat.format(publicuser.getClosurebreakdate()),this.xoffset + block,this.max - (this.yoffset + 935),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "解約区分",this.xoffset + 103,this.max - (this.yoffset + 950),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getClosuretype(),this.xoffset + 103,this.max - (this.yoffset + 950),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "所属支所コード",this.xoffset + 103,this.max - (this.yoffset + 965),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getBranchcode(),this.xoffset + 103,this.max - (this.yoffset + 965),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "経営形態",this.xoffset + 103,this.max - (this.yoffset + 980),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getManagementtype(),this.xoffset + 103,this.max - (this.yoffset + 980),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "地区コード",this.xoffset + 103,this.max - (this.yoffset + 995),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getAreacode(),this.xoffset + 103,this.max - (this.yoffset + 995),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "任意集計コード１",this.xoffset + 103,this.max - (this.yoffset + 1010),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getVarialblestatscode(),this.xoffset + 103,this.max - (this.yoffset + 1010),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "任意集計コード２",this.xoffset + 103,this.max - (this.yoffset + 1025),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getVarialblestatscodetwo(),this.xoffset + 103,this.max - (this.yoffset + 1025),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "内訳資料区分",this.xoffset + 103,this.max - (this.yoffset + 1040),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getDetaileddocumenttype(),this.xoffset + 103,this.max - (this.yoffset + 1040),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "レイアウトＮＯ",this.xoffset + 103,this.max - (this.yoffset + 1055),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getLayoutno(),this.xoffset + 103,this.max - (this.yoffset + 1055),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "帳票制御コード",this.xoffset + 103,this.max - (this.yoffset + 1070),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getPrintingcontrolcode(),this.xoffset + 103,this.max - (this.yoffset + 1070),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "ソリマチ対象者区分",this.xoffset + 103,this.max - (this.yoffset + 1085),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getSorimachitargettype(),this.xoffset + 103,this.max - (this.yoffset + 1085),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "取引残高",this.xoffset + 103,this.max - (this.yoffset + 1100),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, new Integer(publicuser.getRemaining()).toString(),this.xoffset + 103,this.max - (this.yoffset + 1100),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "受入累計",this.xoffset + 103,this.max - (this.yoffset + 1115),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, new Integer(publicuser.getTotalincome()).toString(),this.xoffset + 103,this.max - (this.yoffset + 1115),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "最終取引経理年月日",this.xoffset + 103,this.max - (this.yoffset + 1130),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, dateFormat.format(publicuser.getLasttransactiondate()),this.xoffset + block,this.max - (this.yoffset + 1130),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "要精算額当初金額",this.xoffset + 103,this.max - (this.yoffset + 1145),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, new Integer(publicuser.getNonaccountedatfirst()).toString(),this.xoffset + 103,this.max - (this.yoffset + 1145),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "要精算額累計金額",this.xoffset + 103,this.max - (this.yoffset + 1160),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, new Integer(publicuser.getNonaccountedatlast()).toString(),this.xoffset + 103,this.max - (this.yoffset + 1160),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "集計",this.xoffset + 103,this.max - (this.yoffset + 1175),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "地区",this.xoffset + 103,this.max - (this.yoffset + 1190),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "userInfo",this.xoffset + 103,this.max - (this.yoffset + 1205),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "組合員名",this.xoffset + 103,this.max - (this.yoffset + 1220),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getName(),this.xoffset + 103,this.max - (this.yoffset + 1220),0);

cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "種類",this.xoffset + 103,this.max - (this.yoffset + 1235),0);
cb.showTextAligned(PdfContentByte.ALIGN_LEFT, publicuser.getType(),this.xoffset + 103,this.max - (this.yoffset + 1235),0);




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