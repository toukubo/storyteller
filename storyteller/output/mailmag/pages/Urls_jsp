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
	<tiles:put name="title" value="URL一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">URL一覧</span>
                    <display:table name="${urls}" id="row" requestURI="Urls.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Urls.do?id=${row.id}">編集</a>
                        <a href="DeleteUrl.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="url">
<nobr>
${row.url}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="短縮URL">
<nobr>
${row.shorturl}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="クリック数">
<nobr>
${row.clicknum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メールマガジン">
<nobr>
${row.mailmag.id}
</nobr>
</display:column>

                    </display:table>
<a href="Urls.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Urls.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Urls.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Urls.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	URL編集
</span>
<span id="subform">

		<form method="POST" action="PostUrlVP.do">
          <html:hidden name="form" property="id"/>

url<br />
<html:text name="form" property="url" /><br />

短縮URL<br />
<html:text name="form" property="shorturl" /><br />

クリック数<br />
<html:text name="form" property="clicknum" /><br />

                                メールマガジン<br />
                                <c:choose>
                                    <c:when test="${empty Mailmags}">
                                         <select name="mailmag" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="mailmag" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Mailmags}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.mailmag.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />




          <html:submit value="save" />
		</form>
</span>
                        <a href="Urls.do">新規URL作成</a>
</div>




	</tiles:put>
</tiles:insert>
