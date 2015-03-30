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
	<tiles:put name="title" value="マーク一覧" direct="true" />
	<tiles:put name="content" direct="true">
<table align="right">
	<tr>
	<div>	
		<td>
			<form action="GrepMark.do">
				<input type="text" name="str"/>
				<input type="submit" value="search"/>
			</form>
		</td>
	</div>
	</tr>
	</table>
	<br />

<div>
<form action="Marks.do">


                      <select name="actual" >
 <option value=""></option>
 <option value="true"></option>
   <option value="false"></option>
   </select>
  &nbsp;











<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 

</form>
</div>

                    <display:table name="${marks}" id="row" requestURI="Marks.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowMark.do?id=${row.id}">Show</a> | 
                        <a href="PostMarkDetail.do?id=${row.id}"><img src="icons/table_edit.png"></a>
                        <a href="DeleteMark.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="actual">
<nobr>
${row.actual}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="markmodel">
<nobr>
${row.markmodel}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="markeemodel">
<nobr>
${row.markeemodel}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="マークid">
<nobr>
${row.markerid}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="makeeid">
<nobr>
${row.makeeid}
</nobr>
</display:column>

                    </display:table>


	</tiles:put>
</tiles:insert>
