<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html> 
<html>
<head><!-- "<c:url value="/resources/img/cdac_logo.jpg" />" -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .table>tbody>tr>td, .table>tbody>tr>th, .table>tfoot>tr>td, .table>tfoot>tr>th, .table>thead>tr>td, .table>thead>tr>th {}
    
    
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
      position: fixed;
      bottom: 0px;
      color: white;
      padding: 15px;
       margin-bottom: 0px;
       width:100vw;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
    
    th {text-align:center;}
  </style>
<title>Marks</title>
</head>	
<!--  <c:url value="/resources/img/acts.jpeg"/>-->
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
     <img src="<c:url value="/resources/img/acts.jpeg"/>" style="width:60px;height:50px">
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
      	<li><a href="profile">Profile</a></li>
        <li><a href="notices">Notice</a></li>
        <li><a href="schedules">Schedule</a></li>
        <li><a href="attendance">Attendance</a></li>
        <li><a href="marks">Marks</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="logout"><span class="glyphicon glyphicon-log-out"> </span> Logout</a></li>
      </ul>
    </div>
  </div>
</nav>
  
<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-8 text-left"> 
      <h1>Marks</h1>
           <hr>
    </div>  
  </div>
  <br>
  <!-- ======================================================================================================================================================== -->
					<div class="row">
		                <div class="col-md-12">
							  <div class="form-group row">
							    <div class="table-responsive">          
								  <table class="table">
								  <thead class="text-center">
								  <tr class="text-center">
								  	<th>Subject Name</th>
								   	<th>Internal</th>
								    <th>Practical</th>
								    <th>CCEE</th>
								    <th>Total</th>
								  </tr>
								  </thead>
								  <tfoot>
								  <tr>
								  	<td><strong>Total</strong></td>
								  	<td></td>
								  	<td></td>
								  	<td><strong>${requestScope.cceeTotal}</strong></td>
								  	<td><strong>${requestScope.megaTotal}</strong></td>
								  </tr>
								  </tfoot>
								    <tbody>
								    <c:forEach var="marks" items="${requestScope.marks}" varStatus="status">
								    <tr>
								   		<td>${marks.moduleID.moduleName}</td>
								   		<td>${marks.internalMarks}</td>
								   		<td>${marks.practicalMarks}</td>
								   		<td>${marks.cceeMarks}</td>
								   		<td>${requestScope.totalList[status.index]}</td>
								   		</tr>
								    </c:forEach>
								    </tbody>
								  </table>
								</div>
                              </div> 
		                </div>
		            </div>
  <!-- ======================================================================================================================================================== -->
</div>
 
<footer class="container-fluid text-center">
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