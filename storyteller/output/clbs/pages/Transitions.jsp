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
	<tiles:put name="title" value="経過一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">経過一覧</span>
                    <display:table name="${transitions}" id="row" requestURI="Transitions.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Transitions.do?id=${row.id}">編集</a>
                        <a href="DeleteTransition.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="日時"><nobr>
<st:date date="${row.datetime}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="血糖値">
<nobr>
${row.bs}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="stop60min">
<nobr>
${row.stop60min}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="operation">
<nobr>
${row.operation.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="base">
<nobr>
${row.base}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="comment">
<nobr>
${row.comment}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ステータス">
<nobr>
${row.status}
</nobr>
</display:column>

                    </display:table>
<a href="Transitions.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Transitions.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Transitions.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Transitions.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	経過編集
</span>
<span id="subform">

		<form method="POST" action="PostTransitionVP.do">
          <html:hidden name="form" property="id"/>

日時<br />
<input type="text" name="datetimeAsString" value="<st:date date="${form.datetime}" size="20" />" /><br />
血糖値<br />
<html:text size="20"  name="form" property="bs" /><br />

stop60min<br />
<html:checkbox name="form" property="stop60min" /><br />

                                operation<br />
                                <c:choose>
                                    <c:when test="${empty Operations}">
                                         <select name="operation" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="operation" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Operations}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.operation.id}">
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


base<br />
<html:text size="20"  name="form" property="base" /><br />

comment<br />
<html:text size="20"  name="form" property="comment" /><br />

ステータス<br />
<html:text size="20"  name="form" property="status" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="Transitions.do">新規経過作成</a>
</div>




	</tiles:put>
</tiles:insert>
