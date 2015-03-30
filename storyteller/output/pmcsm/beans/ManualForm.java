package net.pmcsm.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ManualForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private String type;
public void setType(String type){
this.type = type;
}
public String getType(){
return this.type;
}
private String description;
public void setDescription(String description){
this.description = description;
}
public String getDescription(){
return this.description;
}
private Integer id;
public void setId(Integer id){
this.id = id;
}
public Integer getId(){
return this.id;
}
private Integer next;
public void setNext(Integer next){
this.next = next;
}
public Integer getNext(){
return this.next;
}
private String code;
public void setCode(String code){
this.code = code;
}
public String getCode(){
return this.code;
}
private Integer prev;
public void setPrev(Integer prev){
this.prev = prev;
}
public Integer getPrev(){
return this.prev;
}
private int weight;
public void setWeight(int weight){
this.weight = weight;
}
public int getWeight(){
return this.weight;
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
private boolean pmcdone;
public void setPmcdone(boolean pmcdone){
this.pmcdone = pmcdone;
}
public boolean isPmcdone(){
return this.pmcdone;
}
private boolean psndone;
public void setPsndone(boolean psndone){
this.psndone = psndone;
}
public boolean isPsndone(){
return this.psndone;
}
private Date masterdeadline;
public void setMasterdeadline(Date masterdeadline){
this.masterdeadline = masterdeadline;
}
public Date getMasterdeadline(){
return this.masterdeadline;
}
private boolean masterdeadlineIsValid = false;
public void setMasterdeadlineIsValid(boolean masterdeadlineIsValid){
this.masterdeadlineIsValid = masterdeadlineIsValid;
}
public boolean isMasterdeadlineIsValid(){
return this.masterdeadlineIsValid;
}
private java.lang.String masterdeadlineAsRawString ="";
public java.lang.String getMasterdeadlineAsString(){
    return (masterdeadline== null) ? null : format.format(masterdeadline);
}
public void setMasterdeadlineAsString(java.lang.String masterdeadline){
	this.masterdeadlineIsValid = true;
	this.masterdeadlineAsRawString = masterdeadline;
try{
		if(StringUtils.isNotBlank(masterdeadline)){ format.parse(masterdeadline);}
}catch (java.text.ParseException pe){
this.masterdeadlineIsValid = false;
}
	if(masterdeadlineIsValid){
		try {
			this.masterdeadline = (org.apache.commons.lang.StringUtils.isBlank(masterdeadline)) ? null : format.parse(masterdeadline);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setMasterdeadlineAsRawString(java.lang.String masterdeadline){
	this.masterdeadlineAsRawString = masterdeadline;
}

public String getMasterdeadlineAsRawString(){
return this.masterdeadlineAsRawString;
}
private Date temprarymp;
public void setTemprarymp(Date temprarymp){
this.temprarymp = temprarymp;
}
public Date getTemprarymp(){
return this.temprarymp;
}
private boolean temprarympIsValid = false;
public void setTemprarympIsValid(boolean temprarympIsValid){
this.temprarympIsValid = temprarympIsValid;
}
public boolean isTemprarympIsValid(){
return this.temprarympIsValid;
}
private java.lang.String temprarympAsRawString ="";
public java.lang.String getTemprarympAsString(){
    return (temprarymp== null) ? null : format.format(temprarymp);
}
public void setTemprarympAsString(java.lang.String temprarymp){
	this.temprarympIsValid = true;
	this.temprarympAsRawString = temprarymp;
try{
		if(StringUtils.isNotBlank(temprarymp)){ format.parse(temprarymp);}
}catch (java.text.ParseException pe){
this.temprarympIsValid = false;
}
	if(temprarympIsValid){
		try {
			this.temprarymp = (org.apache.commons.lang.StringUtils.isBlank(temprarymp)) ? null : format.parse(temprarymp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setTemprarympAsRawString(java.lang.String temprarymp){
	this.temprarympAsRawString = temprarymp;
}

public String getTemprarympAsRawString(){
return this.temprarympAsRawString;
}
private int earningsyear;
public void setEarningsyear(int earningsyear){
this.earningsyear = earningsyear;
}
public int getEarningsyear(){
return this.earningsyear;
}
private int earningsmonth;
public void setEarningsmonth(int earningsmonth){
this.earningsmonth = earningsmonth;
}
public int getEarningsmonth(){
return this.earningsmonth;
}
private String abroaddomestic;
public void setAbroaddomestic(String abroaddomestic){
this.abroaddomestic = abroaddomestic;
}
public String getAbroaddomestic(){
return this.abroaddomestic;
}
private String creationscope;
public void setCreationscope(String creationscope){
this.creationscope = creationscope;
}
public String getCreationscope(){
return this.creationscope;
}
private String productname;
public void setProductname(String productname){
this.productname = productname;
}
public String getProductname(){
return this.productname;
}
private int pagenum;
public void setPagenum(int pagenum){
this.pagenum = pagenum;
}
public int getPagenum(){
return this.pagenum;
}
private int totalpagenum;
public void setTotalpagenum(int totalpagenum){
this.totalpagenum = totalpagenum;
}
public int getTotalpagenum(){
return this.totalpagenum;
}
private String desconmodification;
public void setDesconmodification(String desconmodification){
this.desconmodification = desconmodification;
}
public String getDesconmodification(){
return this.desconmodification;
}
private String printingmethod;
public void setPrintingmethod(String printingmethod){
this.printingmethod = printingmethod;
}
public String getPrintingmethod(){
return this.printingmethod;
}
private String mechanical;
public void setMechanical(String mechanical){
this.mechanical = mechanical;
}
public String getMechanical(){
return this.mechanical;
}
private String printer;
public void setPrinter(String printer){
this.printer = printer;
}
public String getPrinter(){
return this.printer;
}
private boolean interim;
public void setInterim(boolean interim){
this.interim = interim;
}
public boolean isInterim(){
return this.interim;
}
private String kokunaihaihukubun;
public void setKokunaihaihukubun(String kokunaihaihukubun){
this.kokunaihaihukubun = kokunaihaihukubun;
}
public String getKokunaihaihukubun(){
return this.kokunaihaihukubun;
}
private Date pdfdeadlinedate;
public void setPdfdeadlinedate(Date pdfdeadlinedate){
this.pdfdeadlinedate = pdfdeadlinedate;
}
public Date getPdfdeadlinedate(){
return this.pdfdeadlinedate;
}
private boolean pdfdeadlinedateIsValid = false;
public void setPdfdeadlinedateIsValid(boolean pdfdeadlinedateIsValid){
this.pdfdeadlinedateIsValid = pdfdeadlinedateIsValid;
}
public boolean isPdfdeadlinedateIsValid(){
return this.pdfdeadlinedateIsValid;
}
private java.lang.String pdfdeadlinedateAsRawString ="";
public java.lang.String getPdfdeadlinedateAsString(){
    return (pdfdeadlinedate== null) ? null : format.format(pdfdeadlinedate);
}
public void setPdfdeadlinedateAsString(java.lang.String pdfdeadlinedate){
	this.pdfdeadlinedateIsValid = true;
	this.pdfdeadlinedateAsRawString = pdfdeadlinedate;
try{
		if(StringUtils.isNotBlank(pdfdeadlinedate)){ format.parse(pdfdeadlinedate);}
}catch (java.text.ParseException pe){
this.pdfdeadlinedateIsValid = false;
}
	if(pdfdeadlinedateIsValid){
		try {
			this.pdfdeadlinedate = (org.apache.commons.lang.StringUtils.isBlank(pdfdeadlinedate)) ? null : format.parse(pdfdeadlinedate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setPdfdeadlinedateAsRawString(java.lang.String pdfdeadlinedate){
	this.pdfdeadlinedateAsRawString = pdfdeadlinedate;
}

public String getPdfdeadlinedateAsRawString(){
return this.pdfdeadlinedateAsRawString;
}
private boolean deliverytype1;
public void setDeliverytype1(boolean deliverytype1){
this.deliverytype1 = deliverytype1;
}
public boolean isDeliverytype1(){
return this.deliverytype1;
}
private boolean deliverytype2;
public void setDeliverytype2(boolean deliverytype2){
this.deliverytype2 = deliverytype2;
}
public boolean isDeliverytype2(){
return this.deliverytype2;
}
private boolean deliverytype3;
public void setDeliverytype3(boolean deliverytype3){
this.deliverytype3 = deliverytype3;
}
public boolean isDeliverytype3(){
return this.deliverytype3;
}
private int wpc;
public void setWpc(int wpc){
this.wpc = wpc;
}
public int getWpc(){
return this.wpc;
}
private int othersprintnum;
public void setOthersprintnum(int othersprintnum){
this.othersprintnum = othersprintnum;
}
public int getOthersprintnum(){
return this.othersprintnum;
}
private int totalprintnum;
public void setTotalprintnum(int totalprintnum){
this.totalprintnum = totalprintnum;
}
public int getTotalprintnum(){
return this.totalprintnum;
}
private String mechanicalmaker;
public void setMechanicalmaker(String mechanicalmaker){
this.mechanicalmaker = mechanicalmaker;
}
public String getMechanicalmaker(){
return this.mechanicalmaker;
}
private int websales;
public void setWebsales(int websales){
this.websales = websales;
}
public int getWebsales(){
return this.websales;
}
private int icpage;
public void setIcpage(int icpage){
this.icpage = icpage;
}
public int getIcpage(){
return this.icpage;
}
private int icsales;
public void setIcsales(int icsales){
this.icsales = icsales;
}
public int getIcsales(){
return this.icsales;
}
private int gaihansales;
public void setGaihansales(int gaihansales){
this.gaihansales = gaihansales;
}
public int getGaihansales(){
return this.gaihansales;
}
private boolean psnready;
public void setPsnready(boolean psnready){
this.psnready = psnready;
}
public boolean isPsnready(){
return this.psnready;
}
private int bunit;
public void setBunit(int bunit){
this.bunit = bunit;
}
public int getBunit(){
return this.bunit;
}
private int cost;
public void setCost(int cost){
this.cost = cost;
}
public int getCost(){
return this.cost;
}
private int icunit;
public void setIcunit(int icunit){
this.icunit = icunit;
}
public int getIcunit(){
return this.icunit;
}
private boolean accepted;
public void setAccepted(boolean accepted){
this.accepted = accepted;
}
public boolean isAccepted(){
return this.accepted;
}
private int printingcost;
public void setPrintingcost(int printingcost){
this.printingcost = printingcost;
}
public int getPrintingcost(){
return this.printingcost;
}
private String departmentcode;
public void setDepartmentcode(String departmentcode){
this.departmentcode = departmentcode;
}
public String getDepartmentcode(){
return this.departmentcode;
}
private String typeforbusiness;
public void setTypeforbusiness(String typeforbusiness){
this.typeforbusiness = typeforbusiness;
}
public String getTypeforbusiness(){
return this.typeforbusiness;
}
private String purchasecode;
public void setPurchasecode(String purchasecode){
this.purchasecode = purchasecode;
}
public String getPurchasecode(){
return this.purchasecode;
}
private String exportcontrol;
public void setExportcontrol(String exportcontrol){
this.exportcontrol = exportcontrol;
}
public String getExportcontrol(){
return this.exportcontrol;
}
private String exporttradecontrolordinance;
public void setExporttradecontrolordinance(String exporttradecontrolordinance){
this.exporttradecontrolordinance = exporttradecontrolordinance;
}
public String getExporttradecontrolordinance(){
return this.exporttradecontrolordinance;
}
private String exportregulation;
public void setExportregulation(String exportregulation){
this.exportregulation = exportregulation;
}
public String getExportregulation(){
return this.exportregulation;
}
private int initialcost;
public void setInitialcost(int initialcost){
this.initialcost = initialcost;
}
public int getInitialcost(){
return this.initialcost;
}
private boolean documentrequestinlate;
public void setDocumentrequestinlate(boolean documentrequestinlate){
this.documentrequestinlate = documentrequestinlate;
}
public boolean isDocumentrequestinlate(){
return this.documentrequestinlate;
}
private boolean draftdateinlate;
public void setDraftdateinlate(boolean draftdateinlate){
this.draftdateinlate = draftdateinlate;
}
public boolean isDraftdateinlate(){
return this.draftdateinlate;
}
private boolean finaldraftdateinlate;
public void setFinaldraftdateinlate(boolean finaldraftdateinlate){
this.finaldraftdateinlate = finaldraftdateinlate;
}
public boolean isFinaldraftdateinlate(){
return this.finaldraftdateinlate;
}
private boolean deadlineinlatenotmet;
public void setDeadlineinlatenotmet(boolean deadlineinlatenotmet){
this.deadlineinlatenotmet = deadlineinlatenotmet;
}
public boolean isDeadlineinlatenotmet(){
return this.deadlineinlatenotmet;
}
private boolean current;
public void setCurrent(boolean current){
this.current = current;
}
public boolean isCurrent(){
return this.current;
}
private Date printingdeadline;
public void setPrintingdeadline(Date printingdeadline){
this.printingdeadline = printingdeadline;
}
public Date getPrintingdeadline(){
return this.printingdeadline;
}
private boolean printingdeadlineIsValid = false;
public void setPrintingdeadlineIsValid(boolean printingdeadlineIsValid){
this.printingdeadlineIsValid = printingdeadlineIsValid;
}
public boolean isPrintingdeadlineIsValid(){
return this.printingdeadlineIsValid;
}
private java.lang.String printingdeadlineAsRawString ="";
public java.lang.String getPrintingdeadlineAsString(){
    return (printingdeadline== null) ? null : format.format(printingdeadline);
}
public void setPrintingdeadlineAsString(java.lang.String printingdeadline){
	this.printingdeadlineIsValid = true;
	this.printingdeadlineAsRawString = printingdeadline;
try{
		if(StringUtils.isNotBlank(printingdeadline)){ format.parse(printingdeadline);}
}catch (java.text.ParseException pe){
this.printingdeadlineIsValid = false;
}
	if(printingdeadlineIsValid){
		try {
			this.printingdeadline = (org.apache.commons.lang.StringUtils.isBlank(printingdeadline)) ? null : format.parse(printingdeadline);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setPrintingdeadlineAsRawString(java.lang.String printingdeadline){
	this.printingdeadlineAsRawString = printingdeadline;
}

public String getPrintingdeadlineAsRawString(){
return this.printingdeadlineAsRawString;
}
private String memo;
public void setMemo(String memo){
this.memo = memo;
}
public String getMemo(){
return this.memo;
}
private boolean uketsuke;
public void setUketsuke(boolean uketsuke){
this.uketsuke = uketsuke;
}
public boolean isUketsuke(){
return this.uketsuke;
}
private boolean gaihifirst;
public void setGaihifirst(boolean gaihifirst){
this.gaihifirst = gaihifirst;
}
public boolean isGaihifirst(){
return this.gaihifirst;
}
private boolean gaihisecound;
public void setGaihisecound(boolean gaihisecound){
this.gaihisecound = gaihisecound;
}
public boolean isGaihisecound(){
return this.gaihisecound;
}
private boolean pmregisted;
public void setPmregisted(boolean pmregisted){
this.pmregisted = pmregisted;
}
public boolean isPmregisted(){
return this.pmregisted;
}
private boolean ordershiped;
public void setOrdershiped(boolean ordershiped){
this.ordershiped = ordershiped;
}
public boolean isOrdershiped(){
return this.ordershiped;
}
private boolean pdfchecked;
public void setPdfchecked(boolean pdfchecked){
this.pdfchecked = pdfchecked;
}
public boolean isPdfchecked(){
return this.pdfchecked;
}
private boolean pdfinserted;
public void setPdfinserted(boolean pdfinserted){
this.pdfinserted = pdfinserted;
}
public boolean isPdfinserted(){
return this.pdfinserted;
}
private boolean reserved;
public void setReserved(boolean reserved){
this.reserved = reserved;
}
public boolean isReserved(){
return this.reserved;
}
private boolean orderrecieved;
public void setOrderrecieved(boolean orderrecieved){
this.orderrecieved = orderrecieved;
}
public boolean isOrderrecieved(){
return this.orderrecieved;
}
private String serialnumber;
public void setSerialnumber(String serialnumber){
this.serialnumber = serialnumber;
}
public String getSerialnumber(){
return this.serialnumber;
}
private boolean pmcmodified;
public void setPmcmodified(boolean pmcmodified){
this.pmcmodified = pmcmodified;
}
public boolean isPmcmodified(){
return this.pmcmodified;
}
private boolean pmcmodifiedpagenum;
public void setPmcmodifiedpagenum(boolean pmcmodifiedpagenum){
this.pmcmodifiedpagenum = pmcmodifiedpagenum;
}
public boolean isPmcmodifiedpagenum(){
return this.pmcmodifiedpagenum;
}
private Date psnreadydate;
public void setPsnreadydate(Date psnreadydate){
this.psnreadydate = psnreadydate;
}
public Date getPsnreadydate(){
return this.psnreadydate;
}
private boolean psnreadydateIsValid = false;
public void setPsnreadydateIsValid(boolean psnreadydateIsValid){
this.psnreadydateIsValid = psnreadydateIsValid;
}
public boolean isPsnreadydateIsValid(){
return this.psnreadydateIsValid;
}
private java.lang.String psnreadydateAsRawString ="";
public java.lang.String getPsnreadydateAsString(){
    return (psnreadydate== null) ? null : format.format(psnreadydate);
}
public void setPsnreadydateAsString(java.lang.String psnreadydate){
	this.psnreadydateIsValid = true;
	this.psnreadydateAsRawString = psnreadydate;
try{
		if(StringUtils.isNotBlank(psnreadydate)){ format.parse(psnreadydate);}
}catch (java.text.ParseException pe){
this.psnreadydateIsValid = false;
}
	if(psnreadydateIsValid){
		try {
			this.psnreadydate = (org.apache.commons.lang.StringUtils.isBlank(psnreadydate)) ? null : format.parse(psnreadydate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setPsnreadydateAsRawString(java.lang.String psnreadydate){
	this.psnreadydateAsRawString = psnreadydate;
}

public String getPsnreadydateAsRawString(){
return this.psnreadydateAsRawString;
}
private String memotopsn;
public void setMemotopsn(String memotopsn){
this.memotopsn = memotopsn;
}
public String getMemotopsn(){
return this.memotopsn;
}
private Date pdfdeadlineforpsndate;
public void setPdfdeadlineforpsndate(Date pdfdeadlineforpsndate){
this.pdfdeadlineforpsndate = pdfdeadlineforpsndate;
}
public Date getPdfdeadlineforpsndate(){
return this.pdfdeadlineforpsndate;
}
private boolean pdfdeadlineforpsndateIsValid = false;
public void setPdfdeadlineforpsndateIsValid(boolean pdfdeadlineforpsndateIsValid){
this.pdfdeadlineforpsndateIsValid = pdfdeadlineforpsndateIsValid;
}
public boolean isPdfdeadlineforpsndateIsValid(){
return this.pdfdeadlineforpsndateIsValid;
}
private java.lang.String pdfdeadlineforpsndateAsRawString ="";
public java.lang.String getPdfdeadlineforpsndateAsString(){
    return (pdfdeadlineforpsndate== null) ? null : format.format(pdfdeadlineforpsndate);
}
public void setPdfdeadlineforpsndateAsString(java.lang.String pdfdeadlineforpsndate){
	this.pdfdeadlineforpsndateIsValid = true;
	this.pdfdeadlineforpsndateAsRawString = pdfdeadlineforpsndate;
try{
		if(StringUtils.isNotBlank(pdfdeadlineforpsndate)){ format.parse(pdfdeadlineforpsndate);}
}catch (java.text.ParseException pe){
this.pdfdeadlineforpsndateIsValid = false;
}
	if(pdfdeadlineforpsndateIsValid){
		try {
			this.pdfdeadlineforpsndate = (org.apache.commons.lang.StringUtils.isBlank(pdfdeadlineforpsndate)) ? null : format.parse(pdfdeadlineforpsndate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setPdfdeadlineforpsndateAsRawString(java.lang.String pdfdeadlineforpsndate){
	this.pdfdeadlineforpsndateAsRawString = pdfdeadlineforpsndate;
}

public String getPdfdeadlineforpsndateAsRawString(){
return this.pdfdeadlineforpsndateAsRawString;
}
private Date accepteddate;
public void setAccepteddate(Date accepteddate){
this.accepteddate = accepteddate;
}
public Date getAccepteddate(){
return this.accepteddate;
}
private boolean accepteddateIsValid = false;
public void setAccepteddateIsValid(boolean accepteddateIsValid){
this.accepteddateIsValid = accepteddateIsValid;
}
public boolean isAccepteddateIsValid(){
return this.accepteddateIsValid;
}
private java.lang.String accepteddateAsRawString ="";
public java.lang.String getAccepteddateAsString(){
    return (accepteddate== null) ? null : format.format(accepteddate);
}
public void setAccepteddateAsString(java.lang.String accepteddate){
	this.accepteddateIsValid = true;
	this.accepteddateAsRawString = accepteddate;
try{
		if(StringUtils.isNotBlank(accepteddate)){ format.parse(accepteddate);}
}catch (java.text.ParseException pe){
this.accepteddateIsValid = false;
}
	if(accepteddateIsValid){
		try {
			this.accepteddate = (org.apache.commons.lang.StringUtils.isBlank(accepteddate)) ? null : format.parse(accepteddate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setAccepteddateAsRawString(java.lang.String accepteddate){
	this.accepteddateAsRawString = accepteddate;
}

public String getAccepteddateAsRawString(){
return this.accepteddateAsRawString;
}
private Date pmregistdate;
public void setPmregistdate(Date pmregistdate){
this.pmregistdate = pmregistdate;
}
public Date getPmregistdate(){
return this.pmregistdate;
}
private boolean pmregistdateIsValid = false;
public void setPmregistdateIsValid(boolean pmregistdateIsValid){
this.pmregistdateIsValid = pmregistdateIsValid;
}
public boolean isPmregistdateIsValid(){
return this.pmregistdateIsValid;
}
private java.lang.String pmregistdateAsRawString ="";
public java.lang.String getPmregistdateAsString(){
    return (pmregistdate== null) ? null : format.format(pmregistdate);
}
public void setPmregistdateAsString(java.lang.String pmregistdate){
	this.pmregistdateIsValid = true;
	this.pmregistdateAsRawString = pmregistdate;
try{
		if(StringUtils.isNotBlank(pmregistdate)){ format.parse(pmregistdate);}
}catch (java.text.ParseException pe){
this.pmregistdateIsValid = false;
}
	if(pmregistdateIsValid){
		try {
			this.pmregistdate = (org.apache.commons.lang.StringUtils.isBlank(pmregistdate)) ? null : format.parse(pmregistdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setPmregistdateAsRawString(java.lang.String pmregistdate){
	this.pmregistdateAsRawString = pmregistdate;
}

public String getPmregistdateAsRawString(){
return this.pmregistdateAsRawString;
}
private Date orderdate;
public void setOrderdate(Date orderdate){
this.orderdate = orderdate;
}
public Date getOrderdate(){
return this.orderdate;
}
private boolean orderdateIsValid = false;
public void setOrderdateIsValid(boolean orderdateIsValid){
this.orderdateIsValid = orderdateIsValid;
}
public boolean isOrderdateIsValid(){
return this.orderdateIsValid;
}
private java.lang.String orderdateAsRawString ="";
public java.lang.String getOrderdateAsString(){
    return (orderdate== null) ? null : format.format(orderdate);
}
public void setOrderdateAsString(java.lang.String orderdate){
	this.orderdateIsValid = true;
	this.orderdateAsRawString = orderdate;
try{
		if(StringUtils.isNotBlank(orderdate)){ format.parse(orderdate);}
}catch (java.text.ParseException pe){
this.orderdateIsValid = false;
}
	if(orderdateIsValid){
		try {
			this.orderdate = (org.apache.commons.lang.StringUtils.isBlank(orderdate)) ? null : format.parse(orderdate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setOrderdateAsRawString(java.lang.String orderdate){
	this.orderdateAsRawString = orderdate;
}

public String getOrderdateAsRawString(){
return this.orderdateAsRawString;
}
private boolean psnaccepted;
public void setPsnaccepted(boolean psnaccepted){
this.psnaccepted = psnaccepted;
}
public boolean isPsnaccepted(){
return this.psnaccepted;
}
private Date printingdeadlineforpsn;
public void setPrintingdeadlineforpsn(Date printingdeadlineforpsn){
this.printingdeadlineforpsn = printingdeadlineforpsn;
}
public Date getPrintingdeadlineforpsn(){
return this.printingdeadlineforpsn;
}
private boolean printingdeadlineforpsnIsValid = false;
public void setPrintingdeadlineforpsnIsValid(boolean printingdeadlineforpsnIsValid){
this.printingdeadlineforpsnIsValid = printingdeadlineforpsnIsValid;
}
public boolean isPrintingdeadlineforpsnIsValid(){
return this.printingdeadlineforpsnIsValid;
}
private java.lang.String printingdeadlineforpsnAsRawString ="";
public java.lang.String getPrintingdeadlineforpsnAsString(){
    return (printingdeadlineforpsn== null) ? null : format.format(printingdeadlineforpsn);
}
public void setPrintingdeadlineforpsnAsString(java.lang.String printingdeadlineforpsn){
	this.printingdeadlineforpsnIsValid = true;
	this.printingdeadlineforpsnAsRawString = printingdeadlineforpsn;
try{
		if(StringUtils.isNotBlank(printingdeadlineforpsn)){ format.parse(printingdeadlineforpsn);}
}catch (java.text.ParseException pe){
this.printingdeadlineforpsnIsValid = false;
}
	if(printingdeadlineforpsnIsValid){
		try {
			this.printingdeadlineforpsn = (org.apache.commons.lang.StringUtils.isBlank(printingdeadlineforpsn)) ? null : format.parse(printingdeadlineforpsn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setPrintingdeadlineforpsnAsRawString(java.lang.String printingdeadlineforpsn){
	this.printingdeadlineforpsnAsRawString = printingdeadlineforpsn;
}

public String getPrintingdeadlineforpsnAsRawString(){
return this.printingdeadlineforpsnAsRawString;
}
private boolean bpagemodificationaccepted;
public void setBpagemodificationaccepted(boolean bpagemodificationaccepted){
this.bpagemodificationaccepted = bpagemodificationaccepted;
}
public boolean isBpagemodificationaccepted(){
return this.bpagemodificationaccepted;
}
private boolean bpagemodificationreceived;
public void setBpagemodificationreceived(boolean bpagemodificationreceived){
this.bpagemodificationreceived = bpagemodificationreceived;
}
public boolean isBpagemodificationreceived(){
return this.bpagemodificationreceived;
}
private boolean hasicinfo;
public void setHasicinfo(boolean hasicinfo){
this.hasicinfo = hasicinfo;
}
public boolean isHasicinfo(){
return this.hasicinfo;
}
private boolean bpagemodificationregisted;
public void setBpagemodificationregisted(boolean bpagemodificationregisted){
this.bpagemodificationregisted = bpagemodificationregisted;
}
public boolean isBpagemodificationregisted(){
return this.bpagemodificationregisted;
}
private boolean bpagemodified;
public void setBpagemodified(boolean bpagemodified){
this.bpagemodified = bpagemodified;
}
public boolean isBpagemodified(){
return this.bpagemodified;
}
private boolean gaihifirstaccepted;
public void setGaihifirstaccepted(boolean gaihifirstaccepted){
this.gaihifirstaccepted = gaihifirstaccepted;
}
public boolean isGaihifirstaccepted(){
return this.gaihifirstaccepted;
}
private boolean bpagemodificationrequested;
public void setBpagemodificationrequested(boolean bpagemodificationrequested){
this.bpagemodificationrequested = bpagemodificationrequested;
}
public boolean isBpagemodificationrequested(){
return this.bpagemodificationrequested;
}
private Integer paymentUnit;
public void setPaymentUnit(Integer paymentUnit){
this.paymentUnit = paymentUnit;
}
public Integer getPaymentUnit(){
return this.paymentUnit;
}
private Integer icPaymentUnit;
public void setIcPaymentUnit(Integer icPaymentUnit){
this.icPaymentUnit = icPaymentUnit;
}
public Integer getIcPaymentUnit(){
return this.icPaymentUnit;
}
private Integer parentProduct;
public void setParentProduct(Integer parentProduct){
this.parentProduct = parentProduct;
}
public Integer getParentProduct(){
return this.parentProduct;
}
private String webcode;
public void setWebcode(String webcode){
this.webcode = webcode;
}
public String getWebcode(){
return this.webcode;
}
private String webversion;
public void setWebversion(String webversion){
this.webversion = webversion;
}
public String getWebversion(){
return this.webversion;
}
private Date webdeadline;
public void setWebdeadline(Date webdeadline){
this.webdeadline = webdeadline;
}
public Date getWebdeadline(){
return this.webdeadline;
}
private boolean webdeadlineIsValid = false;
public void setWebdeadlineIsValid(boolean webdeadlineIsValid){
this.webdeadlineIsValid = webdeadlineIsValid;
}
public boolean isWebdeadlineIsValid(){
return this.webdeadlineIsValid;
}
private java.lang.String webdeadlineAsRawString ="";
public java.lang.String getWebdeadlineAsString(){
    return (webdeadline== null) ? null : format.format(webdeadline);
}
public void setWebdeadlineAsString(java.lang.String webdeadline){
	this.webdeadlineIsValid = true;
	this.webdeadlineAsRawString = webdeadline;
try{
		if(StringUtils.isNotBlank(webdeadline)){ format.parse(webdeadline);}
}catch (java.text.ParseException pe){
this.webdeadlineIsValid = false;
}
	if(webdeadlineIsValid){
		try {
			this.webdeadline = (org.apache.commons.lang.StringUtils.isBlank(webdeadline)) ? null : format.parse(webdeadline);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setWebdeadlineAsRawString(java.lang.String webdeadline){
	this.webdeadlineAsRawString = webdeadline;
}

public String getWebdeadlineAsRawString(){
return this.webdeadlineAsRawString;
}
private int webpagenum;
public void setWebpagenum(int webpagenum){
this.webpagenum = webpagenum;
}
public int getWebpagenum(){
return this.webpagenum;
}
private Integer icCsvFile;
public void setIcCsvFile(Integer icCsvFile){
this.icCsvFile = icCsvFile;
}
public Integer getIcCsvFile(){
return this.icCsvFile;
}
private boolean icprocessdone;
public void setIcprocessdone(boolean icprocessdone){
this.icprocessdone = icprocessdone;
}
public boolean isIcprocessdone(){
return this.icprocessdone;
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
private String psnsmsakusei;
public void setPsnsmsakusei(String psnsmsakusei){
this.psnsmsakusei = psnsmsakusei;
}
public String getPsnsmsakusei(){
return this.psnsmsakusei;
}
private boolean web;
public void setWeb(boolean web){
this.web = web;
}
public boolean isWeb(){
return this.web;
}
private boolean pdf;
public void setPdf(boolean pdf){
this.pdf = pdf;
}
public boolean isPdf(){
return this.pdf;
}
private boolean printing;
public void setPrinting(boolean printing){
this.printing = printing;
}
public boolean isPrinting(){
return this.printing;
}
private int version;
public void setVersion(int version){
this.version = version;
}
public int getVersion(){
return this.version;
}
private String assignmenthistory;
public void setAssignmenthistory(String assignmenthistory){
this.assignmenthistory = assignmenthistory;
}
public String getAssignmenthistory(){
return this.assignmenthistory;
}
private boolean psnreadyatleastonce;
public void setPsnreadyatleastonce(boolean psnreadyatleastonce){
this.psnreadyatleastonce = psnreadyatleastonce;
}
public boolean isPsnreadyatleastonce(){
return this.psnreadyatleastonce;
}
private Date exporttradecontrolordinancedate;
public void setExporttradecontrolordinancedate(Date exporttradecontrolordinancedate){
this.exporttradecontrolordinancedate = exporttradecontrolordinancedate;
}
public Date getExporttradecontrolordinancedate(){
return this.exporttradecontrolordinancedate;
}
private boolean exporttradecontrolordinancedateIsValid = false;
public void setExporttradecontrolordinancedateIsValid(boolean exporttradecontrolordinancedateIsValid){
this.exporttradecontrolordinancedateIsValid = exporttradecontrolordinancedateIsValid;
}
public boolean isExporttradecontrolordinancedateIsValid(){
return this.exporttradecontrolordinancedateIsValid;
}
private java.lang.String exporttradecontrolordinancedateAsRawString ="";
public java.lang.String getExporttradecontrolordinancedateAsString(){
    return (exporttradecontrolordinancedate== null) ? null : format.format(exporttradecontrolordinancedate);
}
public void setExporttradecontrolordinancedateAsString(java.lang.String exporttradecontrolordinancedate){
	this.exporttradecontrolordinancedateIsValid = true;
	this.exporttradecontrolordinancedateAsRawString = exporttradecontrolordinancedate;
try{
		if(StringUtils.isNotBlank(exporttradecontrolordinancedate)){ format.parse(exporttradecontrolordinancedate);}
}catch (java.text.ParseException pe){
this.exporttradecontrolordinancedateIsValid = false;
}
	if(exporttradecontrolordinancedateIsValid){
		try {
			this.exporttradecontrolordinancedate = (org.apache.commons.lang.StringUtils.isBlank(exporttradecontrolordinancedate)) ? null : format.parse(exporttradecontrolordinancedate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setExporttradecontrolordinancedateAsRawString(java.lang.String exporttradecontrolordinancedate){
	this.exporttradecontrolordinancedateAsRawString = exporttradecontrolordinancedate;
}

public String getExporttradecontrolordinancedateAsRawString(){
return this.exporttradecontrolordinancedateAsRawString;
}
private String exporttradecontrolordinanceno;
public void setExporttradecontrolordinanceno(String exporttradecontrolordinanceno){
this.exporttradecontrolordinanceno = exporttradecontrolordinanceno;
}
public String getExporttradecontrolordinanceno(){
return this.exporttradecontrolordinanceno;
}
private Date mp;
public void setMp(Date mp){
this.mp = mp;
}
public Date getMp(){
return this.mp;
}
private boolean mpIsValid = false;
public void setMpIsValid(boolean mpIsValid){
this.mpIsValid = mpIsValid;
}
public boolean isMpIsValid(){
return this.mpIsValid;
}
private java.lang.String mpAsRawString ="";
public java.lang.String getMpAsString(){
    return (mp== null) ? null : format.format(mp);
}
public void setMpAsString(java.lang.String mp){
	this.mpIsValid = true;
	this.mpAsRawString = mp;
try{
		if(StringUtils.isNotBlank(mp)){ format.parse(mp);}
}catch (java.text.ParseException pe){
this.mpIsValid = false;
}
	if(mpIsValid){
		try {
			this.mp = (org.apache.commons.lang.StringUtils.isBlank(mp)) ? null : format.parse(mp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setMpAsRawString(java.lang.String mp){
	this.mpAsRawString = mp;
}

public String getMpAsRawString(){
return this.mpAsRawString;
}
private int currentbape;
public void setCurrentbape(int currentbape){
this.currentbape = currentbape;
}
public int getCurrentbape(){
return this.currentbape;
}
private boolean icinfocompleted;
public void setIcinfocompleted(boolean icinfocompleted){
this.icinfocompleted = icinfocompleted;
}
public boolean isIcinfocompleted(){
return this.icinfocompleted;
}
private boolean reportwaiting;
public void setReportwaiting(boolean reportwaiting){
this.reportwaiting = reportwaiting;
}
public boolean isReportwaiting(){
return this.reportwaiting;
}
private String content;
public void setContent(String content){
this.content = content;
}
public String getContent(){
return this.content;
}
private int estimation;
public void setEstimation(int estimation){
this.estimation = estimation;
}
public int getEstimation(){
return this.estimation;
}
private int invoice;
public void setInvoice(int invoice){
this.invoice = invoice;
}
public int getInvoice(){
return this.invoice;
}
private Integer comparison;
public void setComparison(Integer comparison){
this.comparison = comparison;
}
public Integer getComparison(){
return this.comparison;
}
private Date psnaccepteddate;
public void setPsnaccepteddate(Date psnaccepteddate){
this.psnaccepteddate = psnaccepteddate;
}
public Date getPsnaccepteddate(){
return this.psnaccepteddate;
}
private boolean psnaccepteddateIsValid = false;
public void setPsnaccepteddateIsValid(boolean psnaccepteddateIsValid){
this.psnaccepteddateIsValid = psnaccepteddateIsValid;
}
public boolean isPsnaccepteddateIsValid(){
return this.psnaccepteddateIsValid;
}
private java.lang.String psnaccepteddateAsRawString ="";
public java.lang.String getPsnaccepteddateAsString(){
    return (psnaccepteddate== null) ? null : format.format(psnaccepteddate);
}
public void setPsnaccepteddateAsString(java.lang.String psnaccepteddate){
	this.psnaccepteddateIsValid = true;
	this.psnaccepteddateAsRawString = psnaccepteddate;
try{
		if(StringUtils.isNotBlank(psnaccepteddate)){ format.parse(psnaccepteddate);}
}catch (java.text.ParseException pe){
this.psnaccepteddateIsValid = false;
}
	if(psnaccepteddateIsValid){
		try {
			this.psnaccepteddate = (org.apache.commons.lang.StringUtils.isBlank(psnaccepteddate)) ? null : format.parse(psnaccepteddate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setPsnaccepteddateAsRawString(java.lang.String psnaccepteddate){
	this.psnaccepteddateAsRawString = psnaccepteddate;
}

public String getPsnaccepteddateAsRawString(){
return this.psnaccepteddateAsRawString;
}
private boolean pmceditable;
public void setPmceditable(boolean pmceditable){
this.pmceditable = pmceditable;
}
public boolean isPmceditable(){
return this.pmceditable;
}
private boolean pmcrequested;
public void setPmcrequested(boolean pmcrequested){
this.pmcrequested = pmcrequested;
}
public boolean isPmcrequested(){
return this.pmcrequested;
}
private Date gaihiacceptancedate;
public void setGaihiacceptancedate(Date gaihiacceptancedate){
this.gaihiacceptancedate = gaihiacceptancedate;
}
public Date getGaihiacceptancedate(){
return this.gaihiacceptancedate;
}
private boolean gaihiacceptancedateIsValid = false;
public void setGaihiacceptancedateIsValid(boolean gaihiacceptancedateIsValid){
this.gaihiacceptancedateIsValid = gaihiacceptancedateIsValid;
}
public boolean isGaihiacceptancedateIsValid(){
return this.gaihiacceptancedateIsValid;
}
private java.lang.String gaihiacceptancedateAsRawString ="";
public java.lang.String getGaihiacceptancedateAsString(){
    return (gaihiacceptancedate== null) ? null : format.format(gaihiacceptancedate);
}
public void setGaihiacceptancedateAsString(java.lang.String gaihiacceptancedate){
	this.gaihiacceptancedateIsValid = true;
	this.gaihiacceptancedateAsRawString = gaihiacceptancedate;
try{
		if(StringUtils.isNotBlank(gaihiacceptancedate)){ format.parse(gaihiacceptancedate);}
}catch (java.text.ParseException pe){
this.gaihiacceptancedateIsValid = false;
}
	if(gaihiacceptancedateIsValid){
		try {
			this.gaihiacceptancedate = (org.apache.commons.lang.StringUtils.isBlank(gaihiacceptancedate)) ? null : format.parse(gaihiacceptancedate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void setGaihiacceptancedateAsRawString(java.lang.String gaihiacceptancedate){
	this.gaihiacceptancedateAsRawString = gaihiacceptancedate;
}

public String getGaihiacceptancedateAsRawString(){
return this.gaihiacceptancedateAsRawString;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	removed =false;
	pmcdone =false;
	psndone =false;
	interim =false;
	deliverytype1 =false;
	deliverytype2 =false;
	deliverytype3 =false;
	psnready =false;
	accepted =false;
	documentrequestinlate =false;
	draftdateinlate =false;
	finaldraftdateinlate =false;
	deadlineinlatenotmet =false;
	current =false;
	uketsuke =false;
	gaihifirst =false;
	gaihisecound =false;
	pmregisted =false;
	ordershiped =false;
	pdfchecked =false;
	pdfinserted =false;
	reserved =false;
	orderrecieved =false;
	pmcmodified =false;
	pmcmodifiedpagenum =false;
	psnaccepted =false;
	bpagemodificationaccepted =false;
	bpagemodificationreceived =false;
	hasicinfo =false;
	bpagemodificationregisted =false;
	bpagemodified =false;
	gaihifirstaccepted =false;
	bpagemodificationrequested =false;
	icprocessdone =false;
	web =false;
	pdf =false;
	printing =false;
	psnreadyatleastonce =false;
	icinfocompleted =false;
	reportwaiting =false;
	pmceditable =false;
	pmcrequested =false;
}
}
