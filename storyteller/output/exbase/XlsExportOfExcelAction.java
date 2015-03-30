package net.exbase.web.app;

import net.exbase.model.*;

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


public class XlsExportOfExcelAction{
	public XlsExportOfExcelAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
         int x = 0;
                 sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "æ´æ°æ¥"));
        sheet.addCell(new Label(x++, 0, "excelTemplate"));
        sheet.addCell(new Label(x++, 0, "excelVersions"));
        sheet.addCell(new Label(x++, 0, "commentNotificationChoises"));
        sheet.addCell(new Label(x++, 0, "コメント"));
        sheet.addCell(new Label(x++, 0, "activity"));
        sheet.addCell(new Label(x++, 0, "ãã¡ã¤ã«å"));
        sheet.addCell(new Label(x++, 0, "user"));
        sheet.addCell(new Label(x++, 0, "updateDate"));
        sheet.addCell(new Label(x++, 0, "approvalDate"));
        sheet.addCell(new Label(x++, 0, "applicationDate"));
        sheet.addCell(new Label(x++, 0, "category"));
        sheet.addCell(new Label(x++, 0, "downloadDate"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      Excel excel = (Excel) iter.next();
    		            sheet.addCell(new Label(x++,y,excel.getId().toString()));

        sheet.addCell(new DateTime(x++,y,excel.getUpdatedate()));

        sheet.addCell(new Label(x++,y,excel.getExcelTemplate().getName()));




        sheet.addCell(new Label(x++,y,excel.getActivity().getName()));

        sheet.addCell(new Label(x++,y,excel.getName()));

        sheet.addCell(new Label(x++,y,excel.getUser().getName()));

        sheet.addCell(new DateTime(x++,y,excel.getUpdateDate()));

        sheet.addCell(new DateTime(x++,y,excel.getApprovalDate()));

        sheet.addCell(new DateTime(x++,y,excel.getApplicationDate()));

        sheet.addCell(new Label(x++,y,excel.getCategory().getName()));

        sheet.addCell(new DateTime(x++,y,excel.getDownloadDate()));


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