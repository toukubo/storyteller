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
	<tiles:put name="title" value="社員一覧" direct="true" />
	<tiles:put name="content" direct="true">

                    <display:table name="${staffs}" id="row" requestURI="Staffs.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="ShowStaff.do?id=${row.id}">Show</a> | 
                        <a href="PostStaff.do?id=${row.id}"><img src="icons/table_edit.png"></a>
                        <a href="DeleteStaff.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="staffid">
<nobr>
${row.staffid}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="パスワード">
<nobr>
${row.staffpassword}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="社員名">
<nobr>
${row.staffname}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="性別">
<nobr>
${row.staffsex}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="生年月日"><nobr>
<st:date date="${row.staffbirthday}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="勤務開始年月日"><nobr>
<st:date date="${row.dateofbeginingwork}" /> </nobr>
</display:column>
 <display:column media="html" sortable="true" title="事故">
<nobr>
${row.accidents}
</nobr>
</display:column>

                    </display:table>
<a href="Staffs.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Staffs.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Staffs.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Staffs.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>
	</tiles:put>
</tiles:insert>
