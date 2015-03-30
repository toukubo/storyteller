package net.autolink.web.app;

import net.autolink.model.*;

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


public class CsvExportKeywordsAction{
	public CsvExportKeywordsAction(HttpServletResponse res,
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
        			rows[y][x] = "slug";
x++;
        			rows[y][x] = "permalink";
x++;
        			rows[y][x] = "haspage";
x++;
        			rows[y][x] = "quotes";
x++;
        			rows[y][x] = "keywordRelations";
x++;
        			rows[y][x] = "値";
x++;
        			rows[y][x] = "useAsKeyword";
x++;
        			rows[y][x] = "candidate";
x++;




        	x = 0;
        	
        	for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
                      Keyword keyword = (Keyword) collection.next();
     		              rows[y][x] = keyword.getId().toString();
x++;

        rows[y][x] = keyword.getSlug();
x++;

        rows[y][x] = keyword.getPermalink();
x++;

        rows[y][x] = keyword.getHaspage();
x++;



        rows[y][x] = keyword.getValue();
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