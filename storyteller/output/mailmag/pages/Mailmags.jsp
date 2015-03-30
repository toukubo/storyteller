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
	<tiles:put name="title" value="メールマガジン一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">メールマガジン一覧</span>
                    <display:table name="${mailmags}" id="row" requestURI="Mailmags.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Mailmags.do?id=${row.id}">編集</a>
                        <a href="DeleteMailmag.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="人気度">
<nobr>
${row.poplularity}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="最近の">
<nobr>
${row.recentlyadded}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="分割配送の">
<nobr>
${row.devidedlyderivered}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="予約日時"><nobr>
<bean:write name="row" property="reservationdate" format="yyyy/MM/dd" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="分割">
<nobr>
${row.divisions}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="urls">
<nobr>
${row.urls}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="サイト">
<nobr>
${row.site.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="予約済みの">
<nobr>
${row.reserved}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="タイトル">
<nobr>
${row.title}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>

                    </display:table>
<a href="Mailmags.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Mailmags.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Mailmags.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Mailmags.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	メールマガジン編集
</span>
<span id="subform">

		<form method="POST" action="PostMailmagVP.do">
          <html:hidden name="form" property="id"/>

人気度<br />
<html:text name="form" property="poplularity" /><br />

最近の<br />
<html:checkbox name="form" property="recentlyadded" /><br />

分割配送の<br />
<html:checkbox name="form" property="devidedlyderivered" /><br />

予約日時<br />
<input type="text" name="reservationdateAsString" value="<bean:write name="form" property="reservationdate" format="yyyy/MM/dd" />" /><br />
                                サイト<br />
                                <c:choose>
                                    <c:when test="${empty Sites}">
                                         <select name="site" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="site" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Sites}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.site.id}">
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


予約済みの<br />
<html:checkbox name="form" property="reserved" /><br />

タイトル<br />
<html:text name="form" property="title" /><br />

説明<br />
<html:text name="form" property="description" /><br />

日付<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />


          <html:submit value="save" />
		</form>
</span>
                        <a href="Mailmags.do">新規メールマガジン作成</a>
</div>




	</tiles:put>
</tiles:insert>
