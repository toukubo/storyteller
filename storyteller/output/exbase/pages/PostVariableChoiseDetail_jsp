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
		<html:form method="POST" action="/PostVariableChoiseVP">
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


restrictionOperator<br />
<html:text name="form" property="restrictionOperator" /><br />

restrictionValue<br />
<html:text name="form" property="restrictionValue" /><br />

                                restrictedColumnDefinition<br />
                                <c:choose>
                                    <c:when test="${empty RestrictedColumnDefinitions}">
                                         <select name="restrictedColumnDefinition" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="restrictedColumnDefinition" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${RestrictedColumnDefinitions}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.restrictedColumnDefinition.id}">
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


                                labelColumnDefinition<br />
                                <c:choose>
                                    <c:when test="${empty LabelColumnDefinitions}">
                                         <select name="labelColumnDefinition" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="labelColumnDefinition" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${LabelColumnDefinitions}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.labelColumnDefinition.id}">
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


                                optionColumnDefinition<br />
                                <c:choose>
                                    <c:when test="${empty OptionColumnDefinitions}">
                                         <select name="optionColumnDefinition" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="optionColumnDefinition" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${OptionColumnDefinitions}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.optionColumnDefinition.id}">
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





          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
