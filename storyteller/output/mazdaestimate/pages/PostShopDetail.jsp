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
	編集
</span>
<span id="subform">
		<html:form method="POST" action="/PostShopVP">
          <html:hidden name="form" property="id"/>

パスワード<br />
<html:text name="form" property="password" /><br />

アカウント<br />
<html:text name="form" property="account" /><br />

姓<br />
<html:text name="form" property="familyname" /><br />

名<br />
<html:text name="form" property="firstname" /><br />

                                prefecture<br />
                                <c:choose>
                                    <c:when test="${empty Prefectures}">
                                         <select name="prefecture" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="prefecture" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Prefectures}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.prefecture.id}">
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


                                block<br />
                                <c:choose>
                                    <c:when test="${empty Blocks}">
                                         <select name="block" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="block" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Blocks}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.block.id}">
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


