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
		<html:form method="POST" action="/PostQuoteVP">
          <html:hidden name="form" property="id"/>

sentence<br />
<html:text name="form" property="sentence" /><br />

                                keyword<br />
                                <c:choose>
                                    <c:when test="${empty Keywords}">
                                         <select name="keyword" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="keyword" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Keywords}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.keyword.id}">
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


studiovoice<br />
<html:checkbox name="form" property="studiovoice" /><br />

                                post<br />
                                <c:choose>
                                    <c:when test="${empty Posts}">
                                         <select name="post" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="post" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Posts}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.post.id}">
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


source<br />
<html:text name="form" property="source" /><br />

image<br />
<html:checkbox name="form" property="image" /><br />

banned<br />
<html:checkbox name="form" property="banned" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
