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
                    <display:table name="${s_Sales_Storedays}" id="row" requestURI="S_Sales_Storedays.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="compCd" title="compCd"/>
<display:column media="xml csv excel pdf" property="janCd" title="janCd"/>
<display:column media="xml csv excel pdf" property="smrDayYmd" title="smrDayYmd"/>
<display:column media="xml csv excel pdf" property="inpDayYmd" title="inpDayYmd"/>
<display:column media="xml csv excel pdf" property="actDayYmd" title="actDayYmd"/>
<display:column media="xml csv excel pdf" property="divCd" title="divCd"/>
<display:column media="xml csv excel pdf" property="storCd" title="storCd"/>
<display:column media="xml csv excel pdf" property="mstSellprc" title="mstSellprc"/>
<display:column media="xml csv excel pdf" property="mstSellprcIntax" title="mstSellprcIntax"/>
<display:column media="xml csv excel pdf" property="mstCostprc" title="mstCostprc"/>
<display:column media="xml csv excel pdf" property="lmstSellprc" title="lmstSellprc"/>
<display:column media="xml csv excel pdf" property="lmstSellprcIntax" title="lmstSellprcIntax"/>
<display:column media="xml csv excel pdf" property="lmstCostprc" title="lmstCostprc"/>
<display:column media="xml csv excel pdf" property="posSellprc" title="posSellprc"/>
<display:column media="xml csv excel pdf" property="buyQty" title="buyQty"/>
<display:column media="xml csv excel pdf" property="salesQty" title="salesQty"/>
<display:column media="xml csv excel pdf" property="salesMny" title="salesMny"/>
<display:column media="xml csv excel pdf" property="inSalesRtnQty" title="inSalesRtnQty"/>
<display:column media="xml csv excel pdf" property="inSalesRtnMny" title="inSalesRtnMny"/>
<display:column media="xml csv excel pdf" property="brgnDiscMny" title="brgnDiscMny"/>
<display:column media="xml csv excel pdf" property="otherDiscMny" title="otherDiscMny"/>
<display:column media="xml csv excel pdf" property="brgnKbn" title="brgnKbn"/>
<display:column media="xml csv excel pdf" property="edlpKbn" title="edlpKbn"/>
<display:column media="xml csv excel pdf" property="lposSellprc" title="lposSellprc"/>
<display:column media="xml csv excel pdf" property="lbuyQty" title="lbuyQty"/>
<display:column media="xml csv excel pdf" property="lsalesQty" title="lsalesQty"/>
<display:column media="xml csv excel pdf" property="lsalesMny" title="lsalesMny"/>

                    </display:table>


