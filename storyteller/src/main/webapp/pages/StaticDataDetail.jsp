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
<span class="title">StaticData ï“èW</span>
		<html:form method="POST" action="/StaticDataVP">
          <html:hidden name="staticdata" property="id"/>

documentArrivedReportTemplate<br />
<html:text name="staticdata" property="documentArrivedReportTemplate" /><br />

documentRequestTemplate<br />
<html:text name="staticdata" property="documentRequestTemplate" /><br />

inforssurl<br />
<html:text name="staticdata" property="inforssurl" /><br />

reportmail<br />
<html:text name="staticdata" property="reportmail" /><br />

crtmax<br />
<html:text name="staticdata" property="crtmax" /><br />

arpmax<br />
<html:text name="staticdata" property="arpmax" /><br />

eclipseroot<br />
<html:text name="staticdata" property="eclipseroot" /><br />



          <html:submit value="ï€ë∂"/>
		</html:form>
</div>

<div class="sub">


</div>
	</body>
</html:html>


