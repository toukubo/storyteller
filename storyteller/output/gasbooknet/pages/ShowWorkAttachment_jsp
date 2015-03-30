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
${workattachment.id}
<br/>
作品
${workattachment.work}
<br/>
付属品
${workattachment.attachment}
<br/>
filename
${workattachment.filename}
<br/>
mainvisual
${workattachment.mainvisual}
<br/>
dbFile
${workattachment.dbFile}
<br/>
workAttachmentPreviews
<div>
<logic:iterate id="workAttachmentPreview" name="workattachment" property="workAttachmentPreviews">id
${workattachmentpreview.id}
<br/>
workAttachment
${workattachmentpreview.workAttachment}
<br/>
dbFile
${workattachmentpreview.dbFile}
<br/>
xlspng
${workattachmentpreview.xlspng}
<br/>
thumnailsize
${workattachmentpreview.thumnailsize}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="workattachment.workAttachmentPreviews" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="workAttachment">
<nobr>
${row.workAttachment.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="xlspng">
<nobr>
${row.xlspng}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="thumnailsize">
<nobr>
${row.thumnailsize}
</nobr>
</display:column>
                        </display:table>
<br/>


</div>



	</body>
</html:html>


