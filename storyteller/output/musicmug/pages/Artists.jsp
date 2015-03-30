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

<span class="title">一覧</span>
                    <display:table name="${artists}" id="row" requestURI="Artists.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Artists.do?id=${row.id}">編集</a>
                        <a href="DeleteArtist.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="アドレス">
<nobr>
${row.address}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="status">
<nobr>
${row.status}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="パスワード">
<nobr>
${row.password}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="url">
<nobr>
${row.url}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="担当者">
<nobr>
${row.responsible}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メール">
<nobr>
${row.mail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
<nobr>
${row.intraUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アカウント">
<nobr>
${row.account}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="fax">
<nobr>
${row.fax}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="contact">
<nobr>
${row.contact}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="カナ">
<nobr>
${row.kana}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="artistnum">
<nobr>
${row.artistnum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="blogrss">
<nobr>
${row.blogrss}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="delicious">
<nobr>
${row.delicious}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="flickraccount">
<nobr>
${row.flickraccount}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="lastfmaccount">
<nobr>
${row.lastfmaccount}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="profile">
<nobr>
${row.profile}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ininterview">
<nobr>
${row.ininterview}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="worksandstyle">
<nobr>
${row.worksandstyle}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="history">
<nobr>
${row.history}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="誕生日"><nobr>
<bean:write name="row" property="birthdate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="typeofbusiness">
<nobr>
${row.typeofbusiness}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="city">
<nobr>
${row.city}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="countrystr">
<nobr>
${row.countrystr}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="電話番号">
<nobr>
${row.phone}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="responsiblephone">
<nobr>
${row.responsiblephone}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="responsiblemail">
<nobr>
${row.responsiblemail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="awards">
<nobr>
${row.awards}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="展覧会">
<nobr>
${row.exhibitions}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="clients">
<nobr>
${row.clients}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="支払方法">
<nobr>
${row.paymentmethod}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="銀行">
<nobr>
${row.bank}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="支店名">
<nobr>
${row.bankbranch}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="銀行名">
<nobr>
${row.brankname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="銀行口座番号">
<nobr>
${row.bankaccount}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="口座名">
<nobr>
${row.bankaccountname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ibanno">
<nobr>
${row.ibanno}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="swiftbicno">
<nobr>
${row.swiftbicno}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="最近の">
<nobr>
${row.recentlyadded}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="人気度">
<nobr>
${row.poplularity}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japanesename">
<nobr>
${row.japanesename}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ニュース">
<nobr>
${row.news}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="製品">
<nobr>
${row.products}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="basiclanguage">
<nobr>
${row.basiclanguage}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japaneseprofile">
<nobr>
${row.japaneseprofile}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="organizer">
<nobr>
${row.organizer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japaneseexhibitions">
<nobr>
${row.japaneseexhibitions}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japanesetypeofbusiness">
<nobr>
${row.japanesetypeofbusiness}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japaneseclients">
<nobr>
${row.japaneseclients}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japaneseorganizer">
<nobr>
${row.japaneseorganizer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japaneseaddress">
<nobr>
${row.japaneseaddress}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japaneseawards">
<nobr>
${row.japaneseawards}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japaneseresponsible">
<nobr>
${row.japaneseresponsible}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japanesebank">
<nobr>
${row.japanesebank}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japanesebranchname">
<nobr>
${row.japanesebranchname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="japanesebankaccountname">
<nobr>
${row.japanesebankaccountname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="inboundReferences">
<nobr>
${row.inboundReferences}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="cDs">
<nobr>
${row.cDs}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="lives">
<nobr>
${row.lives}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="bbsThreads">
<nobr>
${row.bbsThreads}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="cards">
<nobr>
${row.cards}
</nobr>
</display:column>

                    </display:table>
<a href="Artists.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Artists.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Artists.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Artists.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	編集
</span>
<span id="subform">

		<form method="POST" action="PostArtistVP.do">
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



          <html:submit value="save" />
		</form>
</span>
                        <a href="Artists.do">新規作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

