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
		<html:form method="POST" action="/PostItemVP">
          <html:hidden name="form" property="id"/>

名前<br />
<html:text size="40"  name="form" property="name" /><br />

商品No<br />
<html:text size="40"  name="form" property="no" /><br />

税込み<br />
<html:text size="40"  name="form" property="pricewithtax" /><br />

サイズ<br />
<html:text size="40"  name="form" property="size" /><br />

素材<br />
<html:text size="40"  name="form" property="material" /><br />

キャッチコピー<br />
<html:text size="40"  name="form" property="catchcopy" /><br />

説明<br />
<html:text size="40"  name="form" property="description" /><br />

                                製品<br />
                                <c:choose>
                                    <c:when test="${empty Products}">
                                         <select name="product" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="product" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Products}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.product.id}">
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


                                送料<br />
                                <c:choose>
                                    <c:when test="${empty Carriages}">
                                         <select name="carriage" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="carriage" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Carriages}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.carriage.id}">
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


注釈<br />
<html:text size="40"  name="form" property="note" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
