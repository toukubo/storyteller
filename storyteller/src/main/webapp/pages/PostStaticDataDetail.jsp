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
<%@ taglib uri="/formtag.tld" prefix="formtag" %> 
<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> 


<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<%@ page isELIgnored="false" %>

<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">
<span id="title">
	一般設定編集
</span>
<span id="subform">
		<html:form method="POST" action="/PostStaticDataVP">
          <html:hidden name="form" property="id"/>

documentArrivedReportTemplate<br />
<html:text name="form" property="documentArrivedReportTemplate" /><br />

documentRequestTemplate<br />
<html:text name="form" property="documentRequestTemplate" /><br />

inforssurl<br />
<html:text name="form" property="inforssurl" /><br />

reportmail<br />
<html:text name="form" property="reportmail" /><br />

crtmax<br />
<html:text name="form" property="crtmax" /><br />

arpmax<br />
<html:text name="form" property="arpmax" /><br />

eclipseroot<br />
<html:text name="form" property="eclipseroot" /><br />

storytellerbyprojectteamrate<br />
<html:text name="form" property="storytellerbyprojectteamrate" /><br />

projectbystorytellerrate<br />
<html:text name="form" property="projectbystorytellerrate" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>


