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
                    <display:table name="${payments}" id="row" requestURI="Payments.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="commission" title="振込手数料"/>
<display:column media="xml csv excel pdf" property="paymentdate" title="支払日"/>
<display:column media="xml csv excel pdf" property="contract" title="契約"/>
<display:column media="xml csv excel pdf" property="narrator" title="出演者"/>
<display:column media="xml csv excel pdf" property="total" title="合計"/>
<display:column media="xml csv excel pdf" property="no" title="分割番号"/>
<display:column media="xml csv excel pdf" property="tax" title="消費税"/>
<display:column media="xml csv excel pdf" property="totalprice" title="合計金額"/>
<display:column media="xml csv excel pdf" property="managementrate" title="マネジメント料率"/>
<display:column media="xml csv excel pdf" property="managementprice" title="マネジメント料"/>
<display:column media="xml csv excel pdf" property="withholdingtax" title="源泉税"/>
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="price" title="金額"/>
<display:column media="xml csv excel pdf" property="contractDetail" title="contractDetail"/>
<display:column media="xml csv excel pdf" property="payment" title="payment"/>
<display:column media="xml csv excel pdf" property="paid" title="paid"/>

                    </display:table>


