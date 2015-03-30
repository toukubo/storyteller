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
${tag.id}
<br/>
word
${tag.word}
<br/>
artistTaggings
<div>
<logic:iterate id="artistTagging" name="tag" property="artistTaggings">id
${artisttagging.id}
<br/>
tag
${artisttagging.tag}
<br/>
artist
${artisttagging.artist}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="tag.artistTaggings" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="tag">
<nobr>
${row.tag.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="artist">
<nobr>
${row.artist.id}
</nobr>
</display:column>
                        </display:table>
<br/>
newsTaggings
<div>
<logic:iterate id="newsTagging" name="tag" property="newsTaggings">id
${newstagging.id}
<br/>
tag
${newstagging.tag}
<br/>
news
${newstagging.news}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="tag.newsTaggings" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="tag">
<nobr>
${row.tag.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="news">
<nobr>
${row.news.id}
</nobr>
</display:column>
                        </display:table>
<br/>
workTaggings
<div>
<logic:iterate id="workTagging" name="tag" property="workTaggings">id
${worktagging.id}
<br/>
tag
${worktagging.tag}
<br/>
work
${worktagging.work}
<br/>
<br />
    </logic:iterate>
</div>				<display:table name="tag.workTaggings" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="tag">
<nobr>
${row.tag.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="work">
<nobr>
${row.work.id}
</nobr>
</display:column>
                        </display:table>
<br/>


</div>



	</body>
</html:html>


