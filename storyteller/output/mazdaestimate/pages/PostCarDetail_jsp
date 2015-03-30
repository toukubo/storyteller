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
	車種編集
</span>
<span id="subform">
		<html:form method="POST" action="/PostCarVP">
          <html:hidden name="form" property="id"/>

名前<br />
<html:text name="form" property="name" /><br />

種類<br />
<html:text name="form" property="type" /><br />

salesprice<br />
<html:text name="form" property="salesprice" /><br />

グループ名<br />
<html:text name="form" property="groupname" /><br />

車種<br />
<html:text name="form" property="carline" /><br />

販売費<br />
<html:text name="form" property="salescost" /><br />

軽自動車<br />
<html:checkbox name="form" property="lightcar" /><br />

商用車<br />
<html:checkbox name="form" property="businesscar" /><br />

ソート順<br />
<html:text name="form" property="sortorder" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>


