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
	<tiles:put name="title" value="設定ファイル" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostPolicyVP">
          <html:hidden name="form" property="id"/>

全てのプリンターの削減率<br />
<html:text size="40"  name="form" property="decreasedrateforall" /><br />

priviledgeowner<br />
<html:text size="40"  name="form" property="priviledgeowner" /><br />

新規追加プリンターの削減率<br />
<html:text size="40"  name="form" property="savingratefornewprinters" /><br />

保存期間<br />
<html:text size="40"  name="form" property="timetokeeplog" /><br />

サーバー名orIPアドレス<br />
<html:text size="40"  name="form" property="logserverhostaddress" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
