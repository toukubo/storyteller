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


public class CsvExportPrintingsAction{
	public CsvExportPrintingsAction(HttpServletResponse res,
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
        			rows[y][x] = "ファイル名";
x++;
        			rows[y][x] = "ユーザー";
x++;
        			rows[y][x] = "部署";
x++;
        			rows[y][x] = "コンピューター";
x++;
        			rows[y][x] = "savingrate";
x++;
        			rows[y][x] = "数";
x++;
        			rows[y][x] = "applicationname";
x++;
        			rows[y][x] = "filepath";
x++;
        			rows[y][x] = "papersize";
x++;
        			rows[y][x] = "oneside";
x++;
        			rows[y][x] = "色";
x++;
        			rows[y][x] = "プリンター";
x++;
        			rows[y][x] = "日付";
x++;




        	x = 0;
        	
        	for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
                      Printing printing = (Printing) collection.next();
     		              rows[y][x] = printing.getId().toString();
x++;

        rows[y][x] = printing.getFilename();
x++;

        rows[y][x] = printing.getUser().getName();
x++;

        rows[y][x] = printing.getDepartment().getName();
x++;

        rows[y][x] = printing.getComputer();
x++;

        rows[y][x] = String.valueOf(printing.getSavingrate());
x++;

        rows[y][x] = String.valueOf(printing.getNum());
x++;

        rows[y][x] = printing.getApplicationname();
x++;

        rows[y][x] = printing.getFilepath();
x++;

        rows[y][x] = printing.getPapersize();
x++;



        rows[y][x] = String.valueOf(printing.getPrinter());
x++;

        rows[y][x] = dateFormat.format(printing.getDate());
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