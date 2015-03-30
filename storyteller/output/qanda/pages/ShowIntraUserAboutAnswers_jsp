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
${intrauser.id}
<br/>
score
${intrauser.score}
<br/>
answers
<div>
<logic:iterate id="answer" name="intrauser" property="answers">id
${answer.id}
<br/>
content
${answer.content}
<br/>
intraUser
${answer.intraUser}
<br/>
score
${answer.score}
<br/>
question
${answer.question}
<br/>
description
${answer.description}
<br/>
date
date<st:date date="${answer.id
${intrauser.id}
<br/>
score
${intrauser.score}
<br/>
answers
<div>
<logic:iterate id="answer" name="intrauser" property="answers">id
${answer.id}
<br/>
content
${answer.content}
<br/>
intraUser
${answer.intraUser}
<br/>
score
${answer.score}
<br/>
question
${answer.question}
<br/>
description
${answer.description}
<br/>
date
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="intrauser.answers" id="row" requestURI="AboutAnswers.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="content">
<nobr>
${row.content}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="intraUser">
<nobr>
${row.intraUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="score">
<nobr>
${row.score}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="question">
<nobr>
${row.question.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="description">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="date"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
                        </display:table>
<br/>
name
${intrauser.name}
<br/>
rank
${intrauser.rank}
<br/>


</div>



	</body>
</html:html>


