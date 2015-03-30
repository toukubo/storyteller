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


<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<%@ page isELIgnored="false" %>

<tiles:insert definition=".layout">
	<tiles:put name="title" value="" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostPdfCustomerLabelVP">
          <html:hidden name="form" property="id"/>

名前X座標<br />
<html:text size="40"  name="form" property="nameX" /><br />

名前Y座標<br />
<html:text size="40"  name="form" property="nameY" /><br />

役職名文字サイズ<br />
<html:text size="40"  name="form" property="positionS" /><br />

役職名Y座標<br />
<html:text size="40"  name="form" property="positionY" /><br />

会社名文字サイズ<br />
<html:text size="40"  name="form" property="companyS" /><br />

役職名X座標<br />
<html:text size="40"  name="form" property="positionX" /><br />

住所Y座標<br />
<html:text size="40"  name="form" property="addressY" /><br />

会社名Y座標<br />
<html:text size="40"  name="form" property="companyY" /><br />

郵便番号文字サイズ<br />
<html:text size="40"  name="form" property="zipcodeS" /><br />

会社名X座標<br />
<html:text size="40"  name="form" property="companyX" /><br />

住所文字サイズ<br />
<html:text size="40"  name="form" property="addressS" /><br />

住所X座標<br />
<html:text size="40"  name="form" property="addressX" /><br />

郵便番号Y座標<br />
<html:text size="40"  name="form" property="zipcodeY" /><br />

郵便番号X座標<br />
<html:text size="40"  name="form" property="zipcodeX" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
