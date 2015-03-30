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
<%@ taglib uri="http://www.enclosing.net/tags/storyteller" prefix="st" %>
<%@ page isELIgnored="false" %>
<%@ page import="net.##nameofj2eestory##.web.app.utils.Calculate" %>

<tiles:insert definition=".layout">
	<tiles:put name="title" value="集計画面" direct="true" />
	<tiles:put name="head" direct="true">
		<style>
			.tdiv thead {
				background-color : #C3FDB8;
			}
			.tdiv tbody {
				height:50em; 
				overflow:auto;					
				overflow-y: scroll; 
				overflow-x: hidden;
			}	
			.tdiv tbody td {
				text-align : right;
				padding-left : 50px;
			}				
		</style>
		
		<script type="text/javascript">
$(function(){
$("a.").click(function(){
$('table.displayArea').toggle();
})
});
</script>
		
	</tiles:put>
	<tiles:put name="content" direct="true">
		<c:if test="${!empty error}">
			<font color="red">${error}</font>
		</c:if>
		<div>
		<form action="SSalesStoredays.do"　method="post">

		<table cellpadding="0" cellspacing="0" border="1">
		<tbody>
				<tr>
					<td width="50px" style="background-color:#00FFFF;">期間</td>
					<td width="125px">
						<input type="radio" />週
						&nbsp;<input type="radio" />月
						&nbsp;<input type="radio" />年度
					</td>
					<td width="400px">
						<select name="fy" ><option></option>
							<option value="2006" <c:if test="${param.fy eq '2006'}">selected</c:if>>2006年</option>
							<option value="2007" <c:if test="${param.fy eq '2007'}">selected</c:if>>2007年</option>
							<option value="2008" <c:if test="${param.fy eq '2008'}">selected</c:if>>2008年</option>										
						</select>
						<select name="fm" ><option></option>
							<option value="1" <c:if test="${param.fm eq '1'}">selected</c:if>>1月</option>
							<option value="2" <c:if test="${param.fm eq '2'}">selected</c:if>>2月</option>
							<option value="3" <c:if test="${param.fm eq '3'}">selected</c:if>>3月</option>
							<option value="4" <c:if test="${param.fm eq '4'}">selected</c:if>>4月</option>
							<option value="5" <c:if test="${param.fm eq '5'}">selected</c:if>>5月</option>
							<option value="6" <c:if test="${param.fm eq '6'}">selected</c:if>>6月</option>
							<option value="7" <c:if test="${param.fm eq '7'}">selected</c:if>>7月</option>
							<option value="8" <c:if test="${param.fm eq '8'}">selected</c:if>>8月</option>
							<option value="9" <c:if test="${param.fm eq '9'}">selected</c:if>>9月</option>
							<option value="10" <c:if test="${param.fm eq '10'}">selected</c:if>>10月</option>
							<option value="11" <c:if test="${param.fm eq '11'}">selected</c:if>>11月</option>
							<option value="12" <c:if test="${param.fm eq '12'}">selected</c:if>>12月</option>
						</select>
						<select name="fw" ><option></option>
							<option value="1" <c:if test="${param.fw eq '1'}">selected</c:if>>第1週</option>
							<option value="2" <c:if test="${param.fw eq '2'}">selected</c:if>>第2週</option>
							<option value="3" <c:if test="${param.fw eq '3'}">selected</c:if>>第3週</option>
							<option value="4" <c:if test="${param.fw eq '4'}">selected</c:if>>第4週</option>
							<option value="5" <c:if test="${param.fw eq '5'}">selected</c:if>>第5週</option>
							<option value="6" <c:if test="${param.fw eq '6'}">selected</c:if>>第6週</option>
						</select>
						<label>～</label>
						
						<select name="ty" ><option></option>
							<option value="2006" <c:if test="${param.ty eq '2006'}">selected</c:if>>2006年</option>
							<option value="2007" <c:if test="${param.ty eq '2007'}">selected</c:if>>2007年</option>
							<option value="2008" <c:if test="${param.ty eq '2008'}">selected</c:if>>2008年</option>										
						</select>
						<select name="tm" ><option></option>
							<option value="1" <c:if test="${param.tm eq '1'}">selected</c:if>>1月</option>
							<option value="2" <c:if test="${param.tm eq '2'}">selected</c:if>>2月</option>
							<option value="3" <c:if test="${param.tm eq '3'}">selected</c:if>>3月</option>
							<option value="4" <c:if test="${param.tm eq '4'}">selected</c:if>>4月</option>
							<option value="5" <c:if test="${param.tm eq '5'}">selected</c:if>>5月</option>
							<option value="6" <c:if test="${param.tm eq '6'}">selected</c:if>>6月</option>
							<option value="7" <c:if test="${param.tm eq '7'}">selected</c:if>>7月</option>
							<option value="8" <c:if test="${param.tm eq '8'}">selected</c:if>>8月</option>
							<option value="9" <c:if test="${param.tm eq '9'}">selected</c:if>>9月</option>
							<option value="10" <c:if test="${param.tm eq '10'}">selected</c:if>>10月</option>
							<option value="11" <c:if test="${param.tm eq '11'}">selected</c:if>>11月</option>
							<option value="12" <c:if test="${param.tm eq '12'}">selected</c:if>>12月</option>
						</select>
						<select name="tw" ><option></option>
							<option value="1" <c:if test="${param.tw eq '1'}">selected</c:if>>第1週</option>
							<option value="2" <c:if test="${param.tw eq '2'}">selected</c:if>>第2週</option>
							<option value="3" <c:if test="${param.tw eq '3'}">selected</c:if>>第3週</option>
							<option value="4" <c:if test="${param.tw eq '4'}">selected</c:if>>第4週</option>
							<option value="5" <c:if test="${param.tw eq '5'}">selected</c:if>>第5週</option>
							<option value="6" <c:if test="${param.tw eq '6'}">selected</c:if>>第6週</option>
						</select>
					</td>
				</tr>
			</tbody>
		</table>	
		
		
		
		
		
		























































		                     &nbsp;
			<c:choose>
				<c:when test="${empty MShns}">
					<select name="mShn" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="mShn" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${MShns}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>




		                     &nbsp;
			<c:choose>
				<c:when test="${empty Terms}">
					<select name="term" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="term" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${Terms}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>




		                     &nbsp;
			<c:choose>
				<c:when test="${empty Companys}">
					<select name="company" disabled="disabled"/>
				</c:when>
				<c:otherwise>
				<select name="company" ><option value="">All</option>
				<c:forEach var="valueLabel" items="${Companys}">
					<option value="${valueLabel.id}">${valueLabel.name}</option>
				</c:forEach>
				</select>
				</c:otherwise>
			</c:choose>





		<input type="submit" value="Go" onclick="document.publicusers1.action='PublicUsers.do'"> 
		
