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


</body>
</html>