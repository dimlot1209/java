<%-- 
    Document   : product
    Created on : Sep 5, 2022, 2:40:37 PM
    Author     : Lọt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>

<core:url value="/add/products" var="action" />

<%--<core:if test=""${errMsg != null}">
    <div class="alert alert-danger">${errMsg}</div>-->
</core:if>--%>

<form:form method="post" action="${action}" modelAttribute="product" enctype="multipart/form-data" >
    <form:errors path="*" cssClass="alert alert-danger" element="div" />
    <div class="form-group">
        <lable for="name" >Ten san pham</lable>
            <form:input type="text" id="name" path="name" cssClass="form-control" />
    </div>
    <div class="form-group">
        <lable for="description" >Mo ta</lable>
            <form:textarea id="text" path="description" cssClass="form-control" />
    </div>
    <div class="form-group">
        <lable for="price" >Gia san pham</lable>
            <form:input type="text" id="price" path="price" cssClass="form-control" />
    </div>
    <div class="form-group">
        <lable for="file" >Anh san pham</lable>
            <form:input type="file" id="file" path="file" cssClass="form-control" />
    </div>
    <div class="form-group">
        <lable for="cate" >DANH MUC</lable>
            <form:select type="text" id="cate" path="categoryId" cssClass="form-select" >
                <core:forEach items="${categories}" var="cat" >
                <option value="${cat.id}">${cat.name}</option>
            </core:forEach>
        </form:select>
    </div>
    <div>
        <input type="submit" value="Them san pham" class="btn btn-danger"/>
    </div>
</form:form>
