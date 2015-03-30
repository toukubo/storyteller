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
                    <display:table name="${messages}" id="row" requestURI="Messages.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Messages.do?id=${row.id}">編集</a>
                        <a href="DeleteMessage.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="topublicuser">
<nobr>
${row.topublicuser}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="frompublicuser">
<nobr>
${row.frompublicuser}
</nobr>
</display:column>

                    </display:table>
<a href="Messages.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Messages.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Messages.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Messages.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	編集
</span>
<span id="subform">

		<form method="POST" action="PostMessageVP.do">
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


                                frompublicuser<br />
                                <c:choose>
                                    <c:when test="${empty Frompublicusers}">
                                         <select name="frompublicuser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="frompublicuser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Frompublicusers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.frompublicuser.id}">
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
                        <a href="Messages.do">新規作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

