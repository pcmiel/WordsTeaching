<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  User: cmiel
  Date: 11.01.14
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Words Teaching</title>
</head>
<body>
<div class="page-header">
    <h1>Words:</h1>
</div>
<div class="span6 offset3">
    <table class="table table-hover ">
        <thead class="panel-heading">
        <tr>
            <th></th>
            <th>Native</th>
            <th>Foreign</th>
        </tr>
        </thead>
        <tbody>
        <% int id = 1; %>
        <c:forEach var="word" items="${words}">
            <%--<form:form action="${pageContext.servletContext.contextPath}/edit.htm" commandName="word">--%>
            <tr>
                <td><%=id%>
                </td>
                <td><c:out value="${word.oryginal}"/></td>
                <td><c:out value="${word.foreignWord}"/></td>
                    <%--<td><input type="submit" class="btn btn-default" value="Edit" name="edit"/></td>--%>
                <td><input name="id" value="${word.id}"></td>
                <td><a href="${pageContext.request.contextPath}/edit/${word.id}.htm">Edit</a></td>
                <td><a href="${pageContext.request.contextPath}/delete/${word.id}.htm">Delete</a></td>
            </tr>
            <%--</form:form>--%>
            <% id++; %>
        </c:forEach>
        </tbody>
    </table>

</div>
</body>
</html>