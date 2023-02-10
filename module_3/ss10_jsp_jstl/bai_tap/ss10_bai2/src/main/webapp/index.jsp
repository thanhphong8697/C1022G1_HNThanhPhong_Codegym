<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/2/2023
  Time: 4:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <style>
        label {
            width: 150px;
        }
    </style>
</head>
<body>
<form action="/calculator" method="get">
    <h1>Simple Calculator</h1>
    <table>
        <tr>
            <td><label for="numb1">Enter numberone</label></td>
            <td><input type="text" name="numbOne" id="numb1"></td>
        </tr>
        <tr>
            <td><label>Your option</label></td>
            <td>
                <select name="option">
                    <option value="addition">Addition</option>
                    <option value="subtraction">Subtraction</option>
                    <option value="multiplication">Multiplication</option>
                    <option value="division">Division</option>
                </select>
            </td>
        </tr>
        <tr>
            <td><label for="numb2">Enter numbertwo</label></td>
            <td><input type="text" name="numbTwo" id="numb2"></td>
        </tr>
    </table>
    <input class="btn btn-primary" type="submit" value="Result">
</form>
</body>
</html>
