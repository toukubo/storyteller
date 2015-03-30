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
	<tiles:put name="title" value="患者一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">患者一覧</span>
                    <display:table name="${caseUsers}" id="row" requestURI="CaseUsers.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="CaseUsers.do?id=${row.id}">編集</a>
                        <a href="DeleteCaseUser.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="アカウント">
<nobr>
${row.account}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="operations">
<nobr>
${row.operations}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="体重">
<nobr>
${row.bodyweight}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="性別">
<nobr>
${row.sex}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="年齢">
<nobr>
${row.age}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="身長">
<nobr>
${row.height}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="発症年齢">
<nobr>
${row.onsetage}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="入院前治療">
<nobr>
${row.curebeforoperation}
</nobr>
</display:column>

                    </display:table>
<a href="CaseUsers.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="CaseUsers.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="CaseUsers.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="CaseUsers.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	患者編集
</span>
<span id="subform">

		<form method="POST" action="PostCaseUserVP.do">
          <html:hidden name="form" property="id"/>

アカウント<br />
<html:text size="20"  name="form" property="account" /><br />

体重<br />
<html:text size="20"  name="form" property="bodyweight" /><br />

名前<br />
<html:text size="20"  name="form" property="name" /><br />

性別<br />
<html:checkbox name="form" property="sex" /><br />

年齢<br />
<html:text size="20"  name="form" property="age" /><br />

身長<br />
<html:text size="20"  name="form" property="height" /><br />

発症年齢<br />
<html:text size="20"  name="form" property="onsetage" /><br />

入院前治療<br />
<html:text size="20"  name="form" property="curebeforoperation" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="CaseUsers.do">新規患者作成</a>
</div>




	</tiles:put>
</tiles:insert>
