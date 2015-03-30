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

<html:html>
<tiles:insert page="/h.jsp"/>
<div>
id
${staticdata.id}
<br/>
smtphost
${staticdata.smtphost}
<br/>
smtpacocunt
${staticdata.smtpacocunt}
<br/>
smtppassword
${staticdata.smtppassword}
<br/>
reportmail
${staticdata.reportmail}
<br/>
projectbystorytellerrate
${staticdata.projectbystorytellerrate}
<br/>
unix
${staticdata.unix}
<br/>
humanalecostrate
${staticdata.humanalecostrate}
<br/>
costpercentage
${staticdata.costpercentage}
<br/>
jackpot
${staticdata.jackpot}
<br/>
ticker
${staticdata.ticker}
<br/>


</div>



	</body>
</html:html>


