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
<tiles:insert definition=".publicLayout">
	<tiles:put name="title" value="" direct="true" />
	<tiles:put name="content" direct="true">
	
	

    <logic:iterate id="keyword" name="keywords">
         id
${keyword.id}
<br/>
slug
${keyword.slug}
<br/>
permalink
${keyword.permalink}
<br/>
haspage
${keyword.haspage}
<br/>
quotes
<br/>
keywordRelations
<br/>
value
${keyword.value}
<br/>

    </logic:iterate>




	</tiles:put>
</tiles:insert>


