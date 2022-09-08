<%-- 
    Document   : index
    Created on : Aug 28, 2022, 1:26:52 PM
    Author     : Lọt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>--%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="<core:url value="/css/style.css"/>" rel="stylesheet"  />

<sec:authorize access="hasRole('ADMIN')">
<div>
    <a href="<core:url value="/admin/products" />" class="btn btn-danger" >QUẢN LÝ</a>
</div>
</sec:authorize>

<div> <!-- PHÂN TRANG -->
    <ul class="pagination">
        <core:forEach begin="1" end="${Math.ceil(counter/2)}" var="i" > <!-- lam tron-->
            <li class="page-item"><a class="page-link" href="<core:url value="/" />?page=${i}" />${i}</a></li>
            </core:forEach>
    </ul>
</div>
<h1 class="text-center text-danger">DANH MUC SAN PHAM</h1>

<div class="row">
    <core:forEach var="p" items="${products}"> 
        <div class="card col-md-3">
            <div class="card-body">
                <img class="img-fluid" src="<core:url value="images/tv.png" />" alt="${p.name}" />
            </div>
            <div class="card-footer">
                <h3>${p.name}</h3>
                <p>${p.price} VND</p>
            </div>
        </div>
    </core:forEach>
</div>


