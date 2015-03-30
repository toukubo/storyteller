<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<%@ taglib uri="http://www.enclosing.net/tags/storyteller" prefix="st" %>


<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<%@ page isELIgnored="false" %>

<tiles:insert definition=".layout">
	<tiles:put name="title" value="クライアント" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostCustomerVP">
          <html:hidden name="form" property="id"/>

メール<br />
<html:text size="40"  name="form" property="mail" /><br />

担当者名前(カナ)<br />
<html:text size="40"  name="form" property="kana" /><br />

電話番号<br />
<html:text size="40"  name="form" property="phone" /><br />

顧客コード<br />
<html:text size="40"  name="form" property="code" /><br />

携帯電話番号<br />
<html:text size="40"  name="form" property="mobilephone" /><br />

顧客分類<br />
<html:text size="40"  name="form" property="category" /><br />

住所番号<br />
<html:text size="40"  name="form" property="addresno" /><br />

メモ<br />
<html:text size="40"  name="form" property="memo" /><br />

取引銀行<br />
<html:text size="40"  name="form" property="dealingsbank" /><br />

取引開始日<br />
<input type="text" name="startupdateAsString" value="<st:date date="${form.startupdate}" />" size="20" />
<br />
会社名<br />
<html:text size="40"  name="form" property="company" /><br />

担当者役職<br />
<html:text size="40"  name="form" property="officialposition" /><br />

担当者名前<br />
<html:text size="40"  name="form" property="name" /><br />

印刷有無<br />
<html:checkbox name="form" property="printout" /><br />

deleted<br />
<html:checkbox name="form" property="deleted" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
