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


public class XlsExportOfSSalesStoredayAction{
	public XlsExportOfSSalesStoredayAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
         int x = 0;
                 sheet.addCell(new Label(x++, 0, "compCd"));
        sheet.addCell(new Label(x++, 0, "sRcvStoredays"));
        sheet.addCell(new Label(x++, 0, "janCd"));
        sheet.addCell(new Label(x++, 0, "smrDayYmd"));
        sheet.addCell(new Label(x++, 0, "inpDayYmd"));
        sheet.addCell(new Label(x++, 0, "actDayYmd"));
        sheet.addCell(new Label(x++, 0, "divCd"));
        sheet.addCell(new Label(x++, 0, "storCd"));
        sheet.addCell(new Label(x++, 0, "mstSellprc"));
        sheet.addCell(new Label(x++, 0, "mstSellprcIntax"));
        sheet.addCell(new Label(x++, 0, "mstCostprc"));
        sheet.addCell(new Label(x++, 0, "lmstSellprc"));
        sheet.addCell(new Label(x++, 0, "lmstSellprcIntax"));
        sheet.addCell(new Label(x++, 0, "lmstCostprc"));
        sheet.addCell(new Label(x++, 0, "posSellprc"));
        sheet.addCell(new Label(x++, 0, "buyQty"));
        sheet.addCell(new Label(x++, 0, "salesQty"));
        sheet.addCell(new Label(x++, 0, "salesMny"));
        sheet.addCell(new Label(x++, 0, "inSalesRtnQty"));
        sheet.addCell(new Label(x++, 0, "inSalesRtnMny"));
        sheet.addCell(new Label(x++, 0, "brgnDiscMny"));
        sheet.addCell(new Label(x++, 0, "otherDiscMny"));
        sheet.addCell(new Label(x++, 0, "brgnKbn"));
        sheet.addCell(new Label(x++, 0, "edlpKbn"));
        sheet.addCell(new Label(x++, 0, "lposSellprc"));
        sheet.addCell(new Label(x++, 0, "lbuyQty"));
        sheet.addCell(new Label(x++, 0, "lsalesQty"));
        sheet.addCell(new Label(x++, 0, "lsalesMny"));
        sheet.addCell(new Label(x++, 0, "mShn"));
        sheet.addCell(new Label(x++, 0, "term"));
        sheet.addCell(new Label(x++, 0, "company"));
        sheet.addCell(new Label(x++, 0, "id"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      SSalesStoreday sSalesStoreday = (SSalesStoreday) iter.next();
    		            sheet.addCell(new Label(x++,y,sSalesStoreday.getCompCd()));


        sheet.addCell(new Label(x++,y,sSalesStoreday.getJanCd()));

        sheet.addCell(new Label(x++,y,sSalesStoreday.getSmrDayYmd()));

        sheet.addCell(new Label(x++,y,sSalesStoreday.getInpDayYmd()));

        sheet.addCell(new Label(x++,y,sSalesStoreday.getActDayYmd()));

        sheet.addCell(new Label(x++,y,sSalesStoreday.getDivCd()));

        sheet.addCell(new Label(x++,y,sSalesStoreday.getStorCd()));

        sheet.addCell(new Number(x++,y,sSalesStoreday.getMstSellprc()));

        sheet.addCell(new Number(x++,y,sSalesStoreday.getMstSellprcIntax()));

        sheet.addCell(new Number(x++,y,sSalesStoreday.getMstCostprc()));

        sheet.addCell(new Number(x++,y,sSalesStoreday.getLmstSellprc()));

        sheet.addCell(new Number(x++,y,sSalesStoreday.getLmstSellprcIntax()));

        sheet.addCell(new Number(x++,y,sSalesStoreday.getLmstCostprc()));

        sheet.addCell(new Number(x++,y,sSalesStoreday.getPosSellprc()));

        sheet.addCell(new Number(x++,y,sSalesStoreday.getBuyQty()));

        sheet.addCell(new Number(x++,y,sSalesStoreday.getSalesQty()));

        sheet.addCell(new Number(x++,y,sSalesStoreday.getSalesMny()));

        sheet.addCell(new Number(x++,y,sSalesStoreday.getInSalesRtnQty()));

        sheet.addCell(new Number(x++,y,sSalesStoreday.getInSalesRtnMny()));

        sheet.addCell(new Number(x++,y,sSalesStoreday.getBrgnDiscMny()));

        sheet.addCell(new Number(x++,y,sSalesStoreday.getOtherDiscMny()));

        sheet.addCell(new Label(x++,y,sSalesStoreday.getBrgnKbn()));

        sheet.addCell(new Label(x++,y,sSalesStoreday.getEdlpKbn()));

        sheet.addCell(new Number(x++,y,sSalesStoreday.getLposSellprc()));

        sheet.addCell(new Number(x++,y,sSalesStoreday.getLbuyQty()));

        sheet.addCell(new Number(x++,y,sSalesStoreday.getLsalesQty()));

        sheet.addCell(new Number(x++,y,sSalesStoreday.getLsalesMny()));

        sheet.addCell(new Label(x++,y,sSalesStoreday.getMShn().getName()));

        sheet.addCell(new Label(x++,y,sSalesStoreday.getTerm().getName()));

        sheet.addCell(new Label(x++,y,sSalesStoreday.getCompany().getName()));

        sheet.addCell(new Label(x++,y,sSalesStoreday.getId().toString()));


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