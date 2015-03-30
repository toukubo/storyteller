package net.universe.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class PdfCustomerLabelForm
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
private int zipcodeX;
public void setZipcodeX(int zipcodeX){
this.zipcodeX = zipcodeX;
}
public int getZipcodeX(){
return this.zipcodeX;
}
private int zipcodeY;
public void setZipcodeY(int zipcodeY){
this.zipcodeY = zipcodeY;
}
public int getZipcodeY(){
return this.zipcodeY;
}
private int zipcodeS;
public void setZipcodeS(int zipcodeS){
this.zipcodeS = zipcodeS;
}
public int getZipcodeS(){
return this.zipcodeS;
}
private int addressX;
public void setAddressX(int addressX){
this.addressX = addressX;
}
public int getAddressX(){
return this.addressX;
}
private int addressY;
public void setAddressY(int addressY){
this.addressY = addressY;
}
public int getAddressY(){
return this.addressY;
}
private int addressS;
public void setAddressS(int addressS){
this.addressS = addressS;
}
public int getAddressS(){
return this.addressS;
}
private int companyX;
public void setCompanyX(int companyX){
this.companyX = companyX;
}
public int getCompanyX(){
return this.companyX;
}
private int companyY;
public void setCompanyY(int companyY){
this.companyY = companyY;
}
public int getCompanyY(){
return this.companyY;
}
private int companyS;
public void setCompanyS(int companyS){
this.companyS = companyS;
}
public int getCompanyS(){
return this.companyS;
}
private int positionX;
public void setPositionX(int positionX){
this.positionX = positionX;
}
public int getPositionX(){
return this.positionX;
}
private int positionY;
public void setPositionY(int positionY){
this.positionY = positionY;
}
public int getPositionY(){
return this.positionY;
}
private int positionS;
public void setPositionS(int positionS){
this.positionS = positionS;
}
public int getPositionS(){
return this.positionS;
}
private int nameX;
public void setNameX(int nameX){
this.nameX = nameX;
}
public int getNameX(){
return this.nameX;
}
private int nameY;
public void setNameY(int nameY){
this.nameY = nameY;
}
public int getNameY(){
return this.nameY;
}
private int nameS;
public void setNameS(int nameS){
this.nameS = nameS;
}
public int getNameS(){
return this.nameS;
}
private int invoiceX;
public void setInvoiceX(int invoiceX){
this.invoiceX = invoiceX;
}
public int getInvoiceX(){
return this.invoiceX;
}
private int invoiceY;
public void setInvoiceY(int invoiceY){
this.invoiceY = invoiceY;
}
public int getInvoiceY(){
return this.invoiceY;
}
private int invoiceS;
public void setInvoiceS(int invoiceS){
this.invoiceS = invoiceS;
}
public int getInvoiceS(){
return this.invoiceS;
}
private int invoiceShapeX;
public void setInvoiceShapeX(int invoiceShapeX){
this.invoiceShapeX = invoiceShapeX;
}
public int getInvoiceShapeX(){
return this.invoiceShapeX;
}
private int invoiceShapeY;
public void setInvoiceShapeY(int invoiceShapeY){
this.invoiceShapeY = invoiceShapeY;
}
public int getInvoiceShapeY(){
return this.invoiceShapeY;
}
private int invoiceShapeS;
public void setInvoiceShapeS(int invoiceShapeS){
this.invoiceShapeS = invoiceShapeS;
}
public int getInvoiceShapeS(){
return this.invoiceShapeS;
}
private String title;
public void setTitle(String title){
this.title = title;
}
public String getTitle(){
return this.title;
}
private float pageWidth;
public void setPageWidth(float pageWidth){
this.pageWidth = pageWidth;
}
public float getPageWidth(){
return this.pageWidth;
}
private float pageHeight;
public void setPageHeight(float pageHeight){
this.pageHeight = pageHeight;
}
public float getPageHeight(){
return this.pageHeight;
}
private String zipcodeSeparator;
public void setZipcodeSeparator(String zipcodeSeparator){
this.zipcodeSeparator = zipcodeSeparator;
}
public String getZipcodeSeparator(){
return this.zipcodeSeparator;
}
private int address2X;
public void setAddress2X(int address2X){
this.address2X = address2X;
}
public int getAddress2X(){
return this.address2X;
}
private int address2Y;
public void setAddress2Y(int address2Y){
this.address2Y = address2Y;
}
public int getAddress2Y(){
return this.address2Y;
}
private int address2S;
public void setAddress2S(int address2S){
this.address2S = address2S;
}
public int getAddress2S(){
return this.address2S;
}
private int gapX;
public void setGapX(int gapX){
this.gapX = gapX;
}
public int getGapX(){
return this.gapX;
}
private int gapY;
public void setGapY(int gapY){
this.gapY = gapY;
}
public int getGapY(){
return this.gapY;
}
private boolean gapFlag;
public void setGapFlag(boolean gapFlag){
this.gapFlag = gapFlag;
}
public boolean isGapFlag(){
return this.gapFlag;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	gapFlag =false;
}
}
