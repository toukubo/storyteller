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
	<tiles:put name="title" value="個人別展示会報告一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">個人別展示会報告一覧</span>
                    <display:table name="${exhibitionIntraUsers}" id="row" requestURI="ExhibitionIntraUsers.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ExhibitionIntraUsers.do?id=${row.id}">編集</a>
                        <a href="DeleteExhibitionIntraUser.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
<nobr>
${row.intraUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="DM発信数">
<nobr>
${row.dm}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="TC数">
<nobr>
${row.tc}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店確約">
<nobr>
${row.visitaffirmation}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店接客数AB確約来店">
<nobr>
${row.customerabaffirmationvisit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店接客数AB確約外来店">
<nobr>
${row.customerabnonaffirmationvisit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店接客数NONAB確約来店">
<nobr>
${row.customernonabaffirmationvisit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店接客数NONAB確約外来店">
<nobr>
${row.customernonabnonaffirmationvisit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="来店接客数フリー来店">
<nobr>
${row.customernonabfreevisit}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="デモ">
<nobr>
${row.demo}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ABホット発生顧客">
<nobr>
${row.engenderabhotcustomer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ABホット発生ストック">
<nobr>
${row.engenderabhotstock}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ABホット発生フリー">
<nobr>
${row.engenderabhotfree}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注台数AB顧客">
<nobr>
${row.orderedcarsabcustomer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注台数新他">
<nobr>
${row.orderedcarsabnewother}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注台数NONAB顧客">
<nobr>
${row.orderedcarsnonabcustomer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注台数ストック">
<nobr>
${row.orderedcarsnonabstock}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="受注台数フリー">
<nobr>
${row.orderedcarsnonabfree}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="展示会">
<nobr>
${row.exhibition.id}
</nobr>
</display:column>

                    </display:table>
<a href="ExhibitionIntraUsers.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="ExhibitionIntraUsers.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="ExhibitionIntraUsers.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="ExhibitionIntraUsers.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	個人別展示会報告編集
</span>
<span id="subform">

		<form method="POST" action="PostExhibitionIntraUserVP.do">
          <html:hidden name="form" property="id"/>

                                内部ユーザー<br />
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


DM発信数<br />
<html:text name="form" property="dm" /><br />

TC数<br />
<html:text name="form" property="tc" /><br />

来店確約<br />
<html:text name="form" property="visitaffirmation" /><br />

来店接客数AB確約来店<br />
<html:text name="form" property="customerabaffirmationvisit" /><br />

来店接客数AB確約外来店<br />
<html:text name="form" property="customerabnonaffirmationvisit" /><br />

来店接客数NONAB確約来店<br />
<html:text name="form" property="customernonabaffirmationvisit" /><br />

来店接客数NONAB確約外来店<br />
<html:text name="form" property="customernonabnonaffirmationvisit" /><br />

来店接客数フリー来店<br />
<html:text name="form" property="customernonabfreevisit" /><br />

デモ<br />
<html:text name="form" property="demo" /><br />

ABホット発生顧客<br />
<html:text name="form" property="engenderabhotcustomer" /><br />

ABホット発生ストック<br />
<html:text name="form" property="engenderabhotstock" /><br />

ABホット発生フリー<br />
<html:text name="form" property="engenderabhotfree" /><br />

受注台数AB顧客<br />
<html:text name="form" property="orderedcarsabcustomer" /><br />

受注台数新他<br />
<html:text name="form" property="orderedcarsabnewother" /><br />

受注台数NONAB顧客<br />
<html:text name="form" property="orderedcarsnonabcustomer" /><br />

受注台数ストック<br />
<html:text name="form" property="orderedcarsnonabstock" /><br />

受注台数フリー<br />
<html:text name="form" property="orderedcarsnonabfree" /><br />

                                展示会<br />
                                <c:choose>
                                    <c:when test="${empty Exhibitions}">
                                         <select name="exhibition" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="exhibition" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Exhibitions}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.exhibition.id}">
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
                        <a href="ExhibitionIntraUsers.do">新規個人別展示会報告作成</a>
</div>




	</tiles:put>
</tiles:insert>
