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
<display:column media="xml csv excel pdf" property="name" title="名前"/>
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="password" title="パスワード"/>
<display:column media="xml csv excel pdf" property="groupname" title="グループ名"/>
<display:column media="xml csv excel pdf" property="removed" title="削除済み"/>
<display:column media="xml csv excel pdf" property="resultAndProductivities" title="営業成果と生産性"/>
<display:column media="xml csv excel pdf" property="weeklyProccessPlans" title="週間プロセス計画"/>
<display:column media="xml csv excel pdf" property="base" title="拠点"/>
<display:column media="xml csv excel pdf" property="employeecode" title="社員番号"/>
<display:column media="xml csv excel pdf" property="mailaddr" title="メールアドレス"/>
<display:column media="xml csv excel pdf" property="exhibitionIntraUsers" title="個人別展示会報告"/>
<display:column media="xml csv excel pdf" property="recivemail" title="メール報告対象"/>

                    </display:table>


