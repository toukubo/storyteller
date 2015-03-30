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
	<tiles:put name="title" value="一覧" direct="true" />
	<tiles:put name="content" direct="true">
<div class="main">

<span class="title">一覧</span>
                    <display:table name="${campaneChoises}" id="row" requestURI="CampaneChoises.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="CampaneChoises.do?id=${row.id}">編集</a>
                        <a href="DeleteCampaneChoise.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="製品">
<nobr>
${row.product.id}
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

                    </display:table>
<a href="CampaneChoises.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="CampaneChoises.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="CampaneChoises.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="CampaneChoises.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	編集
</span>
<span id="subform">

		<form method="POST" action="PostCampaneChoiseVP.do">
          <html:hidden name="form" property="id"/>

                                製品<br />
                                <c:choose>
                                    <c:when test="${empty Products}">
                                         <select name="product" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="product" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Products}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.product.id}">
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


タイトル<br />
<html:text name="form" property="title" /><br />

説明<br />
<html:text name="form" property="description" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="CampaneChoises.do">新規作成</a>
</div>




	</tiles:put>
</tiles:insert>
