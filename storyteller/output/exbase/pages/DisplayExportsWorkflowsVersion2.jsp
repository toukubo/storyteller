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
                    <display:table name="${workflows}" id="row" requestURI="Workflows.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="startdate" title="éå§æ¥"/>
<display:column media="xml csv excel pdf" property="enddate" title="å®äºæ¥"/>
<display:column media="xml csv excel pdf" property="workflowTemplate" title="workflowTemplate"/>
<display:column media="xml csv excel pdf" property="activities" title="activities"/>
<display:column media="xml csv excel pdf" property="workflowVersions" title="workflowVersions"/>
<display:column media="xml csv excel pdf" property="name" title="ã¯ã¼ã¯ãã­ã¼å"/>
<display:column media="xml csv excel pdf" property="status" title="ç¶æ"/>

                    </display:table>


