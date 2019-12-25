<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link  rel="stylesheet" href="${pageContext.request.contextPath}/resources/Booking/resources/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/Booking/resources/css/dataTables.bootstrap.css">
    <script  type="text/javascript" src="${pageContext.request.contextPath}/resources/Booking/resources/js/jquery-1.12.3.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/Booking/resources/js/dataTables.bootstrap.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<table id="myTable" class ="table table-stripted">
		<thead>
			<tr class="success">
				<td>hotelName</td>
				<td>roomno</td>
				<td>roomType</td>
				<td>available</td>
				 
				
				<td>price</td>
				<td>Actions</td>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="booking" items="${hlist}">
				<tr >
					<td>${booking.hotelName}</td>
					<td>${booking.roomno}</td>
					<td>${booking.roomType}</td>
					<td>${booking.available}</td>
					
					
					<td>${booking.price}</td>
					
					<td><input
						type="button" onclick="Book(${booking.id})" class="btn btn-success" value="Book"></td>

				</tr>
			</c:forEach>
		</tbody>

	</table>


<script type="text/javascript">
		function Book(id) {
			//root path 
		window.location = "${pageContext.request.contextPath}/" + id
					+ "/booking";
		}

		function deleteStudent(id) {
			//root path 

			var msg = confirm("do you want to delete data?");

			if (msg == true) {

				window.location = "${pageContext.request.contextPath}/" + id
						+ "/delete";
			}

		}
		
		
		$(document).ready( function () {
		    $('#myTable').DataTable();
		} );
	</script>
	




</body>
</html>