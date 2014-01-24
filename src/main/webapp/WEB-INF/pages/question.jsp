<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  User: cmiel
  Date: 24.01.14
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Words Teaching</title>
</head>
<body>
<div class="page-header">
    <h1>Question:</h1>
</div>
<div class="span6 offset3">
    <table class="table table-hover ">
        <thead class="panel-heading">
        <tr>
            <th>Native</th>
            <th>Foreign</th>
        </tr>
        </thead>
        <tbody>
            <td><c:out value="${word.oryginal}"/></td>
            <td><c:out value="${word.foreignWord}"/></td>
        </tr>
        </tbody>
    </table>

</div>
</body>
</html>