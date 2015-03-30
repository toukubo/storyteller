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
<span class="title">Customer 編集</span>
		<html:form method="POST" action="/CustomerVP">
          <html:hidden name="customer" property="id"/>

パスワード<br />
<html:text size="40"  name="form" property="password" /><br />

携帯番号<br />
<html:text size="40"  name="form" property="keitai" /><br />

カナ<br />
<html:text size="40"  name="form" property="kana" /><br />

メール<br />
<html:text size="40"  name="form" property="mail" /><br />

郵便番号3桁<br />
<html:text size="40"  name="form" property="zipthree" /><br />

郵便番号4桁<br />
<html:text size="40"  name="form" property="zipfour" /><br />

県<br />
<html:text size="40"  name="form" property="pref" /><br />

建物名<br />
<html:text size="40"  name="form" property="buildingname" /><br />

電話番号<br />
<html:text size="40"  name="form" property="phone" /><br />

住所<br />
<html:text size="40"  name="form" property="blocknumber" /><br />

生年<br />
<html:text size="40"  name="form" property="birthyear" /><br />

生月<br />
<html:text size="40"  name="form" property="birthmonth" /><br />

誕生日<br />
<html:text size="40"  name="form" property="brithday" /><br />

メール確認<br />
<html:text size="40"  name="form" property="mailforconfirm" /><br />

municipality<br />
<html:text size="40"  name="form" property="municipality" /><br />

男性<br />
<html:checkbox name="form" property="male" /><br />

管理者<br />
<html:checkbox name="form" property="admin" /><br />

削除済み<br />
<html:checkbox name="form" property="removed" /><br />

名前<br />
<html:text size="40"  name="form" property="deliveryname" /><br />

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

郵便番号4桁<br />
<html:text size="40"  name="form" property="deliveryzipfour" /><br />

郵便番号3桁<br />
<html:text size="40"  name="form" property="deliveryzipthree" /><br />

都道府県<br />
<html:text size="40"  name="form" property="deliverypref" /><br />

別のアドレスへ<br />
<html:checkbox name="form" property="delivertodifferentaddress" /><br />

住所<br />
<html:text size="40"  name="form" property="deliveryaddress" /><br />

名前<br />
<html:text size="40"  name="form" property="name" /><br />

アドレス<br />
<html:text size="40"  name="form" property="address" /><br />



          <html:submit />
		</html:form>
</div>

<div class="sub">


</div>
	</body>
</html:html>


