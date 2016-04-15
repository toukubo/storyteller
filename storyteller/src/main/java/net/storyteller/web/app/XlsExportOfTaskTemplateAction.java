package net.storyteller.web.app;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;

import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.Boolean;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import net.storyteller.model.TaskTemplate;

import org.hibernate.Session;


public class XlsExportOfTaskTemplateAction{
	public XlsExportOfTaskTemplateAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
         int x = 0;
        sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "名前"));
//        sheet.addCell(new Label(x++, 0, "タスク"));
        sheet.addCell(new Label(x++, 0, "周期的"));
        sheet.addCell(new Label(x++, 0, "storytellerRole"));
        sheet.addCell(new Label(x++, 0, "順番"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      TaskTemplate taskTemplate = (TaskTemplate) iter.next();

        sheet.addCell(new Label(x++,y,taskTemplate.getId().toString()));
//        StringBuilder builder = new StringBuilder();
//        for (Iterator iter = taskTemplate.getTasks().iterator(); iter.hasNext();) {
//			Task task = (Task) iter.next();
//			builder.append(task.getJ2eeStory().getName());
//		}
        sheet.addCell(new Label(x++,y,taskTemplate.getName()));
        sheet.addCell(new Boolean(x++,y,taskTemplate.isCyclic()));

        if(taskTemplate.getStorytellerRole()!=null){
            sheet.addCell(new Label(x++,y,taskTemplate.getStorytellerRole().getName()));
        }else{
        	x++;
        }
        sheet.addCell(new Number(x++,y,taskTemplate.getOrdernum()));
        


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