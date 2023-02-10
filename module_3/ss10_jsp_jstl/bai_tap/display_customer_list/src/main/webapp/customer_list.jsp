<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <title>Title</title>
    <style>
        td{
            font-weight: bold;
        }

        .size th {
            font-size: 30px;
        }
    </style>
    <link rel="stylesheet" href="/css/bootstrap.css">
</head>
<body>
<h1 class="text-center">Danh sách khách hàng</h1>
<table class="table">
    <thead>
    <tr class="size">
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customerList}" varStatus="loop">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.birthDay}</td>
            <td>${customer.address}</td>
            <td><img src="${customer.img}" width="100x"></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
<script src="/js/bootstrap.js"></script>
</html>