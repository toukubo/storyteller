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
	<tiles:put name="title" value="車種別展示会報告一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">車種別展示会報告一覧</span>
                    <display:table name="${exhibitionReportCars}" id="row" requestURI="ExhibitionReportCars.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ExhibitionReportCars.do?id=${row.id}">編集</a>
                        <a href="DeleteExhibitionReportCar.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="数">
<nobr>
${row.num}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="展示会報告">
<nobr>
${row.exhibitionReport.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車種">
<nobr>
${row.car.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注">
<nobr>
${row.visitmotivation}
</nobr>
</display:column>

                    </display:table>
<a href="ExhibitionReportCars.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="ExhibitionReportCars.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="ExhibitionReportCars.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="ExhibitionReportCars.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	車種別展示会報告編集
</span>
<span id="subform">

		<form method="POST" action="PostExhibitionReportCarVP.do">
          <html:hidden name="form" property="id"/>

数<br />
<html:text name="form" property="num" /><br />

                                展示会報告<br />
                                <c:choose>
                                    <c:when test="${empty ExhibitionReports}">
                                         <select name="exhibitionReport" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="exhibitionReport" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ExhibitionReports}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.exhibitionReport.id}">
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


                                車種<br />
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


受注<br />
<html:checkbox name="form" property="visitmotivation" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="ExhibitionReportCars.do">新規車種別展示会報告作成</a>
</div>




	</tiles:put>
</tiles:insert>
