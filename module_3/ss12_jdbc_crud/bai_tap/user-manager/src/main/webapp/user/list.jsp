<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 15/2/2023
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>Title</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

<div class="container-fluid">
    <div class="row">
        <div class="col-6"><a href="/users?action=create">Create new user</a></div>
        <div class="col-6">
            <form action="/users" method="get">
                <div class="form-group float-left w-75">
                    <input type="text" class="form-control" name="countryName" placeholder="Search" value="${countryName}">
                </div>
                <div class="float-left w25">
                    <input type="submit" class="form-control" name="search" value="Search">
                </div>
            </form>
        </div>
    </div>
</div>
<table class="table">
    <thead>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Email</td>
        <td>Country</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${userList}" varStatus="stt">
        <tr>
        <td>${stt.count}</td>
        <td>${user.name}</td>
        <td>${user.email}</td>
        <td>${user.country}</td>
        <td><a href="/users?action=update&id=${user.id}">Edit</a></td>
        <td>
            <button type="button" class="btn btn-primary" data-bs-toggle="modal"
                    onclick="dele('${user.id}', '${user.name}')"
                    data-bs-target="#exampleModal">
                Delete
            </button>
        </tr>
    </c:forEach>
    </tbody>
</table>
<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <form action="/users?action=delete" method="post">
            <div class="modal-body">
                ...
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
            </div>
            </form>
        </div>
    </div>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
<script src="/js/bootstrap.js"></script>

</body>
<script>
    function dele(id,name) {
        document.getElementById("id").value = id;
        document.getElementById("name").innerText= name;
    }
</script>
</html>
