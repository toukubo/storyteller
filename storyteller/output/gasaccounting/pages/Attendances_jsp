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

<span class="title">勤怠一覧</span>
                    <display:table name="${attendances}" id="row" requestURI="Attendances.do"
                            requestURIcontext="false"
                            export="false" pagesize="30" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="Attendances.do?id=${row.id}">編集</a>
                        <a href="DeleteAttendance.do?id=${row.id}">削除</a>
                        </display:column>
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="内部ユーザー">
<nobr>
${row.intraUser.name}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="出社時間">
<nobr>
${row.starthour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="出社分">
<nobr>
${row.startminuite}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="退社時間">
<nobr>
${row.endhour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="退社分">
<nobr>
${row.endminute}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="休憩時間">
<nobr>
${row.intervalhours}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="総勤務時間">
<nobr>
${row.totalworkhour}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="遅刻">
<nobr>
${row.late}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="早退">
<nobr>
${row.leaveearly}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="有給休暇">
<nobr>
${row.awl}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="日付"><nobr>
<bean:write name="row" property="date" format="yyyy/MM/dd" /> </nobr>
</display:column>

                    </display:table>
<a href="Attendances.do?d-16544-e=1&6578706f7274=1&displayexport">
CVS
</a>
<a href="Attendances.do?d-16544-e=2&6578706f7274=1&displayexport">
XLS
</a>
<a href="Attendances.do?d-16544-e=3&6578706f7274=1&displayexport">
XML
</a>
<a href="Attendances.do?d-16544-e=4&6578706f7274=1&displayexport">
PDF
</a>


</div>

<div class="sub">
<span id="title">
	勤怠編集
</span>
<span id="subform">

		<form method="POST" action="PostAttendanceVP.do">
          <html:hidden name="form" property="id"/>

                                内部ユーザー<br />
                                <c:choose>
                                    <c:when test="${empty IntraUsers}">
                                         <select name="intraUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="intraUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntraUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.intraUser.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />


出社時間<br />
<html:text name="form" property="starthour" /><br />

出社分<br />
<html:text name="form" property="startminuite" /><br />

退社時間<br />
<html:text name="form" property="endhour" /><br />

退社分<br />
<html:text name="form" property="endminute" /><br />

休憩時間<br />
<html:text name="form" property="intervalhours" /><br />

総勤務時間<br />
<html:text name="form" property="totalworkhour" /><br />

遅刻<br />
<html:text name="form" property="late" /><br />

早退<br />
<html:text name="form" property="leaveearly" /><br />

有給休暇<br />
<html:text name="form" property="awl" /><br />

日付<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />


          <html:submit value="save" />
		</form>
</span>
                        <a href="Attendances.do">新規勤怠作成</a>
</div>







<tiles:insert page="/f.jsp"/>
	</body>
</html:html>

