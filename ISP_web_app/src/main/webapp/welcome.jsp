<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ISP</title>
<link href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700|Open+Sans:400,300,700,800" rel="stylesheet" media="screen">

  <!--  <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet" media="screen"> -->
  <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet" media="screen">
  <link href="<c:url value="/resources/color/default.css" />" rel="stylesheet" media="screen">
  <style type="text/css">
  .btn{
  padding:15px 40px;
  font-size:20px;
  border:4px solid transparent;
  }
  .btn-default {
  color:white;
  background-color:transparent;
  border-color:white;
  }
  </style>
</head>

<body>

  <!-- Navigation -->
  <nav class="navbar navbar-default" role="navigation">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
          <span class="sr-only">Toggle nav</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>

        <!-- Logo text or image -->
        <a class="navbar-brand" href="#">Portal</a>

      </div>
      <div class="navigation collapse navbar-collapse navbar-ex1-collapse">
        <ul class="nav navbar-nav">
          <li class="current"><a href="#intro">Home</a></li>
          <li><a href="#services">Technologies</a></li>
          <li><a href="#about">About</a></li>
          <li><a href="#team">Team</a></li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- intro area -->
  <div id="intro">
    <div class="intro-text">
      <div class="container">
        <div class="col-md-12">
          <div id="rotator">
            <h1>Institute Student Portal</h1>
            <div class="line-spacer"></div>
            <h3 style="color:white;">Portal to Information</h3>
         
            <a href="student/login" class="btn btn-default">Login</a>
 	
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- Services -->
  <section id="services" class="home-section bg-white">
    <div class="container">
      <div class="row">
        <div class="col-md-offset-2 col-md-8">
          <div class="section-heading">
            <h2>TECHNOLOGIES</h2>
            <div class="heading-line"></div>
            <p>This project is made with the help of these technologies</p>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-md-12">
          <div id="carousel-service" class="service carousel slide">

            <!-- slides -->
            <div class="carousel-inner">
              <div class="item active">
                <div class="row">
                  <div class="col-sm-12 col-md-offset-1 col-md-6">
                    <div class="wow bounceInLeft">
                      <h4>Spring</h4>
                      <p>he Spring Framework provides a comprehensive programming and configuration model for modern Java-based enterprise applications - 
                      		on any kind of deployment platform.</p>
						<br>
						<p>A key element of Spring is infrastructural support at the application level: Spring focuses on the "plumbing" of 
							enterprise applications so that teams can focus on application-level business logic,
							 without unnecessary ties to specific deployment environments.</p>
                    </div>
                  </div>
                  <div class="col-sm-12 col-md-5">
                    <div class="screenshot wow bounceInRight">
                      <img src="<c:url value="/resources/img/screenshots/1.png" />" class="img-responsive" alt="" />
                    </div>
                  </div>
                </div>
              </div>
              <div class="item">
                <div class="row">
                  <div class="col-sm-12 col-md-offset-1 col-md-6">
                    <div class="wow bounceInLeft">
                      <h4>Hibernate</h4>
                      <p>Hibernate ORM enables developers to more easily write applications whose data outlives the application process. 
                      As an Object/Relational Mapping (ORM) framework, Hibernate is concerned with data persistence as it applies to relational databases (via JDBC). 
                      Unfamiliar with the notion of ORM?</p>
                      <br>
                      <p>In addition to its own "native" API, Hibernate is also an implementation of the Java Persistence API (JPA) specification.
                       As such, it can be easily used in any environment supporting JPA including Java SE applications, 
                       Java EE application servers, Enterprise OSGi containers, etc.</p>
                    </div>
                  </div>
                  <div class="col-sm-12 col-md-5">
                    <div class="screenshot wow bounceInRight">
                      <img src="<c:url value="/resources/img/screenshots/2.png" />" class="img-responsive" alt="" />
                    </div>
                  </div>
                </div>
              </div>
              <div class="item">
                <div class="row">
                  <div class="col-sm-12 col-md-offset-1 col-md-6">
                    <div class="wow bounceInLeft">
                      <h4>Bootstrap</h4>
                      <p>Bootstrap is an open source toolkit for developing with HTML, CSS, and JS. 
                      Quickly prototype your ideas or build your entire app with our Sass variables and mixins, 
                      responsive grid system, extensive prebuilt components, and powerful plugins built on jQuery.</p>
                    </div>
                  </div>
                  <div class="col-sm-12 col-md-5">
                    <div class="screenshot wow bounceInRight">
                      <img src="<c:url value="/resources/img/screenshots/3.png" />" class="img-responsive" alt="" />  
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <!-- Indicators -->
            <ol class="carousel-indicators">
              <li data-target="#carousel-service" data-slide-to="0" class="active"></li>
              <li data-target="#carousel-service" data-slide-to="1"></li>
              <li data-target="#carousel-service" data-slide-to="2"></li>
            </ol>
          </div>
        </div>
      </div>
    </div>
  </section>
  
    <!-- About -->
  <section id="about" class="home-section bg-white">
    <div class="container">
      <div class="row">
        <div class="col-md-offset-2 col-md-8">
          <div class="section-heading">
            <h2>About us</h2>
            <div class="heading-line"></div>
            <p>
 </p>
          </div>
        </div>
      </div>
      <div class="row wow fadeInUp">
        <div class="col-md-6 about-img">
          <img src="<c:url value="/resources/img/about-img.jpg" />" alt="">    
        </div>

        <div class="col-md-6 content">
          <h2>Benefits</h2>
          <p>Using an online portal instead of printing information in booklets saves college printing and paper costs. It also benefits the environment by using fewer resources. An online portal makes it easier for students to access important information from anywhere at any time of day.</p>
          <h2>Significance</h2>
          <p>
           Portals are commonly used in colleges and universities where prompt information and necessary updates must be readily available to a large number of students. Departments of education sometimes also use portals to direct students to educational resources for fun and learning.
 </p>
        </div>
      </div>
    </div>
  </section>


  <!-- Team -->
  <section id="team" class="home-section bg-white">
    <div class="container">
      <div class="row">
        <div class="col-md-offset-2 col-md-8">
          <div class="section-heading">
            <h2>Our Team</h2>
            <div class="heading-line"></div>
            <p>Bringing out the best in each other!</p>
          </div>
        </div>
      </div>

      <div class="row">
        <div class="col-xs-12 col-sm-2 col-md-2 col-lg-2">
          <div class="box-team wow bounceInUp" data-wow-delay="0.1s">
            <img src="<c:url value="/resources/img/team/rana.jpg" />" alt="" class="img-circle img-responsive" />
            <h4>Ankit Rana</h4>
          </div>
        </div>
        <div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" data-wow-delay="0.3s">
          <div class="box-team wow bounceInUp">
            <img src="<c:url value="/resources/img/team/saha.jpg" />" alt="" class="img-circle img-responsive" />
            <h4>Abhishek Saha</h4>
             </div>
        </div>
        <div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" data-wow-delay="0.5s">
          <div class="box-team wow bounceInUp">
            <img src="<c:url value="/resources/img/team/atul.jpg" />" alt="" class="img-circle img-responsive" />
            <h4>Atul Kathet</h4>
          </div>
        </div>
        <div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" data-wow-delay="0.7s">
          <div class="box-team wow bounceInUp">
            <img src="<c:url value="/resources/img/team/negi.jpeg" />" alt="" class="img-circle img-responsive" />
            <h4>Abhishek Negi</h4>
          </div>
        </div>
          <div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" data-wow-delay="0.7s">
          <div class="box-team wow bounceInUp">
            <img src="<c:url value="/resources/img/team/gajju.jpg" />" alt="" class="img-circle img-responsive" />
            <h4>Gajendra Dhakar</h4>
          </div>
        </div>
          <div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" data-wow-delay="0.7s">
          <div class="box-team wow bounceInUp">
            <img src="<c:url value="/resources/img/team/ankita.jpg" />" alt="" class="img-circle img-responsive" />
            <h4>Ankita Kumari</h4>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- Bottom widget -->
  <section id="bottom-widget" class="home-section bg-white">
    <div class="container">
      <div class="row">
        <div class="col-md-4">
          <div class="contact-widget wow bounceInLeft">
            <i class="fa fa-map-marker fa-4x"></i>
            <h5>Main Office</h5>
            <p>
             C-DAC ACTS Innovation Park<br />Pashan Pune - 411008
            </p>
          </div>
        </div>
        <div class="col-md-4">
          <div class="contact-widget wow bounceInUp">
            <i class="fa fa-phone fa-4x"></i>
            <h5>Call</h5>
            <p>
              +91-9876543210<br> +91-7891234560
            </p>
          </div>
        </div>
        <div class="col-md-4">
          <div class="contact-widget wow bounceInRight">
            <i class="fa fa-envelope fa-4x"></i>
            <h5>Email us</h5>
            <p>
              theA_team@gmail.com<br />A_teamManage@gamil.com
            </p>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- Footer -->
  <footer>
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <p>Copyright &copy; A-Team. All rights reserved.</p>
          <div class="credits">
            <!--
              All the links in the footer should remain intact.
              You can delete the links only if you purchased the pro version.
              Licensing information: https://bootstrapmade.com/license/
              Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=Alstar
            -->
            Designed by <a href="https://en.wikipedia.org/wiki/The_A-Team_(film)/">The A-Team</a>
          </div>
        </div>
      </div>
    </div>
  </footer>

  <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>

  <!-- js -->
  <!-- "<c:url value="/resources/styles/bootstrap.min.css" />" -->
  
  <script src="webjars/jquery/3.3.1/jquery.min.js"></script>
  <script src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="<c:url value="/resources/js/jquery.js" />"></script>
  <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
  <script src="<c:url value="/resources/js/wow.min.js" />"></script>
  <script src="<c:url value="/resources/js/mb.bgndGallery.js" />"></script>
  <script src="<c:url value="/resources/js/mb.bgndGallery.effects.js" />"></script>
  <script src="<c:url value="/resources/js/jquery.simple-text-rotator.min.js" />"></script>
  <script src="<c:url value="/resources/js/jquery.scrollTo.min.js" />"></script>
  <script src="<c:url value="/resources/js/jquery.nav.js" />"></script>
  <script src="<c:url value="/resources/js/modernizr.custom.js" />"></script>
  <script src="<c:url value="/resources/js/grid.js" />"></script>
  <script src="<c:url value="/resources/js/stellar.js" />"></script>
  <!-- Contact Form JavaScript File -->
  <script src="<c:url value="/resources/contactform/contactform.js" />"></script>

  <!-- Template Custom Javascript File -->
  <script src="<c:url value="/resources/js/custom.js" />"></script>

</body>
</html>