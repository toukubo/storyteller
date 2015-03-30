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

<%--<html:html>
<tiles:insert page="/h.jsp"/>
<div id="main">
--%>
<tiles:insert definition=".layout">
	<tiles:put name="title" value="Verbs" direct="true" />
	<tiles:put name="side" direct="true">
	</tiles:put>
	<tiles:put name="content" direct="true"  >


                    <display:table name="${verbs}" id="row" requestURI="Verbs.do"
                            requestURIcontext="false"
                            export="true" pagesize="0" sort="list">
                        <display:column media="xml csv excel pdf"
                            property="name"
                            title="name"/>
                        <display:column media="html"
                            headerClass="name" paramId="name"
                            sortProperty="name" sortable="true"
                            title="name">
                                                        <a href="VerbDetail.do?id=${row.id}">${row.name}</a>
                            
</display:column>
                        <display:column media="html" headerClass="twoobjects" title="twoobjects">
                            <c:choose>
                                <c:when test="${row.twoobjects}"><input type="checkbox" checked="checked" disabled="disabled"/></c:when>
                                <c:otherwise><input type="checkbox" disabled="disabled"/></c:otherwise>
                            </c:choose>
                        </display:column>
                        <display:column media="xml csv excel pdf"
                            property="twoobjects" titleKey="verb.twoobjects"/>
                        <display:column media="html" headerClass="valid" title="valid">
                            <c:choose>
                                <c:when test="${row.valid}"><input type="checkbox" checked="checked" disabled="disabled"/></c:when>
                                <c:otherwise><input type="checkbox" disabled="disabled"/></c:otherwise>
                            </c:choose>
                        </display:column>
                        <display:column media="xml csv excel pdf"
                            property="valid" titleKey="verb.valid"/>
                    </display:table>
                    <a href="VerbDetail.do">new verb</a>
	</tiles:put>
</tiles:insert>
                  
                    
<%--</div>

	</body>
</html:html>
--%>
