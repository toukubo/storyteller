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
                    <display:table name="${improvementReportOfUsedCarProfits}" id="row" requestURI="ImprovementReportOfUsedCarProfits.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ImprovementReportOfUsedCarProfits.do?id=${row.id}">編集</a>
                        <a href="DeleteImprovementReportOfUsedCarProfit.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="当月計画">
<nobr>
${row.numofplan}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="予測台数">
<nobr>
${row.numofforecast}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="profitReportOfUsedCar">
<nobr>
${row.profitReportOfUsedCar.id}
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
<a href="ImprovementReportOfUsedCarProfits.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="ImprovementReportOfUsedCarProfits.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="ImprovementReportOfUsedCarProfits.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="ImprovementReportOfUsedCarProfits.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	編集
</span>
<span id="subform">

		<form method="POST" action="PostImprovementReportOfUsedCarProfitVP.do">
          <html:hidden name="form" property="id"/>

当月計画<br />
<html:text size="20"  name="form" property="numofplan" /><br />

予測台数<br />
<html:text size="20"  name="form" property="numofforecast" /><br />

                                profitReportOfUsedCar<br />
                                <c:choose>
                                    <c:when test="${empty ProfitReportOfUsedCars}">
                                         <select name="profitReportOfUsedCar" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="profitReportOfUsedCar" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ProfitReportOfUsedCars}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.profitReportOfUsedCar.id}">
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


month<br />
<html:text size="20"  name="form" property="month" /><br />

year<br />
<html:text size="20"  name="form" property="year" /><br />

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
                        <a href="ImprovementReportOfUsedCarProfits.do">新規作成</a>
</div>




	</tiles:put>
</tiles:insert>
