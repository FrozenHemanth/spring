<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Product page</title>
</head>
<body>
<h1>Product</h1>
<form action="product">
<pre>
    ProductName<input type="text" name="firstname">

    Price<input type="text" name="price">

    Description<input type="text" name="description">
    <input type="submit" value="Register">


    </pre>
</form>


////
    <style>
        .invalid-feedback {
            color: red;
        }
    </style>

    <c:forEach items="${errors}" var="error">
        <div class="invalid-feedback">
            ${error.defaultMessage}
        </div>
    </c:forEach>

////

</body>
</html>
