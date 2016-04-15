package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class BasecampAccountForm
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
private String apid;
public void setApid(String apid){
this.apid = apid;
}
public String getApid(){
return this.apid;
}
private String url;
public void setUrl(String url){
this.url = url;
}
public String getUrl(){
return this.url;
}
private String account;
public void setAccount(String account){
this.account = account;
}
public String getAccount(){
return this.account;
}
private String password;
public void setPassword(String password){
this.password = password;
}
public String getPassword(){
return this.password;
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
