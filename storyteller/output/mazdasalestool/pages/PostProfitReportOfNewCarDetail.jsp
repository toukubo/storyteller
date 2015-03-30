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

<tiles:insert definition=".layout">
	<tiles:put name="title" value="" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostProfitReportOfNewCarVP">
          <html:hidden name="form" property="id"/>

                                intraUser<br />
                                <c:choose>
                                    <c:when test="${empty IntraUsers}">
                                         <select name="intraUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="intraUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntraUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.intraUser.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />


                                car<br />
                                <c:choose>
                                    <c:when test="${empty Cars}">
                                         <select name="car" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="car" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Cars}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.car.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />


cancel<br />
<html:checkbox name="form" property="cancel" /><br />

remain<br />
<html:checkbox name="form" property="remain" /><br />

orderno<br />
<html:text name="form" property="orderno" /><br />

accepteddate<br />
<input type="text" name="accepteddateAsString" value="<bean:write name="form" property="accepteddate" format="yyyy/MM/dd" />" /><br />
numofcars<br />
<html:text name="form" property="numofcars" /><br />

typecode<br />
<html:text name="form" property="typecode" /><br />

customername<br />
<html:text name="form" property="customername" /><br />

winnerspoint<br />
<html:text name="form" property="winnerspoint" /><br />

owntradein<br />
<html:checkbox name="form" property="owntradein" /><br />

carlineoftradein<br />
<html:text name="form" property="carlineoftradein" /><br />

priceofmaintaxin<br />
<html:text name="form" property="priceofmaintaxin" /><br />

profitrateofmain<br />
<html:text name="form" property="profitrateofmain" /><br />

priceofwithoptionstaxin<br />
<html:text name="form" property="priceofwithoptionstaxin" /><br />

profitrateofwithoptions<br />
<html:text name="form" property="profitrateofwithoptions" /><br />

discounttaxin<br />
<html:text name="form" property="discounttaxin" /><br />

chargesforregisttaxin<br />
<html:text name="form" property="chargesforregisttaxin" /><br />

chargesforregisttaxex<br />
<html:text name="form" property="chargesforregisttaxex" /><br />

principalofcredit<br />
<html:text name="form" property="principalofcredit" /><br />

profitofcredit<br />
<html:text name="form" property="profitofcredit" /><br />

actionforcredit<br />
<html:text name="form" property="actionforcredit" /><br />

interest<br />
<html:text name="form" property="interest" /><br />

numofpaymentsforcredit<br />
<html:text name="form" property="numofpaymentsforcredit" /><br />

feeofintroduction<br />
<html:text name="form" property="feeofintroduction" /><br />

submitteddateofordersheet<br />
<input type="text" name="submitteddateofordersheetAsString" value="<bean:write name="form" property="submitteddateofordersheet" format="yyyy/MM/dd" />" /><br />
submitteddateofparkingspacecertificate<br />
<input type="text" name="submitteddateofparkingspacecertificateAsString" value="<bean:write name="form" property="submitteddateofparkingspacecertificate" format="yyyy/MM/dd" />" /><br />
receiptdateofparkingspacecertificate<br />
<input type="text" name="receiptdateofparkingspacecertificateAsString" value="<bean:write name="form" property="receiptdateofparkingspacecertificate" format="yyyy/MM/dd" />" /><br />
collecteddateofsealcertificate<br />
<input type="text" name="collecteddateofsealcertificateAsString" value="<bean:write name="form" property="collecteddateofsealcertificate" format="yyyy/MM/dd" />" /><br />
collecteddateofproxy<br />
<input type="text" name="collecteddateofproxyAsString" value="<bean:write name="form" property="collecteddateofproxy" format="yyyy/MM/dd" />" /><br />
collecteddateofresidencecertificate<br />
<input type="text" name="collecteddateofresidencecertificateAsString" value="<bean:write name="form" property="collecteddateofresidencecertificate" format="yyyy/MM/dd" />" /><br />
senddateofcreditapplication<br />
<input type="text" name="senddateofcreditapplicationAsString" value="<bean:write name="form" property="senddateofcreditapplication" format="yyyy/MM/dd" />" /><br />
submitteddateofregistrequest<br />
<input type="text" name="submitteddateofregistrequestAsString" value="<bean:write name="form" property="submitteddateofregistrequest" format="yyyy/MM/dd" />" /><br />
registeddate<br />
<input type="text" name="registeddateAsString" value="<bean:write name="form" property="registeddate" format="yyyy/MM/dd" />" /><br />
sendthankyouletter<br />
<html:checkbox name="form" property="sendthankyouletter" /><br />

sendthankyouletterbymanager<br />
<html:checkbox name="form" property="sendthankyouletterbymanager" /><br />

employeecodeofregist<br />
<html:text name="form" property="employeecodeofregist" /><br />

forecastofregist<br />
<html:text name="form" property="forecastofregist" /><br />

carryregist<br />
<html:text name="form" property="carryregist" /><br />

collectadvancereceipt<br />
<html:text name="form" property="collectadvancereceipt" /><br />

proceeds<br />
<html:text name="form" property="proceeds" /><br />

priceoftradein<br />
<html:text name="form" property="priceoftradein" /><br />

applicationfee<br />
<html:text name="form" property="applicationfee" /><br />

collecteddateofapplicationfee<br />
<input type="text" name="collecteddateofapplicationfeeAsString" value="<bean:write name="form" property="collecteddateofapplicationfee" format="yyyy/MM/dd" />" /><br />
advancereceipt<br />
<html:text name="form" property="advancereceipt" /><br />

collecteddateofadvancereceipt<br />
<input type="text" name="collecteddateofadvancereceiptAsString" value="<bean:write name="form" property="collecteddateofadvancereceipt" format="yyyy/MM/dd" />" /><br />
remainder<br />
<html:text name="form" property="remainder" /><br />

collecteddateofremainder<br />
<input type="text" name="collecteddateofremainderAsString" value="<bean:write name="form" property="collecteddateofremainder" format="yyyy/MM/dd" />" /><br />
                                navigation<br />
                                <c:choose>
                                    <c:when test="${empty Navigations}">
                                         <select name="navigation" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="navigation" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Navigations}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.navigation.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />


                                companyOfCredit<br />
                                <c:choose>
                                    <c:when test="${empty CompanyOfCredits}">
                                         <select name="companyOfCredit" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="companyOfCredit" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${CompanyOfCredits}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.companyOfCredit.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />


                                police<br />
                                <c:choose>
                                    <c:when test="${empty Polices}">
                                         <select name="police" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="police" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Polices}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.police.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />


                                improvementReportOfNewCarProfit<br />
                                <c:choose>
                                    <c:when test="${empty ImprovementReportOfNewCarProfits}">
                                         <select name="improvementReportOfNewCarProfit" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="improvementReportOfNewCarProfit" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ImprovementReportOfNewCarProfits}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.improvementReportOfNewCarProfit.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />





          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
