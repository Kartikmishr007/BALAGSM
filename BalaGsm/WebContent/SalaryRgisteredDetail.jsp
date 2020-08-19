<!DOCTYPE html>
<html lang="en">
<head>
	<title>Register</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="Register/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Register/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Register/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Register/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Register/fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Register/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="Register/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Register/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Register/vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="Register/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Register/css/util.css">
	<link rel="stylesheet" type="text/css" href="Register/css/main.css">
<!--===============================================================================================-->

</head>
<body style="background-color: #999999;">
	<div class="limiter">
		<div class="container-login100">
			<div class="login100-more" style="background-image: url('Register/images/bg-01.jpg');"></div>

			<div class="wrap-login100 p-l-50 p-r-50 p-t-72 p-b-50">
				<center><h1><p>Please Register Employe Detail</p></h1></center>
			
				<form  action="Salaryregister" method="post">
					
					<div class="wrap-input100 validate-input" data-validate="Name is required">
						<span class="label-input100">Employee Name</span>
						<input class="input100" type="text"  placeholder="Employee_Name" name="Employee_Name">
						<span class="focus-input100"></span>
					</div>
					
					
					
					

					<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<span class="label-input100">Designation</span>
						<input class="input100" type="text" placeholder="Designation" name="Designation">
						<span class="focus-input100"></span>
					</div>
					
					<div class="wrap-input100 validate-input" data-validate = "first and last letter of password should be alphabet">
						<span class="label-input100">Month</span>
						<input class="input100" type="text" placeholder="Month" name="Month">
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "first and last letter of password should be alphabet">
						<span class="label-input100">Year</span>
						<input class="input100" type="text" placeholder="Year" name="Year">
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "first and last letter of password should be alphabet">
						<span class="label-input100">Basic & DA</span>
						<input class="input100" type="text" placeholder="BasicDa" name="BasicDa">
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "first and last letter of password should be alphabet">
						<span class="label-input100">HRA</span>
						<input class="input100" type="text" placeholder="hra" name="hra">
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "first and last letter of password should be alphabet">
						<span class="label-input100">Conveyance</span>
						<input class="input100" type="text" placeholder="Conveyance" name="Conveyance">
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "first and last letter of password should be alphabet">
						<span class="label-input100">ProvidentFund</span>
						<input class="input100" type="text" placeholder="ProvidentFund" name="ProvidentFund">
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "first and last letter of password should be alphabet">
						<span class="label-input100">ESI ID</span>
						<input class="input100" type="text" placeholder="Esi" name="Esi">
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "first and last letter of password should be alphabet">
						<span class="label-input100">Loan</span>
						<input class="input100" type="text" placeholder="Loan" name="Loan">
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "first and last letter of password should be alphabet">
						<span class="label-input100">Profession Tax</span>
						<input class="input100" type="text" placeholder="Profession_Tax" name="ProfessionTax">
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input" data-validate = "first and last letter of password should be alphabet">
						<span class="label-input100">TSD/IT</span>
						<input class="input100" type="text" placeholder="TSDIT" name="TsdIt">
						<span class="focus-input100"></span>
					</div>
					
					
					
					
				
				

					
					
				
					
					
				
					
					
				
			
					
		
			
			
			
					<div class="flex-m w-full p-b-33">
						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
							<label class="label-checkbox100" for="ckb1">
								<span class="txt1">
									I agree to the
									<a href="#" class="txt2 hov1">
										Terms of User
									</a>
								</span>
							</label>
						</div>

						
					</div>

					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn"  type="submit" name="action" value="Salaryregister">Submit</button>>
								
						</div>

					</div>
				</form>
			</div>
		</div>
	</div>
	
<!--===============================================================================================-->
	<script src="Register/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="Register/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="Register/vendor/bootstrap/js/popper.js"></script>
	<script src="Register/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="Register/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="Register/vendor/daterangepicker/moment.min.js"></script>
	<script src="Register/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="Register/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="Register/js/main.js"></script>
	<% 
									%>

</body>
</html>