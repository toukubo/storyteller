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


public class XlsExportOfContributeAction{
	public XlsExportOfContributeAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
         int x = 0;
                 sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "雋｢迪ｮ繧ｿ繧､繝�"));
        sheet.addCell(new Label(x++, 0, "validyearstart"));
        sheet.addCell(new Label(x++, 0, "validmonthstart"));
        sheet.addCell(new Label(x++, 0, "蜀�Κ繝ｦ繝ｼ繧ｶ繝ｼ"));
        sheet.addCell(new Label(x++, 0, "validmonthend"));
        sheet.addCell(new Label(x++, 0, "繧ｹ繝医�繝ｪ繝ｼ"));
        sheet.addCell(new Label(x++, 0, "繝昴う繝ｳ繝�"));
        sheet.addCell(new Label(x++, 0, "validyearend"));
        sheet.addCell(new Label(x++, 0, "謇ｿ隱肴ｸ医∩"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      Contribute contribute = (Contribute) iter.next();
//    		            sheet.addCell(new DateTime(x++,y,contribute.getId().toString()));

        sheet.addCell(new Label(x++,y,contribute.getContributionType().getName()));

        sheet.addCell(new Number(x++,y,contribute.getValidyearstart()));

        sheet.addCell(new Number(x++,y,contribute.getValidmonthstart()));

        sheet.addCell(new Label(x++,y,contribute.getIntraUser().getName()));

        sheet.addCell(new Number(x++,y,contribute.getValidmonthend()));


        sheet.addCell(new Number(x++,y,contribute.getPoint()));

        sheet.addCell(new Number(x++,y,contribute.getValidyearend()));



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