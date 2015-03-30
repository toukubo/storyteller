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
コード
${intrauser.code}
<br/>
電話番号
${intrauser.phonenum}
<br/>
性別
${intrauser.sex}
<br/>
姓
${intrauser.familyname}
<br/>
権限
${intrauser.privilege}
<br/>
名前
${intrauser.name}
<br/>
フラグ
${intrauser.flag}
<br/>
アドレス
${intrauser.address}
<br/>
パスワード
${intrauser.password}
<br/>
icalurl
${intrauser.icalurl}
<br/>
icalurlusing
${intrauser.icalurlusing}
<br/>
icalFile
${intrauser.icalFile}
<br/>
アカウント
${intrauser.account}
<br/>
メール
${intrauser.mail}
<br/>

<div>
<logic:iterate id="task" name="intrauser" property="tasks">id
${task.id}
<br/>
内部ユーザー
${task.intraUser}
<br/>
ジョブ
${task.job}
<br/>
時間
${task.hour}
<br/>
タスクカテゴリー
${task.taskCategory}
<br/>
名前
${task.name}
<br/>
日付
<bean:write name="task" property="date" format="yyyy/MM/dd" />
<br/>
処理済
${task.processed}
<br/>

<div>
<logic:iterate id="transit" name="task" property="transits">id
${transit.id}
<br/>
タスク
${transit.task}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="{task.transits}" id="row" requestURI="ForDateSpa.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" />

</display:column>
 <display:column media="html" sortable="true" title="タスク">
<nobr>
${row.task.name}
</nobr>
</display:column>
                        </display:column>
    </logic:iterate><br/>

${task.icalFile}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="{intrauser.tasks}" id="row" requestURI="ForDateSpa.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" />

</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
<nobr>
${row.intraUser.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ジョブ">
<nobr>
${row.job.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="時間">
<nobr>
${row.hour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タスクカテゴリー">
<nobr>
${row.taskCategory.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="処理済">
<nobr>
${row.processed}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="">
<nobr>
${row.transits}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="">
<nobr>
${row.icalFile.}
</nobr>
</display:column>
                        </display:column>
    </logic:iterate><br/>

${intrauser.costperhour}
<br/>

${intrauser.roi}
<br/>

${intrauser.netincome}
<br/>

<div>
<logic:iterate id="attendance" name="intrauser" property="attendances">id
${attendance.id}
<br/>
内部ユーザー
${attendance.intraUser}
<br/>
出社時間
${attendance.starthour}
<br/>

${attendance.startminuite}
<br/>
退社時間
${attendance.endhour}
<br/>

${attendance.endminute}
<br/>
休憩時間
${attendance.intervalhours}
<br/>
総勤務時間
${attendance.totalworkhour}
<br/>
遅刻
${attendance.late}
<br/>
早退
${attendance.leaveearly}
<br/>
有給休暇
${attendance.awl}
<br/>
日付
<bean:write name="attendance" property="date" format="yyyy/MM/dd" />
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="{intrauser.attendances}" id="row" requestURI="ForDateSpa.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" />

</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
<nobr>
${row.intraUser.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="出社時間">
<nobr>
${row.starthour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="">
<nobr>
${row.startminuite}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="退社時間">
<nobr>
${row.endhour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="">
<nobr>
${row.endminute}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="休憩時間">
<nobr>
${row.intervalhours}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="総勤務時間">
<nobr>
${row.totalworkhour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="遅刻">
<nobr>
${row.late}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="早退">
<nobr>
${row.leaveearly}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="有給休暇">
<nobr>
${row.awl}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>
                        </display:column>
    </logic:iterate><br/>

<div>
<logic:iterate id="icalFile" name="intrauser" property="icalFiles">id
${icalfile.id}
<br/>
内部ユーザー
${icalfile.intraUser}
<br/>

<div>
<logic:iterate id="task" name="icalfile" property="tasks">id
${task.id}
<br/>
内部ユーザー
${task.intraUser}
<br/>
ジョブ
${task.job}
<br/>
時間
${task.hour}
<br/>
タスクカテゴリー
${task.taskCategory}
<br/>
名前
${task.name}
<br/>
日付
<bean:write name="task" property="date" format="yyyy/MM/dd" />
<br/>
処理済
${task.processed}
<br/>

<div>
<logic:iterate id="transit" name="task" property="transits">id
${transit.id}
<br/>
タスク
${transit.task}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="{task.transits}" id="row" requestURI="ForDateSpa.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" />

</display:column>
 <display:column media="html" sortable="true" title="タスク">
<nobr>
${row.task.name}
</nobr>
</display:column>
                        </display:column>
    </logic:iterate><br/>

${task.icalFile}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="{icalfile.tasks}" id="row" requestURI="ForDateSpa.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" />

</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
<nobr>
${row.intraUser.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ジョブ">
<nobr>
${row.job.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="時間">
<nobr>
${row.hour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タスクカテゴリー">
<nobr>
${row.taskCategory.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="処理済">
<nobr>
${row.processed}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="">
<nobr>
${row.transits}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="">
<nobr>
${row.icalFile.}
</nobr>
</display:column>
                        </display:column>
    </logic:iterate><br/>
<br />
    </logic:iterate>
</div>				<display:table name="{intrauser.icalFiles}" id="row" requestURI="ForDateSpa.do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" />

</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
<nobr>
${row.intraUser.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="">
<nobr>
${row.tasks}
</nobr>
</display:column>
                        </display:column>
    </logic:iterate><br/>


</div>



	</body>
</html:html>


