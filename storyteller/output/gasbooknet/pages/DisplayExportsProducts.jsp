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
                    <display:table name="${products}" id="row" requestURI="Products.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="date" title="日付"/>
<display:column media="xml csv excel pdf" property="description" title="説明"/>
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="intraUser" title="内部ユーザー"/>
<display:column media="xml csv excel pdf" property="items" title="アイテム"/>
<display:column media="xml csv excel pdf" property="c" title="c"/>
<display:column media="xml csv excel pdf" property="work" title="作品"/>
<display:column media="xml csv excel pdf" property="poplular" title="人気"/>
<display:column media="xml csv excel pdf" property="b" title="b "/>
<display:column media="xml csv excel pdf" property="a" title="a"/>
<display:column media="xml csv excel pdf" property="brand" title="brand"/>

                    </display:table>


