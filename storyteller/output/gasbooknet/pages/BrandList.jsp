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
<%@ taglib uri="/formtag.tld" prefix="formtag" %> 
<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> 
<%@ page isELIgnored="false" %>
<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">


    <logic:iterate id="model" name="brands">
         名前
${brand.name}
<br/>
日付
date<st:date date="${brand.名前
${brand.name}
<br/>
日付
date}" /><br/>
説明
${brand.description}
<br/>
id
${brand.id}
<br/>
最近の
${brand.recentlyadded}
<br/>
人気
${brand.poplular}
<br/>
ロゴ
${brand.logo}
<br/>

    </logic:iterate>



</div>
	</body>
</html:html>

