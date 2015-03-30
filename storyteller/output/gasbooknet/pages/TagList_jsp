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


    <logic:iterate id="model" name="tags">
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
アーティスト
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
 <display:column media="html" sortable="true" title="アーティスト">
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
ニュース
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
 <display:column media="html" sortable="true" title="ニュース">
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
作品
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
 <display:column media="html" sortable="true" title="作品">
<nobr>
${row.work.id}
</nobr>
</display:column>
                        </display:table>
<br/>

    </logic:iterate>



</div>
	</body>
</html:html>

