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
	<tiles:put name="title" value="ユーザー" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostUserVP">
          <html:hidden name="form" property="id"/>

パスワード<br />
<html:text name="form" property="password" /><br />

ユーザーネーム<br />
<html:text name="form" property="username" /><br />

メール<br />
<html:text name="form" property="mail" /><br />

追加日<br />
<input type="text" name="addeddateAsString" value="<bean:write name="form" property="addeddate" format="yyyy/MM/dd" />" /><br />
カナ<br />
<html:text name="form" property="kana" /><br />

英語名<br />
<html:text name="form" property="englishname" /><br />

性別<br />
<html:text name="form" property="sex" /><br />

電話番号<br />
<html:text name="form" property="phonenum" /><br />

ログイン状態を保存する<br />
<html:checkbox name="form" property="rememberme" /><br />

infoseekmail<br />
<html:text name="form" property="infoseekmail" /><br />

郵便番号<br />
<html:text name="form" property="zip" /><br />

建物名<br />
<html:text name="form" property="buildingname" /><br />

誕生日<br />
<input type="text" name="birthdateAsString" value="<bean:write name="form" property="birthdate" format="yyyy/MM/dd" />" /><br />
mailhp<br />
<html:text name="form" property="mailhp" /><br />

mailpass<br />
<html:text name="form" property="mailpass" /><br />

銀行未登録<br />
<html:checkbox name="form" property="bankvalid" /><br />

銀行<br />
<html:text name="form" property="bank" /><br />

yuchonum<br />
<html:text name="form" property="yuchonum" /><br />

口座番号<br />
<html:text name="form" property="banknumber" /><br />

口座名<br />
<html:text name="form" property="bankaccountname" /><br />

身分証明書No<br />
<html:text name="form" property="certificationNumber" /><br />

コミッション支払残高<br />
<html:text name="form" property="currentcommition" /><br />

支払済コミッション<br />
<html:text name="form" property="paidcommition" /><br />

                                身分証明書<br />
                                <c:choose>
                                    <c:when test="${empty CertificationTypes}">
                                         <select name="certificationType" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="certificationType" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${CertificationTypes}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.certificationType.id}">
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
<html:text name="form" property="name" /><br />

フラグ<br />
<html:text name="form" property="flag" /><br />

説明<br />
<html:text name="form" property="description" /><br />

アドレス<br />
<html:text name="form" property="address" /><br />

禁止<br />
<html:checkbox name="form" property="banned" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
