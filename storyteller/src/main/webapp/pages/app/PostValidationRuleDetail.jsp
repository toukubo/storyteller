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
<span class="title">ValidationRule •ÒW</span>
		<html:form method="POST" action="/ValidationRuleVP">
          <html:hidden name="validationrule" property="id"/>

name<br />
<html:text name="validationrule" property="name" /><br />

defaulterrormessage<br />
<html:text name="validationrule" property="defaulterrormessage" /><br />

template<br />
<html:text name="validationrule" property="template" /><br />



          <html:submit value="•Û‘¶"/>
		</html:form>
</div>

<div class="sub">


</div>
	</body>
</html:html>


