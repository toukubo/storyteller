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
                    <display:table name="${printings}" id="row" requestURI="Printings.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="filename" title="ファイル名"/>
<display:column media="xml csv excel pdf" property="user" title="ユーザー"/>
<display:column media="xml csv excel pdf" property="department" title="部署"/>
<display:column media="xml csv excel pdf" property="computer" title="コンピューター"/>
<display:column media="xml csv excel pdf" property="savingrate" title="savingrate"/>
<display:column media="xml csv excel pdf" property="num" title="数"/>
<display:column media="xml csv excel pdf" property="applicationname" title="applicationname"/>
<display:column media="xml csv excel pdf" property="filepath" title="filepath"/>
<display:column media="xml csv excel pdf" property="papersize" title="papersize"/>
<display:column media="xml csv excel pdf" property="oneside" title="oneside"/>
<display:column media="xml csv excel pdf" property="color" title="色"/>
<display:column media="xml csv excel pdf" property="printer" title="プリンター"/>
<display:column media="xml csv excel pdf" property="date" title="日付"/>

                    </display:table>


