<%-- 
    Document   : login
    Created on : Sep 7, 2022, 12:33:50 PM
    Author     : Lọt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>DANG NHAP</h1>
<core:if test="${param.error != null}">
    <div class="alert alert-danger">
        Da co loi !
    </div>
</core:if>

<core:if test="${param.accessDenied != null}">
         <div class="alert alert-danger">Ban khong co quyen truy cap !</div>
</core:if>
<core:url value="/login" var="action" />

<form:form method="post" action="${action}" >
    <div class="form-group">
        <label for="username">Username</label>
        <input type="text" id="username" name="username" class="form-control"/>
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input type="password" id="password" name="password" class="form-control"/>
    </div>
    <div>
        <input type="submit" value="DANG NHAP" class="btn btn-danger"/>
    </div>
</form:form>

