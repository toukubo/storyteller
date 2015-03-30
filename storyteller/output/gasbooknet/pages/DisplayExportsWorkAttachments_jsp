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
                    <display:table name="${workAttachments}" id="row" requestURI="WorkAttachments.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="work" title="作品"/>
<display:column media="xml csv excel pdf" property="attachment" title="付属品"/>
<display:column media="xml csv excel pdf" property="filename" title="filename"/>
<display:column media="xml csv excel pdf" property="mainvisual" title="mainvisual"/>
<display:column media="xml csv excel pdf" property="dbFile" title="dbFile"/>
<display:column media="xml csv excel pdf" property="workAttachmentPreviews" title="workAttachmentPreviews"/>

                    </display:table>


