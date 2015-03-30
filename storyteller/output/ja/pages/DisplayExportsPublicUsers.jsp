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
                    <display:table name="${publicUsers}" id="row" requestURI="PublicUsers.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="code" title="ＪＡコード"/>
<display:column media="xml csv excel pdf" property="totalcost" title="受入累計"/>
<display:column media="xml csv excel pdf" property="infocode" title="情報管理コード"/>
<display:column media="xml csv excel pdf" property="jacode" title="農協コード"/>
<display:column media="xml csv excel pdf" property="accountTransactions" title="取引"/>
<display:column media="xml csv excel pdf" property="accountofficecode" title="金融機関コード"/>
<display:column media="xml csv excel pdf" property="shopcode" title="店舗コード"/>
<display:column media="xml csv excel pdf" property="departmentcode" title="科目コード"/>
<display:column media="xml csv excel pdf" property="accountnumber" title="口座番号"/>
<display:column media="xml csv excel pdf" property="accountstatus" title="口座状態"/>
<display:column media="xml csv excel pdf" property="closurebreakdate" title="閉鎖解除年月日"/>
<display:column media="xml csv excel pdf" property="closuretype" title="解約区分"/>
<display:column media="xml csv excel pdf" property="branchcode" title="所属支所コード"/>
<display:column media="xml csv excel pdf" property="managementtype" title="経営形態"/>
<display:column media="xml csv excel pdf" property="areacode" title="地区コード"/>
<display:column media="xml csv excel pdf" property="varialblestatscode" title="任意集計コード１"/>
<display:column media="xml csv excel pdf" property="varialblestatscodetwo" title="任意集計コード２"/>
<display:column media="xml csv excel pdf" property="detaileddocumenttype" title="内訳資料区分"/>
<display:column media="xml csv excel pdf" property="layoutno" title="レイアウトＮＯ"/>
<display:column media="xml csv excel pdf" property="printingcontrolcode" title="帳票制御コード"/>
<display:column media="xml csv excel pdf" property="sorimachitargettype" title="ソリマチ対象者区分"/>
<display:column media="xml csv excel pdf" property="remaining" title="取引残高"/>
<display:column media="xml csv excel pdf" property="totalincome" title="受入累計"/>
<display:column media="xml csv excel pdf" property="lasttransactiondate" title="最終取引経理年月日"/>
<display:column media="xml csv excel pdf" property="nonaccountedatfirst" title="要精算額当初金額"/>
<display:column media="xml csv excel pdf" property="nonaccountedatlast" title="要精算額累計金額"/>
<display:column media="xml csv excel pdf" property="transactionSummeries" title="集計"/>
<display:column media="xml csv excel pdf" property="area" title="地区"/>
<display:column media="xml csv excel pdf" property="userInfo" title="userInfo"/>
<display:column media="xml csv excel pdf" property="name" title="組合員名"/>
<display:column media="xml csv excel pdf" property="type" title="種類"/>

                    </display:table>


