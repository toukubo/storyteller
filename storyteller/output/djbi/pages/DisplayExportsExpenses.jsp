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
                    <display:table name="${expenses}" id="row" requestURI="Expenses.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="request" title="request"/>
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="price" title="金額"/>
<display:column media="xml csv excel pdf" property="paymentdate" title="支払日"/>
<display:column media="xml csv excel pdf" property="paymentee" title="支払い先"/>
<display:column media="xml csv excel pdf" property="requestdate" title="請求日"/>
<display:column media="xml csv excel pdf" property="acknowleged" title="承認済み"/>
<display:column media="xml csv excel pdf" property="project" title="project"/>
<display:column media="xml csv excel pdf" property="accountTitle" title="勘定科目"/>
<display:column media="xml csv excel pdf" property="name" title="名前"/>
<display:column media="xml csv excel pdf" property="date" title="日付"/>

                    </display:table>


