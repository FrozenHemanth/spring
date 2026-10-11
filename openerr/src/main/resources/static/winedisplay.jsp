<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h1>Wines Display</h1>
<table border="1">
<tr>
<th>Company Name</th>
<th>Company Address</th>
<th>Manufacturer Name</th>
<th>Manufacture Date</th>
<th>Age</th>
<th>Price</th>
</tr>
<c:forEach items="${WineDTOsList}" var="wineDTO">
<tr>
<td>${wineDTO.companyName}</td>
<td>${wineDTO.companyAddress}</td>
<td>${wineDTO.manufacturerName}</td>
<td>${wineDTO.manufactureDate}</td>
<td>${wineDTO.age}</td>
<td>${wineDTO.price}</td>
</tr>
</c:forEach>
</table>
</body>
</html>