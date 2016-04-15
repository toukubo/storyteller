package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class JspForm
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
private String code;
public void setCode(String code){
this.code = code;
}
public String getCode(){
return this.code;
}
private String filename;
public void setFilename(String filename){
this.filename = filename;
}
public String getFilename(){
return this.filename;
}
private Integer sentence;
public void setSentence(Integer sentence){
this.sentence = sentence;
}
public Integer getSentence(){
return this.sentence;
}
private boolean modified;
public void setModified(boolean modified){
this.modified = modified;
}
public boolean isModified(){
return this.modified;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	modified =false;
}
}
