package net.storyteller.web.app;

import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import net.storyteller.model.Role;
import org.hibernate.Session;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;


public class XlsExportOfRoleAction{
	public XlsExportOfRoleAction(Vector vector,OutputStream outputStream,Session session){

        try{
        	WorkbookSettings ws = new WorkbookSettings();

        	ws.setLocale(new Locale("ja", "JP"));
        	ws.setEncoding("Windows-31J");
        	WritableWorkbook workbook = Workbook.createWorkbook(outputStream, ws);
        	WritableSheet sheet = workbook.createSheet("sheet", 0);
        	ws.setGCDisabled(true);
        	
         int x = 0;
                 sheet.addCell(new Label(x++, 0, "id"));
        sheet.addCell(new Label(x++, 0, "蜀�Κ繝ｦ繝ｼ繧ｶ繝ｼ"));
        sheet.addCell(new Label(x++, 0, "譯井ｻｶ繧ｳ繧ｹ繝�"));
        sheet.addCell(new Label(x++, 0, "taskTemplates"));
        sheet.addCell(new Label(x++, 0, "蜷榊燕"));




        	x = 0;
        	int y= 1;
    		for (Iterator iter = vector.iterator(); iter.hasNext();) {
                      Role role = (Role) iter.next();
//    		            sheet.addCell(new DateTime(x++,y,role.getId().toString()));

        sheet.addCell(new Label(x++,y,role.getIntraUser().getName()));



        sheet.addCell(new Label(x++,y,role.getName()));


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