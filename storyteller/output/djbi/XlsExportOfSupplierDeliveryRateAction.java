package net.djbi.web.app;

import net.djbi.model.*;

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


public class XlsExportOfSupplierDeliveryRateAction{
	public XlsExportOfSupplierDeliveryRateAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
         int x = 0;
                 sheet.addCell(new Label(x++, 0, "期間"));
        sheet.addCell(new Label(x++, 0, "会社"));
        sheet.addCell(new Label(x++, 0, "仕入先"));
        sheet.addCell(new Label(x++, 0, "deliverynum"));
        sheet.addCell(new Label(x++, 0, "deliverytotal"));
        sheet.addCell(new Label(x++, 0, "ordertotal"));
        sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "注文数"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      SupplierDeliveryRate supplierDeliveryRate = (SupplierDeliveryRate) iter.next();
    		            sheet.addCell(new Label(x++,y,supplierDeliveryRate.getTerm().getName()));

        sheet.addCell(new Label(x++,y,supplierDeliveryRate.getCompany().getName()));

        sheet.addCell(new Label(x++,y,supplierDeliveryRate.getSupplier().getName()));

        sheet.addCell(new Number(x++,y,supplierDeliveryRate.getDeliverynum()));

        sheet.addCell(new Number(x++,y,supplierDeliveryRate.getDeliverytotal()));

        sheet.addCell(new Number(x++,y,supplierDeliveryRate.getOrdertotal()));

        sheet.addCell(new DateTime(x++,y,supplierDeliveryRate.getId().toString()));

        sheet.addCell(new Number(x++,y,supplierDeliveryRate.getOrdernum()));


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