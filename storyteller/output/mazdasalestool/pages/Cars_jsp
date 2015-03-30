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
	<tiles:put name="title" value="車種一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">車種一覧</span>
                    <display:table name="${cars}" id="row" requestURI="Cars.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Cars.do?id=${row.id}">編集</a>
                        <a href="DeleteCar.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="グループ名">
<nobr>
${row.groupname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="販売費">
<nobr>
${row.salescost}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="軽自動車">
<nobr>
${row.lightcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ソート順">
<nobr>
${row.sortorder}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="車種別展示会報告">
<nobr>
${row.exhibitionReportCars}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="短縮車種">
<nobr>
${row.shortcarline}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="商用車">
<nobr>
${row.bussinesscar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="profitReportOfNewCars">
<nobr>
${row.profitReportOfNewCars}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="groupOfCarLine">
<nobr>
${row.groupOfCarLine.name}
</nobr>
</display:column>

                    </display:table>
<a href="Cars.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Cars.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Cars.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Cars.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	車種編集
</span>
<span id="subform">

		<form method="POST" action="PostCarVP.do">
          <html:hidden name="form" property="id"/>

グループ名<br />
<html:text name="form" property="groupname" /><br />

販売費<br />
<html:text name="form" property="salescost" /><br />

軽自動車<br />
<html:checkbox name="form" property="lightcar" /><br />

ソート順<br />
<html:text name="form" property="sortorder" /><br />

短縮車種<br />
<html:text name="form" property="shortcarline" /><br />

商用車<br />
<html:checkbox name="form" property="bussinesscar" /><br />

                                groupOfCarLine<br />
                                <c:choose>
                                    <c:when test="${empty GroupOfCarLines}">
                                         <select name="groupOfCarLine" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="groupOfCarLine" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${GroupOfCarLines}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.groupOfCarLine.id}">
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
                        <a href="Cars.do">新規車種作成</a>
</div>




	</tiles:put>
</tiles:insert>
