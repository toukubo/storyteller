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

<tiles:insert definition=".publicLayout">
	<tiles:put name="title" value="##japanese##" direct="true" />
	<tiles:put name="content" direct="true">

<div>
id
${work.id}
<br/>
client
${work.client}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
work
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="work">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
                        </display:table>
<br/>
name
${work.name}
<br/>
description
${work.description}
<br/>
date
date<st:date date="${work.id
${work.id}
<br/>
client
${work.client}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="work" property="attachments">id
${attachment.id}
<br/>
work
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="work.attachments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="work">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
                        </display:table>
<br/>
name
${work.name}
<br/>
description
${work.description}
<br/>
date
date}" /><br/>


</div>




	</tiles:put>
</tiles:insert>
