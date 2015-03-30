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

<form action="SetSelectionOfNounUse##attr##.do" method="post" name="form">
<a href="${from}.do?pagesize=20">20åè</a>
<a href="${from}.do?pagesize=50">50åè</a>
<a href="${from}.do?pagesize=100">100åè</a>
<a href="${from}.do?pagesize=200">200åè</a>
<a href="${from}.do?pagesize=300">300åè</a>
<a href="${from}.do?pagesize=500">500åè</a>
<a href="#" onclick="selectall(form);">select all</a>
<span class="title">nounuses</span>
                    <display:table name="${nounuses}" id="row" requestURI="NounUses.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="NounUseDetail.do?id=${row.id}">ed</a>
                        <a href="DeleteNounUse.do?id=${row.id}">del</a>
                        </display:column>
<display:column media="xml csv excel pdf" property="id" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.id}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="mutiple" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.mutiple}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="oforder" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.oforder}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="noun" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.noun}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="nounClause" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.nounClause}</nobr>
</display:column>

                    </display:table>


                        <a href="NounUseDetail.do">new NounUse</a>
<html:submit />
</form>
</div>


<div class="sub">

		<html:form method="POST" action="/NounUseVP">
          <html:hidden name="nounuse" property="id"/>

mutiple<br />
<html:text name="nounuse" property="mutiple" /><br />

oforder<br />
<html:text name="nounuse" property="oforder" /><br />

                                <c:choose>
                                    <c:when test="${empty nouns}">
                                         <select name="noun" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="noun" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${nouns}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq NounUse.noun.id}">
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
                                    <c:when test="${empty nounClauses}">
                                         <select name="nounClause" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="nounClause" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${nounClauses}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq NounUse.nounClause.id}">
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

