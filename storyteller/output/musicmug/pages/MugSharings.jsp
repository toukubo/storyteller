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
                    <display:table name="${mugSharings}" id="row" requestURI="MugSharings.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="MugSharings.do?id=${row.id}">編集</a>
                        <a href="DeleteMugSharing.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="topublicuser">
<nobr>
${row.topublicuser}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="frombugsharing">
<nobr>
${row.frombugsharing}
</nobr>
</display:column>

                    </display:table>
<a href="MugSharings.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="MugSharings.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="MugSharings.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="MugSharings.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	編集
</span>
<span id="subform">

		<form method="POST" action="PostMugSharingVP.do">
          <html:hidden name="form" property="id"/>

                                topublicuser<br />
                                <c:choose>
                                    <c:when test="${empty Topublicusers}">
                                         <select name="topublicuser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="topublicuser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Topublicusers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.topublicuser.id}">
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


                                frombugsharing<br />
                                <c:choose>
                                    <c:when test="${empty Frombugsharings}">
                                         <select name="frombugsharing" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="frombugsharing" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Frombugsharings}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.frombugsharing.id}">
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
                        <a href="MugSharings.do">新規作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

