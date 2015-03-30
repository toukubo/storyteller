package net.exbase.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ExcelForm
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
private Integer excelTemplate;
public void setExcelTemplate(Integer excelTemplate){
this.excelTemplate = excelTemplate;
}
public Integer getExcelTemplate(){
return this.excelTemplate;
}
private Integer activity;
public void setActivity(Integer activity){
this.activity = activity;
}
public Integer getActivity(){
return this.activity;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
private Integer user;
public void setUser(Integer user){
this.user = user;
}
public Integer getUser(){
return this.user;
}
private Date updateDate;
public void setUpdateDate(Date updateDate){
this.updateDate = updateDate;
}
public Date getUpdateDate(){
return this.updateDate;
}
private boolean updateDateIsValid = false;
public void setUpdateDateIsValid(boolean updateDateIsValid){
this.updateDateIsValid = updateDateIsValid;
}
public boolean isUpdateDateIsValid(){
return this.updateDateIsValid;
}
private java.lang.String updateDateAsRawString ="";
public java.lang.String getUpdateDateAsString(){
    return (updateDate== null) ? null : format.format(updateDate);
}
public void setUpdateDateAsString(java.lang.String updateDate){
	this.updateDateIsValid = true;
	this.updateDateAsRawString = updateDate;
try{
		if(StringUtils.isNotBlank(updateDate)){ format.parse(updateDate);}
}catch (java.text.ParseException pe){
this.updateDateIsValid = false;
}
	if(updateDateIsValid){
		try {
			this.updateDate = (org.apache.commons.lang.StringUtils.isBlank(updateDate)) ? null : format.parse(updateDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setUpdateDateAsRawString(java.lang.String updateDate){
	this.updateDateAsRawString = updateDate;
}

public String getUpdateDateAsRawString(){
return this.updateDateAsRawString;
}
private Date approvalDate;
public void setApprovalDate(Date approvalDate){
this.approvalDate = approvalDate;
}
public Date getApprovalDate(){
return this.approvalDate;
}
private boolean approvalDateIsValid = false;
public void setApprovalDateIsValid(boolean approvalDateIsValid){
this.approvalDateIsValid = approvalDateIsValid;
}
public boolean isApprovalDateIsValid(){
return this.approvalDateIsValid;
}
private java.lang.String approvalDateAsRawString ="";
public java.lang.String getApprovalDateAsString(){
    return (approvalDate== null) ? null : format.format(approvalDate);
}
public void setApprovalDateAsString(java.lang.String approvalDate){
	this.approvalDateIsValid = true;
	this.approvalDateAsRawString = approvalDate;
try{
		if(StringUtils.isNotBlank(approvalDate)){ format.parse(approvalDate);}
}catch (java.text.ParseException pe){
this.approvalDateIsValid = false;
}
	if(approvalDateIsValid){
		try {
			this.approvalDate = (org.apache.commons.lang.StringUtils.isBlank(approvalDate)) ? null : format.parse(approvalDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setApprovalDateAsRawString(java.lang.String approvalDate){
	this.approvalDateAsRawString = approvalDate;
}

public String getApprovalDateAsRawString(){
return this.approvalDateAsRawString;
}
private Date applicationDate;
public void setApplicationDate(Date applicationDate){
this.applicationDate = applicationDate;
}
public Date getApplicationDate(){
return this.applicationDate;
}
private boolean applicationDateIsValid = false;
public void setApplicationDateIsValid(boolean applicationDateIsValid){
this.applicationDateIsValid = applicationDateIsValid;
}
public boolean isApplicationDateIsValid(){
return this.applicationDateIsValid;
}
private java.lang.String applicationDateAsRawString ="";
public java.lang.String getApplicationDateAsString(){
    return (applicationDate== null) ? null : format.format(applicationDate);
}
public void setApplicationDateAsString(java.lang.String applicationDate){
	this.applicationDateIsValid = true;
	this.applicationDateAsRawString = applicationDate;
try{
		if(StringUtils.isNotBlank(applicationDate)){ format.parse(applicationDate);}
}catch (java.text.ParseException pe){
this.applicationDateIsValid = false;
}
	if(applicationDateIsValid){
		try {
			this.applicationDate = (org.apache.commons.lang.StringUtils.isBlank(applicationDate)) ? null : format.parse(applicationDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setApplicationDateAsRawString(java.lang.String applicationDate){
	this.applicationDateAsRawString = applicationDate;
}

public String getApplicationDateAsRawString(){
return this.applicationDateAsRawString;
}
private Integer category;
public void setCategory(Integer category){
this.category = category;
}
public Integer getCategory(){
return this.category;
}
private Date downloadDate;
public void setDownloadDate(Date downloadDate){
this.downloadDate = downloadDate;
}
public Date getDownloadDate(){
return this.downloadDate;
}
private boolean downloadDateIsValid = false;
public void setDownloadDateIsValid(boolean downloadDateIsValid){
this.downloadDateIsValid = downloadDateIsValid;
}
public boolean isDownloadDateIsValid(){
return this.downloadDateIsValid;
}
private java.lang.String downloadDateAsRawString ="";
public java.lang.String getDownloadDateAsString(){
    return (downloadDate== null) ? null : format.format(downloadDate);
}
public void setDownloadDateAsString(java.lang.String downloadDate){
	this.downloadDateIsValid = true;
	this.downloadDateAsRawString = downloadDate;
try{
		if(StringUtils.isNotBlank(downloadDate)){ format.parse(downloadDate);}
}catch (java.text.ParseException pe){
this.downloadDateIsValid = false;
}
	if(downloadDateIsValid){
		try {
			this.downloadDate = (org.apache.commons.lang.StringUtils.isBlank(downloadDate)) ? null : format.parse(downloadDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setDownloadDateAsRawString(java.lang.String downloadDate){
	this.downloadDateAsRawString = downloadDate;
}

public String getDownloadDateAsRawString(){
return this.downloadDateAsRawString;
}
private boolean vergin;
public void setVergin(boolean vergin){
this.vergin = vergin;
}
public boolean isVergin(){
return this.vergin;
}
private Boolean done;
public void setDone(Boolean done){
this.done = done;
}
public Boolean getDone(){
return this.done;
}
private boolean removed;
public void setRemoved(boolean removed){
this.removed = removed;
}
public boolean isRemoved(){
return this.removed;
}
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
}
private boolean test;
public void setTest(boolean test){
this.test = test;
}
public boolean isTest(){
return this.test;
}
private int downloadId;
public void setDownloadId(int downloadId){
this.downloadId = downloadId;
}
public int getDownloadId(){
return this.downloadId;
}
private boolean removeTestData;
public void setRemoveTestData(boolean removeTestData){
this.removeTestData = removeTestData;
}
public boolean isRemoveTestData(){
return this.removeTestData;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	vergin =false;
	removed =false;
	test =false;
	removeTestData =false;
}
}
