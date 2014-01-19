<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Words Teaching</title>
</head>
<body>
<div class="page-header">
    <h1>Edit</h1>
</div>
<form:form action="${pageContext.servletContext.contextPath}/edit.htm" commandName="edit">
    <div class="span6 offset3">
        <table>
            <thead>
            <tr>
                <th>ID</th>
                <th>Native</th>
                <th>Foreign</th>
                <th>Value</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><form:input path="ID" value="${wordForm.ID}" readonly="true"/></td>
                <td><form:input path="oryginal" value="${wordForm.oryginal}"/></td>
                <td><form:input path="foreignWord" value="${wordForm.foreignWord}"/></td>
                <td><form:input path="knowVal" value="${wordForm.knowVal}"/></td>
            </tr>
            </tbody>
        </table>
    </div>

    <div>
        <input type="submit" class="btn btn-info btn-lg" value="Edit"/>
    </div>
    <div class="alert alert-success">
        <c:out value="${info}"/>
    </div>
</form:form>

<hr/>


</body>
</html>