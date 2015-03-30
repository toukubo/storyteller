package net.tonersaver.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ChartSummeryAttributeForm
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
private Integer summeryAttributeType;
public void setSummeryAttributeType(Integer summeryAttributeType){
this.summeryAttributeType = summeryAttributeType;
}
public Integer getSummeryAttributeType(){
return this.summeryAttributeType;
}
private Integer chartSummery;
public void setChartSummery(Integer chartSummery){
this.chartSummery = chartSummery;
}
public Integer getChartSummery(){
return this.chartSummery;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
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
