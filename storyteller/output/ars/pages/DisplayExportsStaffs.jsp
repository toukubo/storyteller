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
                    <display:table name="${staffs}" id="row" requestURI="Staffs.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="staffid" title="staffid"/>
<display:column media="xml csv excel pdf" property="staffpassword" title="パスワード"/>
<display:column media="xml csv excel pdf" property="staffname" title="社員名"/>
<display:column media="xml csv excel pdf" property="staffsex" title="性別"/>
<display:column media="xml csv excel pdf" property="staffbirthday" title="生年月日"/>
<display:column media="xml csv excel pdf" property="dateofbeginingwork" title="勤務開始年月日"/>
<display:column media="xml csv excel pdf" property="accidents" title="事故"/>

                    </display:table>


