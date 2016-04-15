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
<%@ taglib uri="/formtag.tld" prefix="formtag" %> 
<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> 


<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<%@ page isELIgnored="false" %>

<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">
<span id="title">
	TaskTemplate編集
</span>
<span id="subform">
		<html:form method="POST" action="/PostTaskTemplateVP">
          <html:hidden name="form" property="id"/>

名前<br />
<html:text name="form" property="name" /><br />

                                役割<br />
                                <c:choose>
                                    <c:when test="${empty Roles}">
                                         <select name="role" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="role" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Roles}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.role.id}">
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


周期的<br />
<html:checkbox name="form" property="cyclic" /><br />

                                storytellerRole<br />
                                <c:choose>
                                    <c:when test="${empty StorytellerRoles}">
                                         <select name="storytellerRole" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="storytellerRole" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${StorytellerRoles}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.storytellerRole.id}">
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


注文数<br />
<html:text name="form" property="ordernum" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>


