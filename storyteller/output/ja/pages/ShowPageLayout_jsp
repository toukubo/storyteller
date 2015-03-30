<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/formtag.tld" prefix="formtag" %> 
<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> 

<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<%@ page isELIgnored="false" %>

<tiles:insert definition=".publicLayout">
	<tiles:put name="title" value="##japanese##" direct="true" />
	<tiles:put name="content" direct="true">

<div>
id
${pagelayout.id}
<br/>
requesturi
${pagelayout.requesturi}
<br/>
components
<div>
<logic:iterate id="component" name="pagelayout" property="components">id
${component.id}
<br/>
dataComponent
${component.dataComponent}
<br/>
pageLayout
${component.pageLayout}
<br/>
label
${component.label}
<br/>
x
${component.x}
<br/>
y
${component.y}
<br/>
width
${component.width}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="pagelayout.components" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="dataComponent">
<nobr>
${row.dataComponent.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="pageLayout">
<nobr>
${row.pageLayout.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="label">
<nobr>
${row.label.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="x">
<nobr>
${row.x}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="y">
<nobr>
${row.y}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="width">
<nobr>
${row.width}
</nobr>
</display:column>
                        </display:table>
<br/>


</div>




	</tiles:put>
</tiles:insert>
