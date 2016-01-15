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
	ストーリー編集
</span>
<span id="subform">
		<html:form method="POST" action="/PostJ2eeStoryVPAboutEstimation">
          <html:hidden name="form" property="id"/>

contiuningbusiness<br />
<html:checkbox name="form" property="contiuningbusiness" /><br />

consultingrate<br />
<html:text name="form" property="consultingrate" /><br />

offshorable<br />
<html:checkbox name="form" property="offshorable" /><br />

salerequired<br />
<html:checkbox name="form" property="salerequired" /><br />

dificulty<br />
<html:text name="form" property="dificulty" /><br />

tellerapp<br />
<html:checkbox name="form" property="tellerapp" /><br />

advertisingrate<br />
<html:text name="form" property="advertisingrate" /><br />

price_per_sentences<br />
<html:text name="form" property="price_per_sentences" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>


