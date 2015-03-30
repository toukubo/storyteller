package net.mailmag.web.app;

import net.mailmag.model.*;

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
        sheet.addCell(new Label(x++, 0, "パスワード"));
        sheet.addCell(new Label(x++, 0, "メール"));
        sheet.addCell(new Label(x++, 0, "郵便番号3桁"));
        sheet.addCell(new Label(x++, 0, "郵便番号4桁"));
        sheet.addCell(new Label(x++, 0, "配送日"));
        sheet.addCell(new Label(x++, 0, "カナ"));
        sheet.addCell(new Label(x++, 0, "電話番号"));
        sheet.addCell(new Label(x++, 0, "配送時間"));
        sheet.addCell(new Label(x++, 0, "電話番号"));
        sheet.addCell(new Label(x++, 0, "カナ"));
        sheet.addCell(new Label(x++, 0, "住所"));
        sheet.addCell(new Label(x++, 0, "住所"));
        sheet.addCell(new Label(x++, 0, "名前"));
        sheet.addCell(new Label(x++, 0, "郵便番号4桁"));
        sheet.addCell(new Label(x++, 0, "郵便番号3桁"));
        sheet.addCell(new Label(x++, 0, "都道府県"));
        sheet.addCell(new Label(x++, 0, "別のアドレスへ"));
        sheet.addCell(new Label(x++, 0, "住所"));
        sheet.addCell(new Label(x++, 0, "男性"));
        sheet.addCell(new Label(x++, 0, "誕生日"));
        sheet.addCell(new Label(x++, 0, "メール確認"));
        sheet.addCell(new Label(x++, 0, "生月"));
        sheet.addCell(new Label(x++, 0, "municipality"));
        sheet.addCell(new Label(x++, 0, "生年"));
        sheet.addCell(new Label(x++, 0, "携帯番号"));
        sheet.addCell(new Label(x++, 0, "建物名"));
        sheet.addCell(new Label(x++, 0, "県"));
        sheet.addCell(new Label(x++, 0, "管理者"));
        sheet.addCell(new Label(x++, 0, "削除済み"));
        sheet.addCell(new Label(x++, 0, "サイト"));
        sheet.addCell(new Label(x++, 0, "名前"));
        sheet.addCell(new Label(x++, 0, "アドレス"));
        sheet.addCell(new Label(x++, 0, "taggings"));
        sheet.addCell(new Label(x++, 0, "keitaimail"));
        sheet.addCell(new Label(x++, 0, "subscriptions"));
        sheet.addCell(new Label(x++, 0, "language"));
        sheet.addCell(new Label(x++, 0, "subject"));
        sheet.addCell(new Label(x++, 0, "department"));
        sheet.addCell(new Label(x++, 0, "componeyname"));
        sheet.addCell(new Label(x++, 0, "comment"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      PublicUser publicUser = (PublicUser) iter.next();
    		            sheet.addCell(new DateTime(x++,y,publicUser.getId().toString()));

        sheet.addCell(new Label(x++,y,publicUser.getPassword()));

        sheet.addCell(new Label(x++,y,publicUser.getMail()));

        sheet.addCell(new Number(x++,y,publicUser.getZipthree()));

        sheet.addCell(new Number(x++,y,publicUser.getZipfour()));

        sheet.addCell(new Number(x++,y,publicUser.getDeliverydate()));

        sheet.addCell(new Label(x++,y,publicUser.getKana()));

        sheet.addCell(new Label(x++,y,publicUser.getPhone()));

        sheet.addCell(new Number(x++,y,publicUser.getDevliveryhour()));

        sheet.addCell(new Number(x++,y,publicUser.getDeliveryphone()));

        sheet.addCell(new Label(x++,y,publicUser.getDeliverykana()));

        sheet.addCell(new Label(x++,y,publicUser.getDeliveryblocknumber()));

        sheet.addCell(new Label(x++,y,publicUser.getDeliveryaddress()));

        sheet.addCell(new Label(x++,y,publicUser.getDeliveryname()));

        sheet.addCell(new Number(x++,y,publicUser.getDeliveryzipfour()));

        sheet.addCell(new Number(x++,y,publicUser.getDeliveryzipthree()));

        sheet.addCell(new Label(x++,y,publicUser.getDeliverypref()));


        sheet.addCell(new Label(x++,y,publicUser.getBlocknumber()));


        sheet.addCell(new Number(x++,y,publicUser.getBrithday()));

        sheet.addCell(new Label(x++,y,publicUser.getMailforconfirm()));

        sheet.addCell(new Number(x++,y,publicUser.getBirthmonth()));

        sheet.addCell(new Label(x++,y,publicUser.getMunicipality()));

        sheet.addCell(new Number(x++,y,publicUser.getBirthyear()));

        sheet.addCell(new Label(x++,y,publicUser.getKeitai()));

        sheet.addCell(new Label(x++,y,publicUser.getBuildingname()));

        sheet.addCell(new Label(x++,y,publicUser.getPref()));



        sheet.addCell(new Label(x++,y,publicUser.getSite().getName()));

        sheet.addCell(new Label(x++,y,publicUser.getName()));

        sheet.addCell(new Label(x++,y,publicUser.getAddress()));


        sheet.addCell(new Label(x++,y,publicUser.getKeitaimail()));


        sheet.addCell(new Label(x++,y,publicUser.getLanguage()));

        sheet.addCell(new Label(x++,y,publicUser.getSubject()));

        sheet.addCell(new Label(x++,y,publicUser.getDepartment()));

        sheet.addCell(new Label(x++,y,publicUser.getComponeyname()));

        sheet.addCell(new Label(x++,y,publicUser.getComment()));


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