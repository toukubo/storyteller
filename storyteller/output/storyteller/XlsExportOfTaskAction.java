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


public class XlsExportOfTaskAction{
	public XlsExportOfTaskAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
         int x = 0;
                 sheet.addCell(new Label(x++, 0, "名前"));
        sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "済み"));
        sheet.addCell(new Label(x++, 0, "開始日時"));
        sheet.addCell(new Label(x++, 0, "終了日時"));
        sheet.addCell(new Label(x++, 0, "時間"));
        sheet.addCell(new Label(x++, 0, "内部ユーザー"));
        sheet.addCell(new Label(x++, 0, "ストーリー"));
        sheet.addCell(new Label(x++, 0, "承認済み"));
        sheet.addCell(new Label(x++, 0, "アサイン済み"));
        sheet.addCell(new Label(x++, 0, "TaskTemplate"));
        sheet.addCell(new Label(x++, 0, "見積内訳"));
        sheet.addCell(new Label(x++, 0, "サマリー"));
        sheet.addCell(new Label(x++, 0, "注文数"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      Task task = (Task) iter.next();
    		            sheet.addCell(new Label(x++,y,task.getName()));

        sheet.addCell(new DateTime(x++,y,task.getId().toString()));


        sheet.addCell(new DateTime(x++,y,task.getStartdate()));

        sheet.addCell(new DateTime(x++,y,task.getEnddate()));

        sheet.addCell(new Number(x++,y,task.getHour()));

        sheet.addCell(new Label(x++,y,task.getIntraUser().getName()));

        sheet.addCell(new Label(x++,y,task.getJ2eeStory().getName()));



        sheet.addCell(new Label(x++,y,task.getTaskTemplate().getName()));


        sheet.addCell(new Label(x++,y,task.getSummery()));

        sheet.addCell(new Number(x++,y,task.getOrdernum()));


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