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
<html:text size="40"  name="form" property="password" /><br />

url<br />
<html:text size="40"  name="form" property="url" /><br />

人気度<br />
<html:text size="40"  name="form" property="poplularity" /><br />

最近の<br />
<html:checkbox name="form" property="recentlyadded" /><br />

カナ<br />
<html:text size="40"  name="form" property="kana" /><br />

メール<br />
<html:text size="40"  name="form" property="mail" /><br />

アカウント<br />
<html:text size="40"  name="form" property="account" /><br />

                                アーティスト<br />
                                <c:choose>
                                    <c:when test="${empty Artists}">
                                         <select name="artist" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="artist" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Artists}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.artist.id}">
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


人気<br />
<html:checkbox name="form" property="poplular" /><br />

contact<br />
<html:text size="40"  name="form" property="contact" /><br />

blogrss<br />
<html:text size="40"  name="form" property="blogrss" /><br />

delicious<br />
<html:text size="40"  name="form" property="delicious" /><br />

flickraccount<br />
<html:text size="40"  name="form" property="flickraccount" /><br />

profile<br />
<html:text size="40"  name="form" property="profile" /><br />

ininterview<br />
<html:text size="40"  name="form" property="ininterview" /><br />

history<br />
<html:text size="40"  name="form" property="history" /><br />

誕生日<br />
<input type="text" name="birthdateAsString" value="<st:date date="${form.birthdate}" size="20" />" /><br />
city<br />
<html:text size="40"  name="form" property="city" /><br />

countrystr<br />
<html:text size="40"  name="form" property="countrystr" /><br />

clients<br />
<html:text size="40"  name="form" property="clients" /><br />

銀行<br />
<html:text size="40"  name="form" property="bank" /><br />

支店名<br />
<html:text size="40"  name="form" property="bankbranch" /><br />

銀行名<br />
<html:text size="40"  name="form" property="brankname" /><br />

銀行口座番号<br />
<html:text size="40"  name="form" property="bankaccount" /><br />

口座名<br />
<html:text size="40"  name="form" property="bankaccountname" /><br />

branchaddress<br />
<html:text size="40"  name="form" property="branchaddress" /><br />

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


topimageid<br />
<html:text size="40"  name="form" property="topimageid" /><br />

favoritegenre<br />
<html:text size="40"  name="form" property="favoritegenre" /><br />

belonging<br />
<html:text size="40"  name="form" property="belonging" /><br />

birthplace<br />
<html:text size="40"  name="form" property="birthplace" /><br />

                                reviewer<br />
                                <c:choose>
                                    <c:when test="${empty Reviewers}">
                                         <select name="reviewer" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="reviewer" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Reviewers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.reviewer.id}">
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
<html:text size="40"  name="form" property="name" /><br />

日付<br />
<input type="text" name="dateAsString" value="<st:date date="${form.date}" size="20" />" /><br />
アドレス<br />
<html:text size="40"  name="form" property="address" /><br />

                                付属品<br />
                                <c:choose>
                                    <c:when test="${empty Attachments}">
                                         <select name="attachment" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="attachment" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Attachments}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.attachment.id}">
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


男性<br />
<html:checkbox name="form" property="male" /><br />

onewordmessage<br />
<html:text size="40"  name="form" property="onewordmessage" /><br />

displayname<br />
<html:text size="40"  name="form" property="displayname" /><br />

css<br />
<html:text size="40"  name="form" property="css" /><br />

superuser<br />
<html:checkbox name="form" property="superuser" /><br />

                                mpaMarking<br />
                                <c:choose>
                                    <c:when test="${empty MpaMarkings}">
                                         <select name="mpaMarking" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="mpaMarking" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${MpaMarkings}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.mpaMarking.id}">
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


                                invitation<br />
                                <c:choose>
                                    <c:when test="${empty Invitations}">
                                         <select name="invitation" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="invitation" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Invitations}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.invitation.id}">
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
