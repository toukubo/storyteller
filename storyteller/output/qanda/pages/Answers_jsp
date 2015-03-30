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
                    <display:table name="${answers}" id="row" requestURI="Answers.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Answers.do?id=${row.id}">編集</a>
                        <a href="DeleteAnswer.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="content">
<nobr>
${row.content}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="intraUser">
<nobr>
${row.intraUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="score">
<nobr>
${row.score}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="question">
<nobr>
${row.question.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="description">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="date"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>

                    </display:table>
<a href="Answers.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Answers.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Answers.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Answers.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	編集
</span>
<span id="subform">

		<form method="POST" action="PostAnswerVP.do">
          <html:hidden name="form" property="id"/>

content<br />
<html:text size="20"  name="form" property="content" /><br />

                                intraUser<br />
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


score<br />
<html:text size="20"  name="form" property="score" /><br />

                                question<br />
                                <c:choose>
                                    <c:when test="${empty Questions}">
                                         <select name="question" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="question" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Questions}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.question.id}">
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


description<br />
<html:text size="20"  name="form" property="description" /><br />

date<br />
<input type="text" name="dateAsString" value="<st:date date="${form.date}" size="20" />" /><br />


          <html:submit value="save" />
		</form>
</span>
                        <a href="Answers.do">新規作成</a>
</div>




	</tiles:put>
</tiles:insert>
