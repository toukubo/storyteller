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

                    <display:table name="${advertisements}" id="row" requestURI="Advertisements.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowAdvertisement.do?id=${row.id}">Show</a> | 
                        <a href="PostAdvertisementDetail.do?id=${row.id}"><img src="images/icons/table_edit.png">編集</a>
                        <a href="#" onClick="javascript:if(window.confirm('削除してもよろしいですか？')){location.href='DeleteAdvertisement.do?id=${row.id}';}">
                        <img src="images/icons/table_delete.png">削除
                        </a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="url">
<nobr>
${row.url}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="開始日時"><nobr>
<bean:write name="row" property="startdate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="終了日時"><nobr>
<bean:write name="row" property="enddate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="clientname">
<nobr>
${row.clientname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="clicks">
<nobr>
${row.clicks}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="impressions">
<nobr>
${row.impressions}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="pageViews">
<nobr>
${row.pageViews}
</nobr>
</display:column>

                    </display:table>
	</tiles:put>
</tiles:insert>
