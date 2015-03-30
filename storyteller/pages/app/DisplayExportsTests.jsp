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
                    <display:table name="${tests}" id="row" requestURI="Tests.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="j2eeStory" title="ストーリー"/>
<display:column media="xml csv excel pdf" property="responsible" title="担当者"/>
<display:column media="xml csv excel pdf" property="stepstorepeat" title="再現手順"/>
<display:column media="xml csv excel pdf" property="whatyouexpectedtosee" title="期待される動作"/>
<display:column media="xml csv excel pdf" property="whatyousawinstead" title="表示内容"/>
<display:column media="xml csv excel pdf" property="debuged" title="デバグ済み"/>
<display:column media="xml csv excel pdf" property="checked" title="チェック済み"/>
<display:column media="xml csv excel pdf" property="modifiedpagefilename" title="Modifiedpagefilename"/>
<display:column media="xml csv excel pdf" property="modifiedpagetitle" title="Modifiedpagetitle"/>
<display:column media="xml csv excel pdf" property="creator" title="割り当てた人"/>
<display:column media="xml csv excel pdf" property="debugger" title="デバッグ担当"/>
<display:column media="xml csv excel pdf" property="jsp" title="jsp"/>
<display:column media="xml csv excel pdf" property="summery" title="summery"/>
<display:column media="xml csv excel pdf" property="asnormal" title="asnormal"/>
<display:column media="xml csv excel pdf" property="asmain" title="asmain"/>
<display:column media="xml csv excel pdf" property="estimationChoises" title="estimationChoises"/>

                    </display:table>


