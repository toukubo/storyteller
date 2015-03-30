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
	<tiles:put name="title" value="配送先" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostDeliveryAddressVP">
          <html:hidden name="form" property="id"/>

名前<br />
<html:text size="40"  name="form" property="name" /><br />

カナ<br />
<html:text size="40"  name="form" property="kana" /><br />

郵便番号3桁<br />
<html:text size="40"  name="form" property="zipthree" /><br />

郵便番号4桁<br />
<html:text size="40"  name="form" property="zipfour" /><br />

県<br />
<html:text size="40"  name="form" property="pref" /><br />

建物名<br />
<html:text size="40"  name="form" property="buildingname" /><br />

電話番号<br />
<html:text size="40"  name="form" property="phone" /><br />

                                一般ユーザー<br />
                                <c:choose>
                                    <c:when test="${empty PublicUsers}">
                                         <select name="publicUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="publicUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${PublicUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.publicUser.id}">
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


配送希望日<br />
<html:text size="40"  name="form" property="preferreddate" /><br />

配送希望時間<br />
<html:text size="40"  name="form" property="preferredtime" /><br />

                                giftCard<br />
                                <c:choose>
                                    <c:when test="${empty GiftCards}">
                                         <select name="giftCard" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="giftCard" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${GiftCards}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.giftCard.id}">
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


hasgiftcard<br />
<html:checkbox name="form" property="hasgiftcard" /><br />

アドレス<br />
<html:text size="40"  name="form" property="address" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
