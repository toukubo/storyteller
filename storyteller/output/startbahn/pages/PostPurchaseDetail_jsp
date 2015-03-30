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
	<tiles:put name="title" value="購入" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostPurchaseVP">
          <html:hidden name="form" property="id"/>

合計<br />
<html:text size="40"  name="form" property="total" /><br />

送料<br />
<html:text size="40"  name="form" property="carriage" /><br />

サブトータル<br />
<html:text size="40"  name="form" property="subtotal" /><br />

合計注文数<br />
<html:text size="40"  name="form" property="totalordernum" /><br />

発送済み<br />
<html:checkbox name="form" property="shipped" /><br />

                                コレクター<br />
                                <c:choose>
                                    <c:when test="${empty Collectors}">
                                         <select name="collector" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="collector" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Collectors}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.collector.id}">
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


                                オークション<br />
                                <c:choose>
                                    <c:when test="${empty Auctions}">
                                         <select name="auction" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="auction" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Auctions}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.auction.id}">
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
