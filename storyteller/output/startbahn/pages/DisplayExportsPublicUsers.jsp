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
                    <display:table name="${publicUsers}" id="row" requestURI="PublicUsers.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="password" title="パスワード"/>
<display:column media="xml csv excel pdf" property="url" title="url"/>
<display:column media="xml csv excel pdf" property="poplularity" title="人気度"/>
<display:column media="xml csv excel pdf" property="recentlyadded" title="最近の"/>
<display:column media="xml csv excel pdf" property="kana" title="カナ"/>
<display:column media="xml csv excel pdf" property="mail" title="メール"/>
<display:column media="xml csv excel pdf" property="account" title="アカウント"/>
<display:column media="xml csv excel pdf" property="artist" title="アーティスト"/>
<display:column media="xml csv excel pdf" property="poplular" title="人気"/>
<display:column media="xml csv excel pdf" property="contact" title="contact"/>
<display:column media="xml csv excel pdf" property="blogrss" title="blogrss"/>
<display:column media="xml csv excel pdf" property="delicious" title="delicious"/>
<display:column media="xml csv excel pdf" property="flickraccount" title="flickraccount"/>
<display:column media="xml csv excel pdf" property="profile" title="profile"/>
<display:column media="xml csv excel pdf" property="ininterview" title="ininterview"/>
<display:column media="xml csv excel pdf" property="history" title="history"/>
<display:column media="xml csv excel pdf" property="birthdate" title="誕生日"/>
<display:column media="xml csv excel pdf" property="city" title="city"/>
<display:column media="xml csv excel pdf" property="countrystr" title="countrystr"/>
<display:column media="xml csv excel pdf" property="clients" title="clients"/>
<display:column media="xml csv excel pdf" property="bank" title="銀行"/>
<display:column media="xml csv excel pdf" property="bankbranch" title="支店名"/>
<display:column media="xml csv excel pdf" property="brankname" title="銀行名"/>
<display:column media="xml csv excel pdf" property="bankaccount" title="銀行口座番号"/>
<display:column media="xml csv excel pdf" property="bankaccountname" title="口座名"/>
<display:column media="xml csv excel pdf" property="branchaddress" title="branchaddress"/>
<display:column media="xml csv excel pdf" property="collector" title="コレクター"/>
<display:column media="xml csv excel pdf" property="joinings" title="参加"/>
<display:column media="xml csv excel pdf" property="topimageid" title="topimageid"/>
<display:column media="xml csv excel pdf" property="favoritegenre" title="favoritegenre"/>
<display:column media="xml csv excel pdf" property="belonging" title="belonging"/>
<display:column media="xml csv excel pdf" property="birthplace" title="birthplace"/>
<display:column media="xml csv excel pdf" property="reviewer" title="reviewer"/>
<display:column media="xml csv excel pdf" property="folders" title="フォルダ"/>
<display:column media="xml csv excel pdf" property="fromMessage" title="fromMessage"/>
<display:column media="xml csv excel pdf" property="toMessage" title="toMessage"/>
<display:column media="xml csv excel pdf" property="name" title="名前"/>
<display:column media="xml csv excel pdf" property="date" title="日付"/>
<display:column media="xml csv excel pdf" property="address" title="アドレス"/>

                    </display:table>


