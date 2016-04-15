<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%--<%@ taglib uri="/formtag.tld" prefix="formtag" %> 
<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> --%>

<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<%@ page isELIgnored="false" %>

<%--<html:html>
<tiles:insert page="/h.jsp"/>
<div>
--%>
<tiles:insert definition=".layout">
	<tiles:put name="title" value="???" direct="true" />
	<tiles:put name="side" direct="true">
	</tiles:put>
	<tiles:put name="content" direct="true"  >

id
${test.id}
<br/>
ストーリー
${test.j2eeStory.name}
<br/>
担当者
${test.responsible.name}
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
${test.creator.name}
<br/>
デバッグ担当
${test.debugger.name}
<br/>
jsp
${test.jsp}
<br/>
サマリー
${test.summery}
<br/>
asnormal
${test.asnormal}
<br/>
asmain
${test.asmain}
<br/>
見積内訳

<%--<div><logic:iterate id="estimationChoise" name="test" property="estimationChoises">id
${estimationchoise.id}
<br/>
金額
${estimationchoise.price}
<br/>
タスク
${estimationchoise.task}
<br/>
原価
${estimationchoise.cost}
<br/>
利潤
${estimationchoise.profilt}
<br/>
見積
${estimationchoise.estimation}
<br/>
marketAveragePrice
${estimationchoise.marketAveragePrice}
<br/>
marketAverageDays
${estimationchoise.marketAverageDays}
<br/>
requireddays
${estimationchoise.requireddays}
<br/>
テスト
${estimationchoise.test}
<br/>
<br />
    </logic:iterate>
</div>--%>		
<display:table name="test.estimationChoises" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="金額">
<nobr>
${row.price}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タスク">
<nobr>
${row.task.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="原価">
<nobr>
${row.cost}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="利潤">
<nobr>
${row.profilt}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="見積">
<nobr>
${row.estimation.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="marketAveragePrice">
<nobr>
${row.marketAveragePrice}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="marketAverageDays">
<nobr>
${row.marketAverageDays}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="requireddays">
<nobr>
${row.requireddays}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="テスト">
<nobr>
${row.test.id}
</nobr>
</display:column>
                        </display:table>
<br/>
modifiedpagetitle
${test.modifiedpagetitle}
<br/>
modifiedpagefilename
${test.modifiedpagefilename}
<br/>

	</tiles:put>
</tiles:insert>


<%--</div>



	</body>
</html:html>
--%>

