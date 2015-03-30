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

<form action="SetSelectionOfBrand##attr##.do" method="post" name="form">
<a href="${from}.do?pagesize=20">20件</a>
<a href="${from}.do?pagesize=50">50件</a>
<a href="${from}.do?pagesize=100">100件</a>
<a href="${from}.do?pagesize=200">200件</a>
<a href="${from}.do?pagesize=300">300件</a>
<a href="${from}.do?pagesize=500">500件</a>
<a href="#" onclick="selectall(form);">select all</a>
<span class="title">brands</span>
                    <display:table name="${brands}" id="row" requestURI="Brands.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="BrandDetail.do?id=${row.id}">ed</a>
                        <a href="DeleteBrand.do?id=${row.id}">del</a>
                        </display:column>
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
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
 <display:column media="html" sortable="true" title="最近の">
<nobr>
${row.recentlyadded}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="人気">
<nobr>
${row.poplular}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ロゴ">
<nobr>
${row.logo}
</nobr>
</display:column>

                    </display:table>


                        <a href="BrandDetail.do">new Brand</a>
<html:submit />
</form>
</div>


<div class="sub">

		<html:form method="POST" action="/BrandVP">
          <html:hidden name="brand" property="id"/>

名前<br />
<html:text size="40"  name="form" property="name" /><br />

日付<br />
<input type="text" name="dateAsString" value="<st:date date="${form.date}" size="20" />" /><br />
説明<br />
<html:text size="40"  name="form" property="description" /><br />

最近の<br />
<html:checkbox name="form" property="recentlyadded" /><br />

人気<br />
<html:checkbox name="form" property="poplular" /><br />

                                ロゴ<br />
                                <c:choose>
                                    <c:when test="${empty Logos}">
                                         <select name="logo" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="logo" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Logos}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.logo.id}">
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




          <html:submit />
		</html:form>
</div>






	</body>
</html:html>

