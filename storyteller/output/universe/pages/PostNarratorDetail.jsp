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
	<tiles:put name="title" value="出演者" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostNarratorVP">
          <html:hidden name="form" property="id"/>

メール<br />
<html:text size="40"  name="form" property="mail" /><br />

郵便番号4桁<br />
<html:text size="40"  name="form" property="zipfour" /><br />

郵便番号3桁<br />
<html:text size="40"  name="form" property="zipthree" /><br />

電話番号<br />
<html:text size="40"  name="form" property="phone" /><br />

金額<br />
<html:text size="40"  name="form" property="price" /><br />

男性<br />
<html:checkbox name="form" property="male" /><br />

携帯電話番号<br />
<html:text size="40"  name="form" property="mobilephone" /><br />

契約金<br />
<html:text size="40"  name="form" property="contractfee" /><br />

消費税も支払う<br />
<html:checkbox name="form" property="paywithtax" /><br />

基本情報マネジメント率<br />
<html:text size="40"  name="form" property="managementfee" /><br />

カナ<br />
<html:text size="40"  name="form" property="kana" /><br />

メモ<br />
<html:text size="40"  name="form" property="memo" /><br />

入金先銀行<br />
<html:text size="40"  name="form" property="paymentbank" /><br />

法人<br />
<html:checkbox name="form" property="corporation" /><br />

名前<br />
<html:text size="40"  name="form" property="name" /><br />

住所<br />
<html:text size="40"  name="form" property="address" /><br />

deleted<br />
<html:checkbox name="form" property="deleted" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
