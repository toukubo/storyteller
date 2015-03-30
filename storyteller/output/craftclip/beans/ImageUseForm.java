package net.craftclip.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ImageUseForm
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
private int scalex;
public void setScalex(int scalex){
this.scalex = scalex;
}
public int getScalex(){
return this.scalex;
}
private int scaley;
public void setScaley(int scaley){
this.scaley = scaley;
}
public int getScaley(){
return this.scaley;
}
private int angle;
public void setAngle(int angle){
this.angle = angle;
}
public int getAngle(){
return this.angle;
}
private int materialFk;
public void setMaterialFk(int materialFk){
this.materialFk = materialFk;
}
public int getMaterialFk(){
return this.materialFk;
}
private Integer frame;
public void setFrame(Integer frame){
this.frame = frame;
}
public Integer getFrame(){
return this.frame;
}
private String description;
public void setDescription(String description){
this.description = description;
}
public String getDescription(){
return this.description;
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
