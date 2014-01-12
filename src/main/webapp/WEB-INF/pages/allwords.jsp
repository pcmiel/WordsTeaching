<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  User: cmiel
  Date: 11.01.14
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
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
        <% int id = 1; %>
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
</body>
</html>