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
<span class="title">Componey �ҏW</span>
		<html:form method="POST" action="/ComponeyVP">
          <html:hidden name="componey" property="id"/>

name<br />
<html:text name="componey" property="name" /><br />

responsible<br />
<html:text name="componey" property="responsible" /><br />

attacklist<br />
<html:text name="componey" property="attacklist" /><br />



          <html:submit value="�ۑ�"/>
		</html:form>
</div>

<div class="sub">


</div>
	</body>
</html:html>


