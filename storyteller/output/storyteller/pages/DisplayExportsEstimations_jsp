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
                    <display:table name="${estimations}" id="row" requestURI="Estimations.do"
                            requestURIcontext="false"
                            export="true" pagesize="30" sort="list">
                        <display:column media="xml csv excel pdf" sortable="false" property="id" />
<display:column media="xml csv excel pdf" property="id" title="id"/>
<display:column media="xml csv excel pdf" property="totalcost" title="トータルコスト"/>
<display:column media="xml csv excel pdf" property="j2eeStory" title="ストーリー"/>
<display:column media="xml csv excel pdf" property="totalprice" title="合計金額"/>
<display:column media="xml csv excel pdf" property="adapted" title="採用"/>
<display:column media="xml csv excel pdf" property="totalsentencenum" title="totalsentencenum"/>
<display:column media="xml csv excel pdf" property="sentenceunit" title="センテンス単価"/>
<display:column media="xml csv excel pdf" property="estimationChoises" title="見積内訳"/>

                    </display:table>


