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
	<tiles:put name="title" value="タギング一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">タギング一覧</span>
                    <display:table name="${taggings}" id="row" requestURI="Taggings.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Taggings.do?id=${row.id}">編集</a>
                        <a href="DeleteTagging.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="tag">
<nobr>
${row.tag}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="model">
<nobr>
${row.model}
</nobr>
</display:column>

                    </display:table>
<a href="Taggings.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Taggings.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Taggings.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Taggings.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	タギング編集
</span>
<span id="subform">

		<form method="POST" action="PostTaggingVP.do">
          <html:hidden name="form" property="id"/>

日付<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />
tag<br />
<html:text name="form" property="tag" /><br />

model<br />
<html:text name="form" property="model" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="Taggings.do">新規タギング作成</a>
</div>




	</tiles:put>
</tiles:insert>
