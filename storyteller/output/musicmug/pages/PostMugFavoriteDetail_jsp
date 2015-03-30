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
<span id="title">
	MugFavorite編集
</span>
<span id="subform">
		<html:form method="POST" action="/PostMugFavoriteVP">
          <html:hidden name="form" property="id"/>

                                topublicuser<br />
                                <c:choose>
                                    <c:when test="${empty Topublicusers}">
                                         <select name="topublicuser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="topublicuser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Topublicusers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.topublicuser.id}">
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


                                frompublicuser<br />
                                <c:choose>
                                    <c:when test="${empty Frompublicusers}">
                                         <select name="frompublicuser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="frompublicuser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Frompublicusers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.frompublicuser.id}">
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

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>


