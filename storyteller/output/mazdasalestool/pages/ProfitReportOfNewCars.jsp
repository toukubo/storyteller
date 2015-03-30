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
	<tiles:put name="title" value="一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">一覧</span>
                    <display:table name="${profitReportOfNewCars}" id="row" requestURI="ProfitReportOfNewCars.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ProfitReportOfNewCars.do?id=${row.id}">編集</a>
                        <a href="DeleteProfitReportOfNewCar.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="intraUser">
<nobr>
${row.intraUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="valueOfActionSales">
<nobr>
${row.valueOfActionSales}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="car">
<nobr>
${row.car.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="cancel">
<nobr>
${row.cancel}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="remain">
<nobr>
${row.remain}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="orderno">
<nobr>
${row.orderno}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="accepteddate"><nobr>
<bean:write name="row" property="accepteddate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="numofcars">
<nobr>
${row.numofcars}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="typecode">
<nobr>
${row.typecode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="customername">
<nobr>
${row.customername}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="winnerspoint">
<nobr>
${row.winnerspoint}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="owntradein">
<nobr>
${row.owntradein}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="carlineoftradein">
<nobr>
${row.carlineoftradein}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="priceofmaintaxin">
<nobr>
${row.priceofmaintaxin}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="profitrateofmain">
<nobr>
${row.profitrateofmain}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="priceofwithoptionstaxin">
<nobr>
${row.priceofwithoptionstaxin}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="profitrateofwithoptions">
<nobr>
${row.profitrateofwithoptions}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="discounttaxin">
<nobr>
${row.discounttaxin}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="chargesforregisttaxin">
<nobr>
${row.chargesforregisttaxin}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="chargesforregisttaxex">
<nobr>
${row.chargesforregisttaxex}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="principalofcredit">
<nobr>
${row.principalofcredit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="profitofcredit">
<nobr>
${row.profitofcredit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="actionforcredit">
<nobr>
${row.actionforcredit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="interest">
<nobr>
${row.interest}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="numofpaymentsforcredit">
<nobr>
${row.numofpaymentsforcredit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="feeofintroduction">
<nobr>
${row.feeofintroduction}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="submitteddateofordersheet"><nobr>
<bean:write name="row" property="submitteddateofordersheet" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="submitteddateofparkingspacecertificate"><nobr>
<bean:write name="row" property="submitteddateofparkingspacecertificate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="receiptdateofparkingspacecertificate"><nobr>
<bean:write name="row" property="receiptdateofparkingspacecertificate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="collecteddateofsealcertificate"><nobr>
<bean:write name="row" property="collecteddateofsealcertificate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="collecteddateofproxy"><nobr>
<bean:write name="row" property="collecteddateofproxy" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="collecteddateofresidencecertificate"><nobr>
<bean:write name="row" property="collecteddateofresidencecertificate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="senddateofcreditapplication"><nobr>
<bean:write name="row" property="senddateofcreditapplication" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="submitteddateofregistrequest"><nobr>
<bean:write name="row" property="submitteddateofregistrequest" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="registeddate"><nobr>
<bean:write name="row" property="registeddate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="sendthankyouletter">
<nobr>
${row.sendthankyouletter}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="sendthankyouletterbymanager">
<nobr>
${row.sendthankyouletterbymanager}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="employeecodeofregist">
<nobr>
${row.employeecodeofregist}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="forecastofregist">
<nobr>
${row.forecastofregist}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="carryregist">
<nobr>
${row.carryregist}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="collectadvancereceipt">
<nobr>
${row.collectadvancereceipt}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="proceeds">
<nobr>
${row.proceeds}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="priceoftradein">
<nobr>
${row.priceoftradein}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="applicationfee">
<nobr>
${row.applicationfee}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="collecteddateofapplicationfee"><nobr>
<bean:write name="row" property="collecteddateofapplicationfee" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="advancereceipt">
<nobr>
${row.advancereceipt}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="collecteddateofadvancereceipt"><nobr>
<bean:write name="row" property="collecteddateofadvancereceipt" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="remainder">
<nobr>
${row.remainder}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="collecteddateofremainder"><nobr>
<bean:write name="row" property="collecteddateofremainder" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="navigation">
<nobr>
${row.navigation.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="companyOfCredit">
<nobr>
${row.companyOfCredit.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="police">
<nobr>
${row.police.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="improvementReportOfNewCarProfit">
<nobr>
${row.improvementReportOfNewCarProfit.id}
</nobr>
</display:column>

                    </display:table>
<a href="ProfitReportOfNewCars.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="ProfitReportOfNewCars.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="ProfitReportOfNewCars.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="ProfitReportOfNewCars.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	編集
</span>
<span id="subform">

		<form method="POST" action="PostProfitReportOfNewCarVP.do">
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




          <html:submit value="save" />
		</form>
</span>
                        <a href="ProfitReportOfNewCars.do">新規作成</a>
</div>




	</tiles:put>
</tiles:insert>
