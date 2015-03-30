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


public class XlsExportOfJ2eeStoryAction{
	public XlsExportOfJ2eeStoryAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
         int x = 0;
                 sheet.addCell(new Label(x++, 0, "名前"));
        sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "開始日時"));
        sheet.addCell(new Label(x++, 0, "requiredstorytellerhour"));
        sheet.addCell(new Label(x++, 0, "requiredteamhour"));
        sheet.addCell(new Label(x++, 0, "金額"));
        sheet.addCell(new Label(x++, 0, "終了日時"));
        sheet.addCell(new Label(x++, 0, "strutsconfigcontent"));
        sheet.addCell(new Label(x++, 0, "andromdaCoreJarFile"));
        sheet.addCell(new Label(x++, 0, "story"));
        sheet.addCell(new Label(x++, 0, "名詞"));
        sheet.addCell(new Label(x++, 0, "tests"));
        sheet.addCell(new Label(x++, 0, "outOfPattenSentences"));
        sheet.addCell(new Label(x++, 0, "sentences"));
        sheet.addCell(new Label(x++, 0, "estimations"));
        sheet.addCell(new Label(x++, 0, "tasks"));
        sheet.addCell(new Label(x++, 0, "buyings"));
        sheet.addCell(new Label(x++, 0, "totalcost"));
        sheet.addCell(new Label(x++, 0, "client"));
        sheet.addCell(new Label(x++, 0, "income"));
        sheet.addCell(new Label(x++, 0, "profit"));
        sheet.addCell(new Label(x++, 0, "devidentforteam"));
        sheet.addCell(new Label(x++, 0, "tellerapp"));
        sheet.addCell(new Label(x++, 0, "basecampurl"));
        sheet.addCell(new Label(x++, 0, "basecampapihash"));
        sheet.addCell(new Label(x++, 0, "dificulty"));
        sheet.addCell(new Label(x++, 0, "salerequired"));
        sheet.addCell(new Label(x++, 0, "offshorable"));
        sheet.addCell(new Label(x++, 0, "consultingrate"));
        sheet.addCell(new Label(x++, 0, "contiuningbusiness"));
        sheet.addCell(new Label(x++, 0, "advertisingrate"));
        sheet.addCell(new Label(x++, 0, "price_per_sentences"));
        sheet.addCell(new Label(x++, 0, "businessCosts"));
        sheet.addCell(new Label(x++, 0, "profitDividients"));
        sheet.addCell(new Label(x++, 0, "contribute"));
        sheet.addCell(new Label(x++, 0, "interfacespecsurl"));
        sheet.addCell(new Label(x++, 0, "discountpercentage"));
        sheet.addCell(new Label(x++, 0, "interfaceSpecs"));
        sheet.addCell(new Label(x++, 0, "japanese"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      J2eeStory j2eeStory = (J2eeStory) iter.next();
    		            sheet.addCell(new Label(x++,y,j2eeStory.getName()));

        sheet.addCell(new DateTime(x++,y,j2eeStory.getId().toString()));

        sheet.addCell(new DateTime(x++,y,j2eeStory.getStartdate()));

        sheet.addCell(new Number(x++,y,j2eeStory.getRequiredstorytellerhour()));

        sheet.addCell(new Number(x++,y,j2eeStory.getRequiredteamhour()));

        sheet.addCell(new Number(x++,y,j2eeStory.getPrice()));

        sheet.addCell(new DateTime(x++,y,j2eeStory.getEnddate()));

        sheet.addCell(new Label(x++,y,j2eeStory.getStrutsconfigcontent()));

        sheet.addCell(new Label(x++,y,j2eeStory.getAndromdaCoreJarFile().getName()));

        sheet.addCell(new Label(x++,y,j2eeStory.getStory()));








        sheet.addCell(new Number(x++,y,j2eeStory.getTotalcost()));

        sheet.addCell(new Label(x++,y,j2eeStory.getClient().getName()));

        sheet.addCell(new Number(x++,y,j2eeStory.getIncome()));

        sheet.addCell(new Number(x++,y,j2eeStory.getProfit()));

        sheet.addCell(new Number(x++,y,j2eeStory.getDevidentforteam()));


        sheet.addCell(new Label(x++,y,j2eeStory.getBasecampurl()));

        sheet.addCell(new Label(x++,y,j2eeStory.getBasecampapihash()));

        sheet.addCell(new Number(x++,y,j2eeStory.getDificulty()));



        sheet.addCell(new Number(x++,y,j2eeStory.getConsultingrate()));


        sheet.addCell(new Number(x++,y,j2eeStory.getAdvertisingrate()));

        sheet.addCell(new Number(x++,y,j2eeStory.getPrice_per_sentences()));



        sheet.addCell(new Label(x++,y,j2eeStory.getContribute().getName()));

        sheet.addCell(new Label(x++,y,j2eeStory.getInterfacespecsurl()));

        sheet.addCell(new Number(x++,y,j2eeStory.getDiscountpercentage()));


        sheet.addCell(new Label(x++,y,j2eeStory.getJapanese()));


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