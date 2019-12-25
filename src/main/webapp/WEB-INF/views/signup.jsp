
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="robots" content="noindex, nofollow">

<title>Registration</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<style type="text/css">
</style>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script type="text/javascript">
        window.alert = function(){};
        var defaultCSS = document.getElementById('bootstrap-css');
        function changeCSS(css){
            if(css) $('head > link').filter(':first').replaceWith('<link rel="stylesheet" href="'+ css +'" type="text/css" />'); 
            else $('head > link').filter(':first').replaceWith(defaultCSS); 
        }
        $( document ).ready(function() {
          var iframe_height = parseInt($('html').height()); 
          window.parent.postMessage( iframe_height, 'https://bootsnipp.com');
        });
    </script>
</head>
<body>
<form action="usersignup" method="post">
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-primary">
					<div class="panel-heading">Thank you for Sign Up!</div>
					<div class="panel-body">
						<form role="Form" method="post" action="" accept-charset="UTF-8">
							<div class="form-group">
								<label for="fname">First Name</label> <input type="text"
									id="fname" class="form-control" name="fname"
									placeholder="Example: John">
							</div>
							<div class="form-group">
								<label for="lname">Last Name</label> <input type="text"
									id="lname" class="form-control" name="lname"
									placeholder="Example: Doe">
							</div>
							<div class="form-group">
								<label for="username">UserName</label> <input type="text"
									id="username" class="form-control" name="username"
									placeholder="Example: Doe">
							</div>

							<fieldset>
								<label>Birthday</label> <label class="month"> <select
									class="select-style" name="BirthMonth"><br>
										<option value="">Month</option>
										<option value="01">January</option>
										<option value="02">February</option>
										<option value="03">March</option>
										<option value="04">April</option>
										<option value="05">May</option>
										<option value="06">June</option>
										<option value="07">July</option>
										<option value="08">August</option>
										<option value="09">September</option>
										<option value="10">October</option>
										<option value="11">November</option>
										<option value="12">December</option></label> </select> <label>Day<input
									class="birthday" maxlength="2" name="BirthDay"
									placeholder="Day" required=""></label> <label>Year <input
									class="birthyear" maxlength="4" name="BirthYear"
									placeholder="Year" required=""></label>
							</fieldset>


							<div class="form-group">
								<label for="states">Select your country</label> <select
									id="states" class="form-control" name="state">
									<option value="unknown">Unknown</option>
									<option value="America">America</option>
									<option value="alabama">Alabama</option>
									<option value="alaska">Alaska</option>
									<option value="arizona">Arizona</option>
									<option value="arkansas">Arkansas</option>
									<option value="brazil">Brazil</option>
									<option value="california">California</option>
									<option value="colorado">Colorado</option>
									<option value="connecticut">Connecticut</option>
									<option value="delaware">Delaware</option>
									<option value="florida">Florida</option>
									<option value="georgia">Georgia</option>
									<option value="hawaii">Hawaii</option>
									<option value="idaho">Idaho</option>
									<option value="illinois">Illinois</option>
									<option value="indiana">Indiana</option>
									<option value="iowa">Iowa</option>
									<option value="india">India</option>
									<option value="kansas">Kansas</option>
									<option value="kentucky">Kentucky</option>
									<option value="louisiana">Louisiana</option>
									<option value="maine">Maine</option>
									<option value="maryland">Maryland</option>
									<option value="massachusetts">Massachusetts</option>
									<option value="michigan">Michigan</option>
									<option value="minnesota">Minnesota</option>
									<option value="mississippi">Mississippi</option>
									<option value="missouri">Missouri</option>
									<option value="montana">Montana</option>
									<option value="nebraska">Nebraska</option>
									<option value="nepal">Nepal</option>
									<option value="nevada">Nevada</option>
									<option value="new hampshire">New Hampshire</option>
									<option value="new jersey">New Jersey</option>
									<option value="new mexico">New Mexico</option>
									<option value="new york">New York</option>
									<option value="north carolina">North Carolina</option>
									<option value="north dakota">North Dakota</option>
									<option value="ohio">Ohio</option>
									<option value="oklahoma">Oklahoma</option>
									<option value="oregon">Oregon</option>
									<option value="pennsylvania">Pennsylvania</option>
									<option value="rhode island">Rhode Island</option>
									<option value="south carolina">South Carolina</option>
									<option value="south dakota">South Dakota</option>
									<option value="tennessee">Tennessee</option>
									<option value="texas">Texas</option>
									<option value="utah">Utah</option>
									<option value="vermont">Vermont</option>
									<option value="virginia">Virginia</option>
									<option value="washington">Washington</option>
									<option value="west virginia">West Virginia</option>
									<option value="wisconsin">Wisconsin</option>
									<option value="wyoming">Wyoming</option>
								</select>
							</div>
							<div class="form-group">
								<label for="gender">Your Gender</label> <select id="gender"
									class="form-control" name="gender">
									<option value="unknown">Unknown</option>
									<option value="Male">Male</option>
									<option value="Female">Female</option>
									<option value="other">Other</option>
								</select>
							</div>
							<div class="form-group">
								<label for="emailaddr">Email Address</label> <input type="text"
									id="emailaddr" class="form-control" name="email"
									placeholder="Example: john.doe@gmail.com">
							</div>
							<div class="form-group">
								<label for="password">Password</label> <input type="password"
									id="password" class="form-control" name="password"
									placeholder="">
							</div>
							<div class="form-group">
								<label for="verifypass">Verify Password</label> <input
									type="password" id="confirmpass" class="form-control"
									name="verifypass" placeholder="">
							</div>
							<div class="form-group text-center">
								<button type="submit" class="btn btn-primary btn-lg"
									id="submitbtn" name="submit">Sign up!</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
	
	</script>
	</form>
</body>
</html>
