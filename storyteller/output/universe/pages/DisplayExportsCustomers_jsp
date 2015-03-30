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
                    <display:table name="${customers}" id="row" requestURI="Customers.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="customerDetails" title="customerDetails"/>
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="kana" title="担当者名前(カナ)"/>
<display:column media="xml csv excel pdf" property="mail" title="メール"/>
<display:column media="xml csv excel pdf" property="phone" title="電話番号"/>
<display:column media="xml csv excel pdf" property="code" title="顧客コード"/>
<display:column media="xml csv excel pdf" property="category" title="顧客分類"/>
<display:column media="xml csv excel pdf" property="mobilephone" title="携帯電話番号"/>
<display:column media="xml csv excel pdf" property="memo" title="メモ"/>
<display:column media="xml csv excel pdf" property="company" title="会社名"/>
<display:column media="xml csv excel pdf" property="officialposition" title="担当者役職"/>
<display:column media="xml csv excel pdf" property="dealingsbank" title="取引銀行"/>
<display:column media="xml csv excel pdf" property="startupdate" title="取引開始日"/>
<display:column media="xml csv excel pdf" property="closedate" title="締め日"/>
<display:column media="xml csv excel pdf" property="addresno" title="住所番号"/>
<display:column media="xml csv excel pdf" property="contracts" title="契約"/>
<display:column media="xml csv excel pdf" property="name" title="担当者名前"/>
<display:column media="xml csv excel pdf" property="printout" title="printout"/>

                    </display:table>


