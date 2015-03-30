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
	
	

    <logic:iterate id="movie" name="movies">
         id
${movie.id}
<br/>
soundFk
${movie.soundFk}
<br/>
frames
<br/>
size
${movie.size}
<br/>
background
${movie.background}
<br/>
account_fk
${movie.account_fk}
<br/>
status
${movie.status}
<br/>

    </logic:iterate>




	</tiles:put>
</tiles:insert>


