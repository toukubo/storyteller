package net.gasbooknet.web.app;

import net.gasbooknet.model.*;

import java.awt.font.NumericShaper;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.*;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;


public class XlsExportOfWorkAttachmentAction{
	public XlsExportOfWorkAttachmentAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
         int x = 0;
                 sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "作品"));
        sheet.addCell(new Label(x++, 0, "付属品"));
        sheet.addCell(new Label(x++, 0, "filename"));
        sheet.addCell(new Label(x++, 0, "mainvisual"));
        sheet.addCell(new Label(x++, 0, "thumnail"));
        sheet.addCell(new Label(x++, 0, "thumnailsize"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      WorkAttachment workAttachment = (WorkAttachment) iter.next();
    		            sheet.addCell(new DateTime(x++,y,workAttachment.getId().toString()));

        sheet.addCell(new Label(x++,y,workAttachment.getWork().getName()));

        sheet.addCell(new Label(x++,y,workAttachment.getAttachment().getName()));

        sheet.addCell(new Label(x++,y,workAttachment.getFilename()));



        sheet.addCell(new Label(x++,y,workAttachment.getThumnailsize()));


    		     y++;
    			x=0;

    		}
        	
        	workbook.write();
        	workbook.close();
		
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
        }
	}
	


}