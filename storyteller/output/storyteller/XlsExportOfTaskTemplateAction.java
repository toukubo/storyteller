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


public class XlsExportOfTaskTemplateAction{
	public XlsExportOfTaskTemplateAction(Vector vector,OutputStream outputStream,Session session){

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
        sheet.addCell(new Label(x++, 0, "タスク"));
        sheet.addCell(new Label(x++, 0, "周期的"));
        sheet.addCell(new Label(x++, 0, "storytellerRole"));
        sheet.addCell(new Label(x++, 0, "注文数"));
        sheet.addCell(new Label(x++, 0, "dependingPossibleDependance"));
        sheet.addCell(new Label(x++, 0, "dependedPossibleDependance"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      TaskTemplate taskTemplate = (TaskTemplate) iter.next();
    		            sheet.addCell(new Label(x++,y,taskTemplate.getName()));

        sheet.addCell(new DateTime(x++,y,taskTemplate.getId().toString()));



        sheet.addCell(new Label(x++,y,taskTemplate.getStorytellerRole().getName()));

        sheet.addCell(new Number(x++,y,taskTemplate.getOrdernum()));




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