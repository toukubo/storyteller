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

<form action="SetSelectionOfStrutsAction##attr##.do" method="post" name="form">
<a href="${from}.do?pagesize=20">20åè</a>
<a href="${from}.do?pagesize=50">50åè</a>
<a href="${from}.do?pagesize=100">100åè</a>
<a href="${from}.do?pagesize=200">200åè</a>
<a href="${from}.do?pagesize=300">300åè</a>
<a href="${from}.do?pagesize=500">500åè</a>
<a href="#" onclick="selectall(form);">select all</a>
<span class="title">strutsactions</span>
                    <display:table name="${strutsactions}" id="row" requestURI="StrutsActions.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="StrutsActionDetail.do?id=${row.id}">ed</a>
                        <a href="DeleteStrutsAction.do?id=${row.id}">del</a>
                        </display:column>
<display:column media="xml csv excel pdf" property="id" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.id}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="code" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.code}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="filename" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.filename}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="sentence" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.sentence}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="targeteejsp" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.targeteejsp}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="targeteeaction" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.targeteeaction}</nobr>
</display:column>

                    </display:table>


                        <a href="StrutsActionDetail.do">new StrutsAction</a>
<html:submit />
</form>
</div>


<div class="sub">

		<html:form method="POST" action="/StrutsActionVP">
          <html:hidden name="strutsaction" property="id"/>

code<br />
<html:text name="strutsaction" property="code" /><br />

filename<br />
<html:text name="strutsaction" property="filename" /><br />

                                <c:choose>
                                    <c:when test="${empty sentences}">
                                         <select name="sentence" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="sentence" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${sentences}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq StrutsAction.sentence.id}">
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
                                    <c:when test="${empty targeteejsps}">
                                         <select name="targeteejsp" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="targeteejsp" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${targeteejsps}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq StrutsAction.targeteejsp.id}">
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
                                    <c:when test="${empty targeteeactions}">
                                         <select name="targeteeaction" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="targeteeaction" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${targeteeactions}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq StrutsAction.targeteeaction.id}">
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

