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
	<tiles:put name="title" value="" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostStaticDataVP">
          <html:hidden name="form" property="id"/>

smtphost<br />
<html:text name="form" property="smtphost" /><br />

smtpacocunt<br />
<html:text name="form" property="smtpacocunt" /><br />

smtppassword<br />
<html:text name="form" property="smtppassword" /><br />

reportmail<br />
<html:text name="form" property="reportmail" /><br />

projectbystorytellerrate<br />
<html:text name="form" property="projectbystorytellerrate" /><br />

unix<br />
<html:checkbox name="form" property="unix" /><br />

humanalecostrate<br />
<html:text name="form" property="humanalecostrate" /><br />

costpercentage<br />
<html:text name="form" property="costpercentage" /><br />

jackpot<br />
<html:text name="form" property="jackpot" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
