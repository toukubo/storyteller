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

<span class="title">一般ユーザー一覧</span>
                    <display:table name="${publicUsers}" id="row" requestURI="PublicUsers.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="PublicUsers.do?id=${row.id}">編集</a>
                        <a href="DeletePublicUser.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="fromfootstamp">
<nobr>
${row.fromfootstamp}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="skin">
<nobr>
${row.skin.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="tofootstamp">
<nobr>
${row.tofootstamp}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アドレス">
<nobr>
${row.address}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="パスワード">
<nobr>
${row.password}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="削除済み">
<nobr>
${row.removed}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メール">
<nobr>
${row.mail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="郵便番号3桁">
<nobr>
${row.zipthree}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="郵便番号4桁">
<nobr>
${row.zipfour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="配送日">
<nobr>
${row.deliverydate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="カナ">
<nobr>
${row.kana}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="電話番号">
<nobr>
${row.phone}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artists}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="配送時間">
<nobr>
${row.devliveryhour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="電話番号">
<nobr>
${row.deliveryphone}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="カナ">
<nobr>
${row.deliverykana}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="住所">
<nobr>
${row.deliveryblocknumber}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="住所">
<nobr>
${row.deliveryaddress}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.deliveryname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="郵便番号4桁">
<nobr>
${row.deliveryzipfour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="郵便番号3桁">
<nobr>
${row.deliveryzipthree}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="都道府県">
<nobr>
${row.deliverypref}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="別のアドレスへ">
<nobr>
${row.delivertodifferentaddress}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="住所">
<nobr>
${row.blocknumber}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="男性">
<nobr>
${row.male}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="誕生日">
<nobr>
${row.brithday}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メール確認">
<nobr>
${row.mailforconfirm}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="生月">
<nobr>
${row.birthmonth}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="municipality">
<nobr>
${row.municipality}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="生年">
<nobr>
${row.birthyear}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="携帯番号">
<nobr>
${row.keitai}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="建物名">
<nobr>
${row.buildingname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="県">
<nobr>
${row.pref}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="管理者">
<nobr>
${row.admin}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アクセスログ">
<nobr>
${row.accessLogs}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="cards">
<nobr>
${row.cards}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ticketPurchases">
<nobr>
${row.ticketPurchases}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="favorites">
<nobr>
${row.favorites}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="tomugfavorite">
<nobr>
${row.tomugfavorite}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="frommessage">
<nobr>
${row.frommessage}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="tomessage">
<nobr>
${row.tomessage}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="fromfriendship">
<nobr>
${row.fromfriendship}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="tofriendship">
<nobr>
${row.tofriendship}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="tomugsharing">
<nobr>
${row.tomugsharing}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="frommugfavorite">
<nobr>
${row.frommugfavorite}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="frommugsharing">
<nobr>
${row.frommugsharing}
</nobr>
</display:column>

                    </display:table>
<a href="PublicUsers.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="PublicUsers.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="PublicUsers.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="PublicUsers.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	一般ユーザー編集
</span>
<span id="subform">

		<form method="POST" action="PostPublicUserVP.do">
          <html:hidden name="form" property="id"/>

                                skin<br />
                                <c:choose>
                                    <c:when test="${empty Skins}">
                                         <select name="skin" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="skin" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Skins}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.skin.id}">
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

アドレス<br />
<html:text name="form" property="address" /><br />

パスワード<br />
<html:text name="form" property="password" /><br />

削除済み<br />
<html:checkbox name="form" property="removed" /><br />

メール<br />
<html:text name="form" property="mail" /><br />

郵便番号3桁<br />
<html:text name="form" property="zipthree" /><br />

郵便番号4桁<br />
<html:text name="form" property="zipfour" /><br />

配送日<br />
<html:text name="form" property="deliverydate" /><br />

カナ<br />
<html:text name="form" property="kana" /><br />

電話番号<br />
<html:text name="form" property="phone" /><br />

配送時間<br />
<html:text name="form" property="devliveryhour" /><br />

電話番号<br />
<html:text name="form" property="deliveryphone" /><br />

カナ<br />
<html:text name="form" property="deliverykana" /><br />

住所<br />
<html:text name="form" property="deliveryblocknumber" /><br />

住所<br />
<html:text name="form" property="deliveryaddress" /><br />

名前<br />
<html:text name="form" property="deliveryname" /><br />

郵便番号4桁<br />
<html:text name="form" property="deliveryzipfour" /><br />

郵便番号3桁<br />
<html:text name="form" property="deliveryzipthree" /><br />

都道府県<br />
<html:text name="form" property="deliverypref" /><br />

別のアドレスへ<br />
<html:checkbox name="form" property="delivertodifferentaddress" /><br />

住所<br />
<html:text name="form" property="blocknumber" /><br />

男性<br />
<html:checkbox name="form" property="male" /><br />

誕生日<br />
<html:text name="form" property="brithday" /><br />

メール確認<br />
<html:text name="form" property="mailforconfirm" /><br />

生月<br />
<html:text name="form" property="birthmonth" /><br />

municipality<br />
<html:text name="form" property="municipality" /><br />

生年<br />
<html:text name="form" property="birthyear" /><br />

携帯番号<br />
<html:text name="form" property="keitai" /><br />

建物名<br />
<html:text name="form" property="buildingname" /><br />

県<br />
<html:text name="form" property="pref" /><br />

管理者<br />
<html:checkbox name="form" property="admin" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="PublicUsers.do">新規一般ユーザー作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

