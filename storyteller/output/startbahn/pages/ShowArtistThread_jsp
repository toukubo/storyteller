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
${artistthread.id}
<br/>
アーティスト
${artistthread.artist}
<br/>
アーティスト・コメント
<div>
<logic:iterate id="artistComment" name="artistthread" property="artistComments">id
${artistcomment.id}
<br/>
アーティストBBS
${artistcomment.artistThread}
<br/>
タイトル
${artistcomment.title}
<br/>
説明
${artistcomment.description}
<br/>
日付
date<st:date date="${artistcomment.id
${artistthread.id}
<br/>
アーティスト
${artistthread.artist}
<br/>
アーティスト・コメント
<div>
<logic:iterate id="artistComment" name="artistthread" property="artistComments">id
${artistcomment.id}
<br/>
アーティストBBS
${artistcomment.artistThread}
<br/>
タイトル
${artistcomment.title}
<br/>
説明
${artistcomment.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="artistthread.artistComments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティストBBS">
<nobr>
${row.artistThread.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タイトル">
<nobr>
${row.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
                        </display:table>
<br/>
タイトル
${artistthread.title}
<br/>
日付
date<st:date date="${artistthread.id
${artistthread.id}
<br/>
アーティスト
${artistthread.artist}
<br/>
アーティスト・コメント
<div>
<logic:iterate id="artistComment" name="artistthread" property="artistComments">id
${artistcomment.id}
<br/>
アーティストBBS
${artistcomment.artistThread}
<br/>
タイトル
${artistcomment.title}
<br/>
説明
${artistcomment.description}
<br/>
日付
date<st:date date="${artistcomment.id
${artistthread.id}
<br/>
アーティスト
${artistthread.artist}
<br/>
アーティスト・コメント
<div>
<logic:iterate id="artistComment" name="artistthread" property="artistComments">id
${artistcomment.id}
<br/>
アーティストBBS
${artistcomment.artistThread}
<br/>
タイトル
${artistcomment.title}
<br/>
説明
${artistcomment.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="artistthread.artistComments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アーティストBBS">
<nobr>
${row.artistThread.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タイトル">
<nobr>
${row.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
                        </display:table>
<br/>
タイトル
${artistthread.title}
<br/>
日付
date}" /><br/>


</div>



	</body>
</html:html>


