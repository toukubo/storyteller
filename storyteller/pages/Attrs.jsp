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

<form action="SetSelectionOfAttr##attr##.do" method="post" name="form">
<a href="${from}.do?pagesize=20">20��</a>
<a href="${from}.do?pagesize=50">50��</a>
<a href="${from}.do?pagesize=100">100��</a>
<a href="${from}.do?pagesize=200">200��</a>
<a href="${from}.do?pagesize=300">300��</a>
<a href="${from}.do?pagesize=500">500��</a>
<a href="#" onclick="selectall(form);">select all</a>
<span class="title">attrs</span>
                    <display:table name="${attrs}" id="row" requestURI="Attrs.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="AttrDetail.do?id=${row.id}">ed</a>
                        <a href="DeleteAttr.do?id=${row.id}">del</a>
                        </display:column>
<display:column media="xml csv excel pdf" property="name" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.name}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="id" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.id}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="noun" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.noun}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="japanese" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.japanese}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="classtype" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.classtype}</nobr>
</display:column>

                    </display:table>


                        <a href="AttrDetail.do">new Attr</a>
<html:submit />
</form>
</div>


<div class="sub">

		<html:form method="POST" action="/AttrVP">
          <html:hidden name="attr" property="id"/>

name<br />
<html:text name="attr" property="name" /><br />

                                <c:choose>
                                    <c:when test="${empty nouns}">
                                         <select name="noun" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="noun" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${nouns}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq Attr.noun.id}">
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

japanese<br />
<html:text name="attr" property="japanese" /><br />

classtype<br />
<html:text name="attr" property="classtype" /><br />



          <html:submit />
		</html:form>
</div>






	</body>
</html:html>

