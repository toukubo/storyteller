package net.ja.web.app;

import net.ja.model.*;

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


public class XlsExportOfAccountTransactionAction{
	public XlsExportOfAccountTransactionAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
         int x = 0;
                 sheet.addCell(new Label(x++, 0, "basiccode"));
        sheet.addCell(new Label(x++, 0, "detailcode"));
        sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "一般ユーザー"));
        sheet.addCell(new Label(x++, 0, "農協コード"));
        sheet.addCell(new Label(x++, 0, "取明NO"));
        sheet.addCell(new Label(x++, 0, "本体消費税区分"));
        sheet.addCell(new Label(x++, 0, "本支所コード"));
        sheet.addCell(new Label(x++, 0, "組合員コード"));
        sheet.addCell(new Label(x++, 0, "ＳＥＱＮＯ"));
        sheet.addCell(new Label(x++, 0, "取引日"));
        sheet.addCell(new Label(x++, 0, "起算日"));
        sheet.addCell(new Label(x++, 0, "相手科目短縮コード"));
        sheet.addCell(new Label(x++, 0, "摘要"));
        sheet.addCell(new Label(x++, 0, "現振判定コード"));
        sheet.addCell(new Label(x++, 0, "貸借判定"));
        sheet.addCell(new Label(x++, 0, "取引対象者区分"));
        sheet.addCell(new Label(x++, 0, "形態コード"));
        sheet.addCell(new Label(x++, 0, "任意集計コード１"));
        sheet.addCell(new Label(x++, 0, "任意集計コード２"));
        sheet.addCell(new Label(x++, 0, "消費税区分"));
        sheet.addCell(new Label(x++, 0, "JA用報告書区分"));
        sheet.addCell(new Label(x++, 0, "情報管理コード"));
        sheet.addCell(new Label(x++, 0, "データパターン"));
        sheet.addCell(new Label(x++, 0, "UPDATEUSERID"));
        sheet.addCell(new Label(x++, 0, "入力日"));
        sheet.addCell(new Label(x++, 0, "旧基本コード"));
        sheet.addCell(new Label(x++, 0, "旧内訳コード"));
        sheet.addCell(new Label(x++, 0, "営農コード"));
        sheet.addCell(new Label(x++, 0, "取引金額"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      AccountTransaction accountTransaction = (AccountTransaction) iter.next();
    		            sheet.addCell(new Label(x++,y,accountTransaction.getBasiccode()));

        sheet.addCell(new Label(x++,y,accountTransaction.getDetailcode()));

        sheet.addCell(new DateTime(x++,y,accountTransaction.getId().toString()));

        sheet.addCell(new Label(x++,y,accountTransaction.getPublicUser().getName()));

        sheet.addCell(new Label(x++,y,accountTransaction.getCode()));

        sheet.addCell(new Label(x++,y,accountTransaction.getNo()));

        sheet.addCell(new Label(x++,y,accountTransaction.getBodytaxtype()));

        sheet.addCell(new Label(x++,y,accountTransaction.getBranch()));

        sheet.addCell(new DateTime(x++,y,accountTransaction.getDateinaccount()));

        sheet.addCell(new Label(x++,y,accountTransaction.getSeqno()));

        sheet.addCell(new Label(x++,y,accountTransaction.getTransactiondate()));

        sheet.addCell(new DateTime(x++,y,accountTransaction.getReckondate()));

        sheet.addCell(new Label(x++,y,accountTransaction.getPeeraccountingcodeinshort()));

        sheet.addCell(new Label(x++,y,accountTransaction.getAbstraction()));

        sheet.addCell(new Label(x++,y,accountTransaction.getGenhuricode()));

        sheet.addCell(new Label(x++,y,accountTransaction.getTaishaku()));

        sheet.addCell(new Label(x++,y,accountTransaction.getPeertype()));

        sheet.addCell(new Label(x++,y,accountTransaction.getTypecode()));

        sheet.addCell(new Label(x++,y,accountTransaction.getVariablestatscodeone()));

        sheet.addCell(new Label(x++,y,accountTransaction.getVariablestatscodetwo()));

        sheet.addCell(new Label(x++,y,accountTransaction.getTaxtype()));

        sheet.addCell(new Label(x++,y,accountTransaction.getReportingtype()));

        sheet.addCell(new Label(x++,y,accountTransaction.getInfocode()));

        sheet.addCell(new Label(x++,y,accountTransaction.getDatapattern()));

        sheet.addCell(new Label(x++,y,accountTransaction.getUpdateuserid()));

        sheet.addCell(new Label(x++,y,accountTransaction.getInputeddate()));

        sheet.addCell(new Label(x++,y,accountTransaction.getOldbasecode()));

        sheet.addCell(new Label(x++,y,accountTransaction.getOlddetailedcode()));

        sheet.addCell(new Label(x++,y,accountTransaction.getCategory().getName()));

        sheet.addCell(new Label(x++,y,accountTransaction.getValue()));


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