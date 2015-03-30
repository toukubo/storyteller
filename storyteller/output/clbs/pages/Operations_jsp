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
	<tiles:put name="title" value="手術一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">手術一覧</span>
                    <display:table name="${operations}" id="row" requestURI="Operations.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Operations.do?id=${row.id}">編集</a>
                        <a href="DeleteOperation.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
<nobr>
${row.intraUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日時"><nobr>
<st:date date="${row.datetime}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="血糖値">
<nobr>
${row.bs}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="静注流速">
<nobr>
${row.bolus}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="transitions">
<nobr>
${row.transitions}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="caseUser">
<nobr>
${row.caseUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="diseasename">
<nobr>
${row.diseasename}
</nobr>
</display:column>

                    </display:table>
<a href="Operations.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Operations.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Operations.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Operations.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	手術編集
</span>
<span id="subform">

		<form method="POST" action="PostOperationVP.do">
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


日時<br />
<input type="text" name="datetimeAsString" value="<st:date date="${form.datetime}" size="20" />" /><br />
血糖値<br />
<html:text size="20"  name="form" property="bs" /><br />

静注流速<br />
<html:text size="20"  name="form" property="bolus" /><br />

                                caseUser<br />
                                <c:choose>
                                    <c:when test="${empty CaseUsers}">
                                         <select name="caseUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="caseUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${CaseUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.caseUser.id}">
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


名前<br />
<html:text size="20"  name="form" property="name" /><br />

diseasename<br />
<html:text size="20"  name="form" property="diseasename" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="Operations.do">新規手術作成</a>
</div>




	</tiles:put>
</tiles:insert>