</form>









<div class="tdiv">
		<table cellpadding="0" cellspacing="0" border="1" width="100%">
			<thead>
<!--                 ######### in the case of two header rows ############
				<tr>
					<th rowspan="2" width="400px">
						<%--G--%>
					</th>	
					<th colspan="2" width="125px">
						発注
					</th>
					<th colspan="2" width="125px">
						納品
					</th>
					<th colspan="2" width="125px">
						未納
					</th>
					<th colspan="2" width="125px">
						納品率
					</th>
				</tr>
-->				
				<tr>
				##tableheaders##
<!--					<th width="50px">
						金額
					</th>	
					<th width="50px">
						数量
					</th>	
					<th width="50px">
						金額
					</th>	
					<th width="50px">
						数量
					</th>	
					<th width="50px">
						金額
					</th>	
					<th width="50px">
						数量
					</th>	
					<th width="50px">
						金額
					</th>	
					<th width="50px">
						数量
					</th>
-->					
				</tr>
			</thead>
			<tbody>
				<c:set var="object" value="${totalsSalesStoreday}"/>
				<jsp:useBean id="object" class="net.##nameofj2eestory##.model.SSalesStoredayImpl" scope="page"/>
				<tr style="background-color:#A9A9A9">
					<td width="400px" style="text-align:left; padding-left:0px">
						<%--G--%>							
						総合計			
					</td>
					<!--     
					
					<td width="50px">
						<c:choose>
							<c:when test="${param.unit eq '1000'}">
								${totalsSalesStoreday.ordertotal/param.unit}		
							</c:when>
							<c:otherwise>
								${totalsSalesStoreday.ordertotal}						
							</c:otherwise>
						</c:choose>
					</td>
					<td width="50px">
						${totalsSalesStoreday.ordernum}								
					</td>
					<td width="50px">
						<c:choose>
							<c:when test="${param.unit eq '1000'}">
								${totalsSalesStoreday.deliverytotal/param.unit}		
							</c:when>
							<c:otherwise>
								${totalsSalesStoreday.deliverytotal}
							</c:otherwise>
						</c:choose>
					</td>
					<td width="50px">
						${totalsSalesStoreday.deliverynum}																
					</td>
					<td width="50px">
						${totalsSalesStoreday.ordernum - totalsSalesStoreday.deliverynum}
					</td>
					<td width="50px">
						<c:choose>
							<c:when test="${param.unit eq '1000'}">
								${(totalsSalesStoreday.ordertotal - totalsSalesStoreday.deliverytotal)/param.unit}		
							</c:when>
							<c:otherwise>
								${totalsSalesStoreday.ordertotal - totalsSalesStoreday.deliverytotal}
							</c:otherwise>
						</c:choose>
					</td>
					<td width="50px">
						<%= Calculate.rate(object,"total") %>
					</td>
					<td width="50px" style="padding-right:15px;">
						<%= Calculate.rate(object,"num") %>
					</td>
			-->
			##summeryattributes##
			
				</tr>
				<logic:iterate id="row" name="sSalesStoredays">
					<c:set var="obj" value="${row}"/>
					<jsp:useBean id="obj" class="net.nameofj2eestory.web.app.SSalesStoredayBean" scope="page"/>
						<c:choose>
							<c:when test="${row.type eq '##Restirictor1obj##'}">
							<tr style="background-color:#FF99CC" class="company">
							<td width="400px" style="text-align:left; padding-left:25px;">
									<%--G--%>
									<a href="#" onclick="$('tr.##Restirictor2obj##${row.drilldownid}').toggle()">
									${row.Restirictor1obj.name}
									</a>
							</c:when>
							<c:otherwise>
							<tr class="##Restirictor2obj##${row.drilldownid}" style="display:none">
							<td width="400px" style="text-align:left; padding-left:40px">							
									${row.##Restirictor2obj##.name}
								</c:otherwise>
							</c:choose>
						</td>
						<td width="50px">
							<c:choose>
								<c:when test="${param.unit eq '1000'}">
									${row.sSalesStoreday.ordertotal/param.unit}		
								</c:when>
								<c:otherwise>
									${row.sSalesStoreday.ordertotal}						
								</c:otherwise>
							</c:choose>
						</td>
						<td width="50px">
							${row.sSalesStoreday.ordernum}								
						</td>
						<td width="50px">
							<c:choose>
								<c:when test="${param.unit eq '1000'}">
									${row.sSalesStoreday.deliverytotal/param.unit}		
								</c:when>
								<c:otherwise>
									${row.sSalesStoreday.deliverytotal}
								</c:otherwise>
							</c:choose>
						</td>
						<td width="50px">
							${row.sSalesStoreday.deliverynum}																
						</td>
						<td width="50px">
							${row.sSalesStoreday.ordernum - row.sSalesStoreday.deliverynum}
						</td>
						<td width="50px">
							<c:choose>
								<c:when test="${param.unit eq '1000'}">
									${(row.sSalesStoreday.ordertotal - row.sSalesStoreday.deliverytotal)/param.unit}		
								</c:when>
								<c:otherwise>
									${row.sSalesStoreday.ordertotal - row.sSalesStoreday.deliverytotal}
								</c:otherwise>
							</c:choose>
						</td>
						<td width="50px">
							<%= Calculate.rate(obj.getSupplierDeliverysSalesStoreday(),"total") %>
						</td>
						<td width="50px" style="padding-right:15px;">
							<%= Calculate.rate(obj.getSupplierDeliverysSalesStoreday(),"num") %>
						</td>
					</tr>
				</logic:iterate>		
		</tbody>
	</table>
</div>


































	</tiles:put>
</tiles:insert>