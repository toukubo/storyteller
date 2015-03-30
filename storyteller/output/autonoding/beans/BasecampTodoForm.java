package net.autonoding.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class BasecampTodoForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String content;
public void setContent(String content){
this.content = content;
}
public String getContent(){
return this.content;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private boolean done;
public void setDone(boolean done){
this.done = done;
}
public boolean isDone(){
return this.done;
}
private int ordernum;
public void setOrdernum(int ordernum){
this.ordernum = ordernum;
}
public int getOrdernum(){
return this.ordernum;
}
private Integer basecampTodoList;
public void setBasecampTodoList(Integer basecampTodoList){
this.basecampTodoList = basecampTodoList;
}
public Integer getBasecampTodoList(){
return this.basecampTodoList;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	done =false;
}
}
