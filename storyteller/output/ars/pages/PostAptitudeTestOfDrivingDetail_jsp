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

<tiles:insert definition=".layout">
	<tiles:put name="title" value="運転適性診断" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostAptitudeTestOfDrivingVP">
          <html:hidden name="form" property="id"/>

                                事故<br />
                                <c:choose>
                                    <c:when test="${empty Accidents}">
                                         <select name="accident" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="accident" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Accidents}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.accident.id}">
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


日付<br />
<input type="text" name="testdateAsString" value="<st:date date="${form.testdate}" size="20" />" /><br />
場所<br />
<html:text size="40"  name="form" property="testplace" /><br />

個人指導内容<br />
<html:text size="40"  name="form" property="individualguidance" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
