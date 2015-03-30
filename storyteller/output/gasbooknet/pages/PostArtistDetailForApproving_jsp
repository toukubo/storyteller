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
	<tiles:put name="title" value="Artist" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostArtistVP">
          <html:hidden name="form" property="id"/>

名前<br />
<html:text name="form" property="name" /><br />

日付<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />
アドレス<br />
<html:text name="form" property="address" /><br />

url<br />
<html:text name="form" property="url" /><br />

担当者<br />
<html:text name="form" property="responsible" /><br />

メール<br />
<html:text name="form" property="mail" /><br />

                                country<br />
                                <c:choose>
                                    <c:when test="${empty Countrys}">
                                         <select name="country" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="country" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Countrys}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.country.id}">
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

lastfm　account<br />
<html:text name="form" property="lastfmaccount" /><br />

profile<br />
<html:text name="form" property="profile" /><br />

インタビュー<br />
<html:text name="form" property="ininterview" /><br />

worksandstyle<br />
<html:text name="form" property="worksandstyle" /><br />

history<br />
<html:text name="form" property="history" /><br />

誕生日<br />
<input type="text" name="birthdateAsString" value="<bean:write name="form" property="birthdate" format="yyyy/MM/dd" />" /><br />
職種<br />
<html:text name="form" property="typeofbusiness" /><br />

city<br />
<html:text name="form" property="city" /><br />

国<br />
<html:text name="form" property="countrystr" /><br />

電話番号<br />
<html:text name="form" property="phone" /><br />

担当者電話番号<br />
<html:text name="form" property="responsiblephone" /><br />

担当者E-Mailアドレス<br />
<html:text name="form" property="responsiblemail" /><br />

awards<br />
<html:text name="form" property="awards" /><br />

exhibitions<br />
<html:text name="form" property="exhibitions" /><br />

クライアント<br />
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

                                profileimage<br />
                                <c:choose>
                                    <c:when test="${empty Profileimages}">
                                         <select name="profileimage" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="profileimage" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Profileimages}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.profileimage.id}">
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


                                portrait<br />
                                <c:choose>
                                    <c:when test="${empty Portraits}">
                                         <select name="portrait" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="portrait" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Portraits}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.portrait.id}">
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


                                ジャンル<br />
                                <c:choose>
                                    <c:when test="${empty Genres}">
                                         <select name="genre" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="genre" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Genres}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.genre.id}">
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


                                artistXlsFile<br />
                                <c:choose>
                                    <c:when test="${empty ArtistXlsFiles}">
                                         <select name="artistXlsFile" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="artistXlsFile" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ArtistXlsFiles}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.artistXlsFile.id}">
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


account<br />
<html:text name="form" property="account" /><br />

password<br />
<html:text name="form" property="password" /><br />

japanesename<br />
<html:text name="form" property="japanesename" /><br />

japaneserepresentativekana<br />
<html:text name="form" property="japaneserepresentativekana" /><br />

japaneserepresentativename<br />
<html:text name="form" property="japaneserepresentativename" /><br />

representativeenglish<br />
<html:text name="form" property="representativeenglish" /><br />

profilejapanese<br />
<html:text name="form" property="profilejapanese" /><br />

status<br />
<html:text name="form" property="status" /><br />

organizer<br />
<html:text name="form" property="organizer" /><br />

japaneseorganizer<br />
<html:text name="form" property="japaneseorganizer" /><br />

japanesetypeofbusiness<br />
<html:text name="form" property="japanesetypeofbusiness" /><br />

japaneseaddress<br />
<html:text name="form" property="japaneseaddress" /><br />

japaneseresponsible<br />
<html:text name="form" property="japaneseresponsible" /><br />

japaneseawards<br />
<html:text name="form" property="japaneseawards" /><br />

japaneseclients<br />
<html:text name="form" property="japaneseclients" /><br />

japaneseprofile<br />
<html:text name="form" property="japaneseprofile" /><br />

japanesebranchname<br />
<html:text name="form" property="japanesebranchname" /><br />

japanesebank<br />
<html:text name="form" property="japanesebank" /><br />

japanesebankaccountname<br />
<html:text name="form" property="japanesebankaccountname" /><br />

japaneseexhibitions<br />
<html:text name="form" property="japaneseexhibitions" /><br />

basiclanguage<br />
<html:text name="form" property="basiclanguage" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
