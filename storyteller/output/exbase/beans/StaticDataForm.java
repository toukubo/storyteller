package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class StaticDataForm
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
private Boolean unix;
public void setUnix(Boolean unix){
this.unix = unix;
}
public Boolean getUnix(){
return this.unix;
}
private String mailserverpop3;
public void setMailserverpop3(String mailserverpop3){
this.mailserverpop3 = mailserverpop3;
}
public String getMailserverpop3(){
return this.mailserverpop3;
}
private String mailserversmtp;
public void setMailserversmtp(String mailserversmtp){
this.mailserversmtp = mailserversmtp;
}
public String getMailserversmtp(){
return this.mailserversmtp;
}
private String mailserverid;
public void setMailserverid(String mailserverid){
this.mailserverid = mailserverid;
}
public String getMailserverid(){
return this.mailserverid;
}
private String mailserverpassword;
public void setMailserverpassword(String mailserverpassword){
this.mailserverpassword = mailserverpassword;
}
public String getMailserverpassword(){
return this.mailserverpassword;
}
private String systemurl;
public void setSystemurl(String systemurl){
this.systemurl = systemurl;
}
public String getSystemurl(){
return this.systemurl;
}
private String mailsenderid;
public void setMailsenderid(String mailsenderid){
this.mailsenderid = mailsenderid;
}
public String getMailsenderid(){
return this.mailsenderid;
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
