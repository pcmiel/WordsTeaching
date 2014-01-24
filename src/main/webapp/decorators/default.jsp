<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="utf-8"/>

    <title><decorator:title></decorator:title></title>
    

    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" media="all"/>

    <decorator:head></decorator:head>

    <style>
        body {
            padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
        }
    </style>
</head>
<body>

<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="navbar-header">
            <a   class="navbar-brand active" href="${pageContext.request.contextPath}/">Words Teaching App</a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="${pageContext.request.contextPath}/">Home</a></li>
                <li><a href="${pageContext.request.contextPath}/allwords.htm">All words</a></li>
                <li><a href="${pageContext.request.contextPath}/question.htm">Teach</a></li>
            </ul>
        </div>
        <!--/.nav-collapse -->
    </div>
</div>

<div class="container">

    <c:if test="${page_error != null }">
        <div class="alert alert-error">
            <button type="button" class="close" data-dismiss="alert">&times;</button>
            <h4>Error!</h4>
                ${page_error}
        </div>
    </c:if>

    <decorator:body></decorator:body>

    <footer>
        <div class="navbar navbar-fixed-bottom">Panel footer</div>
    </footer>
</div>
</body>
</html>