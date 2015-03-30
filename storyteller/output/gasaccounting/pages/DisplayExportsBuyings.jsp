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
                    <display:table name="${buyings}" id="row" requestURI="Buyings.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="intraUser" title="内部ユーザー"/>
<display:column media="xml csv excel pdf" property="job" title="ジョブ"/>
<display:column media="xml csv excel pdf" property="organization" title="団体"/>
<display:column media="xml csv excel pdf" property="deliverydate" title="配送日"/>
<display:column media="xml csv excel pdf" property="qty" title="個数"/>
<display:column media="xml csv excel pdf" property="remark" title="備考"/>
<display:column media="xml csv excel pdf" property="purchaseorderno" title="purchaseorderno"/>
<display:column media="xml csv excel pdf" property="paymentmethods" title="paymentmethods"/>
<display:column media="xml csv excel pdf" property="orderdate" title="orderdate"/>
<display:column media="xml csv excel pdf" property="paymentdate" title="paymentdate"/>
<display:column media="xml csv excel pdf" property="paymentamount" title="paymentamount"/>
<display:column media="xml csv excel pdf" property="purchasingcontent" title="purchasingcontent"/>
<display:column media="xml csv excel pdf" property="bids" title="bids"/>
<display:column media="xml csv excel pdf" property="taxamount" title="taxamount"/>
<display:column media="xml csv excel pdf" property="handpickedamount" title="handpickedamount"/>
<display:column media="xml csv excel pdf" property="consumptiontax" title="consumptiontax"/>
<display:column media="xml csv excel pdf" property="pretaxamount" title="pretaxamount"/>
<display:column media="xml csv excel pdf" property="accountTitle" title="accountTitle"/>
<display:column media="xml csv excel pdf" property="buyingUnit" title="buyingUnit"/>

                    </display:table>


