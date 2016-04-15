package net.storyteller.web.app;

import net.storyteller.model.*;

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


public class XlsExportOfVerbAction{
	public XlsExportOfVerbAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
         int x = 0;
                 sheet.addCell(new Label(x++, 0, "蜷榊燕"));
        sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "譛牙柑"));
        sheet.addCell(new Label(x++, 0, "twoobjects"));
        sheet.addCell(new Label(x++, 0, "譌･譛ｬ隱�"));
        sheet.addCell(new Label(x++, 0, "strutsActionTemplates"));
        sheet.addCell(new Label(x++, 0, "jspTemplates"));
        sheet.addCell(new Label(x++, 0, "sentences"));
        sheet.addCell(new Label(x++, 0, "templateInputs"));
        sheet.addCell(new Label(x++, 0, "viewCodes"));
        sheet.addCell(new Label(x++, 0, "price"));
        sheet.addCell(new Label(x++, 0, "cost"));
        sheet.addCell(new Label(x++, 0, "marketAverageDays"));
        sheet.addCell(new Label(x++, 0, "profilt"));
        sheet.addCell(new Label(x++, 0, "marketAveragePrice"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      Verb verb = (Verb) iter.next();
    		            sheet.addCell(new Label(x++,y,verb.getName()));

//        sheet.addCell(new DateTime(x++,y,verb.getId().toString()));



        sheet.addCell(new Label(x++,y,verb.getJapanese()));






        sheet.addCell(new Number(x++,y,verb.getPrice()));

        sheet.addCell(new Number(x++,y,verb.getCost()));

        sheet.addCell(new Number(x++,y,verb.getMarketAverageDays()));

        sheet.addCell(new Number(x++,y,verb.getProfilt()));

        sheet.addCell(new Number(x++,y,verb.getMarketAveragePrice()));


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