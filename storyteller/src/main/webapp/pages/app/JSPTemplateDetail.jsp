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
<a href="VerbDetail.do?id=${jsptemplate.verb.id}">back to ${jsptemplate.verb.name}</a>
<div class="main">
		<html:form method="POST" action="/JSPTemplateVRP">
          <html:hidden name="jsptemplate" property="id"/>
          template<br>
			<html:textarea name="jsptemplate" property="template" styleClass="criteriaField" styleId="template" cols="101" rows="70"/><br>
			name template<br>
			<html:text name="jsptemplate" property="nametemplate" styleClass="criteriaField" styleId="nametemplate" size="40"/><br>
			 <input type="hidden" name="verb" value="${jsptemplate.verb.id}" />
          <html:submit />
		</html:form>
</div>

	</body>
</html:html>

