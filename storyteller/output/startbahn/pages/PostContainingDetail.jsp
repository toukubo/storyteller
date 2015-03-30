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
	<tiles:put name="title" value="Containing" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostContainingVP">
          <html:hidden name="form" property="id"/>

tag<br />
<html:text size="40"  name="form" property="tag" /><br />

                                作品<br />
                                <c:choose>
                                    <c:when test="${empty Works}">
                                         <select name="work" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="work" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Works}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.work.id}">
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


                                フォルダ<br />
                                <c:choose>
                                    <c:when test="${empty Folders}">
                                         <select name="folder" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="folder" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Folders}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.folder.id}">
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


model<br />
<html:text size="40"  name="form" property="model" /><br />

日付<br />
<input type="text" name="dateAsString" value="<st:date date="${form.date}" size="20" />" /><br />



          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
