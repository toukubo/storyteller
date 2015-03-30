<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/tags/struts-html.tld" prefix="html" %>
<%@ taglib uri="/tags/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<%@ page isELIgnored="false" %>

<tiles:insert definition=".layout">
	<tiles:put name="title" value="" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostEventVP">
          <html:hidden name="form" property="id"/>

tag<br />
<html:text name="form" property="tag" /><br />

publish<br />
<html:text name="form" property="publish" /><br />

                                venue<br />
                                <c:choose>
                                    <c:when test="${empty Venues}">
                                         <select name="venue" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="venue" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Venues}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.venue.id}">
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


end<br />
<input type="text" name="endAsString" value="<bean:write name="form" property="end" format="yyyy/MM/dd" />" /><br />
start<br />
<input type="text" name="startAsString" value="<bean:write name="form" property="start" format="yyyy/MM/dd" />" /><br />
startdate<br />
<input type="text" name="startdateAsString" value="<bean:write name="form" property="startdate" format="yyyy/MM/dd" />" /><br />
enddate<br />
<input type="text" name="enddateAsString" value="<bean:write name="form" property="enddate" format="yyyy/MM/dd" />" /><br />
createdate<br />
<input type="text" name="createdateAsString" value="<bean:write name="form" property="createdate" format="yyyy/MM/dd" />" /><br />



          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
