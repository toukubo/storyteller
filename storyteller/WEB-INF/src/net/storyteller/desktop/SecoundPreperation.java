package net.storyteller.desktop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


public class SecoundPreperation {
	public SecoundPreperation(){
		LocalStaticData data = new LocalStaticData();
		
		
		try {
			String pomfilepath = data.getEclipseroot() + "/" + data.getNameofj2eeproject() + "/mda/" + data.getNameofj2eeproject() + "/pom.xml";
			BufferedReader reader = new BufferedReader(new FileReader(pomfilepath));
			String line = reader.readLine();
			StringBuilder builder = new StringBuilder();
			
			while(line!=null){
				line = line.replaceAll("/path/to/hsqldb/hsqldb.jar","./mysql-connector-java-3.1.12-bin.jar");
				line = line.replaceAll("jdbc:mysql://localhost:3306/"+data.getNameofj2eeproject(),"jdbc:mysql://localhost/"+data.getNameofj2eeproject()+"?useUnicode=true&amp;amp;amp;characterEncoding=utf8&amp;amp;amp;zeroDateTimeBehavior=convertToNull&amp;amp;amp;autoReconnect=true");
				line = line.replaceAll("<jdbc.username>sa</jdbc.username>","<jdbc.username>"+data.getNameofj2eeproject()+"</jdbc.username>");
				line = line.replaceAll("<jdbc.password></jdbc.password>"," <jdbc.password>"+data.getNameofj2eeproject()+"</jdbc.password>");
				line = line + "\r\n";
				builder.append(line);
				line = reader.readLine();
			}
			reader.close();
			
			FileWriter writer = new FileWriter(pomfilepath);
			writer.write(builder.toString());
			writer.flush();
			writer.close();
			
			String andromdaxmlfilepath = data.getEclipseroot() + "/" + data.getNameofj2eeproject() + "/mda/" + data.getNameofj2eeproject() + "/mda/src/main/config/andromda.xml";

			 reader = new BufferedReader(new FileReader(andromdaxmlfilepath));
			 line = reader.readLine();
			 builder = new StringBuilder();
			
			 int linenum = 0;
			while(line!=null){
				if(linenum == 133){
					line = "";
					builder.append("        <property name=\"defaultDateFormat\">yyyy/MM/dd</property>\r\n");
					linenum++;
					
				}else{
					line = line + "\r\n";
					builder.append(line);
					line = reader.readLine();
					linenum++;
				}
			}
			reader.close();
			
			writer = new FileWriter(andromdaxmlfilepath);
			writer.write(builder.toString());
			writer.flush();
			writer.close();

			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		


	}
	public static void main(String[] args) {
		new SecoundPreperation();
	}

}
