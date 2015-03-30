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
	<tiles:put name="title" value="添付ファイル一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">添付ファイル一覧</span>
                    <display:table name="${attachments}" id="row" requestURI="Attachments.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Attachments.do?id=${row.id}">編集</a>
                        <a href="DeleteAttachment.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="WorkAttachment">
<nobr>
${row.workAttachment.id}
</nobr>
</display:column>

                    </display:table>
<a href="Attachments.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Attachments.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Attachments.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Attachments.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	添付ファイル編集
</span>
<span id="subform">

		<form method="POST" action="PostAttachmentVP.do">
          <html:hidden name="form" property="id"/>

filetype<br />
<html:text name="form" property="filetype" /><br />

                                WorkAttachment<br />
                                <c:choose>
                                    <c:when test="${empty WorkAttachments}">
                                         <select name="workAttachment" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="workAttachment" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${WorkAttachments}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.workAttachment.id}">
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
                        <a href="Attachments.do">新規添付ファイル作成</a>
</div>




	</tiles:put>
</tiles:insert>
