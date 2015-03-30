<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<%@ taglib uri="/formtag.tld" prefix="formtag" %> 
<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> 


<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<%@ page isELIgnored="false" %>

<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">
<span id="title">
	編集
</span>
<span id="subform">
		<html:form method="POST" action="/PostCommonCostVP">
          <html:hidden name="form" property="id"/>

cyclename<br />
<html:text name="form" property="cyclename" /><br />

cycle<br />
<html:text name="form" property="cycle" /><br />

equipment<br />
<html:text name="form" property="equipment" /><br />

payed<br />
<html:text name="form" property="payed" /><br />

costperhour<br />
<html:text name="form" property="costperhour" /><br />

hour<br />
<html:text name="form" property="hour" /><br />

value<br />
<html:text name="form" property="value" /><br />

name<br />
<html:text name="form" property="name" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>


