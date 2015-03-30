package net.gasbooknet.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class ProductForm
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
{
private static final java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy/MM/dd");static { format.setLenient(true); }private Date date;
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
private Integer intraUser;
public void setIntraUser(Integer intraUser){
this.intraUser = intraUser;
}
public Integer getIntraUser(){
return this.intraUser;
}
private Integer c;
public void setC(Integer c){
this.c = c;
}
public Integer getC(){
return this.c;
}
private Integer work;
public void setWork(Integer work){
this.work = work;
}
public Integer getWork(){
return this.work;
}
private boolean poplular;
public void setPoplular(boolean poplular){
this.poplular = poplular;
}
public boolean isPoplular(){
return this.poplular;
}
private Integer b;
public void setB(Integer b){
this.b = b;
}
public Integer getB(){
return this.b;
}
private Integer a;
public void setA(Integer a){
this.a = a;
}
public Integer getA(){
return this.a;
}
private Integer brand;
public void setBrand(Integer brand){
this.brand = brand;
}
public Integer getBrand(){
return this.brand;
}
private Integer item;
public void setItem(Integer item){
this.item = item;
}
public Integer getItem(){
return this.item;
}
private String code;
public void setCode(String code){
this.code = code;
}
public String getCode(){
return this.code;
}
private int pricewithtax;
public void setPricewithtax(int pricewithtax){
this.pricewithtax = pricewithtax;
}
public int getPricewithtax(){
return this.pricewithtax;
}
private String attachment;
public void setAttachment(String attachment){
this.attachment = attachment;
}
public String getAttachment(){
return this.attachment;
}
private int price;
public void setPrice(int price){
this.price = price;
}
public int getPrice(){
return this.price;
}
private boolean pub;
public void setPub(boolean pub){
this.pub = pub;
}
public boolean isPub(){
return this.pub;
}
private int tax;
public void setTax(int tax){
this.tax = tax;
}
public int getTax(){
return this.tax;
}
private String misc;
public void setMisc(String misc){
this.misc = misc;
}
public String getMisc(){
return this.misc;
}
private String material;
public void setMaterial(String material){
this.material = material;
}
public String getMaterial(){
return this.material;
}
private String descriptiontitle;
public void setDescriptiontitle(String descriptiontitle){
this.descriptiontitle = descriptiontitle;
}
public String getDescriptiontitle(){
return this.descriptiontitle;
}
private int stocknum;
public void setStocknum(int stocknum){
this.stocknum = stocknum;
}
public int getStocknum(){
return this.stocknum;
}
private int totalfixedprice;
public void setTotalfixedprice(int totalfixedprice){
this.totalfixedprice = totalfixedprice;
}
public int getTotalfixedprice(){
return this.totalfixedprice;
}
private int weight;
public void setWeight(int weight){
this.weight = weight;
}
public int getWeight(){
return this.weight;
}
private String attention;
public void setAttention(String attention){
this.attention = attention;
}
public String getAttention(){
return this.attention;
}
private String htmlforoption;
public void setHtmlforoption(String htmlforoption){
this.htmlforoption = htmlforoption;
}
public String getHtmlforoption(){
return this.htmlforoption;
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
private String color;
public void setColor(String color){
this.color = color;
}
public String getColor(){
return this.color;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	poplular =false;
	pub =false;
}
}
