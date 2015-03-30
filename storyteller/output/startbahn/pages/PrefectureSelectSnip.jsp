                                        <select name="prefecture">
                                            <option value=""></option>
                                            <c:forEach var="valueLabel" items="${Prefectures}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq ##addingclass##.prefecture.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
