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

priviledgeowner<br />
<html:text name="form" property="priviledgeowner" /><br />

プリンター毎に削減率を設定<br />
<html:checkbox name="form" property="decreaseratebyprinter" /><br />

全てのプリンターの削減率<br />
<html:text name="form" property="decreasedrateforall" /><br />

新規追加プリンターの削減率<br />
<html:text name="form" property="savingratefornewprinters" /><br />

保存期間<br />
<html:text name="form" property="timetokeeplog" /><br />

印刷ログを保存<br />
<html:checkbox name="form" property="donotdeletelog" /><br />

ログを削除しない<br />
<html:checkbox name="form" property="keeplog" /><br />

印刷ログをTonerSaverログサーバーに保存<br />
<html:checkbox name="form" property="keeplogonserver" /><br />

サーバー名orIPアドレス<br />
<html:text name="form" property="logserverhostaddress" /><br />

除外アプリケーションを設定<br />
<html:checkbox name="form" property="excludesapplications" /><br />

除外プリンターを設定<br />
<html:checkbox name="form" property="excludesprinters" /><br />

temp<br />
<html:checkbox name="form" property="temp" /><br />

name<br />
<html:text name="form" property="name" /><br />

transfarport<br />
<html:text name="form" property="transfarport" /><br />

transfarintcp<br />
<html:checkbox name="form" property="transfarintcp" /><br />

useserverforpolicyconfig<br />
<html:checkbox name="form" property="useserverforpolicyconfig" /><br />

lisenceserviceport<br />
<html:text name="form" property="lisenceserviceport" /><br />

transfarslog<br />
<html:checkbox name="form" property="transfarslog" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
