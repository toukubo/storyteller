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

<%@ page isELIgnored="false" %>
<tiles:insert definition=".layout">
	<tiles:put name="title" value="営業日一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">営業日一覧</span>
                    <display:table name="${businessdays}" id="row" requestURI="Businessdays.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Businessdays.do?id=${row.id}">編集</a>
                        <a href="DeleteBusinessday.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="月">
<nobr>
${row.month}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="年">
<nobr>
${row.year}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="中古車">
<nobr>
${row.usedcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="開始日"><nobr>
<bean:write name="row" property="fromdate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="終了日"><nobr>
<bean:write name="row" property="todate" format="yyyy/MM/dd" /> </nobr>
</display:column>

                    </display:table>
<a href="Businessdays.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Businessdays.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Businessdays.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Businessdays.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	営業日編集
</span>
<span id="subform">

		<form method="POST" action="PostBusinessdayVP.do">
          <html:hidden name="form" property="id"/>

月<br />
<html:text name="form" property="month" /><br />

年<br />
<html:text name="form" property="year" /><br />

中古車<br />
<html:checkbox name="form" property="usedcar" /><br />

開始日<br />
<input type="text" name="fromdateAsString" value="<bean:write name="form" property="fromdate" format="yyyy/MM/dd" />" /><br />
終了日<br />
<input type="text" name="todateAsString" value="<bean:write name="form" property="todate" format="yyyy/MM/dd" />" /><br />


          <html:submit value="save" />
		</form>
</span>
                        <a href="Businessdays.do">新規営業日作成</a>
</div>




	</tiles:put>
</tiles:insert>
