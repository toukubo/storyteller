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
                    <display:table name="${contracts}" id="row" requestURI="Contracts.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="appearancedate" title="appearancedate"/>
<display:column media="xml csv excel pdf" property="totalprice" title="合計金額"/>
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="price" title="金額"/>
<display:column media="xml csv excel pdf" property="customer" title="クライアント"/>
<display:column media="xml csv excel pdf" property="total" title="合計請求額"/>
<display:column media="xml csv excel pdf" property="tax" title="消費税"/>
<display:column media="xml csv excel pdf" property="programname" title="番組名"/>
<display:column media="xml csv excel pdf" property="invoiceno" title="請求ナンバー"/>
<display:column media="xml csv excel pdf" property="invoicedate" title="請求日"/>
<display:column media="xml csv excel pdf" property="receivedate" title="入金日"/>
<display:column media="xml csv excel pdf" property="contractDetails" title="契約詳細"/>
<display:column media="xml csv excel pdf" property="totalreceiveprice" title="totalreceiveprice"/>
<display:column media="xml csv excel pdf" property="contractdate" title="contractdate"/>
<display:column media="xml csv excel pdf" property="invoiced" title="invoiced"/>
<display:column media="xml csv excel pdf" property="received" title="received"/>

                    </display:table>


