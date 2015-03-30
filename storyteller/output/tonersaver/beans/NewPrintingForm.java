package net.tonersaver.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class NewPrintingForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private String filename;
public void setFilename(String filename){
this.filename = filename;
}
public String getFilename(){
return this.filename;
}
private String computer;
public void setComputer(String computer){
this.computer = computer;
}
public String getComputer(){
return this.computer;
}
private int savingrate;
public void setSavingrate(int savingrate){
this.savingrate = savingrate;
}
public int getSavingrate(){
return this.savingrate;
}
private int num;
public void setNum(int num){
this.num = num;
}
public int getNum(){
return this.num;
}
private String applicationname;
public void setApplicationname(String applicationname){
this.applicationname = applicationname;
}
public String getApplicationname(){
return this.applicationname;
}
private String filepath;
public void setFilepath(String filepath){
this.filepath = filepath;
}
public String getFilepath(){
return this.filepath;
}
private String papersize;
public void setPapersize(String papersize){
this.papersize = papersize;
}
public String getPapersize(){
return this.papersize;
}
private boolean oneside;
public void setOneside(boolean oneside){
this.oneside = oneside;
}
public boolean isOneside(){
return this.oneside;
}
private String printerstring;
public void setPrinterstring(String printerstring){
this.printerstring = printerstring;
}
public String getPrinterstring(){
return this.printerstring;
}
private Integer user;
public void setUser(Integer user){
this.user = user;
}
public Integer getUser(){
return this.user;
}
private Integer department;
public void setDepartment(Integer department){
this.department = department;
}
public Integer getDepartment(){
return this.department;
}
private boolean color;
public void setColor(boolean color){
this.color = color;
}
public boolean isColor(){
return this.color;
}
private Date date;
public void setDate(Date date){
this.date = date;
}
public Date getDate(){
return this.date;
}
private boolean dateIsValid = false;
public void setDateIsValid(boolean dateIsValid){
this.dateIsValid = dateIsValid;
}
public boolean isDateIsValid(){
return this.dateIsValid;
}
private java.lang.String dateAsRawString ="";
public java.lang.String getDateAsString(){
    return (date== null) ? null : format.format(date);
}
public void setDateAsString(java.lang.String date){
	this.dateIsValid = true;
	this.dateAsRawString = date;
try{
		if(StringUtils.isNotBlank(date)){ format.parse(date);}
}catch (java.text.ParseException pe){
this.dateIsValid = false;
}
	if(dateIsValid){
		try {
			this.date = (org.apache.commons.lang.StringUtils.isBlank(date)) ? null : format.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setDateAsRawString(java.lang.String date){
	this.dateAsRawString = date;
}

public String getDateAsRawString(){
return this.dateAsRawString;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	oneside =false;
	color =false;
}
}
