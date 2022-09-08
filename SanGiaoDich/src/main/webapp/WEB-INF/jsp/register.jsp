<%-- 
    Document   : register
    Created on : Sep 7, 2022, 7:16:10 PM
    Author     : Lọt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<core:if test="${errMsg != null}">
    <div class="alert alert-danger">${errMsg}</div>
</core:if>

<core:url value="/register" var="action" />

<form:form method="post" action="${action}" modelAttribute="user" >
    <div class="form-group">
        <label for="name">Name</label>
        <form:input type="text" id="name" path="name" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="username">Username</label>
        <form:input type="text" id="username" path="username" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <form:input type="password" id="password" path="password" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="password">Confirm Password</label>
        <form:input type="password" id="confirm-password" path="confirmPassword" class="form-control"/>
    </div>
    <div class="form-group">
        <input type="submit" value="Đăng ký" class="btn btn-danger"/>
    </div>
</form:form>