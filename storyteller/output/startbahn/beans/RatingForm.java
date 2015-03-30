package net.startbahn.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class RatingForm
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
private String markmodel;
public void setMarkmodel(String markmodel){
this.markmodel = markmodel;
}
public String getMarkmodel(){
return this.markmodel;
}
private String markeemodel;
public void setMarkeemodel(String markeemodel){
this.markeemodel = markeemodel;
}
public String getMarkeemodel(){
return this.markeemodel;
}
private Integer markerid;
public void setMarkerid(Integer markerid){
this.markerid = markerid;
}
public Integer getMarkerid(){
return this.markerid;
}
private Integer makeeid;
public void setMakeeid(Integer makeeid){
this.makeeid = makeeid;
}
public Integer getMakeeid(){
return this.makeeid;
}
private boolean thumbup;
public void setThumbup(boolean thumbup){
this.thumbup = thumbup;
}
public boolean isThumbup(){
return this.thumbup;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	thumbup =false;
}
}
