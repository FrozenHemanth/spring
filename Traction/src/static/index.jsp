<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Home - Testing MVC</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <style>
        body {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        .card {
            border: none;
            border-radius: 15px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
            background-color: rgba(255, 255, 255, 0.95);
        }

        .card-header {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
            border-radius: 15px 15px 0 0;
            padding: 25px;
            text-align: center;
        }

        .card-header h1 {
            margin: 0;
            font-size: 2rem;
            font-weight: 600;
        }

        .card-body {
            padding: 30px;
        }

        .nav-link {
            display: block;
            padding: 15px 20px;
            margin: 10px 0;
            border-radius: 8px;
            text-decoration: none;
            color: #333;
            background-color: #f8f9fa;
            transition: all 0.3s ease;
            font-weight: 500;
            text-align: center;
            border: 2px solid transparent;
        }

        .nav-link:hover {
            background-color: #667eea;
            color: white;
            transform: translateY(-2px);
            box-shadow: 0 5px 15px rgba(102, 126, 234, 0.4);
        }

        .nav-link:first-child {
            margin-top: 0;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6 col-lg-4">
                <div class="card">
                    <div class="card-header">
                        <h1>Testing MVC</h1>
                    </div>
                    <div class="card-body">
                        <a href="test.jsp" class="nav-link">Test Page</a>
                        <a href="register" class="nav-link">Register</a>
                        <a href="product" class="nav-link">Product</a>
                        <a href="FeedBack.jsp" class="nav-link">FeedBack</a>
                        <a href="user.jsp" class="nav-link">User</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
