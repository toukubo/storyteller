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
${communitythread.id}
<br/>
コミュニティBBSコメント
<div>
<logic:iterate id="communityComment" name="communitythread" property="communityComments">id
${communitycomment.id}
<br/>
コミュニティBBS
${communitycomment.communityThread}
<br/>
タイトル
${communitycomment.title}
<br/>
日付
date<st:date date="${communitycomment.id
${communitythread.id}
<br/>
コミュニティBBSコメント
<div>
<logic:iterate id="communityComment" name="communitythread" property="communityComments">id
${communitycomment.id}
<br/>
コミュニティBBS
${communitycomment.communityThread}
<br/>
タイトル
${communitycomment.title}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="communitythread.communityComments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="コミュニティBBS">
<nobr>
${row.communityThread.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タイトル">
<nobr>
${row.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
                        </display:table>
<br/>
コミュニティ
${communitythread.community}
<br/>


</div>



	</body>
</html:html>


