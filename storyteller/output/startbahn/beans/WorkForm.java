package net.startbahn.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class WorkForm
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
private Integer artist;
public void setArtist(Integer artist){
this.artist = artist;
}
public Integer getArtist(){
return this.artist;
}
private String genre;
public void setGenre(String genre){
this.genre = genre;
}
public String getGenre(){
return this.genre;
}
private String copywrite;
public void setCopywrite(String copywrite){
this.copywrite = copywrite;
}
public String getCopywrite(){
return this.copywrite;
}
private String exposurehistory;
public void setExposurehistory(String exposurehistory){
this.exposurehistory = exposurehistory;
}
public String getExposurehistory(){
return this.exposurehistory;
}
private boolean client;
public void setClient(boolean client){
this.client = client;
}
public boolean isClient(){
return this.client;
}
private String cilentrequest;
public void setCilentrequest(String cilentrequest){
this.cilentrequest = cilentrequest;
}
public String getCilentrequest(){
return this.cilentrequest;
}
private boolean licensed;
public void setLicensed(boolean licensed){
this.licensed = licensed;
}
public boolean isLicensed(){
return this.licensed;
}
private String comments;
public void setComments(String comments){
this.comments = comments;
}
public String getComments(){
return this.comments;
}
private boolean licensingpossibleafterexpired;
public void setLicensingpossibleafterexpired(boolean licensingpossibleafterexpired){
this.licensingpossibleafterexpired = licensingpossibleafterexpired;
}
public boolean isLicensingpossibleafterexpired(){
return this.licensingpossibleafterexpired;
}
private String folderrelativepath;
public void setFolderrelativepath(String folderrelativepath){
this.folderrelativepath = folderrelativepath;
}
public String getFolderrelativepath(){
return this.folderrelativepath;
}
private String concept;
public void setConcept(String concept){
this.concept = concept;
}
public String getConcept(){
return this.concept;
}
private Date updatedate;
public void setUpdatedate(Date updatedate){
this.updatedate = updatedate;
}
public Date getUpdatedate(){
return this.updatedate;
}
private boolean updatedateIsValid = false;
public void setUpdatedateIsValid(boolean updatedateIsValid){
this.updatedateIsValid = updatedateIsValid;
}
public boolean isUpdatedateIsValid(){
return this.updatedateIsValid;
}
private java.lang.String updatedateAsRawString ="";
public java.lang.String getUpdatedateAsString(){
    return (updatedate== null) ? null : format.format(updatedate);
}
public void setUpdatedateAsString(java.lang.String updatedate){
	this.updatedateIsValid = true;
	this.updatedateAsRawString = updatedate;
try{
		if(StringUtils.isNotBlank(updatedate)){ format.parse(updatedate);}
}catch (java.text.ParseException pe){
this.updatedateIsValid = false;
}
	if(updatedateIsValid){
		try {
			this.updatedate = (org.apache.commons.lang.StringUtils.isBlank(updatedate)) ? null : format.parse(updatedate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setUpdatedateAsRawString(java.lang.String updatedate){
	this.updatedateAsRawString = updatedate;
}

public String getUpdatedateAsRawString(){
return this.updatedateAsRawString;
}
private Date productiondate;
public void setProductiondate(Date productiondate){
this.productiondate = productiondate;
}
public Date getProductiondate(){
return this.productiondate;
}
private boolean productiondateIsValid = false;
public void setProductiondateIsValid(boolean productiondateIsValid){
this.productiondateIsValid = productiondateIsValid;
}
public boolean isProductiondateIsValid(){
return this.productiondateIsValid;
}
private java.lang.String productiondateAsRawString ="";
public java.lang.String getProductiondateAsString(){
    return (productiondate== null) ? null : format.format(productiondate);
}
public void setProductiondateAsString(java.lang.String productiondate){
	this.productiondateIsValid = true;
	this.productiondateAsRawString = productiondate;
try{
		if(StringUtils.isNotBlank(productiondate)){ format.parse(productiondate);}
}catch (java.text.ParseException pe){
this.productiondateIsValid = false;
}
	if(productiondateIsValid){
		try {
			this.productiondate = (org.apache.commons.lang.StringUtils.isBlank(productiondate)) ? null : format.parse(productiondate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setProductiondateAsRawString(java.lang.String productiondate){
	this.productiondateAsRawString = productiondate;
}

public String getProductiondateAsRawString(){
return this.productiondateAsRawString;
}
private String material;
public void setMaterial(String material){
this.material = material;
}
public String getMaterial(){
return this.material;
}
private String youtubeurl;
public void setYoutubeurl(String youtubeurl){
this.youtubeurl = youtubeurl;
}
public String getYoutubeurl(){
return this.youtubeurl;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private String size;
public void setSize(String size){
this.size = size;
}
public String getSize(){
return this.size;
}
private Date date;
public void setDate(Date date){
this.date = date;
}
public Date getDate(){
return this.date;
}
private boolean dateIsValid = false;
public void setDateIsValid(boolean dateIsValid){
this.dateIsValid = dateIsValid;
}
public boolean isDateIsValid(){
return this.dateIsValid;
}
private java.lang.String dateAsRawString ="";
public java.lang.String getDateAsString(){
    return (date== null) ? null : format.format(date);
}
public void setDateAsString(java.lang.String date){
	this.dateIsValid = true;
	this.dateAsRawString = date;
try{
		if(StringUtils.isNotBlank(date)){ format.parse(date);}
}catch (java.text.ParseException pe){
this.dateIsValid = false;
}
	if(dateIsValid){
		try {
			this.date = (org.apache.commons.lang.StringUtils.isBlank(date)) ? null : format.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setDateAsRawString(java.lang.String date){
	this.dateAsRawString = date;
}

public String getDateAsRawString(){
return this.dateAsRawString;
}
private int year;
public void setYear(int year){
this.year = year;
}
public int getYear(){
return this.year;
}
private Float depth;
public void setDepth(Float depth){
this.depth = depth;
}
public Float getDepth(){
return this.depth;
}
private String information1;
public void setInformation1(String information1){
this.information1 = information1;
}
public String getInformation1(){
return this.information1;
}
private String information2;
public void setInformation2(String information2){
this.information2 = information2;
}
public String getInformation2(){
return this.information2;
}
private Float height;
public void setHeight(Float height){
this.height = height;
}
public Float getHeight(){
return this.height;
}
private Float width;
public void setWidth(Float width){
this.width = width;
}
public Float getWidth(){
return this.width;
}
private Integer collector;
public void setCollector(Integer collector){
this.collector = collector;
}
public Integer getCollector(){
return this.collector;
}
private Integer folder;
public void setFolder(Integer folder){
this.folder = folder;
}
public Integer getFolder(){
return this.folder;
}
private Integer topimageid;
public void setTopimageid(Integer topimageid){
this.topimageid = topimageid;
}
public Integer getTopimageid(){
return this.topimageid;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	client =false;
	licensed =false;
	licensingpossibleafterexpired =false;
}
}
