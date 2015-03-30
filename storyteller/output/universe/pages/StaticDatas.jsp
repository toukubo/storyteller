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

<html:html>
<tiles:insert page="/h.jsp"/>
<div class="main">
<span class="title">staticDatas</span>
                    <display:table name="${staticDatas}" id="row" requestURI="StaticDatas.do"
                            requestURIcontext="false"
                            export="true" pagesize="15" sort="list">
                        <display:column media="html" sortable="false">
                        <a href="StaticDataDetail.do?id=${row.id}">ed</a>
                        <a href="DeleteStaticData.do?id=${row.id}">del</a>
                        </display:column>
##displaycontent##
                    </display:table>


                        <a href="StaticDataDetail.do">new StaticData</a>
</div>


<div class="sub">

		<html:form method="POST" action="/StaticDataVP">
          <html:hidden name="staticData" property="id"/>

サイトからのメールのフロム部位のアドレス<br />
<html:text size="40"  name="form" property="fromaddress" /><br />

サイト名<br />
<html:text size="40"  name="form" property="sitename" /><br />

mediaserverurl<br />
<html:text size="40"  name="form" property="mediaserverurl" /><br />

basepath<br />
<html:text size="40"  name="form" property="basepath" /><br />

unix<br />
<html:checkbox name="form" property="unix" /><br />

mapeventspan<br />
<html:text size="40"  name="form" property="mapeventspan" /><br />



          <html:submit />
		</html:form>
</div>






	</body>
</html:html>

