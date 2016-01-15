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
<span class="title">J2eeStory ï“èW</span>
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



          <html:submit value="ï€ë∂"/>
		</html:form>
</div>

<div class="sub">


</div>
	</body>
</html:html>


