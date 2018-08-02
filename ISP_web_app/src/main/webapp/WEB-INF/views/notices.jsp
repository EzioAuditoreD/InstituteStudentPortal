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
  	<script>
		$(document).ready(function(){
	    	$(".b").click(function(){
				$("#1").html("<embed src='"+$(this).val()+"' type='application/pdf' align='right' height='600px' width='100%' class='responsive'>");
	    	});
	    });
	</script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .table>tbody>tr>td, .table>tbody>tr>th, .table>tfoot>tr>td, .table>tfoot>tr>th, .table>thead>tr>td, .table>thead>tr>th {border:none;}
    
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    .list-group{
    max-height: 100vh;
    margin-bottom: 10px;
    overflow-y:auto;
    -webkit-overflow-scrolling: touch;
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
    
html, body {
  height: 100%;
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
<title>Notices</title>
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
    <div class="col-sm-8 text-left"> 
      <h1 id="pageHeading">Notice</h1>
           <hr>
    </div>  
  </div>
  <br>
  <!-- ======================================================================================================================================================== -->
	<div id="result_panel">
			<div class="panel-body col-sm-4 col-xs-12 responsive center-block">
				<ul class="list-group">
					<!--  For each loop to get list of paths of notices  -->
					 <c:forEach var="n" items="${requestScope.notices}" varStatus="status">
							<li class="list-group-item">
								${n.title}
								<button class="b" value="<c:url value="/resources/notices/${n.data}.pdf" />">View PDF</button>
							</li>
					 </c:forEach>	
				</ul>
			</div>
			<div id="1" class="panel-body col-sm-8 col-xs-12"></div>
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