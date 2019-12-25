	
	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>     
  
	
	
	<!DOCTYPE html>
	<html lang="zxx" class="no-js">
	<head>
		<!-- Mobile Specific Meta -->
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<!-- Favicon-->
		<link rel="shortcut icon" href="resources/img/fav.png">
		<!-- Author Meta -->
		<meta name="author" content="colorlib">
		<!-- Meta Description -->
		<meta name="description" content="">
		<!-- Meta Keyword -->
		<meta name="keywords" content="">
		<!-- meta character set -->
		<meta charset="UTF-8">
		<!-- Site Title -->
		<title>Travel</title>

		<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet"> 
			<!--
			CSS
			============================================= -->
			<link rel="stylesheet" href="resources/css/linearicons.css">
			<link rel="stylesheet" href="resources/css/font-awesome.min.css">
			<link rel="stylesheet" href="resources/css/bootstrap.css">
			<link rel="stylesheet" href="resources/css/magnific-popup.css">
			<link rel="stylesheet" href="resources/css/jquery-ui.css">				
			<link rel="stylesheet" href="resources/css/nice-select.css">							
			<link rel="stylesheet" href="resources/css/animate.min.css">
			<link rel="stylesheet" href="resources/css/owl.carousel.css">				
			<link rel="stylesheet" href="resources/css/main.css">
		</head>
		<body>	
			<header id="header">
				<div class="header-top">
					<div class="container">
			  		<div class="row align-items-center">
			  			<div class="col-lg-6 col-sm-6 col-6 header-top-left">
			  				<ul>
			  					<li><a href="#">Visit Us</a></li>
			  					<li><a href="#">Buy Tickets</a></li>
			  				</ul>			
			  			</div>
			  			<div class="col-lg-6 col-sm-6 col-6 header-top-right">
							<div class="header-social">
								<a href="#"><i class="fa fa-facebook"></i></a>
								<a href="#"><i class="fa fa-twitter"></i></a>
								<a href="#"><i class="fa fa-dribbble"></i></a>
								<a href="#"><i class="fa fa-behance"></i></a>
							</div>
			  			</div>
			  		</div>			  					
					</div>
				</div>
				<div class="container main-menu">
					<div class="row align-items-center justify-content-between d-flex">
				      <div id="logo">
				        <a href="index.html"><img src="resources/img/neww.png" alt="" title="" /></a>
				      </div>
				      <nav id="nav-menu-container">
				        <ul class="nav-menu">
				          <li><a href="index">Home</a></li>
				          <!-- <li><a href="about.html">About</a></li> -->
				          <li><a href="about">About</a></li>
				           <li><a href="kathmandu">Kathmandu</a></li>
				          <li><a href="userlogout">Logout</a></li>
				          <li><a href="package">Packages</a></li>
				 <!--  <li><a href="hotel">Hotel</a></li>-->   
				 <li><a href="ktm5star">Hotel</a></li>      
				          
				           
				          <!-- <li><a href="student">Booking</a></li> -->
				          
				          <li class="menu-has-children"><a href="">Explore</a>
				            <ul>
				           
				              <li class="Festival"><a href="home">Festivals in Nepal</a>
				            <ul>
				            	<!-- <li><a href="elements">Elements</a></li>    --> 
						          
						          <li class="menu-has-children"><a href="internationalfestival">International Festivals </a>
						            
						          </li>					    
						          
						          <li class="menu-has-children"><a href="localfestival">Local Festivals</a>
						           
						          </li>					                		
				            </ul>
				          </li>					  			
				              <li><a href="culture">Culture</a></li>
				              <li><a href="blog-single.html">Blog Single</a></li>
				            </ul>
				          </li>	
				          <li class="menu-has-children"><a href="home">Hotels</a>
				            <ul>
				            	<!-- <li><a href="elements">Elements</a></li>    --> 
						          
						          <li class="menu-has-children"><a href="ktm">Kathmandu </a>
						            <ul>
						              <li><a href="ktm5star">5 Star Hotels</a></li>
						              <li><a href="ktm4star">4 Star Hotels</a></li>
						              <li><a href="ktm3star">3 Star Hotels</a></li>
						              <li><a href="#">2 Star Hotels</a></li>
						    		  <li><a href="#">1 Star Hotels</a></li>
						     									              
						            </ul>
						          </li>					    
						          
						          <li class="menu-has-children"><a href="">Pokhara </a>
						            <ul>
						              <li><a href="pkr5star">5 Star Hotels</a></li>
						              <li><a href="#">4 Star Hotels</a></li>
						              <li><a href="#">3 Star Hotels</a></li>
						              <li><a href="#">2 Star Hotels</a></li>
						    		  <li><a href="#">1 Star Hotels</a></li>
						            </ul>
						          </li>					                		
				            </ul>
				          </li>		
				          
				                     					          		          
				          <li><a href="contact">Contact</a></li>
				        </ul>
				      </nav><!-- #nav-menu-container -->					      		  
					</div>
				</div>
			</header><!-- #header -->
			
			<!-- start banner Area -->
			<section class="about-banner relative">
				<div class="overlay overlay-bg"></div>
				<div class="container">				
					<div class="row d-flex align-items-center justify-content-center">
						<div class="about-content col-lg-12">
							<h1 class="text-white">
								HomePage			
							</h1>	
							<p class="text-white link-nav"><a href="index">Home </a>  <span class="lnr lnr-arrow-right"></span>  <a href="package"> Tour Packages</a></p>
						</div>	
					</div>
				</div>
			</section>
			<!-- End banner Area -->	
			
			
			
			
			
			
			
			







