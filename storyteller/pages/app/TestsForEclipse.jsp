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
<%@ taglib uri="/formtag.tld" prefix="formtag" %> 
<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> 

<%@ page isELIgnored="false" %>

<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">

<span class="title">tests</span>
                    <display:table name="${tests}" id="row" requestURI="Tests.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Tests.do?id=${row.id}">ed</a>
                        <a href="DeleteTest.do?id=${row.id}">del</a>
                        </display:column>
 <display:column media="html" sortable="true" title="">
<nobr>${row.stepstorepeat}</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ストーリー">
<nobr>${row.j2eeStory}</nobr>
</display:column>
 <display:column media="html" sortable="true" title="">
<nobr>${row.whatyouexpectedtosee}</nobr>
</display:column>
 <display:column media="html" sortable="true" title="">
<nobr>${row.whatyousawinstead}</nobr>
</display:column>
 <display:column media="html" sortable="true" title="">
<nobr>${row.debuged}</nobr>
</display:column>
 <display:column media="html" sortable="true" title="">
<nobr>${row.checked}</nobr>
</display:column>
 <display:column media="html" sortable="true" title="">
<nobr>${row.modifiedpagetitle}</nobr>
</display:column>
 <display:column media="html" sortable="true" title="">
<nobr>${row.modifiedpagefilename}</nobr>
</display:column>

                    </display:table>
<a href="Tests.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Tests.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Tests.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Tests.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
                        <a href="TestDetail.do">new Test</a>

		<form method="POST" action="PostTestVP.do">
          <html:hidden name="form" property="id"/>

<br />
<html:text name="form" property="stepstorepeat" /><br />

                                ストーリー                                <c:choose>
                                    <c:when test="${empty j2eeStorys}">
                                         <select name="j2eeStory" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="j2eeStory" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${j2eeStorys}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.j2eeStory.id}">
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

<br />
<html:text name="form" property="whatyouexpectedtosee" /><br />

<br />
<html:text name="form" property="whatyousawinstead" /><br />

<br />
<html:text name="form" property="debuged" /><br />

<br />
<html:text name="form" property="checked" /><br />

<br />
<html:text name="form" property="modifiedpagetitle" /><br />

<br />
<html:text name="form" property="modifiedpagefilename" /><br />



          <html:submit value="save" />
		</form>
</div>






	</body>
</html:html>

