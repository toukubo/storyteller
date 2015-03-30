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
<%@ taglib uri="/formtag.tld" prefix="formtag" %> 
<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> 

<%@ page isELIgnored="false" %>

<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">

<span class="title">タスク一覧</span>
                    <display:table name="${tasks}" id="row" requestURI="Tasks.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Tasks.do?id=${row.id}">編集</a>
                        <a href="DeleteTask.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
<nobr>
${row.intraUser.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ジョブ">
<nobr>
${row.job.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="時間">
<nobr>
${row.hour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タスクカテゴリー">
<nobr>
${row.taskCategory.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="処理済">
<nobr>
${row.processed}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="">
<nobr>
${row.transits}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="icaluid">
<nobr>
${row.icaluid}
</nobr>
</display:column>

                    </display:table>
<a href="Tasks.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Tasks.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Tasks.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Tasks.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	タスク編集
</span>
<span id="subform">

		<form method="POST" action="PostTaskVP.do">
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


                                ジョブ<br />
                                <c:choose>
                                    <c:when test="${empty Jobs}">
                                         <select name="job" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="job" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Jobs}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.job.id}">
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


時間<br />
<html:text name="form" property="hour" /><br />

                                タスクカテゴリー<br />
                                <c:choose>
                                    <c:when test="${empty TaskCategorys}">
                                         <select name="taskCategory" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="taskCategory" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${TaskCategorys}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.taskCategory.id}">
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
<html:text name="form" property="name" /><br />

日付<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />
処理済<br />
<html:text name="form" property="processed" /><br />

icaluid<br />
<html:text name="form" property="icaluid" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="Tasks.do">新規タスク作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

