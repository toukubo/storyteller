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
	<tiles:put name="title" value="一般ユーザー" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostPublicUserVP">
          <html:hidden name="form" property="id"/>

名前<br />
<html:text name="form" property="name" /><br />

カナ<br />
<html:text name="form" property="kana" /><br />

郵便番号3桁<br />
<html:text name="form" property="zipthree" /><br />

郵便番号4桁<br />
<html:text name="form" property="zipfour" /><br />

メール確認<br />
<html:text name="form" property="mailforconfirm" /><br />

メール<br />
<html:text name="form" property="mail" /><br />

アドレス<br />
<html:text name="form" property="address" /><br />

建物名<br />
<html:text name="form" property="buildingname" /><br />

登録済み<br />
<html:checkbox name="form" property="registed" /><br />

fax<br />
<html:text name="form" property="fax" /><br />

電話番号<br />
<html:text name="form" property="phone" /><br />

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




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
