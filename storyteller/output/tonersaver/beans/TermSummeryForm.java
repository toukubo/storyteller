package net.tonersaver.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class TermSummeryForm
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
private int colorcostperpage;
public void setColorcostperpage(int colorcostperpage){
this.colorcostperpage = colorcostperpage;
}
public int getColorcostperpage(){
return this.colorcostperpage;
}
private int monocostperpage;
public void setMonocostperpage(int monocostperpage){
this.monocostperpage = monocostperpage;
}
public int getMonocostperpage(){
return this.monocostperpage;
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
private double colorsavingpoint1;
public void setColorsavingpoint1(double colorsavingpoint1){
this.colorsavingpoint1 = colorsavingpoint1;
}
public double getColorsavingpoint1(){
return this.colorsavingpoint1;
}
private double savingpoint;
public void setSavingpoint(double savingpoint){
this.savingpoint = savingpoint;
}
public double getSavingpoint(){
return this.savingpoint;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){}
}
