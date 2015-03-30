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
	<tiles:put name="title" value="展示会一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">展示会一覧</span>
                    <display:table name="${exhibitions}" id="row" requestURI="Exhibitions.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Exhibitions.do?id=${row.id}">編集</a>
                        <a href="DeleteExhibition.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="中古車">
<nobr>
${row.usedcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="開始日"><nobr>
<bean:write name="row" property="fromdate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="終了日"><nobr>
<bean:write name="row" property="todate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="週別計画">
<nobr>
${row.weeklyplan}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="平日受注">
<nobr>
${row.weekdayactual}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="展示会報告">
<nobr>
${row.exhibitionReports}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="中古車展示会報告">
<nobr>
${row.exhibitionReportUseds}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="拠点">
<nobr>
${row.base.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="個人別展示会報告">
<nobr>
${row.exhibitionIntraUsers}
</nobr>
</display:column>

                    </display:table>
<a href="Exhibitions.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Exhibitions.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Exhibitions.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Exhibitions.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	展示会編集
</span>
<span id="subform">

		<form method="POST" action="PostExhibitionVP.do">
          <html:hidden name="form" property="id"/>

中古車<br />
<html:checkbox name="form" property="usedcar" /><br />

開始日<br />
<input type="text" name="fromdateAsString" value="<bean:write name="form" property="fromdate" format="yyyy/MM/dd" />" /><br />
終了日<br />
<input type="text" name="todateAsString" value="<bean:write name="form" property="todate" format="yyyy/MM/dd" />" /><br />
週別計画<br />
<html:text name="form" property="weeklyplan" /><br />

平日受注<br />
<html:text name="form" property="weekdayactual" /><br />

                                拠点<br />
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
                        <a href="Exhibitions.do">新規展示会作成</a>
</div>




	</tiles:put>
</tiles:insert>
