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
	<tiles:put name="title" value="受賞者一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">受賞者一覧</span>
                    <display:table name="${awordWInners}" id="row" requestURI="AwordWInners.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="AwordWInners.do?id=${row.id}">編集</a>
                        <a href="DeleteAwordWInner.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="賞">
<nobr>
${row.award.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="アーティスト">
<nobr>
${row.artist.id}
</nobr>
</display:column>

                    </display:table>
<a href="AwordWInners.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="AwordWInners.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="AwordWInners.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="AwordWInners.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	受賞者編集
</span>
<span id="subform">

		<form method="POST" action="PostAwordWInnerVP.do">
          <html:hidden name="form" property="id"/>

                                賞<br />
                                <c:choose>
                                    <c:when test="${empty Awards}">
                                         <select name="award" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="award" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Awards}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.award.id}">
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


                                アーティスト<br />
                                <c:choose>
                                    <c:when test="${empty Artists}">
                                         <select name="artist" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="artist" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Artists}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.artist.id}">
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
                        <a href="AwordWInners.do">新規受賞者作成</a>
</div>




	</tiles:put>
</tiles:insert>
