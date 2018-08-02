<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html> 
<html>
<head><!-- "<c:url value="/resources/img/cdac_logo.jpg" />" -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- <link href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"> 
  <script src="webjars/jquery/3.3.1/jquery.min.js"></script>
  	<script src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>  	 -->
 <!--  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>  -->
  <link href="<c:url value="/resources/bootstrap-3.3.7/dist/css/bootstrap.min.css" />" rel="stylesheet">
   <script src="<c:url value="/resources/jquery-3.3.1/jquery-3.3.1.min.js" />"></script>
  <script src="<c:url value="/resources/bootstrap-3.3.7/dist/js/bootstrap.min.js" />"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .table>tbody>tr>td, .table>tbody>tr>th, .table>tfoot>tr>td, .table>tfoot>tr>th, .table>thead>tr>td, .table>thead>tr>th {border:none;}
    
    
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
 
    /* Set black background color, white text and some padding */
    footer {
     background-color: #555;
      position: static;
      bottom: 0px;
      color: white;
      padding: 15px;
       margin-bottom: 0px;
       width:100vw;
    }
    #img2{
    border:2px solid black;
    }
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
      
      #pageHeading{
      text-align:center;
      }
    }
    
    @media screen and (max-width: 767px){
.table-responsive>.table>tbody>tr>td, .table-responsive>.table>tbody>tr>th, .table-responsive>.table>tfoot>tr>td, .table-responsive>.table>tfoot>tr>th, .table-responsive>.table>thead>tr>td, .table-responsive>.table>thead>tr>th {
    white-space:normal;
}
}
html, body {
  height: 100%;
  max-width: 100%;
  overflow-x: hidden;
}
body {
  display: flex;
  flex-direction: column;
}
.content {
  flex: 1 0 auto;
}
.footer {
  flex-shrink: 0;
}
  </style>
<title>Profile</title>
</head>	
<!--  <c:url value="/resources/img/acts.jpeg"/>-->
<body>
<div class="content">
<nav class="navbar navbar-inverse" style="background-color:black;padding-top:5px;padding-bottom:5px;">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
     <img src="<c:url value="/resources/img/acts.jpeg"/>" style="width:75px;height:50px">
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
      		<li><a href="profile"><strong>Profile</strong></a></li>
        <li><a href="notices"><strong>Notice</strong></a></li>
        <li><a href="schedules"><strong>Schedule</strong></a></li>
        <li><a href="attendance"><strong>Attendance</strong></a></li>
        <li><a href="marks"><strong>Marks</strong></a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="logout"><span class="glyphicon glyphicon-log-out"> </span> <strong>Logout</strong></a></li>
      </ul>
    </div>
  </div>
</nav>
  
<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-9 col-xs-12 text-left"> 
      <h1 id="pageHeading" >Welcome <span class="<c:choose>
					<c:when test="${requestScope.studentDetails.verified}">
							text-success
						</c:when>
							<c:otherwise>
							text-danger
						</c:otherwise>
					</c:choose>">${requestScope.studentDetails.name}</span></h1>
           <hr>
    </div>

     <div class="col-sm-3 col-xs-12">
           <img id="img2" class="img-responsive center-block" src="<c:url value="/resources/profile/${requestScope.studentDetails.photo}" />" style="max-width:150px;max-height:150px;margin-top:7px;"/>
     </div> 
  </div>
  <br>
  <!-- ======================================================================================================================================================== -->
					<div class="row">
		                <div class="col-md-12 col-xs-12">
							  <div class="form-group row">
							    <div class="table-responsive">          
								  <table class="table">
								    <tbody>
								      <tr>
								        <td><strong>ID</strong></td>
								        <td> ${requestScope.studentDetails.id}</td>
								      </tr>
								      <tr>
								        <td><strong>Course Name</strong></td>
								        <td> ${requestScope.studentDetails.courseID.name}</td>
								      </tr>
								       <tr>
								        <td><strong>Batch</strong></td>
								        <td> ${requestScope.studentDetails.batch}</td>
								      </tr>
								       <tr>
								        <td><strong>Username</strong></td>
								        <td> ${requestScope.studentDetails.username}</td>
								      </tr>
								       <tr>
								        <td><strong>Name</strong></td>
								        <td> ${requestScope.studentDetails.name}</td>
								      </tr>
								       <tr>
								        <td><strong>Gender</strong></td>
								        <td> ${requestScope.studentDetails.gender}</td>
								      </tr>
								       <tr>
								        <td><strong>Contact Number</strong></td>
								        <td> ${requestScope.studentDetails.contactNo}</td>
								      </tr>
								          <tr>
								        <td><strong>Date of Birth</strong></td>
								        <td> ${requestScope.studentDetails.dob}</td>
								      </tr>
								          <tr>
								        <td><strong>Address</strong></td>
								      <td> ${requestScope.studentDetails.address}</td>
								      </tr>
								          <tr>
								        <td><strong>Qualification</strong></td>
								        <td> ${requestScope.studentDetails.qualification}</td>
								      </tr>
								          <tr>
								        <td><strong>Father's Name</strong></td>
								        <td> ${requestScope.studentDetails.fathersName}</td>
								      </tr>
								          <tr>
								        <td><strong>Father's Contact</strong></td>
								        <td> ${requestScope.studentDetails.fathersContact}</td>
								      </tr>
								      
								    </tbody>
								  </table>
								</div>
                              </div> 
		                </div>
		            </div>
  <!-- ======================================================================================================================================================== -->
</div>
 </div>
<footer class="container-fluid text-center footer">
 <div class="container">
      <div class="row">
        <div class="col-md-12">
          <p>Copyright &copy; CDAC. All rights reserved.</p>
        </div>
      </div>
    </div>
</footer>

</body>
</html>