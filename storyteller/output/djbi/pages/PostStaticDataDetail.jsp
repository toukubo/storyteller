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
	<tiles:put name="title" value="" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostStaticDataVP">
          <html:hidden name="form" property="id"/>

carriage<br />
<html:text size="40"  name="form" property="carriage" /><br />

fromaddress<br />
<html:text size="40"  name="form" property="fromaddress" /><br />

sitename<br />
<html:text size="40"  name="form" property="sitename" /><br />

basepath<br />
<html:text size="40"  name="form" property="basepath" /><br />

unix<br />
<html:checkbox name="form" property="unix" /><br />

mapeventspan<br />
<html:text size="40"  name="form" property="mapeventspan" /><br />

creditcardprocesurl<br />
<html:text size="40"  name="form" property="creditcardprocesurl" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
