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
<%@ taglib uri="/formtag.tld" prefix="formtag" %> 
<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> 
<%@ taglib uri="http://www.enclosing.net/tags/storyteller" prefix="st" %>

<%@ page isELIgnored="false" %>

<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">

<span class="title">拠点一覧</span>
                    <display:table name="${bases}" id="row" requestURI="Bases.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Bases.do?id=${row.id}">編集</a>
                        <a href="DeleteBase.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="拠点名">
<nobr>
${row.basename}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="intraUsers">
<nobr>
${row.intraUsers}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="展示会">
<nobr>
${row.exhibitions}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="都道府県">
<nobr>
${row.prefecture.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="メモ">
<nobr>
${row.memo}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="拠点コード">
<nobr>
${row.basecode}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="新車">
<nobr>
${row.newcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="中古車">
<nobr>
${row.usedcar}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="resultAndProductivities">
<nobr>
${row.resultAndProductivities}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ブロック">
<nobr>
${row.block.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="weeklyProccessPlans">
<nobr>
${row.weeklyProccessPlans}
</nobr>
</display:column>

                    </display:table>
<a href="Bases.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Bases.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Bases.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Bases.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	拠点編集
</span>
<span id="subform">

		<form method="POST" action="PostBaseVP.do">
          <html:hidden name="form" property="id"/>

拠点名<br />
<html:text name="form" property="basename" /><br />

                                都道府県<br />
                                <c:choose>
                                    <c:when test="${empty Prefectures}">
                                         <select name="prefecture" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="prefecture" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Prefectures}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.prefecture.id}">
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


メモ<br />
<html:text name="form" property="memo" /><br />

拠点コード<br />
<html:text name="form" property="basecode" /><br />

新車<br />
<html:checkbox name="form" property="newcar" /><br />

中古車<br />
<html:checkbox name="form" property="usedcar" /><br />

                                ブロック<br />
                                <c:choose>
                                    <c:when test="${empty Blocks}">
                                         <select name="block" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="block" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Blocks}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.block.id}">
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
                        <a href="Bases.do">新規拠点作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

