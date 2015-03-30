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

<form action="SetSelectionOfValidationRule##attr##.do" method="post" name="form">
<a href="${from}.do?pagesize=20">20åè</a>
<a href="${from}.do?pagesize=50">50åè</a>
<a href="${from}.do?pagesize=100">100åè</a>
<a href="${from}.do?pagesize=200">200åè</a>
<a href="${from}.do?pagesize=300">300åè</a>
<a href="${from}.do?pagesize=500">500åè</a>
<a href="#" onclick="selectall(form);">select all</a>
<span class="title">validationrules</span>
                    <display:table name="${validationrules}" id="row" requestURI="ValidationRules.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ValidationRuleDetail.do?id=${row.id}">ed</a>
                        <a href="DeleteValidationRule.do?id=${row.id}">del</a>
                        </display:column>
<display:column media="xml csv excel pdf" property="name" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.name}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="id" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.id}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="defaulterrormessage" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.defaulterrormessage}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="template" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.template}</nobr>
</display:column>

                    </display:table>


                        <a href="ValidationRuleDetail.do">new ValidationRule</a>
<html:submit />
</form>
</div>


<div class="sub">

		<html:form method="POST" action="/ValidationRuleVP">
          <html:hidden name="validationrule" property="id"/>

name<br />
<html:text name="validationrule" property="name" /><br />

defaulterrormessage<br />
<html:text name="validationrule" property="defaulterrormessage" /><br />

template<br />
<html:text name="validationrule" property="template" /><br />



          <html:submit />
		</html:form>
</div>






	</body>
</html:html>

