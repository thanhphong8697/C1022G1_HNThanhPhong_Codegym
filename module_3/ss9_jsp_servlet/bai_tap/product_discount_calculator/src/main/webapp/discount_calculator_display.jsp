<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/2/2023
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>Title</title>
    <!-- Required meta tags -->
    <link rel="stylesheet" href="/css/bootstrap.css">
</head>
<body>
<form action="calculator" method="post">
    <table>
        <tr style="height: 40px">
            <td>Product Description: &nbsp;</td>
            <td>
                <input type="text" name="name">
            </td>
        </tr>
        <tr style="height: 40px">
            <td>List Price: &nbsp;</td>
            <td>
                <input type="text" name="price">
            </td>
        </tr>
        <tr style="height: 40px">
            <td>Discount Percent: &nbsp;</td>
            <td>
                <input type="text" name="discount">
            </td>
        </tr>
    </table>
    <input type="submit" value="submit">
</form>

<script src="/js/bootstrap.js"></script>
</body>
</html>
