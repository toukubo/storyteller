package net.simpleandhonest.beans;
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
private String reportmail;
public void setReportmail(String reportmail){
this.reportmail = reportmail;
}
public String getReportmail(){
return this.reportmail;
}
private int numofnewsontoppage;
public void setNumofnewsontoppage(int numofnewsontoppage){
this.numofnewsontoppage = numofnewsontoppage;
}
public int getNumofnewsontoppage(){
return this.numofnewsontoppage;
}
private String pickuphtm;
public void setPickuphtm(String pickuphtm){
this.pickuphtm = pickuphtm;
}
public String getPickuphtm(){
return this.pickuphtm;
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
