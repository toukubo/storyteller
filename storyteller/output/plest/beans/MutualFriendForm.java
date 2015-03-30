package net.plest.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class MutualFriendForm
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
private int firstUser;
public void setFirstUser(int firstUser){
this.firstUser = firstUser;
}
public int getFirstUser(){
return this.firstUser;
}
private int secoundUser;
public void setSecoundUser(int secoundUser){
this.secoundUser = secoundUser;
}
public int getSecoundUser(){
return this.secoundUser;
}
private int followingUser;
public void setFollowingUser(int followingUser){
this.followingUser = followingUser;
}
public int getFollowingUser(){
return this.followingUser;
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
