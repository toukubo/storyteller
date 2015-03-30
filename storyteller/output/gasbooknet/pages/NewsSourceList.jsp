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
<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">


    <logic:iterate id="model" name="newsSources">
         名前
${newssource.name}
<br/>
id
${newssource.id}
<br/>
ニュース
				<display:table name="newssource.news" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
                        </display:table>
<br/>
url
${newssource.url}
<br/>
rssurl
${newssource.rssurl}
<br/>
説明
${newssource.description}
<br/>
一般ユーザー
${newssource.publicUser}
<br/>
original
${newssource.original}
<br/>
partnerMedia
${newssource.partnerMedia}
<br/>

    </logic:iterate>



</div>
	</body>
</html:html>

