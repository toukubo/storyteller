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

<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">

<form action="SetSelectionOfColumnChiose##attr##.do" method="post" name="form">
<a href="${from}.do?pagesize=20">20件</a>
<a href="${from}.do?pagesize=50">50件</a>
<a href="${from}.do?pagesize=100">100件</a>
<a href="${from}.do?pagesize=200">200件</a>
<a href="${from}.do?pagesize=300">300件</a>
<a href="${from}.do?pagesize=500">500件</a>
<a href="#" onclick="selectall(form);">select all</a>
<span class="title">columnChioses</span>
                    <display:table name="${columnChioses}" id="row" requestURI="ColumnChioses.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ColumnChioseDetail.do?id=${row.id}">ed</a>
                        <a href="DeleteColumnChiose.do?id=${row.id}">del</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="maxlength">
<nobr>
${row.maxlength}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="excelTemplate">
<nobr>
${row.excelTemplate.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="columnDefinition">
<nobr>
${row.columnDefinition.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="displayed">
<nobr>
${row.displayed}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="excelsheetnum">
<nobr>
${row.excelsheetnum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="excelrownum">
<nobr>
${row.excelrownum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="excelcolumnnum">
<nobr>
${row.excelcolumnnum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="direction">
<nobr>
${row.direction}
</nobr>
</display:column>

                    </display:table>


                        <a href="ColumnChioseDetail.do">new ColumnChiose</a>
<html:submit />
</form>
</div>


<div class="sub">

		<html:form method="POST" action="/ColumnChioseVP">
          <html:hidden name="columnChiose" property="id"/>

maxlength<br />
<html:text name="form" property="maxlength" /><br />

                                excelTemplate<br />
                                <c:choose>
                                    <c:when test="${empty ExcelTemplates}">
                                         <select name="excelTemplate" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="excelTemplate" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ExcelTemplates}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.excelTemplate.id}">
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


                                columnDefinition<br />
                                <c:choose>
                                    <c:when test="${empty ColumnDefinitions}">
                                         <select name="columnDefinition" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="columnDefinition" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ColumnDefinitions}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.columnDefinition.id}">
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


displayed<br />
<html:checkbox name="form" property="displayed" /><br />

excelsheetnum<br />
<html:text name="form" property="excelsheetnum" /><br />

excelrownum<br />
<html:text name="form" property="excelrownum" /><br />

excelcolumnnum<br />
<html:text name="form" property="excelcolumnnum" /><br />

direction<br />
<html:text name="form" property="direction" /><br />



          <html:submit />
		</html:form>
</div>






	</body>
</html:html>

