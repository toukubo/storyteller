package net.gasbooknet.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class AutoLinkForm
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
private boolean actual;
public void setActual(boolean actual){
this.actual = actual;
}
public boolean isActual(){
return this.actual;
}
private String linkermodel;
public void setLinkermodel(String linkermodel){
this.linkermodel = linkermodel;
}
public String getLinkermodel(){
return this.linkermodel;
}
private String linkeemodel;
public void setLinkeemodel(String linkeemodel){
this.linkeemodel = linkeemodel;
}
public String getLinkeemodel(){
return this.linkeemodel;
}
private Integer linkerid;
public void setLinkerid(Integer linkerid){
this.linkerid = linkerid;
}
public Integer getLinkerid(){
return this.linkerid;
}
private Integer linkeeid;
public void setLinkeeid(Integer linkeeid){
this.linkeeid = linkeeid;
}
public Integer getLinkeeid(){
return this.linkeeid;
}
private String ancher;
public void setAncher(String ancher){
this.ancher = ancher;
}
public String getAncher(){
return this.ancher;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	actual =false;
}
}
