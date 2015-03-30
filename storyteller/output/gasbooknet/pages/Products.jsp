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
	<tiles:put name="title" value="製品一覧" direct="true" />
	<tiles:put name="content" direct="true">

                    <display:table name="${products}" id="row" requestURI="Products.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowProduct.do?id=${row.id}">Show</a> | 
                        <a href="PostProductDetail.do?id=${row.id}"><img src="icons/table_edit.png"></a>
                        <a href="DeleteProduct.do?id=${row.id}">削除</a>
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
 <display:column media="html" sortable="true" title="内部ユーザー">
<nobr>
${row.intraUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アイテム">
<nobr>
${row.items}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="c">
<nobr>
${row.c}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
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
 <display:column media="html" sortable="true" title="brand">
<nobr>
${row.brand.id}
</nobr>
</display:column>

                    </display:table>
<a href="Products.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Products.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Products.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Products.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>
	</tiles:put>
</tiles:insert>
