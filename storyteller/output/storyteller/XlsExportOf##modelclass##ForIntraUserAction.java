package net.storyteller.web.app;

import net.storyteller.model.*;
import net.storyteller.model.crud.*;

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
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import net.pmcsm.model.Componey;
import net.pmcsm.model.Manual;
import net.pmcsm.model.Outsourcing;


public class XlsExportOf##modelclass##ForIntraUserAction{
	public XlsExportOf##modelclass##ForIntraUserAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
                int x = 0;
                 sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "金額"));
        sheet.addCell(new Label(x++, 0, "タスク"));
        sheet.addCell(new Label(x++, 0, "原価"));
        sheet.addCell(new Label(x++, 0, "利潤"));
        sheet.addCell(new Label(x++, 0, "見積"));
        sheet.addCell(new Label(x++, 0, "marketAveragePrice"));
        sheet.addCell(new Label(x++, 0, "marketAverageDays"));
        sheet.addCell(new Label(x++, 0, "requireddays"));
        sheet.addCell(new Label(x++, 0, "test"));







        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
    			##modelclass## estimationChoise = (##modelclass##) iter.next();
    			        sheet.addCell(new DateTime(x++,y,estimationChoise.getId().toString()));

        sheet.addCell(new Number(x++,y,estimationChoise.getPrice()));

        sheet.addCell(new Label(x++,y,estimationChoise.getTask().getName()));

        sheet.addCell(new Number(x++,y,estimationChoise.getCost()));

        sheet.addCell(new Number(x++,y,estimationChoise.getProfilt()));

        sheet.addCell(new Label(x++,y,estimationChoise.getEstimation().getName()));

        sheet.addCell(new Number(x++,y,estimationChoise.getMarketAveragePrice()));

        sheet.addCell(new Number(x++,y,estimationChoise.getMarketAverageDays()));

        sheet.addCell(new Number(x++,y,estimationChoise.getRequireddays()));

        sheet.addCell(new Label(x++,y,estimationChoise.getTest().getName()));


    			i++;
    		}
        	
        	workbook.write();
        	workbook.close();
		
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
        }
	}
	


}