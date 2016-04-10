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
id
${estimation.id}
<br/>
トータルコスト
${estimation.totalcost}
<br/>
ストーリー
${estimation.j2eeStory}
<br/>
合計金額
${estimation.totalprice}
<br/>
採用
${estimation.adapted}
<br/>
totalsentencenum
${estimation.totalsentencenum}
<br/>
センテンス単価
${estimation.sentenceunit}
<br/>
見積内訳
<div>
<logic:iterate id="estimationChoise" name="estimation" property="estimationChoises">id
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
<br />
    </logic:iterate>
</div>				<display:table name="{estimation.estimationChoises}" id="row" requestURI=".do" pagesize="0" 
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
                        </display:column>
    </logic:iterate><br/>


</div>



	</body>
</html:html>


