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
                    <display:table name="${purchases}" id="row" requestURI="Purchases.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="publicUser" title="一般ユーザー"/>
<display:column media="xml csv excel pdf" property="total" title="合計"/>
<display:column media="xml csv excel pdf" property="totalordernum" title="合計注文数"/>
<display:column media="xml csv excel pdf" property="shipped" title="発送済み"/>
<display:column media="xml csv excel pdf" property="hour" title="時間"/>
<display:column media="xml csv excel pdf" property="invoiced" title="請求済み"/>
<display:column media="xml csv excel pdf" property="paid" title="支払済"/>
<display:column media="xml csv excel pdf" property="month" title="月"/>
<display:column media="xml csv excel pdf" property="year" title="年"/>

                    </display:table>


