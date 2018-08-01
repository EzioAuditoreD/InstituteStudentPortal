<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
  <title>Institute Student Portal</title>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- css -->
  
	<link rel="icon" type="image/png" href="<c:url value="/resources/img/icons/favicon.ico"/>">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css" />">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/fonts/font-awesome.min.css" />">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/animate.css" />">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendor/hamburgers.min.css" />">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendor/select2/select2.min.css" />">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/util.css" />">
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/main.css" />">
	<style type="text/css">
	body {
	font-family:"Helvetica Neue", Helvetica, Arial, sans-serif;
	}
	</style>

</head>

<body>
	
	<div class="limiter">
		<div class="container-login100" style="background-color:rgb(0,85,125);">
			<div class="wrap-login100">
				<div class="login100-pic js-tilt" data-tilt>
					<img src="<c:url value="/resources/img/cdac_logo.jpg"/>" alt="IMG" align="center">
				</div>

				<form class="login100-form validate-form" action="login" method="post" >
					<span class="login100-form-title">
						Student Login
						
					</span>

					<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<input class="input100" type="text" name="username" placeholder="UserName">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-envelope" aria-hidden="true"></i>
						</span>
					</div>

					<div class="wrap-input100 validate-input" data-validate = "Password is required">
						<input class="input100" type="password" name="password" placeholder="Password">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-lock" aria-hidden="true"></i>
						</span>
					</div>
					<div class="text-danger center-block" >hello ${requestScope.loginMessage}</div>
					<div class="container-login100-form-btn">
						<button class="login100-form-btn">
							Login
						</button>
					</div>

					<div class="text-center p-t-12">
						<span class="txt1">
							Forgot
						</span>
						<a class="txt2" href="#">
							Username / Password?
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	



</body>
</html>
