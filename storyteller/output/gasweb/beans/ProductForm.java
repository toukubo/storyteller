package net.gasweb.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ProductForm
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
private boolean printable;
public void setPrintable(boolean printable){
this.printable = printable;
}
public boolean isPrintable(){
return this.printable;
}
private String descriiptionone;
public void setDescriiptionone(String descriiptionone){
this.descriiptionone = descriiptionone;
}
public String getDescriiptionone(){
return this.descriiptionone;
}
private boolean recievedbyim;
public void setRecievedbyim(boolean recievedbyim){
this.recievedbyim = recievedbyim;
}
public boolean isRecievedbyim(){
return this.recievedbyim;
}
private String imcode;
public void setImcode(String imcode){
this.imcode = imcode;
}
public String getImcode(){
return this.imcode;
}
private boolean checked;
public void setChecked(boolean checked){
this.checked = checked;
}
public boolean isChecked(){
return this.checked;
}
private int totalfixedprice;
public void setTotalfixedprice(int totalfixedprice){
this.totalfixedprice = totalfixedprice;
}
public int getTotalfixedprice(){
return this.totalfixedprice;
}
private int tax;
public void setTax(int tax){
this.tax = tax;
}
public int getTax(){
return this.tax;
}
private boolean pub;
public void setPub(boolean pub){
this.pub = pub;
}
public boolean isPub(){
return this.pub;
}
private Integer artist;
public void setArtist(Integer artist){
this.artist = artist;
}
public Integer getArtist(){
return this.artist;
}
private Integer printFile;
public void setPrintFile(Integer printFile){
this.printFile = printFile;
}
public Integer getPrintFile(){
return this.printFile;
}
private Integer site;
public void setSite(Integer site){
this.site = site;
}
public Integer getSite(){
return this.site;
}
private Integer webImageFile;
public void setWebImageFile(Integer webImageFile){
this.webImageFile = webImageFile;
}
public Integer getWebImageFile(){
return this.webImageFile;
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
private int stocknum;
public void setStocknum(int stocknum){
this.stocknum = stocknum;
}
public int getStocknum(){
return this.stocknum;
}
private String jan;
public void setJan(String jan){
this.jan = jan;
}
public String getJan(){
return this.jan;
}
private boolean imrejected;
public void setImrejected(boolean imrejected){
this.imrejected = imrejected;
}
public boolean isImrejected(){
return this.imrejected;
}
private int cost;
public void setCost(int cost){
this.cost = cost;
}
public int getCost(){
return this.cost;
}
private Integer firstbrand;
public void setFirstbrand(Integer firstbrand){
this.firstbrand = firstbrand;
}
public Integer getFirstbrand(){
return this.firstbrand;
}
private Integer secoundbrand;
public void setSecoundbrand(Integer secoundbrand){
this.secoundbrand = secoundbrand;
}
public Integer getSecoundbrand(){
return this.secoundbrand;
}
private String name;
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	printable =false;
	recievedbyim =false;
	checked =false;
	pub =false;
	imrejected =false;
}
}
