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
                    <display:table name="${transitions}" id="row" requestURI="Transitions.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="datetime" title="日時"/>
<display:column media="xml csv excel pdf" property="bs" title="血糖値"/>
<display:column media="xml csv excel pdf" property="stop60min" title="stop60min"/>
<display:column media="xml csv excel pdf" property="operation" title="operation"/>
<display:column media="xml csv excel pdf" property="base" title="base"/>
<display:column media="xml csv excel pdf" property="comment" title="comment"/>
<display:column media="xml csv excel pdf" property="status" title="ステータス"/>

                    </display:table>


