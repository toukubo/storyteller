package net.plest.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PublicUserForm
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
private String password;
public void setPassword(String password){
this.password = password;
}
public String getPassword(){
return this.password;
}
private String account;
public void setAccount(String account){
this.account = account;
}
public String getAccount(){
return this.account;
}
private String mail;
public void setMail(String mail){
this.mail = mail;
}
public String getMail(){
return this.mail;
}
private String serviceid;
public void setServiceid(String serviceid){
this.serviceid = serviceid;
}
public String getServiceid(){
return this.serviceid;
}
private String passwordConfirmation;
public void setPasswordConfirmation(String passwordConfirmation){
this.passwordConfirmation = passwordConfirmation;
}
public String getPasswordConfirmation(){
return this.passwordConfirmation;
}
private Integer fromFollowing;
public void setFromFollowing(Integer fromFollowing){
this.fromFollowing = fromFollowing;
}
public Integer getFromFollowing(){
return this.fromFollowing;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private boolean removed;
public void setRemoved(boolean removed){
this.removed = removed;
}
public boolean isRemoved(){
return this.removed;
}
private boolean verified;
public void setVerified(boolean verified){
this.verified = verified;
}
public boolean isVerified(){
return this.verified;
}
private int notificationCount;
public void setNotificationCount(int notificationCount){
this.notificationCount = notificationCount;
}
public int getNotificationCount(){
return this.notificationCount;
}
private int lastAccessDateInSecound;
public void setLastAccessDateInSecound(int lastAccessDateInSecound){
this.lastAccessDateInSecound = lastAccessDateInSecound;
}
public int getLastAccessDateInSecound(){
return this.lastAccessDateInSecound;
}
private boolean displaysPirvaiteMessages;
public void setDisplaysPirvaiteMessages(boolean displaysPirvaiteMessages){
this.displaysPirvaiteMessages = displaysPirvaiteMessages;
}
public boolean isDisplaysPirvaiteMessages(){
return this.displaysPirvaiteMessages;
}
private String accessToken;
public void setAccessToken(String accessToken){
this.accessToken = accessToken;
}
public String getAccessToken(){
return this.accessToken;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	removed =false;
	verified =false;
	displaysPirvaiteMessages =false;
}
}
