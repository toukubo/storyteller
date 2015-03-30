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

<span class="title">一覧</span>
                    <display:table name="${cdRelations}" id="row" requestURI="CdRelations.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="CdRelations.do?id=${row.id}">編集</a>
                        <a href="DeleteCdRelation.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="fromcd">
<nobr>
${row.fromcd}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="tocd">
<nobr>
${row.tocd}
</nobr>
</display:column>

                    </display:table>
<a href="CdRelations.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="CdRelations.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="CdRelations.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="CdRelations.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	編集
</span>
<span id="subform">

		<form method="POST" action="PostCdRelationVP.do">
          <html:hidden name="form" property="id"/>

                                fromcd<br />
                                <c:choose>
                                    <c:when test="${empty Fromcds}">
                                         <select name="fromcd" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="fromcd" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Fromcds}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.fromcd.id}">
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


                                tocd<br />
                                <c:choose>
                                    <c:when test="${empty Tocds}">
                                         <select name="tocd" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="tocd" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Tocds}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.tocd.id}">
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
                        <a href="CdRelations.do">新規作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

