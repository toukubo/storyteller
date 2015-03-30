package net.universe.web.app;

import net.universe.model.*;

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


public class XlsExportOfCustomerAction{
	public XlsExportOfCustomerAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
         int x = 0;
                 sheet.addCell(new Label(x++, 0, "customerDetails"));
        sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "担当者名前(カナ)"));
        sheet.addCell(new Label(x++, 0, "メール"));
        sheet.addCell(new Label(x++, 0, "電話番号"));
        sheet.addCell(new Label(x++, 0, "顧客コード"));
        sheet.addCell(new Label(x++, 0, "顧客分類"));
        sheet.addCell(new Label(x++, 0, "携帯電話番号"));
        sheet.addCell(new Label(x++, 0, "メモ"));
        sheet.addCell(new Label(x++, 0, "会社名"));
        sheet.addCell(new Label(x++, 0, "担当者役職"));
        sheet.addCell(new Label(x++, 0, "取引銀行"));
        sheet.addCell(new Label(x++, 0, "取引開始日"));
        sheet.addCell(new Label(x++, 0, "締め日"));
        sheet.addCell(new Label(x++, 0, "住所番号"));
        sheet.addCell(new Label(x++, 0, "契約"));
        sheet.addCell(new Label(x++, 0, "担当者名前"));
        sheet.addCell(new Label(x++, 0, "printout"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      Customer customer = (Customer) iter.next();
    		    
        sheet.addCell(new DateTime(x++,y,customer.getId().toString()));

        sheet.addCell(new Label(x++,y,customer.getKana()));

        sheet.addCell(new Label(x++,y,customer.getMail()));

        sheet.addCell(new Label(x++,y,customer.getPhone()));

        sheet.addCell(new Label(x++,y,customer.getCode()));

        sheet.addCell(new Label(x++,y,customer.getCategory()));

        sheet.addCell(new Label(x++,y,customer.getMobilephone()));

        sheet.addCell(new Label(x++,y,customer.getMemo()));

        sheet.addCell(new Label(x++,y,customer.getCompany()));

        sheet.addCell(new Label(x++,y,customer.getOfficialposition()));

        sheet.addCell(new Label(x++,y,customer.getDealingsbank()));

        sheet.addCell(new DateTime(x++,y,customer.getStartupdate()));

        sheet.addCell(new DateTime(x++,y,customer.getClosedate()));

        sheet.addCell(new Number(x++,y,customer.getAddresno()));


        sheet.addCell(new Label(x++,y,customer.getName()));



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