package net.gasbooknet.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class AttachmentForm
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
private String filetype;
public void setFiletype(String filetype){
this.filetype = filetype;
}
public String getFiletype(){
return this.filetype;
}
private Integer workAttachment;
public void setWorkAttachment(Integer workAttachment){
this.workAttachment = workAttachment;
}
public Integer getWorkAttachment(){
return this.workAttachment;
}
private Integer space;
public void setSpace(Integer space){
this.space = space;
}
public Integer getSpace(){
return this.space;
}
private Integer dbFile;
public void setDbFile(Integer dbFile){
this.dbFile = dbFile;
}
public Integer getDbFile(){
return this.dbFile;
}
private Integer event;
public void setEvent(Integer event){
this.event = event;
}
public Integer getEvent(){
return this.event;
}
private boolean wide;
public void setWide(boolean wide){
this.wide = wide;
}
public boolean isWide(){
return this.wide;
}
private float height;
public void setHeight(float height){
this.height = height;
}
public float getHeight(){
return this.height;
}
private float width;
public void setWidth(float width){
this.width = width;
}
public float getWidth(){
return this.width;
}
private Integer client;
public void setClient(Integer client){
this.client = client;
}
public Integer getClient(){
return this.client;
}
private Integer job;
public void setJob(Integer job){
this.job = job;
}
public Integer getJob(){
return this.job;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	wide =false;
}
}
