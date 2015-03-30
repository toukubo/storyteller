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
	<tiles:put name="title" value="一般ユーザー" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostPublicUserVP">
          <html:hidden name="form" property="id"/>

パスワード<br />
<html:text size="20"  name="form" property="password" /><br />

メール<br />
<html:text size="20"  name="form" property="mail" /><br />

郵便番号3桁<br />
<html:text size="20"  name="form" property="zipthree" /><br />

郵便番号4桁<br />
<html:text size="20"  name="form" property="zipfour" /><br />

配送日<br />
<html:text size="20"  name="form" property="deliverydate" /><br />

カナ<br />
<html:text size="20"  name="form" property="kana" /><br />

電話番号<br />
<html:text size="20"  name="form" property="phone" /><br />

配送時間<br />
<html:text size="20"  name="form" property="devliveryhour" /><br />

電話番号<br />
<html:text size="20"  name="form" property="deliveryphone" /><br />

カナ<br />
<html:text size="20"  name="form" property="deliverykana" /><br />

住所<br />
<html:text size="20"  name="form" property="deliveryblocknumber" /><br />

住所<br />
<html:text size="20"  name="form" property="deliveryaddress" /><br />

名前<br />
<html:text size="20"  name="form" property="deliveryname" /><br />

郵便番号4桁<br />
<html:text size="20"  name="form" property="deliveryzipfour" /><br />

郵便番号3桁<br />
<html:text size="20"  name="form" property="deliveryzipthree" /><br />

都道府県<br />
<html:text size="20"  name="form" property="deliverypref" /><br />

別のアドレスへ<br />
<html:checkbox name="form" property="delivertodifferentaddress" /><br />

住所<br />
<html:text size="20"  name="form" property="blocknumber" /><br />

男性<br />
<html:checkbox name="form" property="male" /><br />

誕生日<br />
<html:text size="20"  name="form" property="brithday" /><br />

メール確認<br />
<html:text size="20"  name="form" property="mailforconfirm" /><br />

生月<br />
<html:text size="20"  name="form" property="birthmonth" /><br />

municipality<br />
<html:text size="20"  name="form" property="municipality" /><br />

生年<br />
<html:text size="20"  name="form" property="birthyear" /><br />

携帯番号<br />
<html:text size="20"  name="form" property="keitai" /><br />

建物名<br />
<html:text size="20"  name="form" property="buildingname" /><br />

県<br />
<html:text size="20"  name="form" property="pref" /><br />

管理者<br />
<html:checkbox name="form" property="admin" /><br />

削除済み<br />
<html:checkbox name="form" property="removed" /><br />

                                サイト<br />
                                <c:choose>
                                    <c:when test="${empty Sites}">
                                         <select name="site" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="site" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Sites}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.site.id}">
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


名前<br />
<html:text size="20"  name="form" property="name" /><br />

アドレス<br />
<html:text size="20"  name="form" property="address" /><br />

keitaimail<br />
<html:text size="20"  name="form" property="keitaimail" /><br />

language<br />
<html:text size="20"  name="form" property="language" /><br />

subject<br />
<html:text size="20"  name="form" property="subject" /><br />

department<br />
<html:text size="20"  name="form" property="department" /><br />

componeyname<br />
<html:text size="20"  name="form" property="componeyname" /><br />

comment<br />
<html:text size="20"  name="form" property="comment" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
