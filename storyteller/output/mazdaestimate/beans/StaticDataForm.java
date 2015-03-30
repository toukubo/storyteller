package net.mazdaestimate.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class StaticDataForm
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
private Integer periodnum;
public void setPeriodnum(Integer periodnum){
this.periodnum = periodnum;
}
public Integer getPeriodnum(){
return this.periodnum;
}
private Integer periodyear;
public void setPeriodyear(Integer periodyear){
this.periodyear = periodyear;
}
public Integer getPeriodyear(){
return this.periodyear;
}
private int termbasisnum;
public void setTermbasisnum(int termbasisnum){
this.termbasisnum = termbasisnum;
}
public int getTermbasisnum(){
return this.termbasisnum;
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
