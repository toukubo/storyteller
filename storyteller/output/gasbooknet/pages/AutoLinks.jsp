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
	<tiles:put name="title" value="一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div>

                    <display:table name="${autoLinks}" id="row" requestURI="AutoLinks.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="AutoLinks.do?id=${row.id}"><img src="icons/table_edit.png"></a>
                        <a href="DeleteAutoLink.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="actual">
<nobr>
${row.actual}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="linkermodel">
<nobr>
${row.linkermodel}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="linkeemodel">
<nobr>
${row.linkeemodel}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="linkerid">
<nobr>
${row.linkerid}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="linkeeid">
<nobr>
${row.linkeeid}
</nobr>
</display:column>

                    </display:table>
<a href="AutoLinks.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="AutoLinks.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="AutoLinks.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="AutoLinks.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	編集
</span>
<span id="subform">

		<form method="POST" action="PostAutoLinkVP.do">
          <html:hidden name="form" property="id"/>

actual<br />
<html:checkbox name="form" property="actual" /><br />

linkermodel<br />
<html:text size="40"  name="form" property="linkermodel" /><br />

linkeemodel<br />
<html:text size="40"  name="form" property="linkeemodel" /><br />

linkerid<br />
<html:text size="40"  name="form" property="linkerid" /><br />

linkeeid<br />
<html:text size="40"  name="form" property="linkeeid" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="AutoLinks.do">新規作成</a>
</div>




	</tiles:put>
</tiles:insert>
