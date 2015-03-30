package net.tonersaver.web.app;

import net.tonersaver.model.*;

import java.awt.font.NumericShaper;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
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


public class CsvExportSummerysAction{
	public CsvExportSummerysAction(HttpServletRequest req,
                                                            OutputStream outputStream,
                                                            Session session,
                                                            Collection collection){
        String rows[][] = = new String[collection.size()][##titlesnum##];

        try{
        int y= 0;
         int x = 0;
                 			rows[y][x] = "集計期間";
x++;
        			rows[y][x] = "部署";
x++;
        			rows[y][x] = "削除後金額";
x++;
        			rows[y][x] = "トナーコスト";
x++;
        			rows[y][x] = "月";
x++;
        			rows[y][x] = "年";
x++;
        			rows[y][x] = "クライアント数";
x++;
        			rows[y][x] = "印刷枚数（枚）";
x++;
        			rows[y][x] = "削減金額";
x++;
        			rows[y][x] = "平均トナー削減率";
x++;
        			rows[y][x] = "モノクロ";
x++;
        			rows[y][x] = "カラー";
x++;
        			rows[y][x] = "一台あたり印刷枚数（枚/台）";
x++;
        			rows[y][x] = "モノクロ";
x++;
        			rows[y][x] = "カラー";
x++;
        			rows[y][x] = "片面";
x++;
        			rows[y][x] = "両面";
x++;




        	x = 0;
        	
    		for (;i < collection.size()+1;y++) {
                      Summery summery = (Summery) collection.next();
     		              rows[y][x] = dateFormat.format(summery.getDate());
x++;

        rows[y][x] = summery.getDepartment().getName();
x++;

        rows[y][x] = String.valueOf(summery.getActualtonercost());
x++;

        rows[y][x] = String.valueOf(summery.getEstimatedtonercost());
x++;

        rows[y][x] = String.valueOf(summery.getMonth());
x++;

        rows[y][x] = String.valueOf(summery.getYear());
x++;

        rows[y][x] = String.valueOf(summery.getClientnum());
x++;

        rows[y][x] = String.valueOf(summery.getPrintnum());
x++;

        rows[y][x] = String.valueOf(summery.getTonercostsaved());
x++;

        rows[y][x] = String.valueOf(summery.getAveragetonerdecreaserate());
x++;

        rows[y][x] = String.valueOf(summery.getAveragemonotonerdecreaserate());
x++;

        rows[y][x] = String.valueOf(summery.getAveragecolortonerdecreaserate());
x++;

        rows[y][x] = String.valueOf(summery.getPrintingnumperclient());
x++;

        rows[y][x] = String.valueOf(summery.getMonoprintnum());
x++;

        rows[y][x] = String.valueOf(summery.getColorprintnum());
x++;

        rows[y][x] = String.valueOf(summery.getOnesideprintnum());
x++;

        rows[y][x] = String.valueOf(summery.getBothsideprintnum());
x++;


     		       x=0;
    		}
        	
    		
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
        }
	}
	


}