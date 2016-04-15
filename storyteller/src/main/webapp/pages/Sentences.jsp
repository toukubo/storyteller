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

<form action="SetSelectionOfSentence##attr##.do" method="post" name="form">
<a href="${from}.do?pagesize=20">20åè</a>
<a href="${from}.do?pagesize=50">50åè</a>
<a href="${from}.do?pagesize=100">100åè</a>
<a href="${from}.do?pagesize=200">200åè</a>
<a href="${from}.do?pagesize=300">300åè</a>
<a href="${from}.do?pagesize=500">500åè</a>
<a href="#" onclick="selectall(form);">select all</a>
<span class="title">sentences</span>
                    <display:table name="${sentences}" id="row" requestURI="Sentences.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="SentenceDetail.do?id=${row.id}">ed</a>
                        <a href="DeleteSentence.do?id=${row.id}">del</a>
                        </display:column>
<display:column media="xml csv excel pdf" property="name" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.name}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="id" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.id}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="valid" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.valid}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="strutsConfigCode" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.strutsConfigCode}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="firstobjective" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.firstobjective}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="verb" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.verb}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="secountobjective" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.secountobjective}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="j2eeStory" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.j2eeStory}</nobr>
</display:column>

                    </display:table>


                        <a href="SentenceDetail.do">new Sentence</a>
<html:submit />
</form>
</div>


<div class="sub">

		<html:form method="POST" action="/SentenceVP">
          <html:hidden name="sentence" property="id"/>

name<br />
<html:text name="sentence" property="name" /><br />

valid<br />
<html:text name="sentence" property="valid" /><br />

strutsConfigCode<br />
<html:text name="sentence" property="strutsConfigCode" /><br />

                                <c:choose>
                                    <c:when test="${empty firstobjectives}">
                                         <select name="firstobjective" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="firstobjective" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${firstobjectives}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq Sentence.firstobjective.id}">
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
                                    <c:when test="${empty verbs}">
                                         <select name="verb" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="verb" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${verbs}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq Sentence.verb.id}">
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
                                    <c:when test="${empty secountobjectives}">
                                         <select name="secountobjective" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="secountobjective" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${secountobjectives}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq Sentence.secountobjective.id}">
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
                                    <c:when test="${empty j2eeStorys}">
                                         <select name="j2eeStory" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="j2eeStory" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${j2eeStorys}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq Sentence.j2eeStory.id}">
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

