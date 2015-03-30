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

<%@ page isELIgnored="false" %>

<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">

<span class="title">一覧</span>
                    <display:table name="${contributes}" id="row" requestURI="Contributes.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Contributes.do?id=${row.id}">編集</a>
                        <a href="DeleteContribute.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="contributionType">
<nobr>
${row.contributionType.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="validyearstart">
<nobr>
${row.validyearstart}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="validmonthstart">
<nobr>
${row.validmonthstart}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="intraUser">
<nobr>
${row.intraUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="validmonthend">
<nobr>
${row.validmonthend}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="j2eeStories">
<nobr>
${row.j2eeStories}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="point">
<nobr>
${row.point}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="validyearend">
<nobr>
${row.validyearend}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="acknowledged">
<nobr>
${row.acknowledged}
</nobr>
</display:column>

                    </display:table>
<a href="Contributes.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Contributes.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Contributes.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Contributes.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	編集
</span>
<span id="subform">

		<form method="POST" action="PostContributeVP.do">
          <html:hidden name="form" property="id"/>

                                contributionType<br />
                                <c:choose>
                                    <c:when test="${empty ContributionTypes}">
                                         <select name="contributionType" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="contributionType" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${ContributionTypes}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.contributionType.id}">
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


validyearstart<br />
<html:text name="form" property="validyearstart" /><br />

validmonthstart<br />
<html:text name="form" property="validmonthstart" /><br />

                                intraUser<br />
                                <c:choose>
                                    <c:when test="${empty IntraUsers}">
                                         <select name="intraUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="intraUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntraUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.intraUser.id}">
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


validmonthend<br />
<html:text name="form" property="validmonthend" /><br />

point<br />
<html:text name="form" property="point" /><br />

validyearend<br />
<html:text name="form" property="validyearend" /><br />

acknowledged<br />
<html:text name="form" property="acknowledged" /><br />



          <html:submit value="save" />
		</form>
</span>
                        <a href="Contributes.do">新規作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

