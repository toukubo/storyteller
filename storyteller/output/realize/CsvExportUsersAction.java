package net.realize.web.app;

import net.realize.model.*;

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


public class CsvExportUsersAction{
	public CsvExportUsersAction(HttpServletResponse res,
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
        			rows[y][x] = "パスワード";
x++;
        			rows[y][x] = "ユーザーネーム";
x++;
        			rows[y][x] = "メール";
x++;
        			rows[y][x] = "サイクルマッチング";
x++;
        			rows[y][x] = "コミッション支払";
x++;
        			rows[y][x] = "追加日";
x++;
        			rows[y][x] = "カナ";
x++;
        			rows[y][x] = "英語名";
x++;
        			rows[y][x] = "性別";
x++;
        			rows[y][x] = "電話番号";
x++;
        			rows[y][x] = "ログイン状態を保存する";
x++;
        			rows[y][x] = "infoseekmail";
x++;
        			rows[y][x] = "郵便番号";
x++;
        			rows[y][x] = "建物名";
x++;
        			rows[y][x] = "誕生日";
x++;
        			rows[y][x] = "mailhp";
x++;
        			rows[y][x] = "mailpass";
x++;
        			rows[y][x] = "銀行未登録";
x++;
        			rows[y][x] = "銀行";
x++;
        			rows[y][x] = "yuchonum";
x++;
        			rows[y][x] = "口座番号";
x++;
        			rows[y][x] = "口座名";
x++;
        			rows[y][x] = "身分証明書No";
x++;
        			rows[y][x] = "コミッション支払残高";
x++;
        			rows[y][x] = "支払済コミッション";
x++;
        			rows[y][x] = "introductionsAsIntroduced";
x++;
        			rows[y][x] = "introductionsAsIntroducer";
x++;
        			rows[y][x] = "身分証明書";
x++;
        			rows[y][x] = "サイクル";
x++;
        			rows[y][x] = "ポジション";
x++;
        			rows[y][x] = "名前";
x++;
        			rows[y][x] = "フラグ";
x++;
        			rows[y][x] = "説明";
x++;
        			rows[y][x] = "アドレス";
x++;
        			rows[y][x] = "禁止";
x++;




        	x = 0;
        	
        	for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
                      User user = (User) collection.next();
     		              rows[y][x] = user.getId().toString();
x++;

        rows[y][x] = user.getPassword();
x++;

        rows[y][x] = user.getUsername();
x++;

        rows[y][x] = user.getMail();
x++;



        rows[y][x] = dateFormat.format(user.getAddeddate());
x++;

        rows[y][x] = user.getKana();
x++;

        rows[y][x] = user.getEnglishname();
x++;

        rows[y][x] = user.getSex();
x++;

        rows[y][x] = user.getPhonenum();
x++;


        rows[y][x] = user.getInfoseekmail();
x++;

        rows[y][x] = user.getZip();
x++;

        rows[y][x] = user.getBuildingname();
x++;

        rows[y][x] = dateFormat.format(user.getBirthdate());
x++;

        rows[y][x] = user.getMailhp();
x++;

        rows[y][x] = user.getMailpass();
x++;


        rows[y][x] = user.getBank();
x++;

        rows[y][x] = user.getYuchonum();
x++;

        rows[y][x] = user.getBanknumber();
x++;

        rows[y][x] = user.getBankaccountname();
x++;

        rows[y][x] = user.getCertificationNumber();
x++;

        rows[y][x] = String.valueOf(user.getCurrentcommition());
x++;

        rows[y][x] = String.valueOf(user.getPaidcommition());
x++;



        rows[y][x] = user.getCertificationType().getName();
x++;



        rows[y][x] = user.getName();
x++;

        rows[y][x] = user.getFlag();
x++;

        rows[y][x] = user.getDescription();
x++;

        rows[y][x] = user.getAddress();
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