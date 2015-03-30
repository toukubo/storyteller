package net.mazdasalestool.web;

import net.mazdasalestool.model.*;
import net.mazdasalestool.model.crud.*;

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


public class XlsExportOfExhibitionReportAction{
	public XlsExportOfExhibitionReportAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
                int x = 0;
                sheet.addCell(new Label(x++, 0, "1"));
        	sheet.addCell(new Label(x++, 0, "2"));
        	sheet.addCell(new Label(x++, 0, "3"));
        	sheet.addCell(new Label(x++, 0, "4"));
        	sheet.addCell(new Label(x++, 0, "5"));
        	sheet.addCell(new Label(x++, 0, "6"));
        	sheet.addCell(new Label(x++, 0, "7"));
        	sheet.addCell(new Label(x++, 0, "8"));
        	sheet.addCell(new Label(x++, 0, "9"));
        	sheet.addCell(new Label(x++, 0, "10"));






        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
    			ExhibitionReport exhibitionReport = (ExhibitionReport) iter.next();
    			sheet.addCell(new Label(x++, y, exhibitionReport.get().getTypename()));
    			sheet.addCell(new Label(x++, y, exhibitionReport.get().getModelcode()));
    			sheet.addCell(new Label(x++, y, exhibitionReport.get().getShimuke()));
    			sheet.addCell(new Label(x++, y, exhibitionReport.get().getName()));
    			sheet.addCell(new Number(x++, y, exhibitionReport.get()));
    			sheet.addCell(new Number(x++, y, exhibitionReport.get()));
    			sheet.addCell(new Label(x++, y, String.valueOf(true)));
    			sheet.addCell(new Label(x++, y, String.valueOf(true)));
    			sheet.addCell(new Label(x++, y, String.valueOf(true)));
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