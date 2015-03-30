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
	<tiles:put name="title" value="サイト" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostSiteVP">
          <html:hidden name="form" property="id"/>

ヘッダー<br />
<html:text name="form" property="header" /><br />

url<br />
<html:text name="form" property="url" /><br />

フッター<br />
<html:text name="form" property="footer" /><br />

モバイルURL<br />
<html:text name="form" property="mobileurl" /><br />

specialtemplateusing<br />
<html:checkbox name="form" property="specialtemplateusing" /><br />

userexporturl<br />
<html:text name="form" property="userexporturl" /><br />

ハッシュ<br />
<html:text name="form" property="hash" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
