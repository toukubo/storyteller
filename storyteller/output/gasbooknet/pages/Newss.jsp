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
	<tiles:put name="title" value="ニュース一覧" direct="true" />
	<tiles:put name="content" direct="true">

                    <display:table name="${newss}" id="row" requestURI="Newss.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowNews.do?id=${row.id}">Show</a> | 
                        <a href="PostNewsDetail.do?id=${row.id}"><img src="icons/table_edit.png"></a>
                        <a href="DeleteNews.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<st:date date="${row.date}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="タイトル">
<nobr>
${row.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="country">
<nobr>
${row.country.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
<nobr>
${row.intraUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="c ">
<nobr>
${row.c}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="最近の">
<nobr>
${row.recentlyadded}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="人気度">
<nobr>
${row.poplularity}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ジャンル">
<nobr>
${row.genre.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="b ">
<nobr>
${row.b}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="a">
<nobr>
${row.a}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="newsType">
<nobr>
${row.newsType.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ニュースソース">
<nobr>
${row.newsSource.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="Feature">
<nobr>
${row.newsFeature.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="newsTaggings">
<nobr>
${row.newsTaggings}
</nobr>
</display:column>

                    </display:table>
<a href="Newss.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Newss.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Newss.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Newss.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>
	</tiles:put>
</tiles:insert>
