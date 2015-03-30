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


    <logic:iterate id="model" name="spaces">
         id
${space.id}
<br/>
events
<div>
<logic:iterate id="event" name="space" property="events">名前
${event.name}
<br/>
日付
date<st:date date="${event.id
${space.id}
<br/>
events
<div>
<logic:iterate id="event" name="space" property="events">名前
${event.name}
<br/>
日付
date}" /><br/>
説明
${event.description}
<br/>
id
${event.id}
<br/>
最近の
${event.recentlyadded}
<br/>
人気
${event.poplular}
<br/>
eventAttendances
<div>
<logic:iterate id="eventAttendance" name="event" property="eventAttendances">id
${eventattendance.id}
<br/>
イベント
${eventattendance.event}
<br/>
アーティスト
${eventattendance.artist}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="event.eventAttendances" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
                        </display:table>
<br/>
space
${event.space}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="event" property="attachments">id
${attachment.id}
<br/>
filetype
${attachment.filetype}
<br/>
WorkAttachment
${attachment.workAttachment}
<br/>
space
${attachment.space}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="event.attachments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="WorkAttachment">
<nobr>
${row.workAttachment.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="space">
<nobr>
${row.space.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="space.events" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="最近の">
<nobr>
${row.recentlyadded}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="eventAttendances">
<nobr>
${row.eventAttendances}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="space">
<nobr>
${row.space.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="attachments">
<nobr>
${row.attachments}
</nobr>
</display:column>
                        </display:table>
<br/>
attachments
<div>
<logic:iterate id="attachment" name="space" property="attachments">id
${attachment.id}
<br/>
filetype
${attachment.filetype}
<br/>
WorkAttachment
${attachment.workAttachment}
<br/>
space
${attachment.space}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="space.attachments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="WorkAttachment">
<nobr>
${row.workAttachment.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="space">
<nobr>
${row.space.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
longitude
${space.longitude}
<br/>
latitude
${space.latitude}
<br/>
名前
${space.name}
<br/>
説明
${space.description}
<br/>
日付
date<st:date date="${space.id
${space.id}
<br/>
events
<div>
<logic:iterate id="event" name="space" property="events">名前
${event.name}
<br/>
日付
date<st:date date="${event.id
${space.id}
<br/>
events
<div>
<logic:iterate id="event" name="space" property="events">名前
${event.name}
<br/>
日付
date}" /><br/>
説明
${event.description}
<br/>
id
${event.id}
<br/>
最近の
${event.recentlyadded}
<br/>
人気
${event.poplular}
<br/>
eventAttendances
<div>
<logic:iterate id="eventAttendance" name="event" property="eventAttendances">id
${eventattendance.id}
<br/>
イベント
${eventattendance.event}
<br/>
アーティスト
${eventattendance.artist}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="event.eventAttendances" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
                        </display:table>
<br/>
space
${event.space}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="event" property="attachments">id
${attachment.id}
<br/>
filetype
${attachment.filetype}
<br/>
WorkAttachment
${attachment.workAttachment}
<br/>
space
${attachment.space}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="event.attachments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="WorkAttachment">
<nobr>
${row.workAttachment.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="space">
<nobr>
${row.space.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="space.events" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="最近の">
<nobr>
${row.recentlyadded}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="eventAttendances">
<nobr>
${row.eventAttendances}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="space">
<nobr>
${row.space.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="attachments">
<nobr>
${row.attachments}
</nobr>
</display:column>
                        </display:table>
<br/>
attachments
<div>
<logic:iterate id="attachment" name="space" property="attachments">id
${attachment.id}
<br/>
filetype
${attachment.filetype}
<br/>
WorkAttachment
${attachment.workAttachment}
<br/>
space
${attachment.space}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="space.attachments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="filetype">
<nobr>
${row.filetype}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="WorkAttachment">
<nobr>
${row.workAttachment.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="space">
<nobr>
${row.space.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="dbFile">
<nobr>
${row.dbFile.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
longitude
${space.longitude}
<br/>
latitude
${space.latitude}
<br/>
名前
${space.name}
<br/>
説明
${space.description}
<br/>
日付
date}" /><br/>

    </logic:iterate>



</div>
	</body>
</html:html>

