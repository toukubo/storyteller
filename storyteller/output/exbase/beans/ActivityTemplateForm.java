package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ActivityTemplateForm
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
private String tasktype;
public void setTasktype(String tasktype){
this.tasktype = tasktype;
}
public String getTasktype(){
return this.tasktype;
}
private Integer timing;
public void setTiming(Integer timing){
this.timing = timing;
}
public Integer getTiming(){
return this.timing;
}
private String notificationmessage;
public void setNotificationmessage(String notificationmessage){
this.notificationmessage = notificationmessage;
}
public String getNotificationmessage(){
return this.notificationmessage;
}
private Integer workflowTemplate;
public void setWorkflowTemplate(Integer workflowTemplate){
this.workflowTemplate = workflowTemplate;
}
public Integer getWorkflowTemplate(){
return this.workflowTemplate;
}
private Integer user;
public void setUser(Integer user){
this.user = user;
}
public Integer getUser(){
return this.user;
}
private Integer excelTemplate;
public void setExcelTemplate(Integer excelTemplate){
this.excelTemplate = excelTemplate;
}
public Integer getExcelTemplate(){
return this.excelTemplate;
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
private boolean removed;
public void setRemoved(boolean removed){
this.removed = removed;
}
public boolean isRemoved(){
return this.removed;
}
private int step;
public void setStep(int step){
this.step = step;
}
public int getStep(){
return this.step;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	removed =false;
}
}
