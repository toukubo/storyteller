package net.storyteller.web.app;

import java.awt.Graphics2D;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.model.Estimation;
import net.storyteller.model.EstimationChoise;
import net.storyteller.model.EstimationImpl;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.pdf.codec.PngImage;

public class PDFShowEstimationAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{




		res.setContentType("application/pdf");
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());
		Criteria criteria = session.createCriteria(Estimation.class);
		Estimation estimation = new EstimationImpl();

		if (req.getParameter("id") != null
				&& !req.getParameter("id").equals("")) {
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			estimation = (Estimation) criteria.uniqueResult();

		} else if (req.getAttribute("id") != null
				&& !req.getAttribute("id").equals("")) {
			criteria.add(Restrictions.idEq(req.getAttribute("id")));
			estimation = (Estimation) criteria.uniqueResult();
		}


		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		byteOut = this.getPDFByteOut(estimation, session, byteOut, this.getServlet().getServletContext().getRealPath("ci.png"));
		
		
		res.setContentType("application/pdf");
		res.setContentLength(byteOut.size());
	    OutputStream out = res.getOutputStream();
	    out.write(byteOut.toByteArray());
	    out.close();
		res.setStatus(HttpServletResponse.SC_OK);
	    
		return null;
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
	public static void main(String[] args) {
		try {
			try {
				ApplicationContext context = new ClassPathXmlApplicationContext(
						new String[] { "applicationContext.xml",
								"applicationContext-localhost.xml" });
				SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
				Session session = sessionFactory.openSession();
				ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
				PDFShowEstimationAction action = new PDFShowEstimationAction();
				Criteria criteria = session.createCriteria(Estimation.class);
				criteria.add(Restrictions.idEq(new Integer(1)));
				Estimation estimation = (Estimation) criteria.uniqueResult();
				
				byteArrayOutputStream = action.getPDFByteOut(estimation, session, byteArrayOutputStream,"ci.png");
				File file = new File("estimation.pdf");
				FileOutputStream outputStream = new FileOutputStream(file);
				outputStream.write(byteArrayOutputStream.toByteArray());
				outputStream.flush();
				outputStream.close();
				session.close();
				sessionFactory.close();
				sessionFactory =null;
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (BeansException e) {
			e.printStackTrace();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
		
		
	}
	public ByteArrayOutputStream getPDFByteOut(Estimation estimation,Session session,ByteArrayOutputStream byteOut,String cipath){
		try {





			
			Document document = new  Document();
            int block = 25;
			NumberFormat numberFormat = NumberFormat.getIntegerInstance(Locale.US);
		       Font font = new Font(BaseFont.createFont("HeiseiMin-W3", "UniJIS-UCS2-HW-H",
		    	          BaseFont.NOT_EMBEDDED));
		       
		       Font font_header =
		    	    new Font(BaseFont.createFont("HeiseiMin-W3","UniJIS-UCS2-H",
		    	    BaseFont.NOT_EMBEDDED),18,Font.BOLD);

			
    		PdfWriter writer = PdfWriter.getInstance(document,byteOut);

            document.open();
            
            Image ci = PngImage.getImage(cipath);
            ci.scalePercent(11);
            ci.setAbsolutePosition(365,this.max -(this.yoffset + 142));
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


                    g.drawRoundRect(xoffset,yoffset + 20,300,20,8,8);
                    g.drawLine(xoffset+90,yoffset + 20,xoffset + 90,yoffset + 40);
            
            //印影のボックス
//            g.drawRoundRect(xoffset+320,yoffset + 160,200,70,8,8);
//            g.drawLine(xoffset+320,yoffset + 180,xoffset + 520,yoffset + 180);
//                       
//            cb.moveTo(this.xoffset + 370,this.max - (this.yoffset + 239));
//            cb.lineTo(this.xoffset + 370,this.max -  (this.yoffset + 288) );
//            cb.moveTo(this.xoffset + 420,this.max -  ( this.yoffset + 219));
//            cb.lineTo(this.xoffset + 420,this.max - ( this.yoffset + 288));
//            cb.moveTo(this.xoffset + 470,this.max -  ( this.yoffset + 219));
//            cb.lineTo(this.xoffset + 470,this.max - ( this.yoffset + 288));


            g.drawRoundRect(xoffset,yoffset + 50,300,30,8,8);
            g.drawLine(xoffset+90,yoffset + 50,xoffset + 90,yoffset + 80);
//            cb.moveTo(this.xoffset,this.max - (this.yoffset + 200));
//            cb.lineTo(this.xoffset + 300,this.max - (this.yoffset + 200));
//	   cb.moveTo(this.xoffset,this.max - (this.yoffset + 230));
//	   cb.lineTo(this.xoffset + 300,this.max - ( this.yoffset + 230));
//	   cb.moveTo(this.xoffset,this.max - (this.yoffset + 260));
//	   cb.lineTo(this.xoffset + 300,this.max - (this.yoffset + 260));
            
            int categoryy = 130;
            int categoryendy = 757;
            
            g.drawRoundRect(xoffset,yoffset + categoryy,550,570,8,8);
            g.drawLine(xoffset,yoffset + categoryy+ 20 ,xoffset+550,yoffset +  categoryy+ 20 );
//            g.drawLine(xoffset+90,yoffset + 110,xoffset + 90,yoffset + 230);
			cb.moveTo(this.xoffset + 240,this.max - (this.yoffset + categoryy + 58));
			cb.lineTo(this.xoffset + 240,this.max - (this.yoffset + categoryendy));
			cb.moveTo(this.xoffset + 340,this.max - (this.yoffset + categoryy + 58));
			cb.lineTo(this.xoffset + 340,this.max - (this.yoffset + categoryendy));
			cb.moveTo(this.xoffset + 420,this.max - (this.yoffset + categoryy + 58));
			cb.lineTo(this.xoffset + 420,this.max - (this.yoffset + categoryendy));
            this.drawCurrencyLine(cb,xoffset+420,yoffset + categoryy + 78,3,g,553);
			
			cb.stroke();


            
            // this strokes everything above. 
            cb.stroke();

            //then we starts drawing texts.
            BaseFont bf = BaseFont.createFont( "HeiseiMin-W3","UniJIS-UCS2-H",BaseFont.NOT_EMBEDDED);

            ///////////////////////////////////////////////////////////////////////////
            cb.beginText();
            
            cb.setFontAndSize(bf, 12);
            Calendar calendar = Calendar.getInstance();
//            calendar.setTime(estimation.getSubmissiondate());
            
            cb.setFontAndSize(bf,19);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"御見積書",this.xoffset + 230,this.max  - (this.yoffset),0);
            cb.setFontAndSize(bf, 12);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"見積No:　　" + estimation.getId().toString(),this.xoffset + 400,this.max - (this.yoffset + 10) ,0);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"平成" + String.valueOf(calendar.get(Calendar.YEAR) - 1988)+ "年" + String.valueOf(calendar.get(Calendar.MONTH) + 1)+ "月" +calendar.get(Calendar.DATE) + "日",this.xoffset + 400,this.max  - (this.yoffset + 35),0);



            if(estimation.getJ2eeStory().getClient()!=null){
            	cb.showTextAligned(PdfContentByte.ALIGN_LEFT,estimation.getJ2eeStory().getClient().getName()+"様",this.xoffset ,this.max - (this.yoffset + 45) ,0);
            }
//            if(estimation.getQuickresponsible() !=null){
//                cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"ご担当　　　" +estimation.getQuickresponsible() ,this.xoffset ,this.max - (this.yoffset + 65) ,0);
//            }
//            cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"ご担当　　　" +estimation.getCustomerresponsible() ,this.xoffset ,this.max - (this.yoffset + 65) ,0);
//            cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"様　　　" ,this.xoffset + 200,this.max - (this.yoffset + 65) ,0);


            cb.setFontAndSize(bf,11);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"御見積合計金額" ,this.xoffset +5 ,this.max - (this.yoffset + 92) ,0);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"件名" ,this.xoffset +5 ,this.max - (this.yoffset + 122) ,0);
                      cb.setFontAndSize(bf,16);
            cb.showTextAligned(PdfContentByte.ALIGN_RIGHT,"￥"+String.valueOf(numberFormat.format( estimation.getTotalprice())) ,this.xoffset+270 ,this.max - (this.yoffset + 95) ,0);
            cb.setFontAndSize(bf,11);
