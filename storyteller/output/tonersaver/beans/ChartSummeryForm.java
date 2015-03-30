package net.tonersaver.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ChartSummeryForm
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
private Integer termSummery;
public void setTermSummery(Integer termSummery){
this.termSummery = termSummery;
}
public Integer getTermSummery(){
return this.termSummery;
}
private Integer summeryType;
public void setSummeryType(Integer summeryType){
this.summeryType = summeryType;
}
public Integer getSummeryType(){
return this.summeryType;
}
private Integer summery;
public void setSummery(Integer summery){
this.summery = summery;
}
public Integer getSummery(){
return this.summery;
}
private String imageurl;
public void setImageurl(String imageurl){
this.imageurl = imageurl;
}
public String getImageurl(){
return this.imageurl;
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
