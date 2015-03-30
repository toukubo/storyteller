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
<span class="title">ArtistTagging 編集</span>
		<html:form method="POST" action="/ArtistTaggingVP">
          <html:hidden name="artistTagging" property="id"/>

                                tag<br />
                                <c:choose>
                                    <c:when test="${empty Tags}">
                                         <select name="tag" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="tag" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Tags}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.tag.id}">
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


                                artist<br />
                                <c:choose>
                                    <c:when test="${empty Artists}">
                                         <select name="artist" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="artist" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Artists}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.artist.id}">
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




          <html:submit value="保存"/>
		</html:form>
</div>

<div class="sub">


</div>
	</body>
</html:html>


