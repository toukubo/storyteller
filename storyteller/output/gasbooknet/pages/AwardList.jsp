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


    <logic:iterate id="model" name="awards">
         名前
${award.name}
<br/>
日付
date<st:date date="${award.名前
${award.name}
<br/>
日付
date}" /><br/>
説明
${award.description}
<br/>
id
${award.id}
<br/>
最近の
${award.recentlyadded}
<br/>
人気
${award.poplular}
<br/>
受賞者
<div>
<logic:iterate id="awordWInner" name="award" property="awordWInners">id
${awordwinner.id}
<br/>
賞
${awordwinner.award}
<br/>
アーティスト
${awordwinner.artist}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="award.awordWInners" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="賞">
<nobr>
${row.award.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
                        </display:table>
<br/>

    </logic:iterate>



</div>
	</body>
</html:html>

