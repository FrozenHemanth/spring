<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <title>Update Wine</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
</head>
<body>
<form action="updateWine" method="post">
    <!-- Form fields for updating wine information -->
        <input type="text" disabled value="${wineDTO.id}">
        <input type="hidden" name="id" value="${wineDTO.id}">

        Company Name: <input type="text" name="companyName" value="${wineDTO.companyName}"><br>

        Company Address: <input type="text" name="companyAddress" value="${wineDTO.companyAddress}"><br>

        Manufacturer Name: <input type="text" name="manufacturerName" value="${wineDTO.manufacturerName}"><br>

        Manufacturer date: <input type="text" name="manufacturerDate" value="${wineDTO.manufacturerDate}"><br>

        Age: <input type="text" name="age" value="${wineDTO.age}"><br>

        Price: <input type="text" name="price" value="${wineDTO.price}"><br>


        <input type="submit" value="Update">
<c:forEach items="${errors}" var="error">
    <p>${error.defaultMessage}</p>
</c:forEach>
<c:if test="${error != null}">
    <p>${error}</p>
</c:if>

</form>
</body>