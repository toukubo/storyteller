package net.nodepad.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class NodeInterfaceForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String contentType;
public void setContentType(String contentType){
this.contentType = contentType;
}
public String getContentType(){
return this.contentType;
}
private String id;
public void setId(String id){
this.id = id;
}
public String getId(){
return this.id;
}
private String content;
public void setContent(String content){
this.content = content;
}
public String getContent(){
return this.content;
}
private int width;
public void setWidth(int width){
this.width = width;
}
public int getWidth(){
return this.width;
}
private int height;
public void setHeight(int height){
this.height = height;
}
public int getHeight(){
return this.height;
}
private int x;
public void setX(int x){
this.x = x;
}
public int getX(){
return this.x;
}
private int y;
public void setY(int y){
this.y = y;
}
public int getY(){
return this.y;
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
