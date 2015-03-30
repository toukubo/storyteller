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
	<tiles:put name="title" value="配送先" direct="true" />
	<tiles:put name="content" direct="true">
	
	

    <logic:iterate id="deliveryAddress" name="deliveryAddresss">
         id
${deliveryaddress.id}
<br/>
カナ
${deliveryaddress.kana}
<br/>
郵便番号3桁
${deliveryaddress.zipthree}
<br/>
郵便番号4桁
${deliveryaddress.zipfour}
<br/>
県
${deliveryaddress.pref}
<br/>
建物名
${deliveryaddress.buildingname}
<br/>
電話番号
${deliveryaddress.phone}
<br/>
一般ユーザー
${deliveryaddress.publicUser}
<br/>
deliveryAddressChoises
<div>
<logic:iterate id="deliveryAddressChoise" name="deliveryaddress" property="deliveryAddressChoises">id
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
<br />
    </logic:iterate>
</div>				<display:table name="deliveryaddress.deliveryAddressChoises" id="row" requestURI=".do" pagesize="0" 
 requestURIcontext="false" sort="list" export="false" >
 <display:column media="html" sortable="true" title="ID" property="id" >

</display:column>
 <display:column media="html" sortable="true" title="注文数">
<nobr>
${row.ordernum}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="配送希望日">
<nobr>
${row.preferreddate}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="配送希望時間">
<nobr>
${row.preferredtime}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="deliveryAddress">
<nobr>
${row.deliveryAddress.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="choise">
<nobr>
${row.choise.id}
</nobr>
</display:column>
 <display:column media="html" sortable="true" title="giftCard">
<nobr>
${row.giftCard.name}
</nobr>
</display:column>
                        </display:table>
<br/>
配送希望日
${deliveryaddress.preferreddate}
<br/>
配送希望時間
${deliveryaddress.preferredtime}
<br/>
giftCard
${deliveryaddress.giftCard}
<br/>
hasgiftcard
${deliveryaddress.hasgiftcard}
<br/>
名前
${deliveryaddress.name}
<br/>
アドレス
${deliveryaddress.address}
<br/>

    </logic:iterate>




	</tiles:put>
</tiles:insert>


