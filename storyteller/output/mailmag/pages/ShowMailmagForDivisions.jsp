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
${mailmag.id}
<br/>
人気度
${mailmag.poplularity}
<br/>
最近の
${mailmag.recentlyadded}
<br/>
分割配送の
${mailmag.devidedlyderivered}
<br/>
予約日時
<bean:write name="mailmag" property="reservationdate" format="yyyy/MM/dd" />
<br/>
分割
<div>
<logic:iterate id="division" name="mailmag" property="divisions">id
${division.id}
<br/>
終了日時
<bean:write name="division" property="enddate" format="yyyy/MM/dd" />
<br/>
開始日時
<bean:write name="division" property="startdate" format="yyyy/MM/dd" />
<br/>
最初のメール
${division.startmail}
<br/>
メールマガジン
${division.mailmag}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="mailmag.divisions" id="row" requestURI="ForDivisions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="終了日時"><nobr>
<bean:write name="row" property="enddate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="開始日時"><nobr>
<bean:write name="row" property="startdate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="最初のメール">
<nobr>
${row.startmail}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メールマガジン">
<nobr>
${row.mailmag.id}
</nobr>
</display:column>
                        </display:table>
<br/>
urls
<div>
<logic:iterate id="url" name="mailmag" property="urls">id
${url.id}
<br/>
url
${url.url}
<br/>
短縮URL
${url.shorturl}
<br/>
クリック数
${url.clicknum}
<br/>
メールマガジン
${url.mailmag}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="mailmag.urls" id="row" requestURI="ForDivisions.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="url">
<nobr>
${row.url}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="短縮URL">
<nobr>
${row.shorturl}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クリック数">
<nobr>
${row.clicknum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メールマガジン">
<nobr>
${row.mailmag.id}
</nobr>
</display:column>
                        </display:table>
<br/>
サイト
${mailmag.site}
<br/>
予約済みの
${mailmag.reserved}
<br/>
タイトル
${mailmag.title}
<br/>
説明
${mailmag.description}
<br/>
日付
<bean:write name="mailmag" property="date" format="yyyy/MM/dd" />
<br/>


</div>



	</body>
</html:html>


