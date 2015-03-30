package net.storyteller.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ContributeForm
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
private Integer contributionType;
public void setContributionType(Integer contributionType){
this.contributionType = contributionType;
}
public Integer getContributionType(){
return this.contributionType;
}
private int validyearstart;
public void setValidyearstart(int validyearstart){
this.validyearstart = validyearstart;
}
public int getValidyearstart(){
return this.validyearstart;
}
private int validmonthstart;
public void setValidmonthstart(int validmonthstart){
this.validmonthstart = validmonthstart;
}
public int getValidmonthstart(){
return this.validmonthstart;
}
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
}
private int validmonthend;
public void setValidmonthend(int validmonthend){
this.validmonthend = validmonthend;
}
public int getValidmonthend(){
return this.validmonthend;
}
private int point;
public void setPoint(int point){
this.point = point;
}
public int getPoint(){
return this.point;
}
private int validyearend;
public void setValidyearend(int validyearend){
this.validyearend = validyearend;
}
public int getValidyearend(){
return this.validyearend;
}
private boolean acknowledged;
public void setAcknowledged(boolean acknowledged){
this.acknowledged = acknowledged;
}
public boolean isAcknowledged(){
return this.acknowledged;
}
private double percentage;
public void setPercentage(double percentage){
this.percentage = percentage;
}
public double getPercentage(){
return this.percentage;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	acknowledged =false;
}
}
