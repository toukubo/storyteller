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
	<tiles:put name="title" value="ニュース" direct="true" />
	<tiles:put name="content" direct="true">

<span id="subform">
		<html:form method="POST" action="/PostNewsVP">
          <html:hidden name="form" property="id"/>

日付<br />
<input type="text" name="dateAsString" value="<bean:write name="form" property="date" format="yyyy/MM/dd" />" /><br />
説明<br />
<html:text name="form" property="description" /><br />

タイトル<br />
<html:text name="form" property="title" /><br />

                                country<br />
                                <c:choose>
                                    <c:when test="${empty Countrys}">
                                         <select name="country" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="country" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Countrys}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.country.id}">
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


                                内部ユーザー<br />
                                <c:choose>
                                    <c:when test="${empty IntraUsers}">
                                         <select name="intraUser" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="intraUser" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${IntraUsers}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.intraUser.id}">
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


                                c <br />
                                <c:choose>
                                    <c:when test="${empty Cs}">
                                         <select name="c" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="c" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Cs}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.c.id}">
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


最近の<br />
<html:checkbox name="form" property="recentlyadded" /><br />

人気度<br />
<html:text name="form" property="poplularity" /><br />

                                ジャンル<br />
                                <c:choose>
                                    <c:when test="${empty Genres}">
                                         <select name="genre" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="genre" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Genres}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.genre.id}">
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


                                アーティスト<br />
                                <c:choose>
                                    <c:when test="${empty Artists}">
                                         <select name="artist" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="artist" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Artists}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.artist.id}">
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


                                b <br />
                                <c:choose>
                                    <c:when test="${empty Bs}">
                                         <select name="b" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="b" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${Bs}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.b.id}">
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


                                a<br />
                                <c:choose>
                                    <c:when test="${empty As}">
                                         <select name="a" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="a" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${As}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.a.id}">
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


                                newsType<br />
                                <c:choose>
                                    <c:when test="${empty NewsTypes}">
                                         <select name="newsType" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="newsType" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${NewsTypes}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.newsType.id}">
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


                                ニュースソース<br />
                                <c:choose>
                                    <c:when test="${empty NewsSources}">
                                         <select name="newsSource" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="newsSource" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${NewsSources}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.newsSource.id}">
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


                                Feature<br />
                                <c:choose>
                                    <c:when test="${empty NewsFeatures}">
                                         <select name="newsFeature" disabled="disabled"/>
                                    </c:when>
                                    <c:otherwise>
                                        <select name="newsFeature" ><option value=""></option>
                                            <c:forEach var="valueLabel" items="${NewsFeatures}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq model.newsFeature.id}">
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





          <html:submit value="save"/>
		</html:form>
</span>
</div>

	</tiles:put>
</tiles:insert>
