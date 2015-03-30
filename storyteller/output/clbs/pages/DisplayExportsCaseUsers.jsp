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
                    <display:table name="${caseUsers}" id="row" requestURI="CaseUsers.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="account" title="アカウント"/>
<display:column media="xml csv excel pdf" property="operations" title="operations"/>
<display:column media="xml csv excel pdf" property="bodyweight" title="体重"/>
<display:column media="xml csv excel pdf" property="name" title="名前"/>
<display:column media="xml csv excel pdf" property="sex" title="性別"/>
<display:column media="xml csv excel pdf" property="age" title="年齢"/>
<display:column media="xml csv excel pdf" property="height" title="身長"/>
<display:column media="xml csv excel pdf" property="onsetage" title="発症年齢"/>
<display:column media="xml csv excel pdf" property="curebeforoperation" title="入院前治療"/>

                    </display:table>


