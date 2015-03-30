package net.gasweb.beans;
import org.apache.struts.upload.FormFile;
import java.util.Date;
import org.apache.commons.lang.StringUtils;
public class StockTakeForm
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
private Integer product;
public void setProduct(Integer product){
this.product = product;
}
public Integer getProduct(){
return this.product;
}
private boolean matching;
public void setMatching(boolean matching){
this.matching = matching;
}
public boolean isMatching(){
return this.matching;
}
private int stocknumcounted;
public void setStocknumcounted(int stocknumcounted){
this.stocknumcounted = stocknumcounted;
}
public int getStocknumcounted(){
return this.stocknumcounted;
}
private Integer stockTakeReport;
public void setStockTakeReport(Integer stockTakeReport){
this.stockTakeReport = stockTakeReport;
}
public Integer getStockTakeReport(){
return this.stockTakeReport;
}
FormFile formFile = null;
public void setFormFile(FormFile formFile){
this.formFile = formFile;
}
public FormFile getFormFile(){
return this.formFile;
}
public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){	matching =false;
}
}
