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

<form action="SetSelectionOfJ2eeStory##attr##.do" method="post" name="form">
<a href="${from}.do?pagesize=20">20åè</a>
<a href="${from}.do?pagesize=50">50åè</a>
<a href="${from}.do?pagesize=100">100åè</a>
<a href="${from}.do?pagesize=200">200åè</a>
<a href="${from}.do?pagesize=300">300åè</a>
<a href="${from}.do?pagesize=500">500åè</a>
<a href="#" onclick="selectall(form);">select all</a>
<span class="title">j2eestorys</span>
                    <display:table name="${j2eestorys}" id="row" requestURI="J2eeStorys.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="J2eeStoryDetail.do?id=${row.id}">ed</a>
                        <a href="DeleteJ2eeStory.do?id=${row.id}">del</a>
                        </display:column>
<display:column media="xml csv excel pdf" property="name" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.name}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="id" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.id}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="startdate" title=""/>
 <display:column media="html" sortable="true" title=""><nobr>
<bean:write name="row" property="startdate" format="yyyy/MM/dd" /> </nobr>
</display:column>
<display:column media="xml csv excel pdf" property="requiredstorytellerhour" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.requiredstorytellerhour}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="requiredteamhour" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.requiredteamhour}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="price" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.price}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="enddate" title=""/>
 <display:column media="html" sortable="true" title=""><nobr>
<bean:write name="row" property="enddate" format="yyyy/MM/dd" /> </nobr>
</display:column>
<display:column media="xml csv excel pdf" property="strutsconfigcontent" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.strutsconfigcontent}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="andromdaCoreJarFile" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.andromdaCoreJarFile}</nobr>
</display:column>

                    </display:table>


                        <a href="J2eeStoryDetail.do">new J2eeStory</a>
<html:submit />
</form>
</div>


<div class="sub">

		<html:form method="POST" action="/J2eeStoryVP">
          <html:hidden name="j2eestory" property="id"/>

name<br />
<html:text name="j2eestory" property="name" /><br />

startdate<br />
<input type="text" name="startdateAsString" value="<bean:write name="j2eestory" property="startdate" format="yyyy/MM/dd" />" /><br />
requiredstorytellerhour<br />
<html:text name="j2eestory" property="requiredstorytellerhour" /><br />

requiredteamhour<br />
<html:text name="j2eestory" property="requiredteamhour" /><br />

price<br />
<html:text name="j2eestory" property="price" /><br />

enddate<br />
<input type="text" name="enddateAsString" value="<bean:write name="j2eestory" property="enddate" format="yyyy/MM/dd" />" /><br />
strutsconfigcontent<br />
<html:text name="j2eestory" property="strutsconfigcontent" /><br />

                                <c:choose>
                                    <c:when test="${empty andromdaCoreJarFiles}">
                                         <select name="andromdaCoreJarFile" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="andromdaCoreJarFile" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${andromdaCoreJarFiles}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq J2eeStory.andromdaCoreJarFile.id}">
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

