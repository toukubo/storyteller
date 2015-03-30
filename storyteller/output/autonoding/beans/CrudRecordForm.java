package net.autonoding.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class CrudRecordForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String type;
public void setType(String type){
this.type = type;
}
public String getType(){
return this.type;
}
private String content;
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
private String prevcontent;
public void setPrevcontent(String prevcontent){
this.prevcontent = prevcontent;
}
public String getPrevcontent(){
return this.prevcontent;
}
private String aftercontent;
public void setAftercontent(String aftercontent){
this.aftercontent = aftercontent;
}
public String getAftercontent(){
return this.aftercontent;
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
