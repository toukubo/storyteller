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
                    <display:table name="${supplierDeliveryRates}" id="row" requestURI="SupplierDeliveryRates.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="term" title="期間"/>
<display:column media="xml csv excel pdf" property="company" title="会社"/>
<display:column media="xml csv excel pdf" property="supplier" title="仕入先"/>
<display:column media="xml csv excel pdf" property="deliverynum" title="deliverynum"/>
<display:column media="xml csv excel pdf" property="deliverytotal" title="deliverytotal"/>
<display:column media="xml csv excel pdf" property="ordertotal" title="ordertotal"/>
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="ordernum" title="注文数"/>

                    </display:table>


