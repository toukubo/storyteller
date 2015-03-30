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
<span class="title">MS_COP 編集</span>
		<html:form method="POST" action="/MS_COPVP">
          <html:hidden name="mS_COP" property="id"/>

tORKDATETIM<br />
<html:text name="form" property="tORKDATETIM" /><br />

tORKAP<br />
<html:text name="form" property="tORKAP" /><br />

tORKUSRID<br />
<html:text name="form" property="tORKUSRID" /><br />

sHRIYMDATE<br />
<html:text name="form" property="sHRIYMDATE" /><br />

oUTJN<br />
<html:text name="form" property="oUTJN" /><br />

copcd<br />
<html:text name="form" property="copcd" /><br />

delflg<br />
<html:text name="form" property="delflg" /><br />

copnmk<br />
<html:text name="form" property="copnmk" /><br />

copnma<br />
<html:text name="form" property="copnma" /><br />

copnmrk<br />
<html:text name="form" property="copnmrk" /><br />

copnmra<br />
<html:text name="form" property="copnmra" /><br />

copkirtkbn<br />
<html:text name="form" property="copkirtkbn" /><br />

copkbn<br />
<html:text name="form" property="copkbn" /><br />

kesnkbn<br />
<html:text name="form" property="kesnkbn" /><br />

kesndra<br />
<html:text name="form" property="kesndra" /><br />



          <html:submit />
		</html:form>
</div>

<div class="sub">


</div>
	</body>
</html:html>


