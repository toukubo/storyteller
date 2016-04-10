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
<div>
tests
<div>
<logic:iterate id="test" name="j2eestory" property="tests">id
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
summery
${test.summery}
<br/>
asnormal
${test.asnormal}
<br/>
asmain
${test.asmain}
<br/>
estimationChoises
<div>
<logic:iterate id="estimationChoise" name="test" property="estimationChoises">id
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
test
${estimationchoise.test}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="{test.estimationChoises}" id="row" requestURI="ForTests.do" pagesize="0" 
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
${row.estimation.id}
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
 <display:column media="html" sortable="true" title="test">
<nobr>
${row.test.id}
</nobr>
</display:column>
                        </display:column>
    </logic:iterate><br/>
<br />
    </logic:iterate>
</div>				<display:table name="{j2eestory.tests}" id="row" requestURI="ForTests.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

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
 <display:column media="html" sortable="true" title="summery">
<nobr>
${row.summery}
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
                        </display:column>
    </logic:iterate><br/>


</div>



	</body>
</html:html>


