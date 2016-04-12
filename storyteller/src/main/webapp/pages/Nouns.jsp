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

<html>

<div class="main">


<span class="title">nouns</span>
                    <display:table name="${nouns}" id="row" requestURI="Nouns.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="NounDetail.do?id=${row.id}">ed</a>
                        <a href="DeleteNoun.do?id=${row.id}">del</a>
                        </display:column>
<display:column media="xml csv excel pdf" property="name" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.name}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="id" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.id}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="valid" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.valid}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="j2eeStory" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.j2eeStory}</nobr>
</display:column>
<display:column media="xml csv excel pdf" property="japanese" title=""/>
 <display:column media="html" sortable="true" title="">
<nobr>${row.japanese}</nobr>
</display:column>

                    </display:table>


</div>


	</body>
</html>

