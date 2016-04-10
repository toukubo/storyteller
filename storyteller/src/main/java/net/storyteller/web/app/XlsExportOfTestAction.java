package net.storyteller.web.app;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;

import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import net.storyteller.model.Test;

import org.hibernate.Session;


public class XlsExportOfTestAction{
	public XlsExportOfTestAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
         int x = 0;
                 sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "繧ｹ繝医�繝ｪ繝ｼ"));
        sheet.addCell(new Label(x++, 0, "諡�ｽ楢��"));
        sheet.addCell(new Label(x++, 0, "蜀咲樟謇矩��"));
        sheet.addCell(new Label(x++, 0, "譛溷ｾ�＆繧後ｋ蜍穂ｽ�"));
        sheet.addCell(new Label(x++, 0, "陦ｨ遉ｺ蜀�ｮｹ"));
        sheet.addCell(new Label(x++, 0, "繝�ヰ繧ｰ貂医∩"));
        sheet.addCell(new Label(x++, 0, "繝√ぉ繝�け貂医∩"));
        sheet.addCell(new Label(x++, 0, "蜑ｲ繧雁ｽ薙※縺滉ｺｺ"));
        sheet.addCell(new Label(x++, 0, "繝�ヰ繝�げ諡�ｽ�"));
        sheet.addCell(new Label(x++, 0, "jsp"));
        sheet.addCell(new Label(x++, 0, "summery"));
        sheet.addCell(new Label(x++, 0, "asnormal"));
        sheet.addCell(new Label(x++, 0, "asmain"));
        sheet.addCell(new Label(x++, 0, "estimationChoises"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      Test test = (Test) iter.next();
//    		            sheet.addCell(new DateTime(x++,y,test.getId().toString()));

        sheet.addCell(new Label(x++,y,test.getJ2eeStory().getName()));

        sheet.addCell(new Label(x++,y,test.getResponsible().getName()));

        sheet.addCell(new Label(x++,y,test.getStepstorepeat()));

        sheet.addCell(new Label(x++,y,test.getWhatyouexpectedtosee()));

        sheet.addCell(new Label(x++,y,test.getWhatyousawinstead()));



        sheet.addCell(new Label(x++,y,test.getCreator().getName()));

        sheet.addCell(new Label(x++,y,test.getDebugger().getName()));

//        sheet.addCell(new Label(x++,y,test.getJsp().getName()));

        sheet.addCell(new Label(x++,y,test.getSummery()));

        sheet.addCell(new Label(x++,y,test.getAsnormal().getName()));

        sheet.addCell(new Label(x++,y,test.getAsmain().getName()));



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