package net.mazdasalestool.web.app;

import net.mazdasalestool.model.*;

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


public class XlsExportOfWeeklyProccessPlanAction{
	public XlsExportOfWeeklyProccessPlanAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
         int x = 0;
                 sheet.addCell(new Label(x++, 0, "退社時刻"));
        sheet.addCell(new Label(x++, 0, "日付"));
        sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "内部ユーザー"));
        sheet.addCell(new Label(x++, 0, "実績"));
        sheet.addCell(new Label(x++, 0, "顧客代替・増車　促進活動受注台数"));
        sheet.addCell(new Label(x++, 0, "車検先行7-4ヶ月対象件数"));
        sheet.addCell(new Label(x++, 0, "車検先行7-4ヶ月TC件数"));
        sheet.addCell(new Label(x++, 0, "車検先行7-4ヶ月メール件数"));
        sheet.addCell(new Label(x++, 0, "車検先行7-4ヶ月来店確約数"));
        sheet.addCell(new Label(x++, 0, "車検先行7-4ヶ月SLC件数"));
        sheet.addCell(new Label(x++, 0, "車検先行7-4ヶ月ご提案書件数"));
        sheet.addCell(new Label(x++, 0, "車検先行7-4ヶ月店頭接客件数"));
        sheet.addCell(new Label(x++, 0, "車検先行7-4ヶ月ＢＣ件数"));
        sheet.addCell(new Label(x++, 0, "車検先行7-4ヶ月デモ件数"));
        sheet.addCell(new Label(x++, 0, "車検先行7-4ヶ月査定件数"));
        sheet.addCell(new Label(x++, 0, "車検先行7-4ヶ月ＡＢホット発生件数"));
        sheet.addCell(new Label(x++, 0, "重点ターゲット対象件数"));
        sheet.addCell(new Label(x++, 0, "重点ターゲットDM件数"));
        sheet.addCell(new Label(x++, 0, "重点ターゲットTC件数"));
        sheet.addCell(new Label(x++, 0, "重点ターゲットメール件数"));
        sheet.addCell(new Label(x++, 0, "重点ターゲット来店確約数"));
        sheet.addCell(new Label(x++, 0, "重点ターゲットSLC件数"));
        sheet.addCell(new Label(x++, 0, "重点ターゲットご提案書件数"));
        sheet.addCell(new Label(x++, 0, "重点ターゲット店頭接客件数"));
        sheet.addCell(new Label(x++, 0, "重点ターゲットＢＣ件数"));
        sheet.addCell(new Label(x++, 0, "重点ターゲットデモ件数"));
        sheet.addCell(new Label(x++, 0, "重点ターゲット査定件数"));
        sheet.addCell(new Label(x++, 0, "重点ターゲットＡＢホット発生件数"));
        sheet.addCell(new Label(x++, 0, "新規・他銘柄　獲得活動受注台数"));
        sheet.addCell(new Label(x++, 0, "新規・他銘柄　獲得活動紹介ハガキ発送件数"));
        sheet.addCell(new Label(x++, 0, "新規・他銘柄　獲得活動紹介依頼件数"));
        sheet.addCell(new Label(x++, 0, "新規・他銘柄　獲得活動紹介発生"));
        sheet.addCell(new Label(x++, 0, "新規・他銘柄　獲得活動店頭来店ストック"));
        sheet.addCell(new Label(x++, 0, "新規・他銘柄　獲得活動出張・職域展示会"));
        sheet.addCell(new Label(x++, 0, "新規・他銘柄　獲得活動その他"));
        sheet.addCell(new Label(x++, 0, "新規・他銘柄　獲得活動総ストック保有件数"));
        sheet.addCell(new Label(x++, 0, "新規・他銘柄　獲得活動ＤＭ件数"));
        sheet.addCell(new Label(x++, 0, "新規・他銘柄　獲得活動ＴＣ件数"));
        sheet.addCell(new Label(x++, 0, "新規・他銘柄　獲得活動メール件数"));
        sheet.addCell(new Label(x++, 0, "新規・他銘柄　獲得活動来店確約数"));
        sheet.addCell(new Label(x++, 0, "新規・他銘柄　獲得活動SLC件数"));
        sheet.addCell(new Label(x++, 0, "新規・他銘柄　獲得活動店頭接客件数"));
        sheet.addCell(new Label(x++, 0, "新規・他銘柄　獲得活動ＢＣ件数"));
        sheet.addCell(new Label(x++, 0, "新規・他銘柄　獲得活動デモ件数"));
        sheet.addCell(new Label(x++, 0, "新規・他銘柄　獲得活動査定件数"));
        sheet.addCell(new Label(x++, 0, "新規・他銘柄　獲得活動ＡＢホット発生件数"));
        sheet.addCell(new Label(x++, 0, "base"));
        sheet.addCell(new Label(x++, 0, "出社時刻"));
        sheet.addCell(new Label(x++, 0, "車検先行7-4ヶ月DM件数"));
        sheet.addCell(new Label(x++, 0, "ABホット発生顧客"));
        sheet.addCell(new Label(x++, 0, "ABホット発生ストック"));
        sheet.addCell(new Label(x++, 0, "ABホット発生フリー"));
        sheet.addCell(new Label(x++, 0, "VIP"));
        sheet.addCell(new Label(x++, 0, "その他受注台数"));
        sheet.addCell(new Label(x++, 0, "来店接客数AB"));
        sheet.addCell(new Label(x++, 0, "来店接客数NON-AB顧客"));
        sheet.addCell(new Label(x++, 0, "来店接客数NON-ABストック"));
        sheet.addCell(new Label(x++, 0, "来店接客数NON-ABフリー"));
        sheet.addCell(new Label(x++, 0, "受注台数AB顧客"));
        sheet.addCell(new Label(x++, 0, "受注台数AB新他"));
        sheet.addCell(new Label(x++, 0, "受注台数NON-AB顧客"));
        sheet.addCell(new Label(x++, 0, "受注台数NON-ABストック"));
        sheet.addCell(new Label(x++, 0, "受注台数NON-ABフリー"));
        sheet.addCell(new Label(x++, 0, "inspectioncars"));
        sheet.addCell(new Label(x++, 0, "prioritycars"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      WeeklyProccessPlan weeklyProccessPlan = (WeeklyProccessPlan) iter.next();
    		            sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getLeavetime()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getDate()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getId().toString()));

        sheet.addCell(new Label(x++,y,weeklyProccessPlan.getIntraUser().getName()));


        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getPromotionalcars().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getInspectiontarget().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getInspectiontc().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getInspectionmail().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getInspectionvisitaffirmation().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getInspectionslc().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getInspectionproposal().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getInspectionstorefront().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getInspectionbc().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getInspectiondemo().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getInspectionappraisal().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getInspectionabhot().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getPrioritytarget().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getPrioritydm().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getPrioritytc().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getPrioritymail().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getPriorityvisitaffirmation().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getPriorityslc().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getPriorityproposal().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getPrioritystorefront().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getPrioritybc().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getPrioritydemo().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getPriorityappraisal().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getPriorityabhot().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getNewclientscars().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getNewclientsintroductionpostcard().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getNewclientsintroductionoffer().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getNewclientsintroduction().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getNewclientsstockstorefront().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getNewclientsstockexhibition().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getNewclientsstockothers().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getNewclientsstock().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getNewclientsdm().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getNewclientstc().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getNewclientsmail().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getNewclientsvisitaffirmation().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getNewclientsslc().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getNewclientsstorefront().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getNewclientsbc().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getNewclientsdemo().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getNewclientsappraisal().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getNewclientsabhot().toString()));

        sheet.addCell(new Label(x++,y,weeklyProccessPlan.getBase().getName()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getCometime()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getInspectiondm().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getEngenderabhotcustomer().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getEngenderabhotstock().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getEngenderabhotfree().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getVip().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getOthercars().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getClientab().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getClientnonabcustomer().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getClientnonabstock().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getClientnonabfree().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getOrdercarsabcustomer().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getOrdercarsabnewother().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getOrdercarsnonabcustomer().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getOrdercarsnonabstock().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getOrdercarsnonabfree().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getInspectioncars().toString()));

        sheet.addCell(new DateTime(x++,y,weeklyProccessPlan.getPrioritycars().toString()));


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