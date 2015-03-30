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

電話番号<br />
<html:text name="form" property="phone" /><br />

配送日<br />
<html:text name="form" property="deliverydate" /><br />

郵便番号3桁<br />
<html:text name="form" property="zipthree" /><br />

削除済み<br />
<html:checkbox name="form" property="removed" /><br />

アドレス<br />
<html:text name="form" property="address" /><br />

名前<br />
<html:text name="form" property="name" /><br />

パスワード<br />
<html:text name="form" property="password" /><br />

住所<br />
<html:text name="form" property="deliveryblocknumber" /><br />

カナ<br />
<html:text name="form" property="deliverykana" /><br />

電話番号<br />
<html:text name="form" property="deliveryphone" /><br />

配送時間<br />
<html:text name="form" property="devliveryhour" /><br />

カナ<br />
<html:text name="form" property="kana" /><br />

郵便番号4桁<br />
<html:text name="form" property="zipfour" /><br />

メール<br />
<html:text name="form" property="mail" /><br />

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

tumblraccount<br />
<html:text name="form" property="tumblraccount" /><br />

tumblrpassword<br />
<html:text name="form" property="tumblrpassword" /><br />

deliciousaccount<br />
<html:text name="form" property="deliciousaccount" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
