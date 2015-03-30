package net.clbs.web.app;

import net.clbs.model.*;

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


public class XlsExportOfTransitionAction{
	public XlsExportOfTransitionAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
         int x = 0;
                 sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "日時"));
        sheet.addCell(new Label(x++, 0, "血糖値"));
        sheet.addCell(new Label(x++, 0, "stop60min"));
        sheet.addCell(new Label(x++, 0, "operation"));
        sheet.addCell(new Label(x++, 0, "base"));
        sheet.addCell(new Label(x++, 0, "comment"));
        sheet.addCell(new Label(x++, 0, "ステータス"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      Transition transition = (Transition) iter.next();
    		            sheet.addCell(new DateTime(x++,y,transition.getId().toString()));

        sheet.addCell(new DateTime(x++,y,transition.getDatetime()));

        sheet.addCell(new DateTime(x++,y,transition.getBs().toString()));


        sheet.addCell(new Label(x++,y,transition.getOperation().getName()));

        sheet.addCell(new Number(x++,y,transition.getBase()));

        sheet.addCell(new Label(x++,y,transition.getComment()));

        sheet.addCell(new DateTime(x++,y,transition.getStatus().toString()));


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