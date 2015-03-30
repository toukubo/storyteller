<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ page isELIgnored="false" %>
                    <display:table name="${profitReportOfNewCars}" id="row" requestURI="ProfitReportOfNewCars.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="intraUser" title="intraUser"/>
<display:column media="xml csv excel pdf" property="valueOfActionSales" title="valueOfActionSales"/>
<display:column media="xml csv excel pdf" property="car" title="car"/>
<display:column media="xml csv excel pdf" property="cancel" title="cancel"/>
<display:column media="xml csv excel pdf" property="remain" title="remain"/>
<display:column media="xml csv excel pdf" property="orderno" title="orderno"/>
<display:column media="xml csv excel pdf" property="accepteddate" title="accepteddate"/>
<display:column media="xml csv excel pdf" property="numofcars" title="numofcars"/>
<display:column media="xml csv excel pdf" property="typecode" title="typecode"/>
<display:column media="xml csv excel pdf" property="customername" title="customername"/>
<display:column media="xml csv excel pdf" property="winnerspoint" title="winnerspoint"/>
<display:column media="xml csv excel pdf" property="owntradein" title="owntradein"/>
<display:column media="xml csv excel pdf" property="carlineoftradein" title="carlineoftradein"/>
<display:column media="xml csv excel pdf" property="priceofmaintaxin" title="priceofmaintaxin"/>
<display:column media="xml csv excel pdf" property="profitrateofmain" title="profitrateofmain"/>
<display:column media="xml csv excel pdf" property="priceofwithoptionstaxin" title="priceofwithoptionstaxin"/>
<display:column media="xml csv excel pdf" property="profitrateofwithoptions" title="profitrateofwithoptions"/>
<display:column media="xml csv excel pdf" property="discounttaxin" title="discounttaxin"/>
<display:column media="xml csv excel pdf" property="chargesforregisttaxin" title="chargesforregisttaxin"/>
<display:column media="xml csv excel pdf" property="chargesforregisttaxex" title="chargesforregisttaxex"/>
<display:column media="xml csv excel pdf" property="principalofcredit" title="principalofcredit"/>
<display:column media="xml csv excel pdf" property="profitofcredit" title="profitofcredit"/>
<display:column media="xml csv excel pdf" property="actionforcredit" title="actionforcredit"/>
<display:column media="xml csv excel pdf" property="interest" title="interest"/>
<display:column media="xml csv excel pdf" property="numofpaymentsforcredit" title="numofpaymentsforcredit"/>
<display:column media="xml csv excel pdf" property="feeofintroduction" title="feeofintroduction"/>
<display:column media="xml csv excel pdf" property="submitteddateofordersheet" title="submitteddateofordersheet"/>
<display:column media="xml csv excel pdf" property="submitteddateofparkingspacecertificate" title="submitteddateofparkingspacecertificate"/>
<display:column media="xml csv excel pdf" property="receiptdateofparkingspacecertificate" title="receiptdateofparkingspacecertificate"/>
<display:column media="xml csv excel pdf" property="collecteddateofsealcertificate" title="collecteddateofsealcertificate"/>
<display:column media="xml csv excel pdf" property="collecteddateofproxy" title="collecteddateofproxy"/>
<display:column media="xml csv excel pdf" property="collecteddateofresidencecertificate" title="collecteddateofresidencecertificate"/>
<display:column media="xml csv excel pdf" property="senddateofcreditapplication" title="senddateofcreditapplication"/>
<display:column media="xml csv excel pdf" property="submitteddateofregistrequest" title="submitteddateofregistrequest"/>
<display:column media="xml csv excel pdf" property="registeddate" title="registeddate"/>
<display:column media="xml csv excel pdf" property="sendthankyouletter" title="sendthankyouletter"/>
<display:column media="xml csv excel pdf" property="sendthankyouletterbymanager" title="sendthankyouletterbymanager"/>
<display:column media="xml csv excel pdf" property="employeecodeofregist" title="employeecodeofregist"/>
<display:column media="xml csv excel pdf" property="forecastofregist" title="forecastofregist"/>
<display:column media="xml csv excel pdf" property="carryregist" title="carryregist"/>
<display:column media="xml csv excel pdf" property="collectadvancereceipt" title="collectadvancereceipt"/>
<display:column media="xml csv excel pdf" property="proceeds" title="proceeds"/>
<display:column media="xml csv excel pdf" property="priceoftradein" title="priceoftradein"/>
<display:column media="xml csv excel pdf" property="applicationfee" title="applicationfee"/>
<display:column media="xml csv excel pdf" property="collecteddateofapplicationfee" title="collecteddateofapplicationfee"/>
<display:column media="xml csv excel pdf" property="advancereceipt" title="advancereceipt"/>
<display:column media="xml csv excel pdf" property="collecteddateofadvancereceipt" title="collecteddateofadvancereceipt"/>
<display:column media="xml csv excel pdf" property="remainder" title="remainder"/>
<display:column media="xml csv excel pdf" property="collecteddateofremainder" title="collecteddateofremainder"/>
<display:column media="xml csv excel pdf" property="navigation" title="navigation"/>
<display:column media="xml csv excel pdf" property="companyOfCredit" title="companyOfCredit"/>
<display:column media="xml csv excel pdf" property="police" title="police"/>
<display:column media="xml csv excel pdf" property="improvementReportOfNewCarProfit" title="improvementReportOfNewCarProfit"/>

                    </display:table>


