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

<tiles:insert definition=".layout">
	<tiles:put name="title" value="社員" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostStaffVP">
          <html:hidden name="form" property="id"/>

staffid<br />
<html:text size="40"  name="form" property="staffid" /><br />

パスワード<br />
<html:text size="40"  name="form" property="staffpassword" /><br />

社員名<br />
<html:text size="40"  name="form" property="staffname" /><br />

性別<br />
<html:text size="40"  name="form" property="staffsex" /><br />

生年月日<br />
<input type="text" name="staffbirthdayAsString" value="<st:date date="${form.staffbirthday}" size="20" />" /><br />
勤務開始年月日<br />
<input type="text" name="dateofbeginingworkAsString" value="<st:date date="${form.dateofbeginingwork}" size="20" />" /><br />



          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
