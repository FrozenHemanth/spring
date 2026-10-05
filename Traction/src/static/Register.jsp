<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Register page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <style>
        body {
            background-image: url('images/register.jpg');
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
<body style="background-image: url('images/register.jpg'); background-size: cover; background-repeat: no-repeat;">
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-body">
                    <h1>Register</h1>

                    <form action="register" method="post">
                        <div class="form-group">
                            <label for="firstname">First Name</label>
                            <input type="text" class="form-control" id="firstname" name="firstname" placeholder="Enter first name" value="${registerDTO.firstname}">
                            <c:forEach items="${errors}" var="error">
                                <c:if test="${error.field == 'firstname'}">
                                    <div class="field-error">${error.defaultMessage}</div>
                                </c:if>
                            </c:forEach>
                        </div>
                        <div class="form-group">
                            <label for="lastname">Last Name</label>
                            <input type="text" class="form-control" id="lastname" name="lastname" placeholder="Enter last name" value="${registerDTO.lastname}">
                            <c:forEach items="${errors}" var="error">
                                <c:if test="${error.field == 'lastname'}">
                                    <div class="field-error">${error.defaultMessage}</div>
                                </c:if>
                            </c:forEach>
                        </div>
                        <div class="form-group">
                            <label for="email">Email</label>
                            <input type="email" class="form-control" id="email" name="email" placeholder="Enter email" value="${registerDTO.email}">
                            <c:forEach items="${errors}" var="error">
                                <c:if test="${error.field == 'email'}">
                                    <div class="field-error">${error.defaultMessage}</div>
                                </c:if>
                            </c:forEach>
                        </div>
                        <div class="form-group">
                            <label for="watsno">WhatsApp Number</label>
                            <input type="text" class="form-control" id="watsno" name="watsno" placeholder="Enter WhatsApp number" value="${registerDTO.watsno}">
                            <c:forEach items="${errors}" var="error">
                                <c:if test="${error.field == 'watsno'}">
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
