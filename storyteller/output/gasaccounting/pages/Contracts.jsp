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

<span class="title">契約一覧</span>
                    <display:table name="${contracts}" id="row" requestURI="Contracts.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Contracts.do?id=${row.id}">編集</a>
                        <a href="DeleteContract.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="団体">
<nobr>
${row.organization.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ジョブ">
<nobr>
${row.job.title}
</nobr>
</display:column>

                    </display:table>
<a href="Contracts.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Contracts.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Contracts.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Contracts.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	契約編集
</span>
<span id="subform">

		<form method="POST" action="PostContractVP.do">
          <html:hidden name="form" property="id"/>

                                団体<br />
                                <c:choose>
                                    <c:when test="${empty Organizations}">
                                         <select name="organization" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="organization" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Organizations}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.organization.id}">
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


                                ジョブ<br />
                                <c:choose>
                                    <c:when test="${empty Jobs}">
                                         <select name="job" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="job" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Jobs}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.job.id}">
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
                        <a href="Contracts.do">新規契約作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

