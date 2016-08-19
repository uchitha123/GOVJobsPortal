<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/AppCSS.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GOV.JOBS</title>
</head>
<body>
<div class="header " align="center">GOV.UK Job Portal</div>
<div>
<br>
<br>
</div>
<div class="container" >	
<div class="row clearfix">
    <div class="col-md-4 col-md-offset-4 column">
		<form class="form-horizontal" action ="/login" method="POST">		
		<div class="form-group">
		 	<!-- label for="name">User Name</label -->
			<div>
				<input name = "name" type = "text" class="form-control inputclass" placeholder="User Name" />
			</div>
		</div>	
		<div class="form-group">
			<!-- label for="inputPassword3" >Password</label-->
			<div >
				<input name = "password" type = "password" class="form-control inputclass" placeholder="Password" />
			</div>
		</div>	
		<div class="form-group">
		    <div>
			<p> <font color="red"> ${errorMessage }</font></p>
			</div>
		</div>	
		<div class="form-group">
		    <div>
			<input type= "submit" class= "btn btn-lg btn-primary btn-block" value="Sign in"/>
			</div>
		</div>
		</form>
    </div>
 </div>
 </div>
 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
 <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>