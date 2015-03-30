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
	<tiles:put name="title" value="患者" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostCaseUserVP">
          <html:hidden name="form" property="id"/>

アカウント<br />
<html:text size="20"  name="form" property="account" /><br />

体重<br />
<html:text size="20"  name="form" property="bodyweight" /><br />

名前<br />
<html:text size="20"  name="form" property="name" /><br />

性別<br />
<html:checkbox name="form" property="sex" /><br />

年齢<br />
<html:text size="20"  name="form" property="age" /><br />

身長<br />
<html:text size="20"  name="form" property="height" /><br />

発症年齢<br />
<html:text size="20"  name="form" property="onsetage" /><br />

入院前治療<br />
<html:text size="20"  name="form" property="curebeforoperation" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
