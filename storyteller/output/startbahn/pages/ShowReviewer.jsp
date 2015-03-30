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
${reviewer.id}
<br/>
一般ユーザー
${reviewer.publicUser}
<br/>
レビュー
<div>
<logic:iterate id="review" name="reviewer" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date<st:date date="${review.id
${reviewer.id}
<br/>
一般ユーザー
${reviewer.publicUser}
<br/>
レビュー
<div>
<logic:iterate id="review" name="reviewer" property="reviews">id
${review.id}
<br/>
人気
${review.poplular}
<br/>
作品
${review.work}
<br/>
reviewer
${review.reviewer}
<br/>
popularity
${review.popularity}
<br/>
タイトル
${review.title}
<br/>
説明
${review.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="reviewer.reviews" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="reviewer">
<nobr>
${row.reviewer.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="popularity">
<nobr>
${row.popularity}
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


</div>



	</body>
</html:html>


