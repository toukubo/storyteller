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
<span id="title">
	内部ユーザー編集
</span>
<span id="subform">
		<html:form method="POST" action="/PostIntraUserVP">
          <html:hidden name="form" property="id"/>

名前<br />
<html:text name="form" property="name" /><br />

日付<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />
アドレス<br />
<html:text name="form" property="address" /><br />

パスワード<br />
<html:text name="form" property="password" /><br />

メール<br />
<html:text name="form" property="mail" /><br />

時間単価<br />
<html:text name="form" property="costperhour" /><br />

電話番号<br />
<html:text name="form" property="phonenum" /><br />

コード<br />
<html:text name="form" property="code" /><br />

フラグ<br />
<html:text name="form" property="flag" /><br />

性別<br />
<html:text name="form" property="sex" /><br />

姓<br />
<html:text name="form" property="familyname" /><br />

ROI<br />
<html:text name="form" property="roi" /><br />

netincome<br />
<html:text name="form" property="netincome" /><br />

アカウント<br />
<html:text name="form" property="account" /><br />

rememberme<br />
<html:checkbox name="form" property="rememberme" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>


