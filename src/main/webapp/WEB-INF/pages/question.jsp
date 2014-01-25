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
<form:form action="${pageContext.servletContext.contextPath}/answer.htm" commandName="answer">
<div class="span6 offset3">
    <table class="table table-hover ">
        <thead class="panel-heading">
        <tr>
            <th>Native</th>
            <th>Foreign</th>
        </tr>
        </thead>
        <tbody>             
            <td><form:label path="oryginal" /><c:out  value="${word.oryginal}"/></td>
            <td><form:label path="foreignWord" /><c:out  value="${word.foreignWord}"/></td>
            <td><form:input path="ID" value="${word.id}"/></td>
            
        </tr>
        </tbody>
    </table>
        <div>
            <input type="submit" class="btn btn-info btn-lg" value="OK" name="correct"/>
        </div>
        <div>
            <input type="submit" class="btn btn-info btn-lg" value="?" name="wrong"/>
        </div>

</div
</form:form>
</body>
</html>