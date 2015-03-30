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
	<tiles:put name="title" value="一般設定" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostStaticDataVP">
          <html:hidden name="form" property="id"/>

ヘッダー<br />
<html:text name="form" property="header" /><br />

フッター<br />
<html:text name="form" property="footer" /><br />

サイトからのメールのフロム部位のアドレス<br />
<html:text name="form" property="fromaddress" /><br />

サイト名<br />
<html:text name="form" property="sitename" /><br />

mediaserverurl<br />
<html:text name="form" property="mediaserverurl" /><br />

unix<br />
<html:checkbox name="form" property="unix" /><br />

basepath<br />
<html:text name="form" property="basepath" /><br />

待機間隔<br />
<html:text name="form" property="sleepsecound" /><br />

エラーアドレス<br />
<html:text name="form" property="erroraddress" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
