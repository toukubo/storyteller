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
	オーガニゼーション編集
</span>
<span id="subform">
		<html:form method="POST" action="/PostOrganizationVP">
          <html:hidden name="form" property="id"/>

名前<br />
<html:text name="form" property="name" /><br />

アドレス<br />
<html:text name="form" property="address" /><br />

電話番号<br />
<html:text name="form" property="phonenum" /><br />

companyname<br />
<html:text name="form" property="companyname" /><br />

furigana<br />
<html:text name="form" property="furigana" /><br />

companyaddress<br />
<html:text name="form" property="companyaddress" /><br />

postcode<br />
<html:text name="form" property="postcode" /><br />

faxnum<br />
<html:text name="form" property="faxnum" /><br />

president<br />
<html:text name="form" property="president" /><br />

storename<br />
<html:text name="form" property="storename" /><br />

creationdate<br />
<input type="text" name="creationdateAsString" value="<bean:write name="form" property="creationdate" format="yyyy/MM/dd" />" /><br />
capital<br />
<html:text name="form" property="capital" /><br />

annualsales<br />
<html:text name="form" property="annualsales" /><br />

employeenum<br />
<html:text name="form" property="employeenum" /><br />

businessdesc<br />
<html:text name="form" property="businessdesc" /><br />

majortradpartner1<br />
<html:text name="form" property="majortradpartner1" /><br />

majortradpartner2<br />
<html:text name="form" property="majortradpartner2" /><br />

majortradpartner3<br />
<html:text name="form" property="majortradpartner3" /><br />

bankers<br />
<html:text name="form" property="bankers" /><br />

paymentsite<br />
<html:text name="form" property="paymentsite" /><br />

supplier<br />
<html:text name="form" property="supplier" /><br />

customer<br />
<html:text name="form" property="customer" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>


