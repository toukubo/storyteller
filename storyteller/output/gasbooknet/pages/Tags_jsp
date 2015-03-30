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

                    <display:table name="${tags}" id="row" requestURI="Tags.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Tags.do?id=${row.id}"><img src="icons/table_edit.png"></a>
                        <a href="DeleteTag.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="word">
<nobr>
${row.word}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="artistTaggings">
<nobr>
${row.artistTaggings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="newsTaggings">
<nobr>
${row.newsTaggings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="workTaggings">
<nobr>
${row.workTaggings}
</nobr>
</display:column>

                    </display:table>
<a href="Tags.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Tags.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Tags.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Tags.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	編集
</span>
<span id="subform">

		<form method="POST" action="PostTagVP.do">
          <html:hidden name="form" property="id"/>

word<br />
<html:text size="40"  name="form" property="word" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="Tags.do">新規作成</a>
</div>




	</tiles:put>
</tiles:insert>
