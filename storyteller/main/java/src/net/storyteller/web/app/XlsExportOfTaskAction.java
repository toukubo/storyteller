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
                 sheet.addCell(new Label(x++, 0, "蜷榊燕"));
        sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "貂医∩"));
        sheet.addCell(new Label(x++, 0, "髢句ｧ区律譎�"));
        sheet.addCell(new Label(x++, 0, "邨ゆｺ�律譎�"));
        sheet.addCell(new Label(x++, 0, "譎る俣"));
        sheet.addCell(new Label(x++, 0, "蜀�Κ繝ｦ繝ｼ繧ｶ繝ｼ"));
        sheet.addCell(new Label(x++, 0, "繧ｹ繝医�繝ｪ繝ｼ"));
        sheet.addCell(new Label(x++, 0, "謇ｿ隱肴ｸ医∩"));
        sheet.addCell(new Label(x++, 0, "繧｢繧ｵ繧､繝ｳ貂医∩"));
        sheet.addCell(new Label(x++, 0, "TaskTemplate"));
        sheet.addCell(new Label(x++, 0, "隕狗ｩ榊�險ｳ"));
        sheet.addCell(new Label(x++, 0, "繧ｵ繝槭Μ繝ｼ"));
        sheet.addCell(new Label(x++, 0, "豕ｨ譁�焚"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      Task task = (Task) iter.next();
    		            sheet.addCell(new Label(x++,y,task.getName()));

//        sheet.addCell(new DateTime(x++,y,task.getId().toString()));


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