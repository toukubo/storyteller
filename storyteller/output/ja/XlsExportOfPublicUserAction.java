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


public class XlsExportOfPublicUserAction{
	public XlsExportOfPublicUserAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
         int x = 0;
                 sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "ＪＡコード"));
        sheet.addCell(new Label(x++, 0, "受入累計"));
        sheet.addCell(new Label(x++, 0, "情報管理コード"));
        sheet.addCell(new Label(x++, 0, "農協コード"));
        sheet.addCell(new Label(x++, 0, "取引"));
        sheet.addCell(new Label(x++, 0, "金融機関コード"));
        sheet.addCell(new Label(x++, 0, "店舗コード"));
        sheet.addCell(new Label(x++, 0, "科目コード"));
        sheet.addCell(new Label(x++, 0, "口座番号"));
        sheet.addCell(new Label(x++, 0, "口座状態"));
        sheet.addCell(new Label(x++, 0, "閉鎖解除年月日"));
        sheet.addCell(new Label(x++, 0, "解約区分"));
        sheet.addCell(new Label(x++, 0, "所属支所コード"));
        sheet.addCell(new Label(x++, 0, "経営形態"));
        sheet.addCell(new Label(x++, 0, "地区コード"));
        sheet.addCell(new Label(x++, 0, "任意集計コード１"));
        sheet.addCell(new Label(x++, 0, "任意集計コード２"));
        sheet.addCell(new Label(x++, 0, "内訳資料区分"));
        sheet.addCell(new Label(x++, 0, "レイアウトＮＯ"));
        sheet.addCell(new Label(x++, 0, "帳票制御コード"));
        sheet.addCell(new Label(x++, 0, "ソリマチ対象者区分"));
        sheet.addCell(new Label(x++, 0, "取引残高"));
        sheet.addCell(new Label(x++, 0, "受入累計"));
        sheet.addCell(new Label(x++, 0, "最終取引経理年月日"));
        sheet.addCell(new Label(x++, 0, "要精算額当初金額"));
        sheet.addCell(new Label(x++, 0, "要精算額累計金額"));
        sheet.addCell(new Label(x++, 0, "集計"));
        sheet.addCell(new Label(x++, 0, "地区"));
        sheet.addCell(new Label(x++, 0, "userInfo"));
        sheet.addCell(new Label(x++, 0, "組合員名"));
        sheet.addCell(new Label(x++, 0, "種類"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      PublicUser publicUser = (PublicUser) iter.next();
    		            sheet.addCell(new DateTime(x++,y,publicUser.getId().toString()));

        sheet.addCell(new Label(x++,y,publicUser.getCode()));

        sheet.addCell(new Number(x++,y,publicUser.getTotalcost()));

        sheet.addCell(new Label(x++,y,publicUser.getInfocode()));

        sheet.addCell(new Label(x++,y,publicUser.getJacode()));


        sheet.addCell(new Label(x++,y,publicUser.getAccountofficecode()));

        sheet.addCell(new Label(x++,y,publicUser.getShopcode()));

        sheet.addCell(new Label(x++,y,publicUser.getDepartmentcode()));

        sheet.addCell(new Label(x++,y,publicUser.getAccountnumber()));

        sheet.addCell(new Label(x++,y,publicUser.getAccountstatus()));

        sheet.addCell(new DateTime(x++,y,publicUser.getClosurebreakdate()));

        sheet.addCell(new Label(x++,y,publicUser.getClosuretype()));

        sheet.addCell(new Label(x++,y,publicUser.getBranchcode()));

        sheet.addCell(new Label(x++,y,publicUser.getManagementtype()));

        sheet.addCell(new Label(x++,y,publicUser.getAreacode()));

        sheet.addCell(new Label(x++,y,publicUser.getVarialblestatscode()));

        sheet.addCell(new Label(x++,y,publicUser.getVarialblestatscodetwo()));

        sheet.addCell(new Label(x++,y,publicUser.getDetaileddocumenttype()));

        sheet.addCell(new Label(x++,y,publicUser.getLayoutno()));

        sheet.addCell(new Label(x++,y,publicUser.getPrintingcontrolcode()));

        sheet.addCell(new Label(x++,y,publicUser.getSorimachitargettype()));

        sheet.addCell(new Number(x++,y,publicUser.getRemaining()));

        sheet.addCell(new Number(x++,y,publicUser.getTotalincome()));

        sheet.addCell(new DateTime(x++,y,publicUser.getLasttransactiondate()));

        sheet.addCell(new Number(x++,y,publicUser.getNonaccountedatfirst()));

        sheet.addCell(new Number(x++,y,publicUser.getNonaccountedatlast()));


        sheet.addCell(new Label(x++,y,publicUser.getArea().getName()));

        sheet.addCell(new Label(x++,y,publicUser.getUserInfo().getName()));

        sheet.addCell(new Label(x++,y,publicUser.getName()));

        sheet.addCell(new Label(x++,y,publicUser.getType()));


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