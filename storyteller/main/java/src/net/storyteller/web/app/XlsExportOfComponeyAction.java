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


public class XlsExportOfComponeyAction{
	public XlsExportOfComponeyAction(Vector vector,OutputStream outputStream,Session session){

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
        sheet.addCell(new Label(x++, 0, "諡�ｽ楢��"));
        sheet.addCell(new Label(x++, 0, "attacklist"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      Componey componey = (Componey) iter.next();
    		            sheet.addCell(new Label(x++,y,componey.getName()));

//        sheet.addCell(new DateTime(x++,y,componey.getId().toString()));

        sheet.addCell(new Label(x++,y,componey.getResponsible()));



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