<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Product page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <style>
        body {
            background-image: url('images/grocery.jpg');
            background-size: cover;
            background-repeat: no-repeat;
        }

        .card {
            margin-top: 50px;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.1);
        }

        .form-group {
            margin-bottom: 20px;
        }

        .field-error {
            color: red;
            font-size: 0.875rem;
            margin-top: 5px;
        }
    </style>
</head>
<body style="background-image: url('images/grocery.jpg'); background-size: cover; background-repeat: no-repeat;">
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-body">
                    <h1>Product</h1>

                    <form action="product" method="post">
                        <div class="form-group">
                            <label for="productName">Product Name</label>
                            <input type="text" class="form-control" id="productName" name="firstname" placeholder="Enter product name" value="${productMessage.firstname}">
                            <c:forEach items="${errors}" var="error">
                                <c:if test="${error.field == 'firstname'}">
                                    <div class="field-error">${error.defaultMessage}</div>
                                </c:if>
                            </c:forEach>
                        </div>
                        <div class="form-group">
                            <label for="price">Price</label>
                            <input type="text" class="form-control" id="price" name="price" placeholder="Enter price" value="${productMessage.price}">
                            <c:forEach items="${errors}" var="error">
                                <c:if test="${error.field == 'price'}">
                                    <div class="field-error">${error.defaultMessage}</div>
                                </c:if>
                            </c:forEach>
                        </div>
                        <div class="form-group">
                            <label for="description">Description</label>
                            <input type="text" class="form-control" id="description" name="description" placeholder="Enter description" value="${productMessage.description}">
                            <c:forEach items="${errors}" var="error">
                                <c:if test="${error.field == 'description'}">
                                    <div class="field-error">${error.defaultMessage}</div>
                                </c:if>
                            </c:forEach>
                        </div>
                        <button type="submit" class="btn btn-primary">Register</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
