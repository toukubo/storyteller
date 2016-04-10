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

<form action="SetSelectionOfAttrUse##attr##.do" method="post" name="form">
<a href="${from}.do?pagesize=20">20åè</a>
<a href="${from}.do?pagesize=50">50åè</a>
<a href="${from}.do?pagesize=100">100åè</a>
<a href="${from}.do?pagesize=200">200åè</a>
<a href="${from}.do?pagesize=300">300åè</a>
<a href="${from}.do?pagesize=500">500åè</a>
<a href="#" onclick="selectall(form);">select all</a>
<span class="title">attruses</span>
                    <display:table name="${attruses}" id="row" requestURI="AttrUses.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="AttrUseDetail.do?id=${row.id}">ed</a>
                        <a href="DeleteAttrUse.do?id=${row.id}">del</a>
                        </display:column>
<display:column media="xml csv excel pdf" property="id" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.id}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="attr" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.attr}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="nounUse" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.nounUse}</nobr>
</display:column>

                    </display:table>


                        <a href="AttrUseDetail.do">new AttrUse</a>
<html:submit />
</form>
</div>


<div class="sub">

		<html:form method="POST" action="/AttrUseVP">
          <html:hidden name="attruse" property="id"/>

                                <c:choose>
                                    <c:when test="${empty attrs}">
                                         <select name="attr" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="attr" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${attrs}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq AttrUse.attr.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>

                                <c:choose>
                                    <c:when test="${empty nounUses}">
                                         <select name="nounUse" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="nounUse" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${nounUses}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq AttrUse.nounUse.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>



          <html:submit />
		</html:form>
</div>






	</body>
</html:html>

