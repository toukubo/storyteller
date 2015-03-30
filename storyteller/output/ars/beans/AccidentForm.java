package net.ars.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class AccidentForm
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
private String day;
public void setDay(String day){
this.day = day;
}
public String getDay(){
return this.day;
}
private Integer sex;
public void setSex(Integer sex){
this.sex = sex;
}
public Integer getSex(){
return this.sex;
}
private Integer attachment;
public void setAttachment(Integer attachment){
this.attachment = attachment;
}
public Integer getAttachment(){
return this.attachment;
}
private Integer number;
public void setNumber(Integer number){
this.number = number;
}
public Integer getNumber(){
return this.number;
}
private Integer weather;
public void setWeather(Integer weather){
this.weather = weather;
}
public Integer getWeather(){
return this.weather;
}
private Integer accidentcategory;
public void setAccidentcategory(Integer accidentcategory){
this.accidentcategory = accidentcategory;
}
public Integer getAccidentcategory(){
return this.accidentcategory;
}
private String roadname;
public void setRoadname(String roadname){
this.roadname = roadname;
}
public String getRoadname(){
return this.roadname;
}
private Integer responsibility;
public void setResponsibility(Integer responsibility){
this.responsibility = responsibility;
}
public Integer getResponsibility(){
return this.responsibility;
}
private Integer roadcategory;
public void setRoadcategory(Integer roadcategory){
this.roadcategory = roadcategory;
}
public Integer getRoadcategory(){
return this.roadcategory;
}
private Integer roadcurve;
public void setRoadcurve(Integer roadcurve){
this.roadcurve = roadcurve;
}
public Integer getRoadcurve(){
return this.roadcurve;
}
private boolean roadview;
public void setRoadview(boolean roadview){
this.roadview = roadview;
}
public boolean isRoadview(){
return this.roadview;
}
private boolean intersection;
public void setIntersection(boolean intersection){
this.intersection = intersection;
}
public boolean isIntersection(){
return this.intersection;
}
private boolean signal;
public void setSignal(boolean signal){
this.signal = signal;
}
public boolean isSignal(){
return this.signal;
}
private Integer roadgrade;
public void setRoadgrade(Integer roadgrade){
this.roadgrade = roadgrade;
}
public Integer getRoadgrade(){
return this.roadgrade;
}
private Integer roadwidth;
public void setRoadwidth(Integer roadwidth){
this.roadwidth = roadwidth;
}
public Integer getRoadwidth(){
return this.roadwidth;
}
private Integer limitingspeed;
public void setLimitingspeed(Integer limitingspeed){
this.limitingspeed = limitingspeed;
}
public Integer getLimitingspeed(){
return this.limitingspeed;
}
private Integer roadcondition;
public void setRoadcondition(Integer roadcondition){
this.roadcondition = roadcondition;
}
public Integer getRoadcondition(){
return this.roadcondition;
}
private Integer carline;
public void setCarline(Integer carline){
this.carline = carline;
}
public Integer getCarline(){
return this.carline;
}
private boolean cargo;
public void setCargo(boolean cargo){
this.cargo = cargo;
}
public boolean isCargo(){
return this.cargo;
}
private Integer death;
public void setDeath(Integer death){
this.death = death;
}
public Integer getDeath(){
return this.death;
}
private Integer seriousinjury;
public void setSeriousinjury(Integer seriousinjury){
this.seriousinjury = seriousinjury;
}
public Integer getSeriousinjury(){
return this.seriousinjury;
}
private Integer minorinjury;
public void setMinorinjury(Integer minorinjury){
this.minorinjury = minorinjury;
}
public Integer getMinorinjury(){
return this.minorinjury;
}
private Integer hazardperceptionspeed;
public void setHazardperceptionspeed(Integer hazardperceptionspeed){
this.hazardperceptionspeed = hazardperceptionspeed;
}
public Integer getHazardperceptionspeed(){
return this.hazardperceptionspeed;
}
private Integer hazardperceptiondistance;
public void setHazardperceptiondistance(Integer hazardperceptiondistance){
this.hazardperceptiondistance = hazardperceptiondistance;
}
public Integer getHazardperceptiondistance(){
return this.hazardperceptiondistance;
}
private String registrationplate;
public void setRegistrationplate(String registrationplate){
this.registrationplate = registrationplate;
}
public String getRegistrationplate(){
return this.registrationplate;
}
private String carname;
public void setCarname(String carname){
this.carname = carname;
}
public String getCarname(){
return this.carname;
}
private String modelyear;
public void setModelyear(String modelyear){
this.modelyear = modelyear;
}
public String getModelyear(){
return this.modelyear;
}
private Integer costofinsurancebypersonalinjury;
public void setCostofinsurancebypersonalinjury(Integer costofinsurancebypersonalinjury){
this.costofinsurancebypersonalinjury = costofinsurancebypersonalinjury;
}
public Integer getCostofinsurancebypersonalinjury(){
return this.costofinsurancebypersonalinjury;
}
private Integer costofcompanybypersonalinjury;
public void setCostofcompanybypersonalinjury(Integer costofcompanybypersonalinjury){
this.costofcompanybypersonalinjury = costofcompanybypersonalinjury;
}
public Integer getCostofcompanybypersonalinjury(){
return this.costofcompanybypersonalinjury;
}
private Integer costofinsurancebypropertydamage;
public void setCostofinsurancebypropertydamage(Integer costofinsurancebypropertydamage){
this.costofinsurancebypropertydamage = costofinsurancebypropertydamage;
}
public Integer getCostofinsurancebypropertydamage(){
return this.costofinsurancebypropertydamage;
}
private Integer costofcompanybypropatydamage;
public void setCostofcompanybypropatydamage(Integer costofcompanybypropatydamage){
this.costofcompanybypropatydamage = costofcompanybypropatydamage;
}
public Integer getCostofcompanybypropatydamage(){
return this.costofcompanybypropatydamage;
}
private Integer costofinsurancebyautomobilephysicaldamage;
public void setCostofinsurancebyautomobilephysicaldamage(Integer costofinsurancebyautomobilephysicaldamage){
this.costofinsurancebyautomobilephysicaldamage = costofinsurancebyautomobilephysicaldamage;
}
public Integer getCostofinsurancebyautomobilephysicaldamage(){
return this.costofinsurancebyautomobilephysicaldamage;
}
private Integer costofcompanybyautomobilephysicaldamage;
public void setCostofcompanybyautomobilephysicaldamage(Integer costofcompanybyautomobilephysicaldamage){
this.costofcompanybyautomobilephysicaldamage = costofcompanybyautomobilephysicaldamage;
}
public Integer getCostofcompanybyautomobilephysicaldamage(){
return this.costofcompanybyautomobilephysicaldamage;
}
private boolean actionofsaftydriving;
public void setActionofsaftydriving(boolean actionofsaftydriving){
this.actionofsaftydriving = actionofsaftydriving;
}
public boolean isActionofsaftydriving(){
return this.actionofsaftydriving;
}
private String problemdescription;
public void setProblemdescription(String problemdescription){
this.problemdescription = problemdescription;
}
public String getProblemdescription(){
return this.problemdescription;
}
private Date datepfholdingsaftygroup;
public void setDatepfholdingsaftygroup(Date datepfholdingsaftygroup){
this.datepfholdingsaftygroup = datepfholdingsaftygroup;
}
public Date getDatepfholdingsaftygroup(){
return this.datepfholdingsaftygroup;
}
private boolean datepfholdingsaftygroupIsValid = false;
public void setDatepfholdingsaftygroupIsValid(boolean datepfholdingsaftygroupIsValid){
this.datepfholdingsaftygroupIsValid = datepfholdingsaftygroupIsValid;
}
public boolean isDatepfholdingsaftygroupIsValid(){
return this.datepfholdingsaftygroupIsValid;
}
private java.lang.String datepfholdingsaftygroupAsRawString ="";
public java.lang.String getDatepfholdingsaftygroupAsString(){
    return (datepfholdingsaftygroup== null) ? null : format.format(datepfholdingsaftygroup);
}
public void setDatepfholdingsaftygroupAsString(java.lang.String datepfholdingsaftygroup){
	this.datepfholdingsaftygroupIsValid = true;
	this.datepfholdingsaftygroupAsRawString = datepfholdingsaftygroup;
try{
		if(StringUtils.isNotBlank(datepfholdingsaftygroup)){ format.parse(datepfholdingsaftygroup);}
}catch (java.text.ParseException pe){
this.datepfholdingsaftygroupIsValid = false;
}
	if(datepfholdingsaftygroupIsValid){
		try {
			this.datepfholdingsaftygroup = (org.apache.commons.lang.StringUtils.isBlank(datepfholdingsaftygroup)) ? null : format.parse(datepfholdingsaftygroup);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setDatepfholdingsaftygroupAsRawString(java.lang.String datepfholdingsaftygroup){
	this.datepfholdingsaftygroupAsRawString = datepfholdingsaftygroup;
}

public String getDatepfholdingsaftygroupAsRawString(){
return this.datepfholdingsaftygroupAsRawString;
}
private String actionofsafy;
public void setActionofsafy(String actionofsafy){
this.actionofsafy = actionofsafy;
}
public String getActionofsafy(){
return this.actionofsafy;
}
private Date dateofholdingaccidentcommittee;
public void setDateofholdingaccidentcommittee(Date dateofholdingaccidentcommittee){
this.dateofholdingaccidentcommittee = dateofholdingaccidentcommittee;
}
public Date getDateofholdingaccidentcommittee(){
return this.dateofholdingaccidentcommittee;
}
private boolean dateofholdingaccidentcommitteeIsValid = false;
public void setDateofholdingaccidentcommitteeIsValid(boolean dateofholdingaccidentcommitteeIsValid){
this.dateofholdingaccidentcommitteeIsValid = dateofholdingaccidentcommitteeIsValid;
}
public boolean isDateofholdingaccidentcommitteeIsValid(){
return this.dateofholdingaccidentcommitteeIsValid;
}
private java.lang.String dateofholdingaccidentcommitteeAsRawString ="";
public java.lang.String getDateofholdingaccidentcommitteeAsString(){
    return (dateofholdingaccidentcommittee== null) ? null : format.format(dateofholdingaccidentcommittee);
}
public void setDateofholdingaccidentcommitteeAsString(java.lang.String dateofholdingaccidentcommittee){
	this.dateofholdingaccidentcommitteeIsValid = true;
	this.dateofholdingaccidentcommitteeAsRawString = dateofholdingaccidentcommittee;
try{
		if(StringUtils.isNotBlank(dateofholdingaccidentcommittee)){ format.parse(dateofholdingaccidentcommittee);}
}catch (java.text.ParseException pe){
this.dateofholdingaccidentcommitteeIsValid = false;
}
	if(dateofholdingaccidentcommitteeIsValid){
		try {
			this.dateofholdingaccidentcommittee = (org.apache.commons.lang.StringUtils.isBlank(dateofholdingaccidentcommittee)) ? null : format.parse(dateofholdingaccidentcommittee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setDateofholdingaccidentcommitteeAsRawString(java.lang.String dateofholdingaccidentcommittee){
	this.dateofholdingaccidentcommitteeAsRawString = dateofholdingaccidentcommittee;
}

public String getDateofholdingaccidentcommitteeAsRawString(){
return this.dateofholdingaccidentcommitteeAsRawString;
}
private String penaltyofaccident;
public void setPenaltyofaccident(String penaltyofaccident){
this.penaltyofaccident = penaltyofaccident;
}
public String getPenaltyofaccident(){
return this.penaltyofaccident;
}
private Integer numberofinssurance;
public void setNumberofinssurance(Integer numberofinssurance){
this.numberofinssurance = numberofinssurance;
}
public Integer getNumberofinssurance(){
return this.numberofinssurance;
}
private Integer age;
public void setAge(Integer age){
this.age = age;
}
public Integer getAge(){
return this.age;
}
private Integer yearofemplyment;
public void setYearofemplyment(Integer yearofemplyment){
this.yearofemplyment = yearofemplyment;
}
public Integer getYearofemplyment(){
return this.yearofemplyment;
}
private Integer yearofexperience;
public void setYearofexperience(Integer yearofexperience){
this.yearofexperience = yearofexperience;
}
public Integer getYearofexperience(){
return this.yearofexperience;
}
private String division;
public void setDivision(String division){
this.division = division;
}
public String getDivision(){
return this.division;
}
private String branch;
public void setBranch(String branch){
this.branch = branch;
}
public String getBranch(){
return this.branch;
}
private Integer branchcode;
public void setBranchcode(Integer branchcode){
this.branchcode = branchcode;
}
public Integer getBranchcode(){
return this.branchcode;
}
private String section;
public void setSection(String section){
this.section = section;
}
public String getSection(){
return this.section;
}
private String telnumber;
public void setTelnumber(String telnumber){
this.telnumber = telnumber;
}
public String getTelnumber(){
return this.telnumber;
}
private Integer accidenttype;
public void setAccidenttype(Integer accidenttype){
this.accidenttype = accidenttype;
}
public Integer getAccidenttype(){
return this.accidenttype;
}
private Integer actionbeforeaccident;
public void setActionbeforeaccident(Integer actionbeforeaccident){
this.actionbeforeaccident = actionbeforeaccident;
}
public Integer getActionbeforeaccident(){
return this.actionbeforeaccident;
}
private Integer causeofaccident;
public void setCauseofaccident(Integer causeofaccident){
this.causeofaccident = causeofaccident;
}
public Integer getCauseofaccident(){
return this.causeofaccident;
}
private Integer staffcategory;
public void setStaffcategory(Integer staffcategory){
this.staffcategory = staffcategory;
}
public Integer getStaffcategory(){
return this.staffcategory;
}
private String reportcode;
public void setReportcode(String reportcode){
this.reportcode = reportcode;
}
public String getReportcode(){
return this.reportcode;
}
private Integer submittedstatus;
public void setSubmittedstatus(Integer submittedstatus){
this.submittedstatus = submittedstatus;
}
public Integer getSubmittedstatus(){
return this.submittedstatus;
}
private String reportname;
public void setReportname(String reportname){
this.reportname = reportname;
}
public String getReportname(){
return this.reportname;
}
private Date submitteddate;
public void setSubmitteddate(Date submitteddate){
this.submitteddate = submitteddate;
}
public Date getSubmitteddate(){
return this.submitteddate;
}
private boolean submitteddateIsValid = false;
public void setSubmitteddateIsValid(boolean submitteddateIsValid){
this.submitteddateIsValid = submitteddateIsValid;
}
public boolean isSubmitteddateIsValid(){
return this.submitteddateIsValid;
}
private java.lang.String submitteddateAsRawString ="";
public java.lang.String getSubmitteddateAsString(){
    return (submitteddate== null) ? null : format.format(submitteddate);
}
public void setSubmitteddateAsString(java.lang.String submitteddate){
	this.submitteddateIsValid = true;
	this.submitteddateAsRawString = submitteddate;
try{
		if(StringUtils.isNotBlank(submitteddate)){ format.parse(submitteddate);}
}catch (java.text.ParseException pe){
this.submitteddateIsValid = false;
}
	if(submitteddateIsValid){
		try {
			this.submitteddate = (org.apache.commons.lang.StringUtils.isBlank(submitteddate)) ? null : format.parse(submitteddate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setSubmitteddateAsRawString(java.lang.String submitteddate){
	this.submitteddateAsRawString = submitteddate;
}

public String getSubmitteddateAsRawString(){
return this.submitteddateAsRawString;
}
private Integer staff;
public void setStaff(Integer staff){
this.staff = staff;
}
public Integer getStaff(){
return this.staff;
}
private Date time;
public void setTime(Date time){
this.time = time;
}
public Date getTime(){
return this.time;
}
private boolean timeIsValid = false;
public void setTimeIsValid(boolean timeIsValid){
this.timeIsValid = timeIsValid;
}
public boolean isTimeIsValid(){
return this.timeIsValid;
}
private java.lang.String timeAsRawString ="";
public java.lang.String getTimeAsString(){
    return (time== null) ? null : format.format(time);
}
public void setTimeAsString(java.lang.String time){
	this.timeIsValid = true;
	this.timeAsRawString = time;
try{
		if(StringUtils.isNotBlank(time)){ format.parse(time);}
}catch (java.text.ParseException pe){
this.timeIsValid = false;
}
	if(timeIsValid){
		try {
			this.time = (org.apache.commons.lang.StringUtils.isBlank(time)) ? null : format.parse(time);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setTimeAsRawString(java.lang.String time){
	this.timeAsRawString = time;
}

public String getTimeAsRawString(){
return this.timeAsRawString;
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
private String address;
public void setAddress(String address){
this.address = address;
}
public String getAddress(){
return this.address;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	roadview =false;
	intersection =false;
	signal =false;
	cargo =false;
	actionofsaftydriving =false;
}
}
