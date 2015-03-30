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
                    <display:table name="${artists}" id="row" requestURI="Artists.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="publicUser" title="一般ユーザー"/>
<display:column media="xml csv excel pdf" property="works" title="作品"/>
<display:column media="xml csv excel pdf" property="portrait" title="portrait"/>
<display:column media="xml csv excel pdf" property="events" title="発生状況"/>
<display:column media="xml csv excel pdf" property="artistThreads" title="アーティストBBS"/>
<display:column media="xml csv excel pdf" property="historicalProfiles" title="プロフィール"/>
<display:column media="xml csv excel pdf" property="actionHistories" title="履歴"/>

                    </display:table>


