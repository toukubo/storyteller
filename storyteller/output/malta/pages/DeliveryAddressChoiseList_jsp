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
	<tiles:put name="title" value="配送先選択" direct="true" />
	<tiles:put name="content" direct="true">
	
	

    <logic:iterate id="deliveryAddressChoise" name="deliveryAddressChoises">
         id
${deliveryaddresschoise.id}
<br/>
注文数
${deliveryaddresschoise.ordernum}
<br/>
配送希望日
${deliveryaddresschoise.preferreddate}
<br/>
配送希望時間
${deliveryaddresschoise.preferredtime}
<br/>
deliveryAddress
${deliveryaddresschoise.deliveryAddress}
<br/>
choise
${deliveryaddresschoise.choise}
<br/>
giftCard
${deliveryaddresschoise.giftCard}
<br/>

    </logic:iterate>




	</tiles:put>
</tiles:insert>


