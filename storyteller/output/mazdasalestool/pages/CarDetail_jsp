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
<span class="title">Car 編集</span>
		<html:form method="POST" action="/CarVP">
          <html:hidden name="car" property="id"/>

グループ名<br />
<html:text name="form" property="groupname" /><br />

販売費<br />
<html:text name="form" property="salescost" /><br />

軽自動車<br />
<html:checkbox name="form" property="lightcar" /><br />

ソート順<br />
<html:text name="form" property="sortorder" /><br />

短縮車種<br />
<html:text name="form" property="shortcarline" /><br />

商用車<br />
<html:checkbox name="form" property="bussinesscar" /><br />



          <html:submit value="保存"/>
		</html:form>
</div>

<div class="sub">


</div>
	</body>
</html:html>


