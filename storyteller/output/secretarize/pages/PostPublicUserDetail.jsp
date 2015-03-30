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
	<tiles:put name="title" value="一般ユーザー" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostPublicUserVP">
          <html:hidden name="form" property="id"/>

銀行<br />
<html:text size="40"  name="form" property="bank" /><br />

銀行口座番号<br />
<html:text size="40"  name="form" property="bankaccount" /><br />

名前<br />
<html:text size="40"  name="form" property="name" /><br />

アドレス<br />
<html:text size="40"  name="form" property="address" /><br />

日付<br />
<input type="text" name="dateAsString" value="<st:date date="${form.date}" size="20" />" /><br />
superuser<br />
<html:checkbox name="form" property="superuser" /><br />

branchname<br />
<html:text size="40"  name="form" property="branchname" /><br />

パスワード<br />
<html:text size="40"  name="form" property="password" /><br />

カナ<br />
<html:text size="40"  name="form" property="kana" /><br />

支店名<br />
<html:text size="40"  name="form" property="bankbranch" /><br />

口座名<br />
<html:text size="40"  name="form" property="bankaccountname" /><br />

アカウント<br />
<html:text size="40"  name="form" property="account" /><br />

メール<br />
<html:text size="40"  name="form" property="mail" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
