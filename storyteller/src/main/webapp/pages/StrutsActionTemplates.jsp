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

<form action="SetSelectionOfStrutsActionTemplate##attr##.do" method="post" name="form">
<a href="${from}.do?pagesize=20">20åè</a>
<a href="${from}.do?pagesize=50">50åè</a>
<a href="${from}.do?pagesize=100">100åè</a>
<a href="${from}.do?pagesize=200">200åè</a>
<a href="${from}.do?pagesize=300">300åè</a>
<a href="${from}.do?pagesize=500">500åè</a>
<a href="#" onclick="selectall(form);">select all</a>
<span class="title">strutsactiontemplates</span>
                    <display:table name="${strutsactiontemplates}" id="row" requestURI="StrutsActionTemplates.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="StrutsActionTemplateDetail.do?id=${row.id}">ed</a>
                        <a href="DeleteStrutsActionTemplate.do?id=${row.id}">del</a>
                        </display:column>
<display:column media="xml csv excel pdf" property="id" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.id}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="targeteeaction" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.targeteeaction}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="verb" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.verb}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="template" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.template}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="nametemplate" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.nametemplate}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="jspTemplate" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.jspTemplate}</nobr>
</display:column>

                    </display:table>


                        <a href="StrutsActionTemplateDetail.do">new StrutsActionTemplate</a>
<html:submit />
</form>
</div>


<div class="sub">

		<html:form method="POST" action="/StrutsActionTemplateVP">
          <html:hidden name="strutsactiontemplate" property="id"/>

                                <c:choose>
                                    <c:when test="${empty targeteeactions}">
                                         <select name="targeteeaction" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="targeteeaction" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${targeteeactions}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq StrutsActionTemplate.targeteeaction.id}">
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
                                                    <c:when test="${valueLabel.id eq StrutsActionTemplate.verb.id}">
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

template<br />
<html:text name="strutsactiontemplate" property="template" /><br />

nametemplate<br />
<html:text name="strutsactiontemplate" property="nametemplate" /><br />

                                <c:choose>
                                    <c:when test="${empty jspTemplates}">
                                         <select name="jspTemplate" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="jspTemplate" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${jspTemplates}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq StrutsActionTemplate.jspTemplate.id}">
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

