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
	<tiles:put name="title" value="Storys" direct="true" />
	<tiles:put name="content" direct="true">
<display:table name="${j2eestorys}" id="row" pagesize="10" requestURI="J2eeStorys.do">
<display:column title="id">
	${row.id}
</display:column>
		<c:if test="${!empty param.del}">
				<display:column>
						<a href="DeleteJ2eeStory.do?id=${row.id}">Del</a>
				</display:column>
		</c:if>
	<display:column title="Name" width="50">
		<a href="J2eeStoryDetail.do?id=<bean:write name="row" property="id"/>"><bean:write name="row" property="name"/></a>
	</display:column>
	<display:column>
	<a href="ShowJ2eeStoryAboutNouns.do?id=${row.id}">Nouns</a>
	
	</display:column>
	<display:column title="StruntsConfigCodes">
		<a href="StrutsConfigCodesOfSentencesOfAJ2eeProject.do?id=<bean:write name="row" property="id"/>">codes</a>
		or 
		<a href="StrutsConfigOfAJ2eeStory.do?id=${row.id}">ファイルで</a>
	</display:column>
	<display:column title="Load Nouns From Core Jar">
			<a href="SystemCreatesNonnsAndAttrsFromCoreJarOfJ2eeStorys.do?j2eeStory=${row.name}">XXX</a>
	
	</display:column>

</display:table>
</div>
	</tiles:put>
</tiles:insert>
