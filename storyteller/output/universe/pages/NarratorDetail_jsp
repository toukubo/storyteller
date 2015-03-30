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
<span class="title">Narrator 編集</span>
		<html:form method="POST" action="/NarratorVP">
          <html:hidden name="narrator" property="id"/>

素材<br />
<html:text size="40"  name="form" property="material" /><br />

人気<br />
<html:checkbox name="form" property="poplular" /><br />

付属品<br />
<html:text size="40"  name="form" property="attachment" /><br />

公開<br />
<html:checkbox name="form" property="pub" /><br />

金額<br />
<html:text size="40"  name="form" property="price" /><br />

コード<br />
<html:text size="40"  name="form" property="code" /><br />

消費税<br />
<html:text size="40"  name="form" property="tax" /><br />

税込み<br />
<html:text size="40"  name="form" property="pricewithtax" /><br />

その他<br />
<html:text size="40"  name="form" property="misc" /><br />

descriptiontitle<br />
<html:text size="40"  name="form" property="descriptiontitle" /><br />

在庫数<br />
<html:text size="40"  name="form" property="stocknum" /><br />

合計在庫数<br />
<html:text size="40"  name="form" property="totalfixedprice" /><br />

重さ<br />
<html:text size="40"  name="form" property="weight" /><br />

注意書き<br />
<html:text size="40"  name="form" property="attention" /><br />

htmlforoption<br />
<html:text size="40"  name="form" property="htmlforoption" /><br />

名前<br />
<html:text size="40"  name="form" property="name" /><br />

サイズ<br />
<html:text size="40"  name="form" property="size" /><br />

色<br />
<html:text size="40"  name="form" property="color" /><br />

説明<br />
<html:text size="40"  name="form" property="description" /><br />

日付<br />
<input type="text" name="dateAsString" value="<st:date date="${form.date}" size="20" />" /><br />


          <html:submit />
		</html:form>
</div>

<div class="sub">


</div>
	</body>
</html:html>


