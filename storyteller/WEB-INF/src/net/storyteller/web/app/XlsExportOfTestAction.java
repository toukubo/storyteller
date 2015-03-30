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
import net.pmcsm.model.Componey;
import net.pmcsm.model.Manual;
import net.pmcsm.model.Outsourcing;


public class XlsExportOfTestAction{
	public XlsExportOfTestAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
         int x = 0;
                 sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "ストーリー"));
        sheet.addCell(new Label(x++, 0, "担当者"));
        sheet.addCell(new Label(x++, 0, "再現手順"));
        sheet.addCell(new Label(x++, 0, "期待される動作"));
        sheet.addCell(new Label(x++, 0, "表示内容"));
        sheet.addCell(new Label(x++, 0, "デバグ済み"));
        sheet.addCell(new Label(x++, 0, "チェック済み"));
        sheet.addCell(new Label(x++, 0, "割り当てた人"));
        sheet.addCell(new Label(x++, 0, "デバッグ担当"));
        sheet.addCell(new Label(x++, 0, "jsp"));
        sheet.addCell(new Label(x++, 0, "summery"));
        sheet.addCell(new Label(x++, 0, "asnormal"));
        sheet.addCell(new Label(x++, 0, "asmain"));
        sheet.addCell(new Label(x++, 0, "estimationChoises"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      Test test = (Test) iter.next();
    		            sheet.addCell(new DateTime(x++,y,test.getId().toString()));

        sheet.addCell(new Label(x++,y,test.getJ2eeStory().getName()));

        sheet.addCell(new Label(x++,y,test.getResponsible().getName()));

        sheet.addCell(new Label(x++,y,test.getStepstorepeat()));

        sheet.addCell(new Label(x++,y,test.getWhatyouexpectedtosee()));

        sheet.addCell(new Label(x++,y,test.getWhatyousawinstead()));



        sheet.addCell(new Label(x++,y,test.getCreator().getName()));

        sheet.addCell(new Label(x++,y,test.getDebugger().getName()));

        sheet.addCell(new Label(x++,y,test.getJsp().getName()));

        sheet.addCell(new Label(x++,y,test.getSummery()));

        sheet.addCell(new Label(x++,y,test.getAsnormal().getName()));

        sheet.addCell(new Label(x++,y,test.getAsmain().getName()));



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