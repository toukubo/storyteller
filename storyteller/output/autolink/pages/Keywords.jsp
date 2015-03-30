<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/tags/struts-html.tld" prefix="html" %>
<%@ taglib uri="/tags/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>



<%@ page isELIgnored="false" %>
<tiles:insert definition=".layout">
	<tiles:put name="title" value="一覧" direct="true" />
	<tiles:put name="content" direct="true">

                    <display:table name="${keywords}" id="row" requestURI="Keywords.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowKeyword.do?id=${row.id}">Show</a> | 
                        <a href="PostKeywordDetail.do?id=${row.id}"><img src="images/icons/table_edit.png">編集</a>
                        <a href="#" onClick="javascript:if(window.confirm('削除してもよろしいですか？')){location.href='DeleteKeyword.do?id=${row.id}';}">
                        <img src="images/icons/table_delete.png">削除
                        </a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="slug">
<nobr>
${row.slug}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="permalink">
<nobr>
${row.permalink}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="haspage">
<nobr>
${row.haspage}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="quotes">
<nobr>
${row.quotes}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="keywordRelations">
<nobr>
${row.keywordRelations}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="値">
<nobr>
${row.value}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="useAsKeyword">
<nobr>
${row.useAsKeyword}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="candidate">
<nobr>
${row.candidate}
</nobr>
</display:column>

                    </display:table>
	</tiles:put>
</tiles:insert>
