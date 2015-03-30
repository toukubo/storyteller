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

<tiles:insert definition=".layout">
	<tiles:put name="title" value="一般ユーザー" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostPublicUserVP">
          <html:hidden name="form" property="id"/>

ＪＡコード<br />
<html:text size="40"  name="form" property="code" /><br />

受入累計<br />
<html:text size="40"  name="form" property="totalcost" /><br />

情報管理コード<br />
<html:text size="40"  name="form" property="infocode" /><br />

農協コード<br />
<html:text size="40"  name="form" property="jacode" /><br />

金融機関コード<br />
<html:text size="40"  name="form" property="accountofficecode" /><br />

店舗コード<br />
<html:text size="40"  name="form" property="shopcode" /><br />

科目コード<br />
<html:text size="40"  name="form" property="departmentcode" /><br />

口座番号<br />
<html:text size="40"  name="form" property="accountnumber" /><br />

口座状態<br />
<html:text size="40"  name="form" property="accountstatus" /><br />

閉鎖解除年月日<br />
<input type="text" name="closurebreakdateAsString" value="<st:date date="${form.closurebreakdate}" size="20" />" /><br />
解約区分<br />
<html:text size="40"  name="form" property="closuretype" /><br />

所属支所コード<br />
<html:text size="40"  name="form" property="branchcode" /><br />

経営形態<br />
<html:text size="40"  name="form" property="managementtype" /><br />

地区コード<br />
<html:text size="40"  name="form" property="areacode" /><br />

任意集計コード１<br />
<html:text size="40"  name="form" property="varialblestatscode" /><br />

任意集計コード２<br />
<html:text size="40"  name="form" property="varialblestatscodetwo" /><br />

内訳資料区分<br />
<html:text size="40"  name="form" property="detaileddocumenttype" /><br />

レイアウトＮＯ<br />
<html:text size="40"  name="form" property="layoutno" /><br />

帳票制御コード<br />
<html:text size="40"  name="form" property="printingcontrolcode" /><br />

ソリマチ対象者区分<br />
<html:text size="40"  name="form" property="sorimachitargettype" /><br />

取引残高<br />
<html:text size="40"  name="form" property="remaining" /><br />

受入累計<br />
<html:text size="40"  name="form" property="totalincome" /><br />

最終取引経理年月日<br />
<input type="text" name="lasttransactiondateAsString" value="<st:date date="${form.lasttransactiondate}" size="20" />" /><br />
要精算額当初金額<br />
<html:text size="40"  name="form" property="nonaccountedatfirst" /><br />

要精算額累計金額<br />
<html:text size="40"  name="form" property="nonaccountedatlast" /><br />

                                地区<br />
                                <c:choose>
                                    <c:when test="${empty Areas}">
                                         <select name="area" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="area" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Areas}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.area.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />


                                userInfo<br />
                                <c:choose>
                                    <c:when test="${empty UserInfos}">
                                         <select name="userInfo" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="userInfo" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${UserInfos}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.userInfo.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
                                    </c:otherwise>
                                </c:choose><br />


組合員名<br />
<html:text size="40"  name="form" property="name" /><br />

種類<br />
<html:text size="40"  name="form" property="type" /><br />




          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
