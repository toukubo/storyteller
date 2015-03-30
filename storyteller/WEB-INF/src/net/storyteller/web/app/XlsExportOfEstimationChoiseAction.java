package net.storyteller.web.app;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;

import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import net.storyteller.model.EstimationChoise;

import org.hibernate.Session;


public class XlsExportOfEstimationChoiseAction{
	public XlsExportOfEstimationChoiseAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
                int x = 0;
        sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "件名"));
        sheet.addCell(new Label(x++, 0, "金額"));
        sheet.addCell(new Label(x++, 0, "人日"));







        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
    			EstimationChoise estimationChoise = (EstimationChoise) iter.next();

    	        sheet.addCell(new Label(x++,y,estimationChoise.getId().toString()));
    	        sheet.addCell(new Label(x++,y,estimationChoise.getTest().getSummery()));
    	        sheet.addCell(new Number(x++,y,estimationChoise.getPrice()));
    	        sheet.addCell(new Number(x++,y,estimationChoise.getRequireddays()));


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