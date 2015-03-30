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
<span class="title">AccessLog 編集</span>
		<html:form method="POST" action="/AccessLogVP">
          <html:hidden name="accessLog" property="id"/>

日付<br />
<input type="text" name="dateAsString" value="<st:date date="${form.date}" size="20" />" /><br />


          <html:submit value="保存"/>
		</html:form>
</div>

<div class="sub">


</div>
	</body>
</html:html>


