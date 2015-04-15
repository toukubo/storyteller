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


public class XlsExportOfIntraUserAction{
	public XlsExportOfIntraUserAction(Vector vector,OutputStream outputStream,Session session){

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
        sheet.addCell(new Label(x++, 0, "繧｢繧ｫ繧ｦ繝ｳ繝�"));
        sheet.addCell(new Label(x++, 0, "costperhour"));
        sheet.addCell(new Label(x++, 0, "asdebugger"));
        sheet.addCell(new Label(x++, 0, "asresponsible"));
        sheet.addCell(new Label(x++, 0, "ascreator"));
        sheet.addCell(new Label(x++, 0, "tasks"));
        sheet.addCell(new Label(x++, 0, "icalurl"));
        sheet.addCell(new Label(x++, 0, "c2talkaccount"));
        sheet.addCell(new Label(x++, 0, "c2talkpassword"));
        sheet.addCell(new Label(x++, 0, "businessCosts"));
        sheet.addCell(new Label(x++, 0, "profitDividients"));
        sheet.addCell(new Label(x++, 0, "contributes"));
        sheet.addCell(new Label(x++, 0, "roleAssigns"));
        sheet.addCell(new Label(x++, 0, "password"));
        sheet.addCell(new Label(x++, 0, "mail"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      IntraUser intraUser = (IntraUser) iter.next();
    		            sheet.addCell(new Label(x++,y,intraUser.getName()));

//        sheet.addCell(new DateTime(x++,y,intraUser.getId().toString()));

        sheet.addCell(new Label(x++,y,intraUser.getAccount()));

        sheet.addCell(new Number(x++,y,intraUser.getCostperhour()));





        sheet.addCell(new Label(x++,y,intraUser.getIcalurl()));

        sheet.addCell(new Label(x++,y,intraUser.getC2talkaccount()));

        sheet.addCell(new Label(x++,y,intraUser.getC2talkpassword()));





        sheet.addCell(new Label(x++,y,intraUser.getPassword()));

        sheet.addCell(new Label(x++,y,intraUser.getMail()));


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