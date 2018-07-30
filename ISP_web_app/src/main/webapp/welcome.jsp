<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ISP</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<!-- "<c:url value="/resources/color/default.css" />" -->
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700|Open+Sans:400,300,700,800" rel="stylesheet" media="screen">

  <!--  <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet" media="screen"> -->
  <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet" media="screen">
  <link href="<c:url value="/resources/color/default.css" />" rel="stylesheet" media="screen">
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
        <a class="navbar-brand" href="index.html">Portal</a>

      </div>
      <div class="navigation collapse navbar-collapse navbar-ex1-collapse">
        <ul class="nav navbar-nav">
          <li class="current"><a href="#intro">Home</a></li>
          <li><a href="#services">Service</a></li>
          <li><a href="#about">About</a></li>
          <li><a href="#team">Team</a></li>
          <li><a href="#contact">Contact</a></li>
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
            <div class="btn btn-default">
            <a href="login.html" class="btn btn-default">Login</a>
            </div>
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
            <h2>Services</h2>
            <div class="heading-line"></div>
            <p>We’ve been building unique digital products, platforms, and experiences for the past 6 years.</p>
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
                      <h4>Website Design</h4>
                      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna.</p>
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
                      <h4>Brand Identity</h4>
                      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna.</p>
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
                      <h4>Web & Mobile Apps</h4>
                      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna.</p>
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
            <img src="<c:url value="/resources/img/team/1.jpg" />" alt="" class="img-circle img-responsive" />
            <h4>Ankit Rana</h4>
          </div>
        </div>
        <div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" data-wow-delay="0.3s">
          <div class="box-team wow bounceInUp">
            <img src="<c:url value="/resources/img/team/2.jpg" />" alt="" class="img-circle img-responsive" />
            <h4>Abhishek Saha</h4>
             </div>
        </div>
        <div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" data-wow-delay="0.5s">
          <div class="box-team wow bounceInUp">
            <img src="<c:url value="/resources/img/team/3.jpg" />" alt="" class="img-circle img-responsive" />
            <h4>Atul Kathet</h4>
          </div>
        </div>
        <div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" data-wow-delay="0.7s">
          <div class="box-team wow bounceInUp">
            <img src="<c:url value="/resources/img/team/4.jpg" />" alt="" class="img-circle img-responsive" />
            <h4>Abhishek Negi</h4>
          </div>
        </div>
          <div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" data-wow-delay="0.7s">
          <div class="box-team wow bounceInUp">
            <img src="<c:url value="/resources/img/team/4.jpg" />" alt="" class="img-circle img-responsive" />
            <h4>Gajendra Dhakar</h4>
          </div>
        </div>
          <div class="col-xs-12 col-sm-2 col-md-2 col-lg-2" data-wow-delay="0.7s">
          <div class="box-team wow bounceInUp">
            <img src="<c:url value="/resources/img/team/4.jpg" />" alt="" class="img-circle img-responsive" />
            <h4>Ankita Kumari</h4>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- Contact -->
  <section id="contact" class="home-section bg-gray">
    <div class="container">
      <div class="row">
        <div class="col-md-offset-2 col-md-8">
          <div class="section-heading">
            <h2>Contact us</h2>
            <div class="heading-line"></div>
            <p>If you have any question or just want to say 'hello' to Alstar web studio please fill out form below and we will be get in touch with you within 24 hours. </p>
          </div>
        </div>
      </div>

      <div class="row">
        <div class="col-md-offset-2 col-md-8">
          <div id="sendmessage">Your message has been sent. Thank you!</div>
          <div id="errormessage"></div>

          <form action="" method="post" class="form-horizontal contactForm" role="form">
            <div class="col-md-offset-2 col-md-8">
              <div class="form-group">
                <input type="text" name="name" class="form-control" id="name" placeholder="Your Name" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                <div class="validation"></div>
              </div>
            </div>

            <div class="col-md-offset-2 col-md-8">
              <div class="form-group">
                <input type="email" class="form-control" name="email" id="email" placeholder="Your Email" data-rule="email" data-msg="Please enter a valid email" />
                <div class="validation"></div>
              </div>
            </div>

            <div class="col-md-offset-2 col-md-8">
              <div class="form-group">
                <input type="text" class="form-control" name="subject" id="subject" placeholder="Subject" data-rule="minlen:4" data-msg="Please enter at least 8 chars of subject" />
                <div class="validation"></div>
              </div>
            </div>

            <div class="col-md-offset-2 col-md-8">
              <div class="form-group">
                <textarea class="form-control" name="message" rows="5" data-rule="required" data-msg="Please write something for us" placeholder="Message"></textarea>
                <div class="validation"></div>
              </div>
            </div>
            <div class="form-group">
              <div class="col-md-offset-2 col-md-8">
                <button type="submit" class="btn btn-theme btn-lg btn-block">Send message</button>
              </div>
            </div>
          </form>

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
              +91 9876543210<br> +91 7891234560
            </p>
          </div>
        </div>
        <div class="col-md-4">
          <div class="contact-widget wow bounceInRight">
            <i class="fa fa-envelope fa-4x"></i>
            <h5>Email us</h5>
            <p>
              theAteam@gmail.com<br />AteamManage@gamil.com
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
          <p>Copyright &copy; A Team. All rights reserved.</p>
          <div class="credits">
            <!--
              All the links in the footer should remain intact.
              You can delete the links only if you purchased the pro version.
              Licensing information: https://bootstrapmade.com/license/
              Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=Alstar
            -->
            Designed by <a href="https://en.wikipedia.org/wiki/The_A-Team_(film)/">The A Team</a>
          </div>
        </div>
      </div>
    </div>
  </footer>

  <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>

  <!-- js -->
  <!-- "<c:url value="/resources/styles/bootstrap.min.css" />" -->
  
  <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
  <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
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