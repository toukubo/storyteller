package net.mazdaestimate.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ExhibitionReportCarForm
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
private boolean order;
public void setOrder(boolean order){
this.order = order;
}
public boolean isOrder(){
return this.order;
}
private int num;
public void setNum(int num){
this.num = num;
}
public int getNum(){
return this.num;
}
private Integer exhibitionReport;
public void setExhibitionReport(Integer exhibitionReport){
this.exhibitionReport = exhibitionReport;
}
public Integer getExhibitionReport(){
return this.exhibitionReport;
}
private Integer car;
public void setCar(Integer car){
this.car = car;
}
public Integer getCar(){
return this.car;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	order =false;
}
}
