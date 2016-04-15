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
                    <display:table name="${incomePayments}" id="row" requestURI="IncomePayments.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="IncomePayments.do?id=${row.id}">編集</a>
                        <a href="DeleteIncomePayment.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="j2eeStory">
<nobr>
${row.j2eeStory.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="value">
<nobr>
${row.value}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="date"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>

                    </display:table>
<a href="IncomePayments.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="IncomePayments.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="IncomePayments.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="IncomePayments.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	編集
</span>
<span id="subform">

		<form method="POST" action="PostIncomePaymentVP.do">
          <html:hidden name="form" property="id"/>

                                j2eeStory<br />
                                <c:choose>
                                    <c:when test="${empty J2eeStorys}">
                                         <select name="j2eeStory" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="j2eeStory" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${J2eeStorys}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.j2eeStory.id}">
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


value<br />
<html:text name="form" property="value" /><br />

date<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />


          <html:submit value="save" />
		</form>
</span>
                        <a href="IncomePayments.do">新規作成</a>
</div>




	</tiles:put>
</tiles:insert>
