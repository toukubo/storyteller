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

<span class="title">アクセスログ一覧</span>
                    <display:table name="${accessLogs}" id="row" requestURI="AccessLogs.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="AccessLogs.do?id=${row.id}">編集</a>
                        <a href="DeleteAccessLog.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="model">
<nobr>
${row.model}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="uri">
<nobr>
${row.uri}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ページタイトル">
<nobr>
${row.pagetitle}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>

                    </display:table>
<a href="AccessLogs.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="AccessLogs.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="AccessLogs.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="AccessLogs.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	アクセスログ編集
</span>
<span id="subform">

		<form method="POST" action="PostAccessLogVP.do">
          <html:hidden name="form" property="id"/>

日付<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />
model<br />
<html:text name="form" property="model" /><br />

uri<br />
<html:text name="form" property="uri" /><br />

ページタイトル<br />
<html:text name="form" property="pagetitle" /><br />

                                一般ユーザー<br />
                                <c:choose>
                                    <c:when test="${empty PublicUsers}">
                                         <select name="publicUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="publicUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${PublicUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.publicUser.id}">
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
                        <a href="AccessLogs.do">新規アクセスログ作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