//                    cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"NET" ,this.xoffset +5 ,this.max - (this.yoffset + 122) ,0);
//                    cb.showTextAligned(PdfContentByte.ALIGN_RIGHT,"￥"+String.valueOf(numberFormat.format( estimation.getNet().intValue() )) ,this.xoffset+270 ,this.max - (this.yoffset + 125) ,0);
//                    cb.showTextAligned(PdfContentByte.ALIGN_LEFT,"内消費税額" ,this.xoffset +5 ,this.max - (this.yoffset + 152) ,0);
//                    cb.showTextAligned(PdfContentByte.ALIGN_RIGHT,"￥"+String.valueOf(numberFormat.format( tax )) ,this.xoffset+270 ,this.max - (this.yoffset + 155) ,0);


                    

            cb.setFontAndSize(bf,16);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "見積内訳",this.xoffset + 33,this.max - (this.yoffset + 170),0);
                    
            cb.setFontAndSize(bf,12);
            //工事件名文字列


            cb.showTextAligned(PdfContentByte.ALIGN_LEFT,estimation.getTitle(),this.xoffset + 95,this.max - (this.yoffset + 122) ,0);

			cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "項目ID・名称",this.xoffset +85,this.max - (this.yoffset + categoryy + 70),0);
//            cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "単価",this.xoffset + 380,this.max - (this.yoffset +  categoryy + 70 ),0);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "人日",this.xoffset + 279,this.max - (this.yoffset + categoryy + 70),0);
            cb.showTextAligned(PdfContentByte.ALIGN_RIGHT, "金額",this.xoffset + 387,this.max - (this.yoffset +  categoryy + 70),0);
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT, "備考",this.xoffset + 469,this.max - (this.yoffset +  categoryy + 70),0);



			Criteria criteriaEstimationChoise = session.createCriteria(EstimationChoise.class);
			criteriaEstimationChoise.add(Restrictions.eq("estimation", estimation));
			criteriaEstimationChoise.addOrder(Order.asc("id"));
			//req.setAttribute("EstimationChoises", criteriaEstimationChoise.list());
			
			
			int ypoint = 0;
			for (Iterator iter = criteriaEstimationChoise.list().iterator(); iter.hasNext();) {
				EstimationChoise estimationChoise = (EstimationChoise) iter.next();
				ypoint += 20;
				cb.showTextAligned(PdfContentByte.ALIGN_RIGHT, estimationChoise.getTest().getId().toString() + ":" ,this.xoffset + 22,this.max - (this.yoffset + 205 + ypoint),0);
				cb.showTextAligned(PdfContentByte.ALIGN_LEFT, estimationChoise.getTest().getSummery(),this.xoffset + 25,this.max - (this.yoffset + 205 + ypoint),0);
//				cb.showTextAligned(PdfContentByte.ALIGN_RIGHT, "40,000",this.xoffset + 400,this.max - (this.yoffset + 320 + ypoint),0);
				cb.showTextAligned(PdfContentByte.ALIGN_RIGHT, new java.lang.Float(estimationChoise.getRequireddays()).toString(),this.xoffset + 335,this.max - (this.yoffset + 205 + ypoint),0);
				cb.showTextAligned(PdfContentByte.ALIGN_RIGHT, numberFormat.format(estimationChoise.getPrice()),this.xoffset + 420,this.max - (this.yoffset + 205 + ypoint),0);
			}



            cb.endText();
//            g.dispose();
    		document.close();
		
		} catch (DocumentException de) {
			System.err.println(de.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
		return byteOut;
	}
	public void drawCurrencyLine(PdfContentByte cb ,int x,int y,int num,Graphics2D g,int height) {
		int span = 20;
		float[] fd = {1.0f};
		int dashspan = 3;
		

//		BasicStroke dashed = new BasicStroke(1.0f, BasicStroke.CAP_BUTT,
//                BasicStroke.JOIN_MITER, 10.0f,fd, 0.0f);
//		g.setStroke(dashed);
//		cb.setLineDash(fd);
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < (height/dashspan); j++) {
				cb.moveTo(x- i* span,max - (y + j * dashspan));
				j++; 
				cb.lineTo(x - i*span,max - (y + j*dashspan));
			}
//			.drawLine(x - (i * span) , y , x - ( i * span ) , y + 400);
			
		}
	}


}