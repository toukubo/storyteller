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
発生状況
<div>
<logic:iterate id="event" name="artist" property="events">id
${event.id}
<br/>
最近の
${event.recentlyadded}
<br/>
アーティスト
${event.artist}
<br/>
人気
${event.poplular}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="event" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="event.attachments" id="row" requestURI="ForEvents.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
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
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
名前
${event.name}
<br/>
説明
${event.description}
<br/>
日付
date<st:date date="${event.発生状況
<div>
<logic:iterate id="event" name="artist" property="events">id
${event.id}
<br/>
最近の
${event.recentlyadded}
<br/>
アーティスト
${event.artist}
<br/>
人気
${event.poplular}
<br/>
attachments
<div>
<logic:iterate id="attachment" name="event" property="attachments">id
${attachment.id}
<br/>
作品
${attachment.work}
<br/>
filetype
${attachment.filetype}
<br/>
dbFile
${attachment.dbFile}
<br/>
イベント
${attachment.event}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="event.attachments" id="row" requestURI="ForEvents.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="作品">
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
 <display:column media="html" sortable="true" title="イベント">
<nobr>
${row.event.id}
</nobr>
</display:column>
                        </display:table>
<br/>
名前
${event.name}
<br/>
説明
${event.description}
<br/>
日付
date}" /><br/>
<br />
    </logic:iterate>
</div>				<display:table name="artist.events" id="row" requestURI="ForEvents.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="最近の">
<nobr>
${row.recentlyadded}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="attachments">
<nobr>
${row.attachments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
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




	</tiles:put>
</tiles:insert>
