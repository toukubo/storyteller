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

<form action="SetSelectionOfValidationRuleChoise##attr##.do" method="post" name="form">
<a href="${from}.do?pagesize=20">20åè</a>
<a href="${from}.do?pagesize=50">50åè</a>
<a href="${from}.do?pagesize=100">100åè</a>
<a href="${from}.do?pagesize=200">200åè</a>
<a href="${from}.do?pagesize=300">300åè</a>
<a href="${from}.do?pagesize=500">500åè</a>
<a href="#" onclick="selectall(form);">select all</a>
<span class="title">validationrulechoises</span>
                    <display:table name="${validationrulechoises}" id="row" requestURI="ValidationRuleChoises.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ValidationRuleChoiseDetail.do?id=${row.id}">ed</a>
                        <a href="DeleteValidationRuleChoise.do?id=${row.id}">del</a>
                        </display:column>
<display:column media="xml csv excel pdf" property="actualcode" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.actualcode}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="errormessage" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.errormessage}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="attrUse" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.attrUse}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="validationRule" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.validationRule}</nobr>
</display:column>

                    </display:table>


                        <a href="ValidationRuleChoiseDetail.do">new ValidationRuleChoise</a>
<html:submit />
</form>
</div>


<div class="sub">

		<html:form method="POST" action="/ValidationRuleChoiseVP">
          <html:hidden name="validationrulechoise" property="id"/>

actualcode<br />
<html:text name="validationrulechoise" property="actualcode" /><br />

errormessage<br />
<html:text name="validationrulechoise" property="errormessage" /><br />

                                <c:choose>
                                    <c:when test="${empty attrUses}">
                                         <select name="attrUse" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="attrUse" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${attrUses}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq ValidationRuleChoise.attrUse.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>

                                <c:choose>
                                    <c:when test="${empty validationRules}">
                                         <select name="validationRule" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="validationRule" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${validationRules}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq ValidationRuleChoise.validationRule.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose>



          <html:submit />
		</html:form>
</div>






	</body>
</html:html>

