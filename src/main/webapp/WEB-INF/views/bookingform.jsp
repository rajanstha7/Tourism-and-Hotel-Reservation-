<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>     
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html lang="zxx" class="no-js">
	<head>
		

<a href ="back">Back</a>
<spring:form action="${pageContext.request.contextPath}/bookedConfirm" method="post" modelAttribute="booking">
	<table>
	
	
		<tr>
		<td><spring:label path="hotelName">Hotel Name</spring:label></td>
		<td><spring:input path="hotelName" readonly="true"></spring:input></td>
		</tr>
		
		<tr>
		<td><spring:label path="roomno">RoomNo</spring:label></td>
		<td><spring:input path="roomno" readonly="true"></spring:input></td>
		</tr>
		
		<tr>
		<td><spring:label path="roomType">RoomType</spring:label></td>
		<td><spring:input path="roomType" readonly="true"></spring:input></td>
		</tr>
		
		
		<tr>
		<td><spring:label path="price">Price</spring:label></td>
		<td><spring:input path="price" readonly="true"></spring:input></td>
		</tr>
		
		
		
		
		<tr>
		<td><spring:label path="available">Available</spring:label></td>
		<td><spring:input path="available" readonly="true"></spring:input></td>
		</tr>
		
		<tr>
		<td><spring:label path="bookingDate">BookingDate</spring:label></td>
		<td><spring:input path="bookingDate"  type="Date"></spring:input></td>
		</tr>
		
		<tr>
		<td><spring:label path="checkoutDate">CheckOutDate</spring:label></td>
		<td><spring:input path="checkoutDate" type="Date"></spring:input></td>
		</tr>
		
		<tr>
		<td><spring:label path="email">Email</spring:label></td>
		<td><spring:input path="email" ></spring:input></td>
		</tr>
			
		
		<tr>
			<td><input type ="submit" value="Done"></td>
			
			
			
			</tr>
			
				</table>
				
				<p>Check Your Email for Confirmation</p>
<spring:hidden path="id"/>

</spring:form>



</body>
</html>