package net.tkm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class AttachmentForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String path;
public void setPath(String path){
this.path = path;
}
public String getPath(){
return this.path;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private String mimeType;
public void setMimeType(String mimeType){
this.mimeType = mimeType;
}
public String getMimeType(){
return this.mimeType;
}
private Integer dbFile;
public void setDbFile(Integer dbFile){
this.dbFile = dbFile;
}
public Integer getDbFile(){
return this.dbFile;
}
private Integer shop;
public void setShop(Integer shop){
this.shop = shop;
}
public Integer getShop(){
return this.shop;
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
