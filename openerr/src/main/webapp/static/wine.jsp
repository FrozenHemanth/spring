<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Wine Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: url('wine.jpg') no-repeat center center fixed;
            background-size: cover;
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 20px;
        }
        .form-container {
            background: rgba(255, 255, 255, 0.85);
            border-radius: 20px;
            box-shadow: 0 15px 35px rgba(0, 0, 0, 0.1);
            padding: 40px;
            max-width: 600px;
            width: 100%;
        }
        .form-title {
            text-align: center;
            color: #333;
            margin-bottom: 30px;
            font-weight: 700;
        }
        .form-label {
            font-weight: 600;
            color: #555;
            margin-bottom: 8px;
        }
        .form-control {
            border-radius: 10px;
            padding: 12px 15px;
            border: 2px solid #e0e0e0;
            transition: all 0.3s ease;
        }
        .form-control:focus {
            border-color: #667eea;
            box-shadow: 0 0 0 0.2rem rgba(102, 126, 234, 0.25);
        }
        .form-control.is-invalid {
            border-color: #dc3545;
            background-image: none;
        }
        .invalid-feedback {
            color: #dc3545;
            font-size: 0.875rem;
            margin-top: 5px;
            display: block;
        }
        .btn-submit {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            border: none;
            border-radius: 10px;
            padding: 12px 30px;
            color: white;
            font-weight: 600;
            width: 100%;
            margin-top: 20px;
            transition: transform 0.3s ease;
        }
        .btn-submit:hover {
            transform: translateY(-2px);
            box-shadow: 0 5px 15px rgba(102, 126, 234, 0.4);
        }
        .alert-success {
            border-radius: 10px;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h1 class="form-title">: Wine Application</h1>



        <form:form action="wine" method="post" modelAttribute="winemessage">
            <div class="mb-3">
                <label for="companyName" class="form-label">Company Name</label>
                <form:input type="text" path="companyName" class="form-control" id="companyName" placeholder="Enter company name" cssErrorClass="form-control is-invalid" />
                <form:errors path="companyName" class="invalid-feedback" />
            </div>

            <div class="mb-3">
                <label for="companyAddress" class="form-label">Company Address</label>
                <form:input type="text" path="companyAddress" class="form-control" id="companyAddress" placeholder="Enter company address" cssErrorClass="form-control is-invalid" />
                <form:errors path="companyAddress" class="invalid-feedback" />
            </div>

            <div class="mb-3">
                <label for="manufacturerName" class="form-label">Manufacturer Name</label>
                <form:input type="text" path="manufacturerName" class="form-control" id="manufacturerName" placeholder="Enter manufacturer name" cssErrorClass="form-control is-invalid" />
                <form:errors path="manufacturerName" class="invalid-feedback" />
            </div>

            <div class="mb-3">
                <label for="manufactureDate" class="form-label">Manufacture Date</label>
                <form:input type="date" path="manufactureDate" class="form-control" id="manufactureDate" cssErrorClass="form-control is-invalid" />
                <form:errors path="manufactureDate" class="invalid-feedback" />
            </div>

            <div class="mb-3">
                <label for="age" class="form-label">Age</label>
                <form:input type="number" path="age" class="form-control" id="age" placeholder="Enter age" cssErrorClass="form-control is-invalid" />
                <form:errors path="age" class="invalid-feedback" />
            </div>

            <div class="mb-3">
                <label for="price" class="form-label">Price</label>
                <form:input type="number" path="price" step="0.01" class="form-control" id="price" placeholder="Enter price" cssErrorClass="form-control is-invalid" />
                <form:errors path="price" class="invalid-feedback" />
            </div>

            <button type="submit" class="btn btn-submit">Submit</button>
        </form:form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
