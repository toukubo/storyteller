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

<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">

<form action="SetSelectionOfFolder##attr##.do" method="post" name="form">
<a href="${from}.do?pagesize=20">20件</a>
<a href="${from}.do?pagesize=50">50件</a>
<a href="${from}.do?pagesize=100">100件</a>
<a href="${from}.do?pagesize=200">200件</a>
<a href="${from}.do?pagesize=300">300件</a>
<a href="${from}.do?pagesize=500">500件</a>
<a href="#" onclick="selectall(form);">select all</a>
<span class="title">folders</span>
                    <display:table name="${folders}" id="row" requestURI="Folders.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="FolderDetail.do?id=${row.id}">ed</a>
                        <a href="DeleteFolder.do?id=${row.id}">del</a>
                        </display:column>
 <display:column media="html" sortable="true" title="語">
<nobr>
${row.word}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="コンセプト">
<nobr>
${row.concept}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="制作期間"><nobr>
<st:date date="${row.productionspan}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="掛け率">
<nobr>
${row.rate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="containings">
<nobr>
${row.containings}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="folderComments">
<nobr>
${row.folderComments}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="fromdate"><nobr>
<st:date date="${row.fromdate}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="todate"><nobr>
<st:date date="${row.todate}" /> </nobr>
</display:column>

                    </display:table>


                        <a href="FolderDetail.do">new Folder</a>
<html:submit />
</form>
</div>


<div class="sub">

		<html:form method="POST" action="/FolderVP">
          <html:hidden name="folder" property="id"/>

語<br />
<html:text size="40"  name="form" property="word" /><br />

                                一般ユーザー<br />
                                <c:choose>
                                    <c:when test="${empty PublicUsers}">
                                         <select name="publicUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="publicUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${PublicUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.publicUser.id}">
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


コンセプト<br />
<html:text size="40"  name="form" property="concept" /><br />

制作期間<br />
<input type="text" name="productionspanAsString" value="<st:date date="${form.productionspan}" size="20" />" /><br />
掛け率<br />
<html:text size="40"  name="form" property="rate" /><br />

fromdate<br />
<input type="text" name="fromdateAsString" value="<st:date date="${form.fromdate}" size="20" />" /><br />
todate<br />
<input type="text" name="todateAsString" value="<st:date date="${form.todate}" size="20" />" /><br />


          <html:submit />
		</html:form>
</div>






	</body>
</html:html>

