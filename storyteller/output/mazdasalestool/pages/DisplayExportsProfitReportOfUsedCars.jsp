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
                    <display:table name="${profitReportOfUsedCars}" id="row" requestURI="ProfitReportOfUsedCars.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="intraUser" title="intraUser"/>
<display:column media="xml csv excel pdf" property="credit" title="内クレジット"/>
<display:column media="xml csv excel pdf" property="memo" title="通信欄"/>
<display:column media="xml csv excel pdf" property="salescost" title="販売費"/>
<display:column media="xml csv excel pdf" property="accepteddate" title="受注日"/>
<display:column media="xml csv excel pdf" property="customername" title="販売先ユーザ名"/>
<display:column media="xml csv excel pdf" property="chargesforregisttaxex" title="税抜き登録収手"/>
<display:column media="xml csv excel pdf" property="interest" title="金利"/>
<display:column media="xml csv excel pdf" property="numofpaymentsforcredit" title="支払回数"/>
<display:column media="xml csv excel pdf" property="registeddate" title="登録日"/>
<display:column media="xml csv excel pdf" property="priceoftradein" title="下取価格"/>
<display:column media="xml csv excel pdf" property="entereddate" title="確定注文書入力日"/>
<display:column media="xml csv excel pdf" property="modelyearofsalescar" title="販売車両年式"/>
<display:column media="xml csv excel pdf" property="modelcodeofsalescar" title="販売車両型式"/>
<display:column media="xml csv excel pdf" property="noofsalescar" title="販売車両車体No"/>
<display:column media="xml csv excel pdf" property="sourceofsales" title="販売源泉"/>
<display:column media="xml csv excel pdf" property="ab" title="AB or NON-AB"/>
<display:column media="xml csv excel pdf" property="triggerofsales" title="商談のキッカケ"/>
<display:column media="xml csv excel pdf" property="recoverorder" title="受注再生"/>
<display:column media="xml csv excel pdf" property="registtype" title="新規移転登録"/>
<display:column media="xml csv excel pdf" property="assignedpricetaxex" title="車両本体税抜き指示価格"/>
<display:column media="xml csv excel pdf" property="salespricetaxex" title="車両本体税抜き販売価格"/>
<display:column media="xml csv excel pdf" property="costpricetaxex" title="車両本体税抜き原価"/>
<display:column media="xml csv excel pdf" property="totalpaymenttaxin" title="税込支払総額"/>
<display:column media="xml csv excel pdf" property="cash" title="内現金"/>
<display:column media="xml csv excel pdf" property="modelyearoftradein" title="下取年式"/>
<display:column media="xml csv excel pdf" property="modelcodeoftradein" title="下取型式"/>
<display:column media="xml csv excel pdf" property="nooftradein" title="下取車体NO"/>
<display:column media="xml csv excel pdf" property="priceofnonfreemaintenancetaxex" title="税抜き有償整備"/>
<display:column media="xml csv excel pdf" property="priceofnonfreepartstaxex" title="税抜き有償部品"/>
<display:column media="xml csv excel pdf" property="creditkb" title="クレジットKB"/>
<display:column media="xml csv excel pdf" property="priceofpartsforrecover" title="中古再生部品"/>
<display:column media="xml csv excel pdf" property="priceofoutsourcingforrecover" title="中古再生外注"/>
<display:column media="xml csv excel pdf" property="priceofworkingforrecover" title="中古再生工賃"/>
<display:column media="xml csv excel pdf" property="improvementReportOfUsedCarProfit" title="improvementReportOfUsedCarProfit"/>

                    </display:table>