<spring:form action="${pageContext.request.contextPath}/bookedConfirm " method="post" modelAttribute="booking">
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
		<td><spring:label path="price">Price</spring:label></td>
		<td><spring:input path="price" readonly="true"></spring:input></td>
		</tr>
		
		<tr>
		<td><spring:label path="available">Available</spring:label></td>
		<td><spring:input path="available" readonly="true"></spring:input></td>
		</tr>
		
		<tr>
		<td><spring:label path="bookingDate">BookingDate</spring:label></td>
		<td><spring:input path="bookingDate" readonly="true"></spring:input></td>
		</tr>
		
		<tr>
		<td><spring:label path="checkoutDate">CheckOutDate</spring:label></td>
		<td><spring:input path="checkoutDate" ></spring:input></td>
		</tr>
		
		<tr>
		<td><spring:label path="email">Email</spring:label></td>
		<td><spring:input path="email" ></spring:input></td>
		</tr>
		
		
		
		
		
		<tr>
			<td><input type ="submit" value="Done"></td>
			
			
			<spring:hidden path="id"/>
			</tr>
		
	</table>


</spring:form>




			
			<!-- start footer Area -->		
			<footer class="footer-area section-gap">
				<div class="container">

					<div class="row">
						<div class="col-lg-3  col-md-6 col-sm-6">
							<div class="single-footer-widget">
								<h6>About Agency</h6>
								<p>
									The world has become so fast paced that people donât want to stand by reading a page of information, they would much rather look at a presentation and understand the message. It has come to a point 
								</p>
							</div>
						</div>
						<div class="col-lg-3 col-md-6 col-sm-6">
							<div class="single-footer-widget">
								<h6>Navigation Links</h6>
								<div class="row">
									<div class="col">
										<ul>
											<li><a href="#">Home</a></li>
											<li><a href="#">Feature</a></li>
											<li><a href="#">Services</a></li>
											<li><a href="#">Portfolio</a></li>
										</ul>
									</div>
									<div class="col">
										<ul>
											<li><a href="#">Team</a></li>
											<li><a href="#">Pricing</a></li>
											<li><a href="#">Blog</a></li>
											<li><a href="#">Contact</a></li>
										</ul>
									</div>										
								</div>							
							</div>
						</div>							
						<div class="col-lg-3  col-md-6 col-sm-6">
							<div class="single-footer-widget">
								<h6>Newsletter</h6>
								<p>
									For business professionals caught between high OEM price and mediocre print and graphic output.									
								</p>								
								<div id="mc_embed_signup">
									<form target="_blank" action="https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01" method="get" class="subscription relative">
										<div class="input-group d-flex flex-row">
											<input name="EMAIL" placeholder="Email Address" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Email Address '" required="" type="email">
											<button class="btn bb-btn"><span class="lnr lnr-location"></span></button>		
										</div>									
										<div class="mt-10 info"></div>
									</form>
								</div>
							</div>
						</div>
						<div class="col-lg-3  col-md-6 col-sm-6">
							<div class="single-footer-widget mail-chimp">
								<h6 class="mb-20">InstaFeed</h6>
								<ul class="instafeed d-flex flex-wrap">
									<li><img src="img/i1.jpg" alt=""></li>
									<li><img src="img/i2.jpg" alt=""></li>
									<li><img src="img/i3.jpg" alt=""></li>
									<li><img src="img/i4.jpg" alt=""></li>
									<li><img src="img/i5.jpg" alt=""></li>
									<li><img src="img/i6.jpg" alt=""></li>
									<li><img src="img/i7.jpg" alt=""></li>
									<li><img src="img/i8.jpg" alt=""></li>
								</ul>
							</div>
						</div>						
					</div>

					<div class="row footer-bottom d-flex justify-content-between align-items-center">
						<p class="col-lg-8 col-sm-12 footer-text m-0"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->

<!-- Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
						<div class="col-lg-4 col-sm-12 footer-social">
							<a href="#"><i class="fa fa-facebook"></i></a>
							<a href="#"><i class="fa fa-twitter"></i></a>
							<a href="#"><i class="fa fa-dribbble"></i></a>
							<a href="#"><i class="fa fa-behance"></i></a>
						</div>
					</div>
				</div>
			</footer>
			<!-- End footer Area -->	

			<script src="resources/js/vendor/jquery-2.2.4.min.js"></script>
			<script src="resources/js/popper.min.js"></script>
			<script src="resources/js/vendor/bootstrap.min.js"></script>			
			<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBhOdIF3Y9382fqJYt5I_sswSrEw5eihAA"></script>		
 			<script src="resources/js/jquery-ui.js"></script>					
  			<script src="resources/js/easing.min.js"></script>			
			<script src="resources/js/hoverIntent.js"></script>
			<script src="resources/js/superfish.min.js"></script>	
			<script src="resources/js/jquery.ajaxchimp.min.js"></script>
			<script src="resources/js/jquery.magnific-popup.min.js"></script>						
			<script src="resources/js/jquery.nice-select.min.js"></script>					
			<script src="resources/js/owl.carousel.min.js"></script>							
			<script src="resources/js/mail-script.js"></script>	
			<script src="resources/js/main.js"></script>	
		</body>
	</html>