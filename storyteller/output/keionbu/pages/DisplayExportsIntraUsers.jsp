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
                    <display:table name="${intraUsers}" id="row" requestURI="IntraUsers.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="password" title="パスワード"/>
<display:column media="xml csv excel pdf" property="mail" title="メール"/>
<display:column media="xml csv excel pdf" property="removed" title="削除済み"/>
<display:column media="xml csv excel pdf" property="updatedate" title="更新日"/>
<display:column media="xml csv excel pdf" property="city" title="市区町村"/>
<display:column media="xml csv excel pdf" property="prefecture" title="都道府県"/>
<display:column media="xml csv excel pdf" property="firstname" title="名"/>
<display:column media="xml csv excel pdf" property="zipcode" title="郵便番号"/>
<display:column media="xml csv excel pdf" property="firstnamekana" title="名かな"/>
<display:column media="xml csv excel pdf" property="familyname" title="姓"/>
<display:column media="xml csv excel pdf" property="familynamekana" title="姓かな"/>
<display:column media="xml csv excel pdf" property="nickname" title="ニックネーム"/>
<display:column media="xml csv excel pdf" property="affiliation" title="所属"/>
<display:column media="xml csv excel pdf" property="utn" title="端末ID"/>
<display:column media="xml csv excel pdf" property="mobileno" title="携帯番号"/>
<display:column media="xml csv excel pdf" property="mobilemail" title="携帯アドレス"/>
<display:column media="xml csv excel pdf" property="telno" title="電話番号"/>
<display:column media="xml csv excel pdf" property="building" title="建物名"/>
<display:column media="xml csv excel pdf" property="createdate" title="作成日"/>
<display:column media="xml csv excel pdf" property="instruments" title="パート"/>
<display:column media="xml csv excel pdf" property="address" title="アドレス"/>
<display:column media="xml csv excel pdf" property="introductionFrom" title="紹介者"/>
<display:column media="xml csv excel pdf" property="introductionTo" title="introductionTo"/>
<display:column media="xml csv excel pdf" property="genres" title="ジャンル"/>

                    </display:table>


