package net.plest.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PlestValueForm
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
private int total;
public void setTotal(int total){
this.total = total;
}
public int getTotal(){
return this.total;
}
private double closeness;
public void setCloseness(double closeness){
this.closeness = closeness;
}
public double getCloseness(){
return this.closeness;
}
private int mentionid;
public void setMentionid(int mentionid){
this.mentionid = mentionid;
}
public int getMentionid(){
return this.mentionid;
}
private double mentionerPlestValue;
public void setMentionerPlestValue(double mentionerPlestValue){
this.mentionerPlestValue = mentionerPlestValue;
}
public double getMentionerPlestValue(){
return this.mentionerPlestValue;
}
private int mentionTotalScore;
public void setMentionTotalScore(int mentionTotalScore){
this.mentionTotalScore = mentionTotalScore;
}
public int getMentionTotalScore(){
return this.mentionTotalScore;
}
private int likingTotalScore;
public void setLikingTotalScore(int likingTotalScore){
this.likingTotalScore = likingTotalScore;
}
public int getLikingTotalScore(){
return this.likingTotalScore;
}
private int averageReactionScore;
public void setAverageReactionScore(int averageReactionScore){
this.averageReactionScore = averageReactionScore;
}
public int getAverageReactionScore(){
return this.averageReactionScore;
}
private double freshness;
public void setFreshness(double freshness){
this.freshness = freshness;
}
public double getFreshness(){
return this.freshness;
}
private int syncroScore;
public void setSyncroScore(int syncroScore){
this.syncroScore = syncroScore;
}
public int getSyncroScore(){
return this.syncroScore;
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
