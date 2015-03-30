package net.tonersaver.web.app;

import net.tonersaver.model.*;

import java.awt.font.NumericShaper;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletOutputStream;

import java.util.Collection;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.*;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;


public class CsvExportDepartmentsAction{
	public CsvExportDepartmentsAction(HttpServletResponse res,
			HttpServletRequest req,

                                                            OutputStream outputStream,
                                                            Session session,
                                                            Collection collection){

       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String rows[][] = new String[collection.size()][##titlesnum##];

        try{
        int y= 0;
         int x = 0;
                 			rows[y][x] = "id";
x++;
        			rows[y][x] = "印刷ログ";
x++;
        			rows[y][x] = "ユーザー";
x++;
        			rows[y][x] = "適用設定ファイル";
x++;
        			rows[y][x] = "summeries";
x++;
        			rows[y][x] = "名前";
x++;
        			rows[y][x] = "parentDepartment";
x++;
        			rows[y][x] = "childrendepartments";
x++;
        			rows[y][x] = "policy";
x++;




        	x = 0;
        	
        	for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
                      Department department = (Department) collection.next();
     		              rows[y][x] = department.getId().toString();
x++;





        rows[y][x] = department.getName();
x++;

        rows[y][x] = department.getParentDepartment().getName();
x++;


        rows[y][x] = department.getPolicy().getName();
x++;


     		       x=0;
                    y++;
    		}
        	
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_kkmmss");
			String filename = "csv_" + simpleDateFormat.format(new Date());
			
			BufferedWriter bufferedWriter;
			if (req.getParameter("code") != null &&  Boolean.valueOf(req.getParameter("code")) == true){
				res.setContentType("application/csv;charset=Shift_JIS");
				res.setCharacterEncoding("Shift_JIS");
				res.setHeader("Pragma", "");
				res.setHeader("Cache-Control", "");
				res.setHeader("Content-Disposition", "attachment; filename=" + filename + "-sjis.csv");
				bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "Shift_JIS"));
			} else {
				res.setContentType("application/csv;charset=UTF-8");
				res.setCharacterEncoding("UTF-8");
				res.setHeader("Pragma", "");
				res.setHeader("Cache-Control", "");
				res.setHeader("Content-Disposition", "attachment; filename=" + filename + ".csv");
				// add bom
				byte[] bomInfo = new byte[] { (byte) 0xef, (byte) 0xbb, (byte) 0xbf };
				ServletOutputStream outs = res.getOutputStream();
				outs.write(bomInfo);
				bufferedWriter = new BufferedWriter(new OutputStreamWriter(res.getOutputStream(), "UTF8"));

			}			
			PrintWriter printWriter = new PrintWriter(bufferedWriter);
			CSVWriter writer = new CSVWriter(printWriter);
			writer.write(rows, true);
			printWriter.close();
			

    		
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
        }
	}
	


}