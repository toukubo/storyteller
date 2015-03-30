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
                    <display:table name="${admins}" id="row" requestURI="Admins.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="pagesize" title="1ページあたりの最大表示行数"/>
<display:column media="xml csv excel pdf" property="password" title="パスワード"/>
<display:column media="xml csv excel pdf" property="passwordchanged" title="パスワード変更済"/>
<display:column media="xml csv excel pdf" property="name" title="名前"/>
<display:column media="xml csv excel pdf" property="priviledge" title="権限"/>
<display:column media="xml csv excel pdf" property="newpasswordconfirmation" title="新しいパスワード（確認）"/>
<display:column media="xml csv excel pdf" property="newpassword" title="新しいパスワード"/>
<display:column media="xml csv excel pdf" property="accountstatus" title="状況"/>
<display:column media="xml csv excel pdf" property="decimallevel" title="小数点以下表示桁数"/>
<display:column media="xml csv excel pdf" property="displayssummery" title="サマリーを表示する"/>

                    </display:table>


