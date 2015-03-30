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
<%@ taglib uri="/formtag.tld" prefix="formtag" %> 
<%@ taglib uri="/clientsidevalidation.tld" prefix="f" %> 
<%@ page isELIgnored="false" %>
<tiles:insert definition=".publicLayout">
	<tiles:put name="title" value="" direct="true" />
	<tiles:put name="content" direct="true">
	
	

    <logic:iterate id="mClass" name="mClasss">
         dptCd
${mclass.dptCd}
<br/>
lineCd
${mclass.lineCd}
<br/>
clsCd
${mclass.clsCd}
<br/>
subclsCd
${mclass.subclsCd}
<br/>
mdCd
${mclass.mdCd}
<br/>
mdNm
${mclass.mdNm}
<br/>
dptNm
${mclass.dptNm}
<br/>
lineNm
${mclass.lineNm}
<br/>
clsNm
${mclass.clsNm}
<br/>
subclsNm
${mclass.subclsNm}
<br/>
mShns
<br/>
mMkr
${mclass.mMkr}
<br/>
btUpdDt
<bean:write name="mclass" property="btUpdDt" format="yyyy/MM/dd" />
<br/>
id
${mclass.id}
<br/>

    </logic:iterate>




	</tiles:put>
</tiles:insert>


