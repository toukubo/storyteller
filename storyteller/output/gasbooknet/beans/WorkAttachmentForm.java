package net.gasbooknet.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class WorkAttachmentForm
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
private Integer work;
public void setWork(Integer work){
this.work = work;
}
public Integer getWork(){
return this.work;
}
private Integer attachment;
public void setAttachment(Integer attachment){
this.attachment = attachment;
}
public Integer getAttachment(){
return this.attachment;
}
private String filename;
public void setFilename(String filename){
this.filename = filename;
}
public String getFilename(){
return this.filename;
}
private boolean mainvisual;
public void setMainvisual(boolean mainvisual){
this.mainvisual = mainvisual;
}
public boolean isMainvisual(){
return this.mainvisual;
}
private Integer dbFile;
public void setDbFile(Integer dbFile){
this.dbFile = dbFile;
}
public Integer getDbFile(){
return this.dbFile;
}
private String rawdataext;
public void setRawdataext(String rawdataext){
this.rawdataext = rawdataext;
}
public String getRawdataext(){
return this.rawdataext;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	mainvisual =false;
}
}
