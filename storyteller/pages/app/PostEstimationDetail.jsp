<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="http://www.enclosing.net/tags/storyteller" prefix="st" %>


<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<%@ page isELIgnored="false" %>

<html:html>
<tiles:insert page="/h.jsp"/>

<div class="main">
<span id="title">
	見積編集
</span>
<span id="subform">
		<html:form method="POST" action="/PostEstimationVP">
          <html:hidden name="form" property="id"/>
          
          名前<br />
          <html:text property="title" name="form"></html:text>

トータルコスト<br />
<html:text name="form" property="totalcost" /><br />

                                ストーリー<br />
                                <input type="hidden" name="j2eeStory" value="${form.j2eeStory}" />
                                ${model.j2eeStory.name}<br />


合計金額<br />
<html:text name="form" property="totalprice" /><br />

採用<br />
<html:checkbox name="form" property="adapted" /><br />

totalsentencenum<br />
<html:text name="form" property="totalsentencenum" /><br />

センテンス単価<br />
<html:text name="form" property="sentenceunit" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

<tiles:insert page="/f.jsp"/>

	</body>
</html:html>


