<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<%@ taglib uri="http://www.enclosing.net/tags/storyteller" prefix="st" %>


<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<%@ page isELIgnored="false" %>

<tiles:insert definition=".layout">
	<tiles:put name="title" value="" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostColumnChoiseVP">
          <html:hidden name="form" property="id"/>

                                excelTemplate<br />
                                <c:choose>
                                    <c:when test="${empty ExcelTemplates}">
                                         <select name="excelTemplate" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="excelTemplate" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ExcelTemplates}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.excelTemplate.id}">
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


                                columnDefinition<br />
                                <c:choose>
                                    <c:when test="${empty ColumnDefinitions}">
                                         <select name="columnDefinition" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="columnDefinition" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ColumnDefinitions}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.columnDefinition.id}">
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


maxlength<br />
<html:text name="form" property="maxlength" /><br />

displayed<br />
<html:checkbox name="form" property="displayed" /><br />

excelsheetnum<br />
<html:text name="form" property="excelsheetnum" /><br />

excelrownum<br />
<html:text name="form" property="excelrownum" /><br />

excelcolumnnum<br />
<html:text name="form" property="excelcolumnnum" /><br />

direction<br />
<html:text name="form" property="direction" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
