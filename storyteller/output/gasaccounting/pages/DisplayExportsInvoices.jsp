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
                    <display:table name="${invoices}" id="row" requestURI="Invoices.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="currency" title="通貨"/>
<display:column media="xml csv excel pdf" property="total" title="合計"/>
<display:column media="xml csv excel pdf" property="productname" title="商品名"/>
<display:column media="xml csv excel pdf" property="cost" title="原価"/>
<display:column media="xml csv excel pdf" property="payment" title="決済方法"/>
<display:column media="xml csv excel pdf" property="qty" title="個数"/>
<display:column media="xml csv excel pdf" property="remark" title="備考"/>
<display:column media="xml csv excel pdf" property="code" title="請求番号"/>
<display:column media="xml csv excel pdf" property="subject" title="件名"/>
<display:column media="xml csv excel pdf" property="billingdate" title="請求日"/>
<display:column media="xml csv excel pdf" property="duedate" title="支払い期限"/>
<display:column media="xml csv excel pdf" property="taxbeforecharges" title="税抜き請求金額"/>
<display:column media="xml csv excel pdf" property="totconsumptiontax" title="消費税総額"/>
<display:column media="xml csv excel pdf" property="margin" title="差益"/>
<display:column media="xml csv excel pdf" property="marginrate" title="差益率"/>
<display:column media="xml csv excel pdf" property="partno" title="品番"/>
<display:column media="xml csv excel pdf" property="purchaseprice" title="仕入値"/>
<display:column media="xml csv excel pdf" property="overseas" title="海外"/>
<display:column media="xml csv excel pdf" property="rate" title="レート"/>
<display:column media="xml csv excel pdf" property="retailprice" title="小売価格"/>
<display:column media="xml csv excel pdf" property="wholesaleprice" title="卸値"/>
<display:column media="xml csv excel pdf" property="salestax" title="消費税総額"/>
<display:column media="xml csv excel pdf" property="tax" title="税額"/>
<display:column media="xml csv excel pdf" property="taxinternorextern" title="税（外／内）"/>
<display:column media="xml csv excel pdf" property="pretaxsales" title="売上げ税抜"/>
<display:column media="xml csv excel pdf" property="rackrate" title="掛け率"/>
<display:column media="xml csv excel pdf" property="intraUser" title="内部ユーザー"/>
<display:column media="xml csv excel pdf" property="job" title="ジョブ"/>
<display:column media="xml csv excel pdf" property="infotransfer" title="決済方法"/>
<display:column media="xml csv excel pdf" property="organization" title="団体"/>

                    </display:table>


