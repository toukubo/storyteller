<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/tags/struts-html.tld" prefix="html" %>
<%@ taglib uri="/tags/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<%@ page isELIgnored="false" %>

<tiles:insert definition=".layout">
	<tiles:put name="title" value="一般ユーザー" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostPublicUserVP">
          <html:hidden name="form" property="id"/>

パスワード<br />
<html:text name="form" property="password" /><br />

コード<br />
<html:text name="form" property="code" /><br />

belonging<br />
<html:text name="form" property="belonging" /><br />

mailladdress<br />
<html:text name="form" property="mailladdress" /><br />

phonenumber<br />
<html:text name="form" property="phonenumber" /><br />

twitteraccount<br />
<html:text name="form" property="twitteraccount" /><br />

twittertoken<br />
<html:text name="form" property="twittertoken" /><br />

名前<br />
<html:text name="form" property="name" /><br />

comment<br />
<html:text name="form" property="comment" /><br />

種類<br />
<html:text name="form" property="type" /><br />

account<br />
<html:text name="form" property="account" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
