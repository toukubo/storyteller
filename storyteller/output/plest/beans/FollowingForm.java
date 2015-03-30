package net.plest.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class FollowingForm
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
private Integer fromPublicUser;
public void setFromPublicUser(Integer fromPublicUser){
this.fromPublicUser = fromPublicUser;
}
public Integer getFromPublicUser(){
return this.fromPublicUser;
}
private int mutualFollowingCount;
public void setMutualFollowingCount(int mutualFollowingCount){
this.mutualFollowingCount = mutualFollowingCount;
}
public int getMutualFollowingCount(){
return this.mutualFollowingCount;
}
private int shareCount;
public void setShareCount(int shareCount){
this.shareCount = shareCount;
}
public int getShareCount(){
return this.shareCount;
}
private int likingCount;
public void setLikingCount(int likingCount){
this.likingCount = likingCount;
}
public int getLikingCount(){
return this.likingCount;
}
private int messageCount;
public void setMessageCount(int messageCount){
this.messageCount = messageCount;
}
public int getMessageCount(){
return this.messageCount;
}
private int mentionCount;
public void setMentionCount(int mentionCount){
this.mentionCount = mentionCount;
}
public int getMentionCount(){
return this.mentionCount;
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
