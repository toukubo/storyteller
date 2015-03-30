                                        <select name="workTagging">
                                            <option value=""></option>
                                            <c:forEach var="valueLabel" items="${WorkTaggings}">
                                                <c:choose>
                                                    <c:when test="${valueLabel.id eq ##addingclass##.workTagging.id}">
                                                        <option value="${valueLabel.id}" selected="selected">${valueLabel.name}</option>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <option value="${valueLabel.id}">${valueLabel.name}</option>
                                                    </c:otherwise>
                                                </c:choose>
                                            </c:forEach>
                                        </select>
