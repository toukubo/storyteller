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

<%--<html:html>
<tiles:insert page="/h.jsp"/>
<div>--%>
<tiles:insert definition=".layout">
	<tiles:put name="title" value="トップ" direct="true" />
	<tiles:put name="side" direct="true">
	</tiles:put>
	<tiles:put name="content" direct="true"  >
	
tests <br />
<display:table name="${j2eeStory.tests}" id="row" requestURI="ForTests.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="summery">
<nobr>
${row.summery}
</nobr>
</display:column>

 <display:column media="html" sortable="true" title="ストーリー">
<nobr>
${row.j2eeStory.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="担当者">
<nobr>
${row.responsible}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="再現手順">
<nobr>
${row.stepstorepeat}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="期待される動作">
<nobr>
${row.whatyouexpectedtosee}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="表示内容">
<nobr>
${row.whatyousawinstead}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="デバグ済み">
<nobr>
${row.debuged}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="チェック済み">
<nobr>
${row.checked}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="割り当てた人">
<nobr>
${row.creator}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="デバッグ担当">
<nobr>
${row.debugger}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="jsp">
<nobr>
${row.jsp.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="asnormal">
<nobr>
${row.asnormal}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="asmain">
<nobr>
${row.asmain}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="estimationChoises">
<nobr>
${row.estimationChoises}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="modifiedpagetitle">
<nobr>
${row.modifiedpagetitle}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="modifiedpagefilename">
<nobr>
${row.modifiedpagefilename}
</nobr>
</display:column>


                        </display:table>


	</tiles:put>
</tiles:insert>



<%--</div>



	</body>
</html:html>
--%>

