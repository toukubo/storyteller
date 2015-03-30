package net.startbahn.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class InvitationForm
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
private String mail;
public void setMail(String mail){
this.mail = mail;
}
public String getMail(){
return this.mail;
}
private String hash;
public void setHash(String hash){
this.hash = hash;
}
public String getHash(){
return this.hash;
}
private Integer publicUser;
public void setPublicUser(Integer publicUser){
this.publicUser = publicUser;
}
public Integer getPublicUser(){
return this.publicUser;
}
private Integer invitationSet;
public void setInvitationSet(Integer invitationSet){
this.invitationSet = invitationSet;
}
public Integer getInvitationSet(){
return this.invitationSet;
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
