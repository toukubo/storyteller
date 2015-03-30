package net.djbi.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class M_ClndrForm
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
private Double cLNDR_YMD;
public void setCLNDR_YMD(Double cLNDR_YMD){
this.cLNDR_YMD = cLNDR_YMD;
}
public Double getCLNDR_YMD(){
return this.cLNDR_YMD;
}
private String dayKen;
public void setDayKen(String dayKen){
this.dayKen = dayKen;
}
public String getDayKen(){
return this.dayKen;
}
private String fstvlKen;
public void setFstvlKen(String fstvlKen){
this.fstvlKen = fstvlKen;
}
public String getFstvlKen(){
return this.fstvlKen;
}
private Double prvYearTrgtSmday;
public void setPrvYearTrgtSmday(Double prvYearTrgtSmday){
this.prvYearTrgtSmday = prvYearTrgtSmday;
}
public Double getPrvYearTrgtSmday(){
return this.prvYearTrgtSmday;
}
private Double smwekMonDate;
public void setSmwekMonDate(Double smwekMonDate){
this.smwekMonDate = smwekMonDate;
}
public Double getSmwekMonDate(){
return this.smwekMonDate;
}
private Double fsclYearinCmltdDcnt;
public void setFsclYearinCmltdDcnt(Double fsclYearinCmltdDcnt){
this.fsclYearinCmltdDcnt = fsclYearinCmltdDcnt;
}
public Double getFsclYearinCmltdDcnt(){
return this.fsclYearinCmltdDcnt;
}
private Double fsclYear;
public void setFsclYear(Double fsclYear){
this.fsclYear = fsclYear;
}
public Double getFsclYear(){
return this.fsclYear;
}
private Double fsclMnth;
public void setFsclMnth(Double fsclMnth){
this.fsclMnth = fsclMnth;
}
public Double getFsclMnth(){
return this.fsclMnth;
}
private Double fsclMntihCmltdDcnt;
public void setFsclMntihCmltdDcnt(Double fsclMntihCmltdDcnt){
this.fsclMntihCmltdDcnt = fsclMntihCmltdDcnt;
}
public Double getFsclMntihCmltdDcnt(){
return this.fsclMntihCmltdDcnt;
}
private Double bsnsMnthwekSresno;
public void setBsnsMnthwekSresno(Double bsnsMnthwekSresno){
this.bsnsMnthwekSresno = bsnsMnthwekSresno;
}
public Double getBsnsMnthwekSresno(){
return this.bsnsMnthwekSresno;
}
private Double djMngYear;
public void setDjMngYear(Double djMngYear){
this.djMngYear = djMngYear;
}
public Double getDjMngYear(){
return this.djMngYear;
}
private Double djMngMnth;
public void setDjMngMnth(Double djMngMnth){
this.djMngMnth = djMngMnth;
}
public Double getDjMngMnth(){
return this.djMngMnth;
}
private Double rYear;
public void setRYear(Double rYear){
this.rYear = rYear;
}
public Double getRYear(){
return this.rYear;
}
private Double rMnth;
public void setRMnth(Double rMnth){
this.rMnth = rMnth;
}
public Double getRMnth(){
return this.rMnth;
}
private Double rYmd;
public void setRYmd(Double rYmd){
this.rYmd = rYmd;
}
public Double getRYmd(){
return this.rYmd;
}
private Double yearWeekno;
public void setYearWeekno(Double yearWeekno){
this.yearWeekno = yearWeekno;
}
public Double getYearWeekno(){
return this.yearWeekno;
}
private Double rWeek;
public void setRWeek(Double rWeek){
this.rWeek = rWeek;
}
public Double getRWeek(){
return this.rWeek;
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
