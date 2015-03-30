package net.realize.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PositionForm
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
private Integer cycle;
public void setCycle(Integer cycle){
this.cycle = cycle;
}
public Integer getCycle(){
return this.cycle;
}
private Integer user;
public void setUser(Integer user){
this.user = user;
}
public Integer getUser(){
return this.user;
}
private boolean cycled;
public void setCycled(boolean cycled){
this.cycled = cycled;
}
public boolean isCycled(){
return this.cycled;
}
private Integer parentPositionAsLeft;
public void setParentPositionAsLeft(Integer parentPositionAsLeft){
this.parentPositionAsLeft = parentPositionAsLeft;
}
public Integer getParentPositionAsLeft(){
return this.parentPositionAsLeft;
}
private Integer leftChildPosition;
public void setLeftChildPosition(Integer leftChildPosition){
this.leftChildPosition = leftChildPosition;
}
public Integer getLeftChildPosition(){
return this.leftChildPosition;
}
private Integer parentPositionAsRight;
public void setParentPositionAsRight(Integer parentPositionAsRight){
this.parentPositionAsRight = parentPositionAsRight;
}
public Integer getParentPositionAsRight(){
return this.parentPositionAsRight;
}
private Integer rightChildPosition;
public void setRightChildPosition(Integer rightChildPosition){
this.rightChildPosition = rightChildPosition;
}
public Integer getRightChildPosition(){
return this.rightChildPosition;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	cycled =false;
}
}
