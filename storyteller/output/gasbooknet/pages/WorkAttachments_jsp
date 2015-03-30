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
	<tiles:put name="title" value="WorkAttachment一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">WorkAttachment一覧</span>
                    <display:table name="${workAttachments}" id="row" requestURI="WorkAttachments.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="WorkAttachments.do?id=${row.id}">編集</a>
                        <a href="DeleteWorkAttachment.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="付属品">
<nobr>
${row.attachment.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filename">
<nobr>
${row.filename}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="mainvisual">
<nobr>
${row.mainvisual}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="workAttachmentPreviews">
<nobr>
${row.workAttachmentPreviews}
</nobr>
</display:column>

                    </display:table>
<a href="WorkAttachments.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="WorkAttachments.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="WorkAttachments.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="WorkAttachments.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	WorkAttachment編集
</span>
<span id="subform">

		<form method="POST" action="PostWorkAttachmentVP.do">
          <html:hidden name="form" property="id"/>

                                作品<br />
                                <c:choose>
                                    <c:when test="${empty Works}">
                                         <select name="work" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="work" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Works}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.work.id}">
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


                                付属品<br />
                                <c:choose>
                                    <c:when test="${empty Attachments}">
                                         <select name="attachment" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="attachment" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Attachments}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.attachment.id}">
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


filename<br />
<html:text name="form" property="filename" /><br />

mainvisual<br />
<html:checkbox name="form" property="mainvisual" /><br />

                                dbFile<br />
                                <c:choose>
                                    <c:when test="${empty DbFiles}">
                                         <select name="dbFile" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="dbFile" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${DbFiles}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.dbFile.id}">
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
                        <a href="WorkAttachments.do">新規WorkAttachment作成</a>
</div>




	</tiles:put>
</tiles:insert>
