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
	<tiles:put name="title" value="車種" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostCarVP">
          <html:hidden name="form" property="id"/>

グループ名<br />
<html:text name="form" property="groupname" /><br />

販売費<br />
<html:text name="form" property="salescost" /><br />

軽自動車<br />
<html:checkbox name="form" property="lightcar" /><br />

ソート順<br />
<html:text name="form" property="sortorder" /><br />

短縮車種<br />
<html:text name="form" property="shortcarline" /><br />

商用車<br />
<html:checkbox name="form" property="bussinesscar" /><br />

                                groupOfCarLine<br />
                                <c:choose>
                                    <c:when test="${empty GroupOfCarLines}">
                                         <select name="groupOfCarLine" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="groupOfCarLine" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${GroupOfCarLines}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.groupOfCarLine.id}">
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
