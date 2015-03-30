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


    <logic:iterate id="model" name="tests">
         id
${test.id}
<br/>
ストーリー
${test.j2eeStory}
<br/>
担当者
${test.responsible}
<br/>
再現手順
${test.stepstorepeat}
<br/>
期待される動作
${test.whatyouexpectedtosee}
<br/>
表示内容
${test.whatyousawinstead}
<br/>
デバグ済み
${test.debuged}
<br/>
チェック済み
${test.checked}
<br/>
割り当てた人
${test.creator}
<br/>
デバッグ担当
${test.debugger}
<br/>
jsp
${test.jsp}
<br/>

    </logic:iterate>



</div>
	</body>
</html:html>

