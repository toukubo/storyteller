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
                    <display:table name="${sites}" id="row" requestURI="Sites.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="header" title="ヘッダー"/>
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="url" title="url"/>
<display:column media="xml csv excel pdf" property="footer" title="フッター"/>
<display:column media="xml csv excel pdf" property="mobileurl" title="モバイルURL"/>
<display:column media="xml csv excel pdf" property="specialtemplateusing" title="specialtemplateusing"/>
<display:column media="xml csv excel pdf" property="userexporturl" title="userexporturl"/>
<display:column media="xml csv excel pdf" property="hash" title="ハッシュ"/>
<display:column media="xml csv excel pdf" property="publicUsers" title="パブリックユーザー"/>
<display:column media="xml csv excel pdf" property="mailmags" title="メールマガジン"/>

                    </display:table>


