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
	一般コスト編集
</span>
<span id="subform">
		<html:form method="POST" action="/PostCommonCostVP">
          <html:hidden name="form" property="id"/>

cyclename<br />
<html:text name="form" property="cyclename" /><br />

周期的<br />
<html:checkbox name="form" property="cycle" /><br />

機材<br />
<html:checkbox name="form" property="equipment" /><br />

支払済み<br />
<html:checkbox name="form" property="payed" /><br />

時間単価<br />
<html:text name="form" property="costperhour" /><br />

時間<br />
<html:text name="form" property="hour" /><br />

値<br />
<html:text name="form" property="value" /><br />

名前<br />
<html:text name="form" property="name" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>


