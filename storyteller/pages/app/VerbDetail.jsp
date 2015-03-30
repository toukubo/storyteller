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
	<tiles:put name="title" value="Verb " direct="true" />
	<tiles:put name="side" direct="true">
	</tiles:put>
	<tiles:put name="content" direct="true"  >
		<html:form method="POST" action="/VerbVP">
		
		                    <html:hidden name="verb" property="id"/><br>
		                    name<br>
		                    <html:text name="verb" property="name"/><br>
		                    日本語<br>
		                    <html:text name="verb" property="japanese"/><br>
		                    price<br>
		                    <html:text name="verb" property="price"/><br>
		                    marketAveragePrice<br>
		                    <html:text name="verb" property="marketAveragePrice"/><br>
		                    profilt<br>
		                    <html:text name="verb" property="profilt"/><br>
		                    marketAverageDays<br>
		                    <html:text name="verb" property="marketAverageDays"/><br>
		                    cost<br>
		                    <html:text name="verb" property="cost"/><br>
		                    
		                    
							two objects(名詞節を二つ取るか）<br>
	                        <html:checkbox name="verb" property="twoobjects" styleClass="criteriaField" styleId="twoobjects"/><br>
    						valid<br>                           
                            <html:checkbox name="verb" property="valid" styleClass="criteriaField" styleId="valid"/><br>
                            <html:submit />
		
		</html:form>
		</div>
		<hr>
		
<div>
<span>
<span class="title">StrutsActionTemplate OF The Verb</span>

<!-- 1 StrutsActionTemplate -->
                    <display:table name="${verb.strutsActionTemplates}" id="row" requestURI="/VerbDetail.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="StrutsActionTemplateDetail.do?id=${row.id}">☆</a>
                        <a href="DeleteStrutsTemplate.do?id=${row.id}">Del</a>
                        </display:column>
                        <display:column media="xml csv excel pdf"
                            property="nametemplate"
                            title="struts.action.template.nametemplate"/>
                        <display:column media="html"
                            headerClass="nametemplate" paramId="nametemplate" maxLength="36"
                            sortProperty="nametemplate" sortable="true"
                            title="nametemplate"><nobr>${row.nametemplate}</nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="template"
                            title="struts.action.template.template"/>
                        <display:column media="html"
                            headerClass="template" paramId="template" maxLength="3000"
                            sortProperty="template" sortable="true"
                            title="struts.action.template.template">
                            <textarea cols="200" rows="40">${row.template}</textarea>
                            </display:column>
                        <display:column media="xml csv excel pdf"
                            property="targeteeaction"
                            title="struts.action.template.targeteeaction"/>
                        <display:column media="html"
                            headerClass="targeteeaction" paramId="targeteeaction" maxLength="36"
                            sortProperty="targeteeaction" sortable="true"
                            title="targeteeaction"><nobr>${row.targeteeaction}</nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="jspTemplate"
                            title="struts.action.template.jsp.template"/>
                        <display:column media="html"
                            headerClass="jspTemplate" paramId="jspTemplate" maxLength="36"
                            sortProperty="jspTemplate" sortable="true"
                            title="jsp.template"><nobr>${row.jspTemplate}</nobr></display:column>
                    </display:table>
                    <a href="StrutsActionTemplateDetail.do?rid=<bean:write name="verb" property="id"/>">Add StrutsActionte</a>
</span>
<hr>

<span>
<span class="title">JspTemplate OF The Verb</span>
<!-- 2 -->
                    <display:table name="${verb.jspTemplates}" id="row" requestURI="/VerbDetail.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                            
                        <display:column media="html" sortable="false">
                        oya
                            <a href="JspTemplateDetail.do?id=${row.id}">☆</a> //
                            <a href="DeleteJSPTemplate.do?id=${row.id}">Del</a>
                        </display:column>
                        <display:column media="xml csv excel pdf"
                            property="template"
                            title="jsp.template.template"/>
                        <display:column media="html"
                            headerClass="template" paramId="template" maxLength="3000"
                            sortProperty="template" sortable="true"
                            title="jsp.template.template"><textarea cols="200" rows="40" >${row.template}</textarea></display:column>
                        <display:column media="xml csv excel pdf"
                            property="nametemplate"
                            title="nametemplate"/>
                        <display:column media="html"
                            headerClass="nametemplate" paramId="nametemplate" maxLength="36"
                            sortProperty="nametemplate" sortable="true"
                            title="jsp.template.nametemplate"><nobr><formatting:escape language="javascript,html">${row.nametemplate}</formatting:escape></nobr></display:column>
                        <display:column media="xml csv excel pdf"
                            property="strutsActionTemplates"
                            title="action.templates"/>
                        <display:column media="html"
                            headerClass="strutsActionTemplates" paramId="strutsActionTemplates" maxLength="36"
                            sortProperty="strutsActionTemplates" sortable="true"
                            title="action.templates"><nobr><formatting:escape language="javascript,html">${row.strutsActionTemplates}</formatting:escape></nobr></display:column>
                    </display:table>
                    <a href="JspTemplateDetail.do?rid=<bean:write name="verb" property="id"/>">Add JSPTemplate</a><br>
</span>
<hr>
<span>
<span class="title">template inputs</span>
<!-- 3 -->
                    <display:table name="${verb.templateInputs}" id="row" requestURI="/VerbDetail.do"
                            requestURIcontext="false"
                            export="true" pagesize="0" sort="list">
                        <display:column media="html" sortable="false">
                            <nobr>
                            <a href="TemplateInputDetailAddingToVerb.do?id=${row.id}">☆</a>
                            <a href="DeleteTemplateInput.do?id=${row.id}">Del</a>
                            </nobr>
                        </display:column>
                        <display:column media="xml csv excel pdf"
                            property="name"
                            title="template.input.name"/>
                        <display:column media="html"
                            headerClass="name" paramId="name" maxLength="36"
                            sortProperty="name" sortable="true"
                            title="template.input.name"><nobr>${row.name}</nobr></display:column>
                    </display:table>
                    <a href="TemplateInputDetailAddingToVerb.do?rid=<bean:write name="verb" property="id"/>">Add Template Input</a>
                    <a href="UpdateTemplateInputsFromTemplatesOfAVerb.do?id=${verb.id}">auto update</a>

</span>
<hr>
<span>
<!-- 4 -->


</span>

	</tiles:put>
</tiles:insert>
