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
                    <display:table name="${improvementReportOfNewCarProfits}" id="row" requestURI="ImprovementReportOfNewCarProfits.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ImprovementReportOfNewCarProfits.do?id=${row.id}">編集</a>
                        <a href="DeleteImprovementReportOfNewCarProfit.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="profitReportOfNewCars">
<nobr>
${row.profitReportOfNewCars}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="targetValueByGroupOfCarLines">
<nobr>
${row.targetValueByGroupOfCarLines}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="remianofacceptedlastmonth">
<nobr>
${row.remianofacceptedlastmonth}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="remainofregistedlastmonth">
<nobr>
${row.remainofregistedlastmonth}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="numofaccepted">
<nobr>
${row.numofaccepted}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="numofregisted">
<nobr>
${row.numofregisted}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="incentiveoflevelget">
<nobr>
${row.incentiveoflevelget}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="volumeaction">
<nobr>
${row.volumeaction}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="profitofnewcar">
<nobr>
${row.profitofnewcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="priceofmainnewcar">
<nobr>
${row.priceofmainnewcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="profitofmainnewcar">
<nobr>
${row.profitofmainnewcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="priceofwithoptionsnewcar">
<nobr>
${row.priceofwithoptionsnewcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="profitofwithoptionsnewcar">
<nobr>
${row.profitofwithoptionsnewcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="discountnewcar">
<nobr>
${row.discountnewcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="chargeforregistnewcar">
<nobr>
${row.chargeforregistnewcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="profitofcarnewcar">
<nobr>
${row.profitofcarnewcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="principalofcreditnewcar">
<nobr>
${row.principalofcreditnewcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="profitofcreditnewcar">
<nobr>
${row.profitofcreditnewcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="profitofsalesnewcar">
<nobr>
${row.profitofsalesnewcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="actionsnewcar">
<nobr>
${row.actionsnewcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="marginalprofitnewcar">
<nobr>
${row.marginalprofitnewcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="volumeactionnewcar">
<nobr>
${row.volumeactionnewcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="monthlyprofitnewcar">
<nobr>
${row.monthlyprofitnewcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="profitofusedcar">
<nobr>
${row.profitofusedcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="priceofmainusedcar">
<nobr>
${row.priceofmainusedcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="profitofmainusedcar">
<nobr>
${row.profitofmainusedcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="priceofwithoptionsusedcar">
<nobr>
${row.priceofwithoptionsusedcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="profitofwithoptionsusedcar">
<nobr>
${row.profitofwithoptionsusedcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="discountusedcar">
<nobr>
${row.discountusedcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="chargesforregistusedcar">
<nobr>
${row.chargesforregistusedcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="profitofcarusedcar">
<nobr>
${row.profitofcarusedcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="principalofcreditusedcar">
<nobr>
${row.principalofcreditusedcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="profitofcreditusedcar">
<nobr>
${row.profitofcreditusedcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="marginalprofitusedcar">
<nobr>
${row.marginalprofitusedcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="costofrecover">
<nobr>
${row.costofrecover}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="monthlyprofitusedcar">
<nobr>
${row.monthlyprofitusedcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="targetValueByIntraUsers">
<nobr>
${row.targetValueByIntraUsers}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="month">
<nobr>
${row.month}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="year">
<nobr>
${row.year}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="base">
<nobr>
${row.base.id}
</nobr>
</display:column>

                    </display:table>
<a href="ImprovementReportOfNewCarProfits.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="ImprovementReportOfNewCarProfits.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="ImprovementReportOfNewCarProfits.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="ImprovementReportOfNewCarProfits.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	編集
</span>
<span id="subform">

		<form method="POST" action="PostImprovementReportOfNewCarProfitVP.do">
          <html:hidden name="form" property="id"/>

remianofacceptedlastmonth<br />
<html:text name="form" property="remianofacceptedlastmonth" /><br />

remainofregistedlastmonth<br />
<html:text name="form" property="remainofregistedlastmonth" /><br />

numofaccepted<br />
<html:text name="form" property="numofaccepted" /><br />

numofregisted<br />
<html:text name="form" property="numofregisted" /><br />

incentiveoflevelget<br />
<html:text name="form" property="incentiveoflevelget" /><br />

volumeaction<br />
<html:text name="form" property="volumeaction" /><br />

profitofnewcar<br />
<html:text name="form" property="profitofnewcar" /><br />

priceofmainnewcar<br />
<html:text name="form" property="priceofmainnewcar" /><br />

profitofmainnewcar<br />
<html:text name="form" property="profitofmainnewcar" /><br />

priceofwithoptionsnewcar<br />
<html:text name="form" property="priceofwithoptionsnewcar" /><br />

profitofwithoptionsnewcar<br />
<html:text name="form" property="profitofwithoptionsnewcar" /><br />

discountnewcar<br />
<html:text name="form" property="discountnewcar" /><br />

chargeforregistnewcar<br />
<html:text name="form" property="chargeforregistnewcar" /><br />

profitofcarnewcar<br />
<html:text name="form" property="profitofcarnewcar" /><br />

principalofcreditnewcar<br />
<html:text name="form" property="principalofcreditnewcar" /><br />

profitofcreditnewcar<br />
<html:text name="form" property="profitofcreditnewcar" /><br />

profitofsalesnewcar<br />
<html:text name="form" property="profitofsalesnewcar" /><br />

actionsnewcar<br />
<html:text name="form" property="actionsnewcar" /><br />

marginalprofitnewcar<br />
<html:text name="form" property="marginalprofitnewcar" /><br />

volumeactionnewcar<br />
<html:text name="form" property="volumeactionnewcar" /><br />

monthlyprofitnewcar<br />
<html:text name="form" property="monthlyprofitnewcar" /><br />

profitofusedcar<br />
<html:text name="form" property="profitofusedcar" /><br />

priceofmainusedcar<br />
<html:text name="form" property="priceofmainusedcar" /><br />

profitofmainusedcar<br />
<html:text name="form" property="profitofmainusedcar" /><br />

priceofwithoptionsusedcar<br />
<html:text name="form" property="priceofwithoptionsusedcar" /><br />

profitofwithoptionsusedcar<br />
<html:text name="form" property="profitofwithoptionsusedcar" /><br />

discountusedcar<br />
<html:text name="form" property="discountusedcar" /><br />

chargesforregistusedcar<br />
<html:text name="form" property="chargesforregistusedcar" /><br />

profitofcarusedcar<br />
<html:text name="form" property="profitofcarusedcar" /><br />

principalofcreditusedcar<br />
<html:text name="form" property="principalofcreditusedcar" /><br />

profitofcreditusedcar<br />
<html:text name="form" property="profitofcreditusedcar" /><br />

marginalprofitusedcar<br />
<html:text name="form" property="marginalprofitusedcar" /><br />

costofrecover<br />
<html:text name="form" property="costofrecover" /><br />

monthlyprofitusedcar<br />
<html:text name="form" property="monthlyprofitusedcar" /><br />

month<br />
<html:text name="form" property="month" /><br />

year<br />
<html:text name="form" property="year" /><br />

                                base<br />
                                <c:choose>
                                    <c:when test="${empty Bases}">
                                         <select name="base" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="base" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Bases}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.base.id}">
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
                        <a href="ImprovementReportOfNewCarProfits.do">新規作成</a>
</div>




	</tiles:put>
</tiles:insert>
