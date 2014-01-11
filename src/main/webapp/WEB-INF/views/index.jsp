<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Words Teaching</title>
    <link type="text/css" href="<%=request.getContextPath() %>/css/bootstrap.css" rel="stylesheet"/>
</head>
<body>
<h1>Words Teaching Application</h1>

<form:form action="${pageContext.servletContext.contextPath}/index.htm" commandName="index">

    <div>
        <form:label path="oryginal">Native: </form:label>
        <form:input path="oryginal"/>
    </div>

    <div>
        <form:label  path="foreignWord">Foreign: </form:label>
        <form:input path="foreignWord"/>
    </div>

    <div>
        <input type="submit" value="Add word"/>
    </div>

</form:form>

<hr/>

<div>
    <a href="${pageContext.servletContext.contextPath}/index/show-words.htm">Show all words</a>
    <a href="${pageContext.servletContext.contextPath}/allwords.htm">Test</a>

    <% int id = 1; %>
    <c:if test="${not empty words}">
        <div>
            <h3>Words:</h3>

            <table border="1">
                <thead>
                <tr>
                    <th></th>
                    <th>Native</th>
                    <th>Foreign</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="word" items="${words}">
                    <tr>
                        <td><%=id%></td>
                        <td><c:out value="${word.oryginal}"/></td>
                        <td><c:out value="${word.foreignWord}"/></td>
                    </tr>
                    <% id++; %>
                </c:forEach>
                </tbody>
            </table>

        </div>

    </c:if>
</div>

</body>
</html>