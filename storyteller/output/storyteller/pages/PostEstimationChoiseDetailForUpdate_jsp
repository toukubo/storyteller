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
<span id="title">
	見積内訳編集
</span>
<span id="subform">
		<html:form method="POST" action="/PostEstimationChoiseVP">
          <html:hidden name="form" property="id"/>

requireddays<br />
<html:text name="form" property="requireddays" /><br />

marketAverageDays<br />
<html:text name="form" property="marketAverageDays" /><br />

marketAveragePrice<br />
<html:text name="form" property="marketAveragePrice" /><br />

原価<br />
<html:text name="form" property="cost" /><br />

金額<br />
<html:text name="form" property="price" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>


