<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="icon" href="${pageContext.request.contextPath}/img/favicon.png" type="image/png">

    <title>Satner Portfolio</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/vendors/linericon/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/vendors/owl-carousel/owl.carousel.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/magnific-popup.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/vendors/nice-select/css/nice-select.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>

<body>

    <!-- Header -->
    <%@include file="header.jsp" %>

    <!-- Home Banner -->
    <section class="home_banner_area">
        <div class="banner_inner">
            <div class="container">
                <div class="row">
                    <div class="col-lg-7">
                        <div class="banner_content">
                            <h3 class="text-uppercase">Hello</h3>
                            <h1 class="text-uppercase">I am Rahi Satner</h1>
                            <h5 class="text-uppercase">Senior WordPress Developer</h5>

                            <div class="d-flex align-items-center">
                                <a class="primary_btn"
                                   href="${pageContext.request.contextPath}/contact.html">
                                    <span>Hire Me</span>
                                </a>

                                <a class="primary_btn tr-bg" href="#">
                                    <span>Get CV</span>
                                </a>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-5">
                        <div class="home_right_img">
                            <img src="${pageContext.request.contextPath}/img/banner/home-right.png" alt="">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- About Us -->
    <section class="about_area section_gap">
        <div class="container">
            <div class="row justify-content-start align-items-center">
                <div class="col-lg-5">
                    <div class="about_img">
                        <img src="${pageContext.request.contextPath}/img/about-us.png" alt="">
                    </div>
                </div>

                <div class="offset-lg-1 col-lg-5">
                    <div class="main_title text-left">
                        <h2>Let's <br> Introduce About <br> Myself</h2>

                        <p>
                            Whose given. Were gathered. There first subdue greater.
                            Bearing you Whales heaven midst their.
                        </p>

                        <p>
                            Is give may shall likeness made yielding spirit a itself together.
                        </p>

                        <a class="primary_btn" href="#">
                            <span>Download CV</span>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- Brand Area -->
    <section class="brand_area section_gap_bottom">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-lg-6">
                    <div class="row">

                        <% for (int i = 1; i <= 9; i++) { %>
                        <div class="col-lg-4 col-md-4 col-sm-6">
                            <div class="single-brand-item d-table">
                                <div class="d-table-cell text-center">
                                    <img src="${pageContext.request.contextPath}/img/brands/logo<%= i %>.png" alt="">
                                </div>
                            </div>
                        </div>
                        <% } %>

                    </div>
                </div>

                <div class="offset-lg-2 col-lg-4 col-md-6">
                    <div class="client-info">
                        <div class="d-flex mb-50">
                            <span class="lage">10</span>
                            <span class="smll">Years Experience Working</span>
                        </div>

                        <div class="call-now d-flex">
                            <div>
                                <span class="fa fa-phone"></span>
                            </div>

                            <div class="ml-15">
                                <p>Call Us Now</p>
                                <h3>(+1)-800-555-6789</h3>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </section>

    <!-- Features Area -->
    <section class="features_area">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-lg-8 text-center">
                    <div class="main_title">
                        <h2>Service Offers</h2>
                        <p>Explore our services.</p>
                    </div>
                </div>
            </div>

            <div class="row feature_inner">

                <div class="col-lg-3 col-md-6">
                    <div class="feature_item">
                        <img src="${pageContext.request.contextPath}/img/services/s1.png" alt="">
                        <h4>WP Developing</h4>
                        <p>Website development services.</p>
                    </div>
                </div>

                <div class="col-lg-3 col-md-6">
                    <div class="feature_item">
                        <img src="${pageContext.request.contextPath}/img/services/s2.png" alt="">
                        <h4>UI/UX Design</h4>
                        <p>User interface and user experience design.</p>
                    </div>
                </div>

                <div class="col-lg-3 col-md-6">
                    <div class="feature_item">
                        <img src="${pageContext.request.contextPath}/img/services/s3.png" alt="">
                        <h4>Web Design</h4>
                        <p>Responsive website design services.</p>
                    </div>
                </div>

                <div class="col-lg-3 col-md-6">
                    <div class="feature_item">
                        <img src="${pageContext.request.contextPath}/img/services/s4.png" alt="">
                        <h4>SEO Optimize</h4>
                        <p>Search engine optimization services.</p>
                    </div>
                </div>

            </div>
        </div>
    </section>

    <!--================ Start Testimonial Area =================-->
	<div class="testimonial_area section_gap_bottom">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-lg-8 text-center">
					<div class="main_title">
						<h2>client say about me</h2>
						<p>Is give may shall likeness made yielding spirit a itself togeth created after sea is in beast <br>
							 beginning signs open god you're gathering ithe</p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="testi_slider owl-carousel">
        			<div class="testi_item">
        				<div class="row">
        					<div class="col-lg-4">
        						<img src="${pageContext.request.contextPath}/img/testimonials/t1.jpg" alt="">
        					</div>
        					<div class="col-lg-8">
        						<div class="testi_text">
        							<h4>Elite Martin</h4>
									<p>Him, made can't called over won't there on divide there male fish beast own his day third seed sixth seas unto. Saw from </p>
        						</div>
        					</div>
        				</div>
        			</div>
        			<div class="testi_item">
        				<div class="row">
        					<div class="col-lg-4">
        						<img src="${pageContext.request.contextPath}/img/testimonials/t2.jpg" alt="">
        					</div>
        					<div class="col-lg-8">
        						<div class="testi_text">
        							<h4>Davil Saden</h4>
									<p>Him, made can't called over won't there on divide there male fish beast own his day third seed sixth seas unto. Saw from </p>
        						</div>
        					</div>
        				</div>
        			</div>
        			<div class="testi_item">
        				<div class="row">
        					<div class="col-lg-4">
        						<img src="${pageContext.request.contextPath}/img/testimonials/t1.jpg" alt="">
        					</div>
        					<div class="col-lg-8">
        						<div class="testi_text">
        							<h4>Elite Martin</h4>
									<p>Him, made can't called over won't there on divide there male fish beast own his day third seed sixth seas unto. Saw from </p>
        						</div>
        					</div>
        				</div>
        			</div>
        			<div class="testi_item">
        				<div class="row">
        					<div class="col-lg-4">
        						<img src="${pageContext.request.contextPath}/img/testimonials/t2.jpg" alt="">
        					</div>
        					<div class="col-lg-8">
        						<div class="testi_text">
        							<h4>Davil Saden</h4>
									<p>Him, made can't called over won't there on divide there male fish beast own his day third seed sixth seas unto. Saw from </p>
        						</div>
        					</div>
        				</div>
        			</div>
        			<div class="testi_item">
        				<div class="row">
        					<div class="col-lg-4">
        						<img src="${pageContext.request.contextPath}/img/testimonials/t1.jpg" alt="">
        					</div>
        					<div class="col-lg-8">
        						<div class="testi_text">
        							<h4>Elite Martin</h4>
									<p>Him, made can't called over won't there on divide there male fish beast own his day third seed sixth seas unto. Saw from </p>
        						</div>
        					</div>
        				</div>
        			</div>
        			<div class="testi_item">
        				<div class="row">
        					<div class="col-lg-4">
        						<img src="${pageContext.request.contextPath}/img/testimonials/t2.jpg" alt="">
        					</div>
        					<div class="col-lg-8">
        						<div class="testi_text">
        							<h4>Davil Saden</h4>
									<p>Him, made can't called over won't there on divide there male fish beast own his day third seed sixth seas unto. Saw from </p>
        						</div>
        					</div>
        				</div>
        			</div>
        		</div>
			</div>
		</div>
	</div>
	<!--================ End Testimonial Area =================-->

    <!-- Footer -->
    <%@ include file="footer.jsp" %>

    <!-- JavaScript -->
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/popper.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/stellar.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.magnific-popup.min.js"></script>
    <script src="${pageContext.request.contextPath}/vendors/nice-select/js/jquery.nice-select.min.js"></script>
    <script src="${pageContext.request.contextPath}/vendors/isotope/imagesloaded.pkgd.min.js"></script>
    <script src="${pageContext.request.contextPath}/vendors/isotope/isotope-min.js"></script>
    <script src="${pageContext.request.contextPath}/vendors/owl-carousel/owl.carousel.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.ajaxchimp.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/mail-script.js"></script>

    <!-- Google Maps -->
    <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY"></script>
    <script src="${pageContext.request.contextPath}/js/gmaps.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/theme.js"></script>

</body>
</html>