<%-- 
    Document   : header
    Created on : Sep 7, 2022, 2:43:14 PM
    Author     : Lọt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<nav class="navbar navbar-expand-sm navbar-dark w3-dark-grey">
    <div class="container-fluid">
        <a class="navbar-brand text-warning" href="<core:url value="/" />" />Locao</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="mynavbar">
            <ul class="navbar-nav me-auto">
                <core:forEach var="cat" items="${categories}">
                    <core:url value="/" var="categoryUrl">
                        <core:param name="categoryID" value="${cat.id}" />
                    </core:url>
                    <li class="nav-item">
                        <a class="nav-link" href="${categoryUrl}">${cat.name}</a>
                    </li>
                </core:forEach>
                <sec:authorize access="!isAuthenticated()">
                    <core:if test="${pageContext.request.userPrincipal.name == null}">
                        <li class="nav-item" style="margin: 0 5px">
                            <a class="btn text-dark btn-outline-secondary w3-hover-text-white" href="<core:url value="/login" />" /><b>Đăng nhập</b></a>
                        </li>
                    </core:if>
                    <li class="nav-item" style="margin: 0 5px">
                        <a class="btn text-dark btn-outline-secondary w3-hover-text-white" href="<core:url value="/register" />" /><b>Đăng Ký</b></a>
                    </li>
                </sec:authorize>

                <sec:authorize access=" isAuthenticated()">
                    <core:if test="${pageContext.request.userPrincipal.name != null}">
                        <li class="nav-item" style="margin: 0 5px">
                            <a class="btn text-dark btn-outline-secondary w3-hover-text-white" href="<core:url value="/" /> " />${pageContext.request.userPrincipal.name}</a>
                        </li>
                       <li class="nav-item" style="margin: 0 5px">
                            <a class="btn text-dark btn-outline-secondary w3-hover-text-white" href="<core:url value="/" /> " />${pageContext.session.getAttribute("user").role}</a>
                        </li>
                    </core:if>
                    <li class="nav-item" style="margin: 0 5px">
                        <a class="btn text-dark btn-outline-secondary w3-hover-text-white" href="<core:url value="/logout" />" />Ðăng Xuất</a>
                    </li>
                </sec:authorize>
            </ul>
            
            <form class="d-flex" >
                <input class="form-control me-2" name="kw" type="text" placeholder="Nhập sản phẩm cần tìm...">

                <button class="btn btn-warning" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>
