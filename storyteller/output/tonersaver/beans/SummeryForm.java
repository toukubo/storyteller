package net.tonersaver.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class SummeryForm
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
private String termtype;
public void setTermtype(String termtype){
this.termtype = termtype;
}
public String getTermtype(){
return this.termtype;
}
private int estimatedtonercost;
public void setEstimatedtonercost(int estimatedtonercost){
this.estimatedtonercost = estimatedtonercost;
}
public int getEstimatedtonercost(){
return this.estimatedtonercost;
}
private int actualtonercost;
public void setActualtonercost(int actualtonercost){
this.actualtonercost = actualtonercost;
}
public int getActualtonercost(){
return this.actualtonercost;
}
private int printer;
public void setPrinter(int printer){
this.printer = printer;
}
public int getPrinter(){
return this.printer;
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
private int month;
public void setMonth(int month){
this.month = month;
}
public int getMonth(){
return this.month;
}
private int year;
public void setYear(int year){
this.year = year;
}
public int getYear(){
return this.year;
}
private int clientnum;
public void setClientnum(int clientnum){
this.clientnum = clientnum;
}
public int getClientnum(){
return this.clientnum;
}
private int printnum;
public void setPrintnum(int printnum){
this.printnum = printnum;
}
public int getPrintnum(){
return this.printnum;
}
private int tonercostsaved;
public void setTonercostsaved(int tonercostsaved){
this.tonercostsaved = tonercostsaved;
}
public int getTonercostsaved(){
return this.tonercostsaved;
}
private float averagetonerdecreaserate;
public void setAveragetonerdecreaserate(float averagetonerdecreaserate){
this.averagetonerdecreaserate = averagetonerdecreaserate;
}
public float getAveragetonerdecreaserate(){
return this.averagetonerdecreaserate;
}
private float averagemonotonerdecreaserate;
public void setAveragemonotonerdecreaserate(float averagemonotonerdecreaserate){
this.averagemonotonerdecreaserate = averagemonotonerdecreaserate;
}
public float getAveragemonotonerdecreaserate(){
return this.averagemonotonerdecreaserate;
}
private float averagecolortonerdecreaserate;
public void setAveragecolortonerdecreaserate(float averagecolortonerdecreaserate){
this.averagecolortonerdecreaserate = averagecolortonerdecreaserate;
}
public float getAveragecolortonerdecreaserate(){
return this.averagecolortonerdecreaserate;
}
private float printingnumperclient;
public void setPrintingnumperclient(float printingnumperclient){
this.printingnumperclient = printingnumperclient;
}
public float getPrintingnumperclient(){
return this.printingnumperclient;
}
private int monoprintnum;
public void setMonoprintnum(int monoprintnum){
this.monoprintnum = monoprintnum;
}
public int getMonoprintnum(){
return this.monoprintnum;
}
private int colorprintnum;
public void setColorprintnum(int colorprintnum){
this.colorprintnum = colorprintnum;
}
public int getColorprintnum(){
return this.colorprintnum;
}
private int onesideprintnum;
public void setOnesideprintnum(int onesideprintnum){
this.onesideprintnum = onesideprintnum;
}
public int getOnesideprintnum(){
return this.onesideprintnum;
}
private int bothsideprintnum;
public void setBothsideprintnum(int bothsideprintnum){
this.bothsideprintnum = bothsideprintnum;
}
public int getBothsideprintnum(){
return this.bothsideprintnum;
}
private String drilldownid;
public void setDrilldownid(String drilldownid){
this.drilldownid = drilldownid;
}
public String getDrilldownid(){
return this.drilldownid;
}
private double savingpoint;
public void setSavingpoint(double savingpoint){
this.savingpoint = savingpoint;
}
public double getSavingpoint(){
return this.savingpoint;
}
private double colorsavingpoint;
public void setColorsavingpoint(double colorsavingpoint){
this.colorsavingpoint = colorsavingpoint;
}
public double getColorsavingpoint(){
return this.colorsavingpoint;
}
private double monosavingpoint;
public void setMonosavingpoint(double monosavingpoint){
this.monosavingpoint = monosavingpoint;
}
public double getMonosavingpoint(){
return this.monosavingpoint;
}
private boolean dirty;
public void setDirty(boolean dirty){
this.dirty = dirty;
}
public boolean isDirty(){
return this.dirty;
}
private int printingssize;
public void setPrintingssize(int printingssize){
this.printingssize = printingssize;
}
public int getPrintingssize(){
return this.printingssize;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	dirty =false;
}
}
