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


    <logic:iterate id="model" name="partnerMedias">
         名前
${partnermedia.name}
<br/>
id
${partnermedia.id}
<br/>
newsSources
<div>
<logic:iterate id="newsSource" name="partnermedia" property="newsSources">名前
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
<br />
    </logic:iterate>
</div>				<display:table name="partnermedia.newsSources" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="名前">
<nobr>
${row.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="ニュース">
<nobr>
${row.news}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="url">
<nobr>
${row.url}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="rssurl">
<nobr>
${row.rssurl}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="説明">
<nobr>
${row.description}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="一般ユーザー">
<nobr>
${row.publicUser.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="original">
<nobr>
${row.original}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="partnerMedia">
<nobr>
${row.partnerMedia.id}
</nobr>
</display:column>
                        </display:table>
<br/>

    </logic:iterate>



</div>
	</body>
</html:html>

