package net.autonoding.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class NodeForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private int value;
public void setValue(int value){
this.value = value;
}
public int getValue(){
return this.value;
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
private int selfhappiness;
public void setSelfhappiness(int selfhappiness){
this.selfhappiness = selfhappiness;
}
public int getSelfhappiness(){
return this.selfhappiness;
}
private int selfinvestmentdepth;
public void setSelfinvestmentdepth(int selfinvestmentdepth){
this.selfinvestmentdepth = selfinvestmentdepth;
}
public int getSelfinvestmentdepth(){
return this.selfinvestmentdepth;
}
private int frequency;
public void setFrequency(int frequency){
this.frequency = frequency;
}
public int getFrequency(){
return this.frequency;
}
private int selfinvestment;
public void setSelfinvestment(int selfinvestment){
this.selfinvestment = selfinvestment;
}
public int getSelfinvestment(){
return this.selfinvestment;
}
private int selfnodevalue;
public void setSelfnodevalue(int selfnodevalue){
this.selfnodevalue = selfnodevalue;
}
public int getSelfnodevalue(){
return this.selfnodevalue;
}
private int x;
public void setX(int x){
this.x = x;
}
public int getX(){
return this.x;
}
private int y;
public void setY(int y){
this.y = y;
}
public int getY(){
return this.y;
}
private int selfhappinessdepth;
public void setSelfhappinessdepth(int selfhappinessdepth){
this.selfhappinessdepth = selfhappinessdepth;
}
public int getSelfhappinessdepth(){
return this.selfhappinessdepth;
}
private Integer nodeField;
public void setNodeField(Integer nodeField){
this.nodeField = nodeField;
}
public Integer getNodeField(){
return this.nodeField;
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
