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
		<html:form method="POST" action="/PostArtistVP">
          <html:hidden name="form" property="id"/>

名前<br />
<html:text name="form" property="name" /><br />

日付<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />
アドレス<br />
<html:text name="form" property="address" /><br />

status<br />
<html:text name="form" property="status" /><br />

パスワード<br />
<html:text name="form" property="password" /><br />

url<br />
<html:text name="form" property="url" /><br />

担当者<br />
<html:text name="form" property="responsible" /><br />

メール<br />
<html:text name="form" property="mail" /><br />

                                内部ユーザー<br />
                                <c:choose>
                                    <c:when test="${empty IntraUsers}">
                                         <select name="intraUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="intraUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntraUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.intraUser.id}">
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


アカウント<br />
<html:text name="form" property="account" /><br />

fax<br />
<html:text name="form" property="fax" /><br />

contact<br />
<html:text name="form" property="contact" /><br />

カナ<br />
<html:text name="form" property="kana" /><br />

artistnum<br />
<html:text name="form" property="artistnum" /><br />

blogrss<br />
<html:text name="form" property="blogrss" /><br />

delicious<br />
<html:text name="form" property="delicious" /><br />

flickraccount<br />
<html:text name="form" property="flickraccount" /><br />

lastfmaccount<br />
<html:text name="form" property="lastfmaccount" /><br />

profile<br />
<html:text name="form" property="profile" /><br />

ininterview<br />
<html:text name="form" property="ininterview" /><br />

worksandstyle<br />
<html:text name="form" property="worksandstyle" /><br />

history<br />
<html:text name="form" property="history" /><br />

誕生日<br />
<input type="text" name="birthdateAsString" value="<bean:write name="form" property="birthdate" format="yyyy/MM/dd" />" /><br />
typeofbusiness<br />
<html:text name="form" property="typeofbusiness" /><br />

city<br />
<html:text name="form" property="city" /><br />

countrystr<br />
<html:text name="form" property="countrystr" /><br />

電話番号<br />
<html:text name="form" property="phone" /><br />

responsiblephone<br />
<html:text name="form" property="responsiblephone" /><br />

responsiblemail<br />
<html:text name="form" property="responsiblemail" /><br />

awards<br />
<html:text name="form" property="awards" /><br />

展覧会<br />
<html:text name="form" property="exhibitions" /><br />

clients<br />
<html:text name="form" property="clients" /><br />

支払方法<br />
<html:text name="form" property="paymentmethod" /><br />

銀行<br />
<html:text name="form" property="bank" /><br />

支店名<br />
<html:text name="form" property="bankbranch" /><br />

銀行名<br />
<html:text name="form" property="brankname" /><br />

銀行口座番号<br />
<html:text name="form" property="bankaccount" /><br />

口座名<br />
<html:text name="form" property="bankaccountname" /><br />

ibanno<br />
<html:text name="form" property="ibanno" /><br />

swiftbicno<br />
<html:text name="form" property="swiftbicno" /><br />

最近の<br />
<html:checkbox name="form" property="recentlyadded" /><br />

人気<br />
<html:checkbox name="form" property="poplular" /><br />

人気度<br />
<html:text name="form" property="poplularity" /><br />

japanesename<br />
<html:text name="form" property="japanesename" /><br />

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


basiclanguage<br />
<html:text name="form" property="basiclanguage" /><br />

japaneseprofile<br />
<html:text name="form" property="japaneseprofile" /><br />

organizer<br />
<html:text name="form" property="organizer" /><br />

japaneseexhibitions<br />
<html:text name="form" property="japaneseexhibitions" /><br />

japanesetypeofbusiness<br />
<html:text name="form" property="japanesetypeofbusiness" /><br />

japaneseclients<br />
<html:text name="form" property="japaneseclients" /><br />

japaneseorganizer<br />
<html:text name="form" property="japaneseorganizer" /><br />

japaneseaddress<br />
<html:text name="form" property="japaneseaddress" /><br />

japaneseawards<br />
<html:text name="form" property="japaneseawards" /><br />

japaneseresponsible<br />
<html:text name="form" property="japaneseresponsible" /><br />

japanesebank<br />
<html:text name="form" property="japanesebank" /><br />

japanesebranchname<br />
<html:text name="form" property="japanesebranchname" /><br />

japanesebankaccountname<br />
<html:text name="form" property="japanesebankaccountname" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>


