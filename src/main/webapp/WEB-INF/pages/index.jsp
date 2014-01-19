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
    <h1>Add new word</h1>
</div>
<form:form action="${pageContext.servletContext.contextPath}/index.htm" commandName="index">
    <div class="span6 offset3">
        <table>
            <thead>
            <tr>
                <th>Native</th>
                <th>Foreign</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><form:input path="oryginal"/></td>
                <td><form:input path="foreignWord"/></td>
            </tr>
            </tbody>
        </table>
    </div>

    <div>
        <input type="submit" class="btn btn-info btn-lg" value="Add word"/>
    </div>
    <div class="alert alert-success">
        <c:out value="${info}"/>
    </div>
</form:form>

<hr/>


</body>
</html>