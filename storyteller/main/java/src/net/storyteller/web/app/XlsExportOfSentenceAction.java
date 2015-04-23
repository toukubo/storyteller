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


public class XlsExportOfSentenceAction{
	public XlsExportOfSentenceAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
         int x = 0;
                 sheet.addCell(new Label(x++, 0, "蜷榊燕"));
        sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "譛牙柑"));
        sheet.addCell(new Label(x++, 0, "strutsConfigCode"));
        sheet.addCell(new Label(x++, 0, "隨ｬ荳�逶ｮ逧�ｪ�"));
        sheet.addCell(new Label(x++, 0, "蜍戊ｩ�"));
        sheet.addCell(new Label(x++, 0, "隨ｬ莠檎岼逧�ｪ�"));
        sheet.addCell(new Label(x++, 0, "繧ｹ繝医�繝ｪ繝ｼ"));
        sheet.addCell(new Label(x++, 0, "strutsActions"));
        sheet.addCell(new Label(x++, 0, "jsp"));
        sheet.addCell(new Label(x++, 0, "譌･譛ｬ隱�"));
        sheet.addCell(new Label(x++, 0, "normal"));
        sheet.addCell(new Label(x++, 0, "maintest"));
        sheet.addCell(new Label(x++, 0, "interfaceSpecsReferences"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      Sentence sentence = (Sentence) iter.next();
    		            sheet.addCell(new Label(x++,y,sentence.getName()));

//        sheet.addCell(new DateTime(x++,y,sentence.getId().toString()));


        sheet.addCell(new Label(x++,y,sentence.getStrutsConfigCode()));

//        sheet.addCell(new Label(x++,y,sentence.getFirstobjective().getName()));

        sheet.addCell(new Label(x++,y,sentence.getVerb().getName()));

//        sheet.addCell(new Label(x++,y,sentence.getSecountobjective().getName()));

        sheet.addCell(new Label(x++,y,sentence.getJ2eeStory().getName()));



        sheet.addCell(new Label(x++,y,sentence.getJapanese()));


//        sheet.addCell(new Label(x++,y,sentence.getMaintest().getName()));



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