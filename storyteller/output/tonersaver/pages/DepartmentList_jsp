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
<tiles:insert definition=".publicLayout">
	<tiles:put name="title" value="部署" direct="true" />
	<tiles:put name="content" direct="true">
	
	

    <logic:iterate id="department" name="departments">
         id
${department.id}
<br/>
印刷ログ
<div>
<logic:iterate id="printing" name="department" property="printings">id
${printing.id}
<br/>
ファイル名
${printing.filename}
<br/>
ユーザー
${printing.user}
<br/>
部署
${printing.department}
<br/>
コンピューター
${printing.computer}
<br/>
savingrate
${printing.savingrate}
<br/>
数
${printing.num}
<br/>
applicationname
${printing.applicationname}
<br/>
filepath
${printing.filepath}
<br/>
papersize
${printing.papersize}
<br/>
oneside
${printing.oneside}
<br/>
色
${printing.color}
<br/>
プリンター
${printing.printer}
<br/>
日付
<bean:write name="printing" property="date" format="yyyy/MM/dd" />
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="department.printings" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="ファイル名">
<nobr>
${row.filename}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ユーザー">
<nobr>
${row.user.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="部署">
<nobr>
${row.department.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コンピューター">
<nobr>
${row.computer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="savingrate">
<nobr>
${row.savingrate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="数">
<nobr>
${row.num}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="applicationname">
<nobr>
${row.applicationname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filepath">
<nobr>
${row.filepath}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="papersize">
<nobr>
${row.papersize}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="oneside">
<nobr>
${row.oneside}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="色">
<nobr>
${row.color}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="プリンター">
<nobr>
${row.printer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>
                        </display:table>
<br/>
ユーザー
<div>
<logic:iterate id="user" name="department" property="users">id
${user.id}
<br/>
部署
${user.department}
<br/>
印刷ログ
<div>
<logic:iterate id="printing" name="user" property="printings">id
${printing.id}
<br/>
ファイル名
${printing.filename}
<br/>
ユーザー
${printing.user}
<br/>
部署
${printing.department}
<br/>
コンピューター
${printing.computer}
<br/>
savingrate
${printing.savingrate}
<br/>
数
${printing.num}
<br/>
applicationname
${printing.applicationname}
<br/>
filepath
${printing.filepath}
<br/>
papersize
${printing.papersize}
<br/>
oneside
${printing.oneside}
<br/>
色
${printing.color}
<br/>
プリンター
${printing.printer}
<br/>
日付
<bean:write name="printing" property="date" format="yyyy/MM/dd" />
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="user.printings" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="ファイル名">
<nobr>
${row.filename}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ユーザー">
<nobr>
${row.user.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="部署">
<nobr>
${row.department.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コンピューター">
<nobr>
${row.computer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="savingrate">
<nobr>
${row.savingrate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="数">
<nobr>
${row.num}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="applicationname">
<nobr>
${row.applicationname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="filepath">
<nobr>
${row.filepath}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="papersize">
<nobr>
${row.papersize}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="oneside">
<nobr>
${row.oneside}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="色">
<nobr>
${row.color}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="プリンター">
<nobr>
${row.printer}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>
                        </display:table>
<br/>
assignments
<div>
<logic:iterate id="assignment" name="user" property="assignments">ユーザー
${assignment.user}
<br/>
id
${assignment.id}
<br/>
設定ファイル
${assignment.policy}
<br/>
部署
${assignment.department}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="user.assignments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ユーザー">
<nobr>
${row.user.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="設定ファイル">
<nobr>
${row.policy.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="部署">
<nobr>
${row.department.id}
</nobr>
</display:column>
                        </display:table>
<br/>
summeries
				<display:table name="user.summeries" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
                        </display:table>
<br/>
ログオンユーザー名
${user.adname}
<br/>
ユーザー氏名
${user.name}
<br/>
policy
${user.policy}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="department.users" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="部署">
<nobr>
${row.department.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="印刷ログ">
<nobr>
${row.printings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="assignments">
<nobr>
${row.assignments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="summeries">
<nobr>
${row.summeries}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ログオンユーザー名">
<nobr>
${row.adname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ユーザー氏名">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="policy">
<nobr>
${row.policy.id}
</nobr>
</display:column>
                        </display:table>
<br/>
適用設定ファイル
<div>
<logic:iterate id="assignment" name="department" property="assignments">ユーザー
${assignment.user}
<br/>
id
${assignment.id}
<br/>
設定ファイル
${assignment.policy}
<br/>
部署
${assignment.department}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="department.assignments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ユーザー">
<nobr>
${row.user.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="設定ファイル">
<nobr>
${row.policy.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="部署">
<nobr>
${row.department.id}
</nobr>
</display:column>
                        </display:table>
<br/>
summeries
				<display:table name="department.summeries" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
                        </display:table>
<br/>
名前
${department.name}
<br/>
parentDepartment
${department.parentDepartment}
<br/>
childrendepartments
				<display:table name="department.childrendepartments" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
                        </display:table>
<br/>
policy
${department.policy}
<br/>

    </logic:iterate>




	</tiles:put>
</tiles:insert>


