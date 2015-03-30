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
                    <display:table name="${cDs}" id="row" requestURI="CDs.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="name" title="名前"/>
<display:column media="xml csv excel pdf" property="date" title="日付"/>
<display:column media="xml csv excel pdf" property="year" title="年"/>
<display:column media="xml csv excel pdf" property="description" title="説明"/>
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="title" title="タイトル"/>
<display:column media="xml csv excel pdf" property="intraUser" title="内部ユーザー"/>
<display:column media="xml csv excel pdf" property="poplular" title="人気"/>
<display:column media="xml csv excel pdf" property="poplularity" title="人気度"/>
<display:column media="xml csv excel pdf" property="artist" title="アーティスト"/>
<display:column media="xml csv excel pdf" property="projectname" title="projectname"/>
<display:column media="xml csv excel pdf" property="copywrite" title="copywrite"/>
<display:column media="xml csv excel pdf" property="productionpurpose" title="productionpurpose"/>
<display:column media="xml csv excel pdf" property="exposurehistory" title="exposurehistory"/>
<display:column media="xml csv excel pdf" property="credit" title="credit"/>
<display:column media="xml csv excel pdf" property="client" title="クライアント"/>
<display:column media="xml csv excel pdf" property="clientname" title="clientname"/>
<display:column media="xml csv excel pdf" property="cilentrequest" title="cilentrequest"/>
<display:column media="xml csv excel pdf" property="expiredate" title="expiredate"/>
<display:column media="xml csv excel pdf" property="licensed" title="licensed"/>
<display:column media="xml csv excel pdf" property="particulars" title="particulars"/>
<display:column media="xml csv excel pdf" property="comments" title="コメント"/>
<display:column media="xml csv excel pdf" property="licensingpossibleafterexpired" title="licensingpossibleafterexpired"/>
<display:column media="xml csv excel pdf" property="tocdrelation" title="tocdrelation"/>
<display:column media="xml csv excel pdf" property="fromcdrelation" title="fromcdrelation"/>
<display:column media="xml csv excel pdf" property="songs" title="songs"/>

                    </display:table>


