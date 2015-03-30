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

<form action="SetSelectionOfPublicUser##attr##.do" method="post" name="form">
<a href="${from}.do?pagesize=20">20件</a>
<a href="${from}.do?pagesize=50">50件</a>
<a href="${from}.do?pagesize=100">100件</a>
<a href="${from}.do?pagesize=200">200件</a>
<a href="${from}.do?pagesize=300">300件</a>
<a href="${from}.do?pagesize=500">500件</a>
<a href="#" onclick="selectall(form);">select all</a>
<span class="title">publicUsers</span>
                    <display:table name="${publicUsers}" id="row" requestURI="PublicUsers.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="PublicUserDetail.do?id=${row.id}">ed</a>
                        <a href="DeletePublicUser.do?id=${row.id}">del</a>
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
 <display:column media="html" sortable="true" title="配送時間">
<nobr>
${row.devliveryhour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="配送日">
<nobr>
${row.deliverydate}
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
 <display:column media="html" sortable="true" title="注文">
<nobr>
${row.orders}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="purchases">
<nobr>
${row.purchases}
</nobr>
</display:column>

                    </display:table>


                        <a href="PublicUserDetail.do">new PublicUser</a>
<html:submit />
</form>
</div>


<div class="sub">

		<html:form method="POST" action="/PublicUserVP">
          <html:hidden name="publicUser" property="id"/>

名前<br />
<html:text size="40"  name="form" property="name" /><br />

アドレス<br />
<html:text size="40"  name="form" property="address" /><br />

パスワード<br />
<html:text size="40"  name="form" property="password" /><br />

削除済み<br />
<html:checkbox name="form" property="removed" /><br />

メール<br />
<html:text size="40"  name="form" property="mail" /><br />

郵便番号3桁<br />
<html:text size="40"  name="form" property="zipthree" /><br />

郵便番号4桁<br />
<html:text size="40"  name="form" property="zipfour" /><br />

カナ<br />
<html:text size="40"  name="form" property="kana" /><br />

電話番号<br />
<html:text size="40"  name="form" property="phone" /><br />

配送時間<br />
<html:text size="40"  name="form" property="devliveryhour" /><br />

配送日<br />
<html:text size="40"  name="form" property="deliverydate" /><br />

電話番号<br />
<html:text size="40"  name="form" property="deliveryphone" /><br />

カナ<br />
<html:text size="40"  name="form" property="deliverykana" /><br />

住所<br />
<html:text size="40"  name="form" property="deliveryblocknumber" /><br />

住所<br />
<html:text size="40"  name="form" property="deliveryaddress" /><br />

名前<br />
<html:text size="40"  name="form" property="deliveryname" /><br />

郵便番号4桁<br />
<html:text size="40"  name="form" property="deliveryzipfour" /><br />

郵便番号3桁<br />
<html:text size="40"  name="form" property="deliveryzipthree" /><br />

都道府県<br />
<html:text size="40"  name="form" property="deliverypref" /><br />

別のアドレスへ<br />
<html:checkbox name="form" property="delivertodifferentaddress" /><br />

住所<br />
<html:text size="40"  name="form" property="blocknumber" /><br />

男性<br />
<html:checkbox name="form" property="male" /><br />

誕生日<br />
<html:text size="40"  name="form" property="brithday" /><br />

メール確認<br />
<html:text size="40"  name="form" property="mailforconfirm" /><br />

生月<br />
<html:text size="40"  name="form" property="birthmonth" /><br />

municipality<br />
<html:text size="40"  name="form" property="municipality" /><br />

生年<br />
<html:text size="40"  name="form" property="birthyear" /><br />

携帯番号<br />
<html:text size="40"  name="form" property="keitai" /><br />

建物名<br />
<html:text size="40"  name="form" property="buildingname" /><br />

県<br />
<html:text size="40"  name="form" property="pref" /><br />

管理者<br />
<html:checkbox name="form" property="admin" /><br />



          <html:submit />
		</html:form>
</div>






	</body>
</html:html>

