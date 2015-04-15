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


public class XlsExportOfBusinessCostAction{
	public XlsExportOfBusinessCostAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
         int x = 0;
                 sheet.addCell(new Label(x++, 0, "繧ｹ繝医�繝ｪ繝ｼ"));
        sheet.addCell(new Label(x++, 0, "譎る俣蜊倅ｾ｡"));
        sheet.addCell(new Label(x++, 0, "蜀�Κ繝ｦ繝ｼ繧ｶ繝ｼ"));
        sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "蛟､"));
        sheet.addCell(new Label(x++, 0, "譎る俣"));
        sheet.addCell(new Label(x++, 0, "storytellerRole"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      BusinessCost businessCost = (BusinessCost) iter.next();
    		            sheet.addCell(new Label(x++,y,businessCost.getJ2eeStory().getName()));

        sheet.addCell(new Number(x++,y,businessCost.getCostperhour()));

        sheet.addCell(new Label(x++,y,businessCost.getIntraUser().getName()));

//        sheet.addCell(new DateTime(x++,y,businessCost.getId().toString()));

        sheet.addCell(new Number(x++,y,businessCost.getValue()));

        sheet.addCell(new Number(x++,y,businessCost.getHour()));

        sheet.addCell(new Label(x++,y,businessCost.getStorytellerRole().getName()));


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