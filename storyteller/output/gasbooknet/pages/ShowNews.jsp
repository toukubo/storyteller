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
日付
date<st:date date="${news.日付
date}" /><br/>
説明
${news.description}
<br/>
id
${news.id}
<br/>
タイトル
${news.title}
<br/>
country
${news.country}
<br/>
内部ユーザー
${news.intraUser}
<br/>
c 
${news.c}
<br/>
最近の
${news.recentlyadded}
<br/>
人気度
${news.poplularity}
<br/>
ジャンル
${news.genre}
<br/>
アーティスト
${news.artist}
<br/>
b 
${news.b}
<br/>
a
${news.a}
<br/>
newsType
${news.newsType}
<br/>
ニュースソース
${news.newsSource}
<br/>
Feature
${news.newsFeature}
<br/>
newsTaggings
<div>
<logic:iterate id="newsTagging" name="news" property="newsTaggings">id
${newstagging.id}
<br/>
tag
${newstagging.tag}
<br/>
ニュース
${newstagging.news}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="news.newsTaggings" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="tag">
<nobr>
${row.tag.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ニュース">
<nobr>
${row.news.id}
</nobr>
</display:column>
                        </display:table>
<br/>


</div>



	</body>
</html:html>


