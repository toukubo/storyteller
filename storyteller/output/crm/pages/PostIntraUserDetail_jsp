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
	<tiles:put name="title" value="内部ユーザー" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostIntraUserVP">
          <html:hidden name="form" property="id"/>

パスワード<br />
<html:text size="40"  name="form" property="password" /><br />

メール<br />
<html:text size="40"  name="form" property="mail" /><br />

電話番号<br />
<html:text size="40"  name="form" property="phone" /><br />

アカウント<br />
<html:text size="40"  name="form" property="account" /><br />

コード<br />
<html:text size="40"  name="form" property="code" /><br />

時間単価<br />
<html:text size="40"  name="form" property="costperhour" /><br />

性別<br />
<html:text size="40"  name="form" property="sex" /><br />

netincome<br />
<html:text size="40"  name="form" property="netincome" /><br />

名前<br />
<html:text size="40"  name="form" property="name" /><br />

フラグ<br />
<html:text size="40"  name="form" property="flag" /><br />

日付<br />
<input type="text" name="dateAsString" value="<st:date date="${form.date}" size="20" />" /><br />
アドレス<br />
<html:text size="40"  name="form" property="address" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
