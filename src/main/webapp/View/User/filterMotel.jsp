<%@page import="Model.bean.District"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="author" content="Untree.co">
<link rel="shortcut icon" href="favicon.png">

<meta name="description" content="" />
<meta name="keywords" content="bootstrap, bootstrap4" />

<!-- Bootstrap CSS -->
	<link href="<%=request.getContextPath()%>/View/css/bootstrap.min.css" rel="stylesheet">
	<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
	<link href="<%=request.getContextPath()%>/View/css/tiny-slider.css" rel="stylesheet">
	<link href="<%=request.getContextPath()%>/View/css/style.css" rel="stylesheet">
	<link href="<%=request.getContextPath()%>/View/css/UserMotel.css" rel="stylesheet">
	<title>Lọc nhà trọ</title>
	

</head>

	<body>

		<!-- Start Header/Navigation -->
		<nav class="custom-navbar navbar navbar navbar-expand-md navbar-dark bg-dark" arial-label="Furni navigation bar">

			<div class="container">
				<a class="navbar-brand" href="${pageContext.request.contextPath}/FilterMotel_Controller">Motel<span>.</span></a>

				<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsFurni" aria-controls="navbarsFurni" aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarsFurni">
					<ul class="custom-navbar-nav navbar-nav ms-auto mb-2 mb-md-0">
						<li class="nav-item">
							<a class="nav-link" href="<%=request.getContextPath()%>/View/User/indexUser.jsp">Trang chủ</a>
						</li>
						<li class="active"><a class="nav-link" href="filterMotel.jsp">Lọc nhà trọ</a></li>
					</ul>

					<ul class="custom-navbar-cta navbar-nav mb-2 mb-md-0 ms-5">
						<li><a class="nav-link" href="#"><img src="<%=request.getContextPath()%>/View/img/user.svg"></a></li>
						<li><span class="nav-hello-user">Hello user</span></li>
					</ul>
				</div>
			</div>
				
		</nav>
		<!-- End Header/Navigation -->

		<!-- Start Hero Section -->
			<div class="hero">
				<div class="container">
					<div class="row justify-content-between">
						<div class="col-lg-5">
							<div class="intro-excerpt">
								<h1>Hãy tìm nhà trọ phù hợp với bạn</h1>
							</div>
						</div>
						<div class="col-lg-7">
							
						</div>
					</div>
				</div>
			</div>
		<!-- End Hero Section -->

		<!-- Start Filter Motel -->
		<h2 class="filter-motel-title">Lọc theo thuộc tính</h2>
		<form action="${pageContext.request.contextPath}/FilterMotel_Controller" method="post">
			<div class="filter-motel">
			
				<div class="filter-motel-container" name="district">
				    <label class="title-combobox">Quận: </label>
				    <select class="combobox" name="districtSelect" id="districtSelect">
				        <option value="">--Hãy chọn quận--</option>
				
				        <% 
				            // Lặp qua danh sách quận và tạo các option trực tiếp trong mã Java
				            ArrayList<District> districtList = (ArrayList<District>)request.getAttribute("districtList");
				        if(districtList != null) {
				            for (District district : districtList) {
				        %>
				            <option value="<%= district.getName_district()%>"><%= district.getName_district() %></option>
				        <%
				            }
				        }
				        %>
				    </select>
				</div>

				
				<div class="filter-motel-container" name="ward">
					<label class="title-combobox">Phường: </label>
					<select class="combobox" id="wardSelect">
						<option value="">--Hãy chọn phường--</option>
					</select>
				</div>
				
				<div class="filter-motel-container" name="area">
					<label class="title-combobox">Diện tích: </label>
					<select class="combobox">
						<option value="">--Hãy chọn diện tích--</option>
						<option value="10 - 20">10 - 20 (m2)</option>
						<option value="20 - 30">20 - 30 (m2)</option>
						<option value="30 - 40">30 - 40 (m2)</option>
						<option value="40 - 50">40 - 50 (m2)</option>
						
					</select>
				</div>
				
				<div class="filter-motel-container" name="price">
					<label class="title-combobox">Giá: </label>
					<select class="combobox">
						<option value="">--Hãy chọn giá--</option>
						<option value="500000 - 1000000">500000 - 1000000</option>
						<option value="1000000 - 2000000">1000000 - 2000000</option>
						<option value="2000000 - 3000000">2000000 - 3000000</option>
					</select>
				</div>
				
				<input type="submit" value="Lọc" class="btn btn-primary">
			</div>
			
		</form>
		<!-- End Filter Motel -->
		
		<div class="untree_co-section product-section before-footer-section">
		    <div class="container">
		      	<div class="row">

		      		<!-- Start Column 1 -->
					<div class="col-12 col-md-4 col-lg-3 mb-5">
						<a class="product-item" href="#">
							<img src="<%=request.getContextPath()%>/View/img/1.jpg" class="img-fluid product-thumbnail">
							<h3 class="product-title">Nordic Chair</h3>
							<strong class="product-price">$50.00</strong>

							<span class="icon-cross">
								<img src="images/cross.svg" class="img-fluid">
							</span>
						</a>
					</div> 
					<!-- End Column 1 -->
						
					<!-- Start Column 2 -->
					<div class="col-12 col-md-4 col-lg-3 mb-5">
						<a class="product-item" href="#">
							<img src="<%=request.getContextPath()%>/View/img/2.jpg" class="img-fluid product-thumbnail">
							<h3 class="product-title">Nordic Chair</h3>
							<strong class="product-price">$50.00</strong>

							<span class="icon-cross">
								<img src="images/cross.svg" class="img-fluid">
							</span>
						</a>
					</div> 
					<!-- End Column 2 -->

					<!-- Start Column 3 -->
					<div class="col-12 col-md-4 col-lg-3 mb-5">
						<a class="product-item" href="#">
							<img src="<%=request.getContextPath()%>/View/img/3.jpg" class="img-fluid product-thumbnail">
							<h3 class="product-title">Kruzo Aero Chair</h3>
							<strong class="product-price">$78.00</strong>

							<span class="icon-cross">
								<img src="images/cross.svg" class="img-fluid">
							</span>
						</a>
					</div>
					<!-- End Column 3 -->

					<!-- Start Column 4 -->
					<div class="col-12 col-md-4 col-lg-3 mb-5">
						<a class="product-item" href="#">
							<img src="<%=request.getContextPath()%>/View/img/4.jpg" class="img-fluid product-thumbnail">
							<h3 class="product-title">Ergonomic Chair</h3>
							<strong class="product-price">$43.00</strong>

							<span class="icon-cross">
								<img src="images/cross.svg" class="img-fluid">
							</span>
						</a>
					</div>
					<!-- End Column 4 -->


					<!-- Start Column 1 -->
					<div class="col-12 col-md-4 col-lg-3 mb-5">
						<a class="product-item" href="#">
							<img src="<%=request.getContextPath()%>/View/img/5.jpg" class="img-fluid product-thumbnail">
							<h3 class="product-title">Nordic Chair</h3>
							<strong class="product-price">$50.00</strong>

							<span class="icon-cross">
								<img src="images/cross.svg" class="img-fluid">
							</span>
						</a>
					</div> 
					<!-- End Column 1 -->
						
					<!-- Start Column 2 -->
					<div class="col-12 col-md-4 col-lg-3 mb-5">
						<a class="product-item" href="#">
							<img src="<%=request.getContextPath()%>/View/img/6.jpg" class="img-fluid product-thumbnail">
							<h3 class="product-title">Nordic Chair</h3>
							<strong class="product-price">$50.00</strong>

							<span class="icon-cross">
								<img src="images/cross.svg" class="img-fluid">
							</span>
						</a>
					</div> 
					<!-- End Column 2 -->

					<!-- Start Column 3 -->
					<div class="col-12 col-md-4 col-lg-3 mb-5">
						<a class="product-item" href="#">
							<img src="<%=request.getContextPath()%>/View/img/7.jpg" class="img-fluid product-thumbnail">
							<h3 class="product-title">Kruzo Aero Chair</h3>
							<strong class="product-price">$78.00</strong>

							<span class="icon-cross">
								<img src="images/cross.svg" class="img-fluid">
							</span>
						</a>
					</div>
					<!-- End Column 3 -->

					<!-- Start Column 4 -->
					<div class="col-12 col-md-4 col-lg-3 mb-5">
						<a class="product-item" href="#">
							<img src="<%=request.getContextPath()%>/View/img/8.jpg" class="img-fluid product-thumbnail">
							<h3 class="product-title">Ergonomic Chair</h3>
							<strong class="product-price">$43.00</strong>

							<span class="icon-cross">
								<img src="images/cross.svg" class="img-fluid">
							</span>
						</a>
					</div>
					<!-- End Column 4 -->

		      	</div>
		    </div>
		</div>


		<!-- Start Footer Section -->
		<footer class="footer-section">
			<div class="container relative">

				<div class="sofa-img">
					<img src="<%=request.getContextPath()%>/View/img/sofa.png" alt="Image" class="img-fluid">
				</div>

				<div class="row">
					<div class="col-lg-8">
						<div class="subscription-form">
							<h3 class="d-flex align-items-center"><span class="me-1"><img src="<%=request.getContextPath()%>/View/img/envelope-outline.svg" alt="Image" class="img-fluid"></span><span>Subscribe to Newsletter</span></h3>

							<form action="#" class="row g-3">
								<div class="col-auto">
									<input type="text" class="form-control" placeholder="Enter your name">
								</div>
								<div class="col-auto">
									<input type="email" class="form-control" placeholder="Enter your email">
								</div>
								<div class="col-auto">
									<button class="btn btn-primary">
										<span class="fa fa-paper-plane"></span>
									</button>
								</div>
							</form>

						</div>
					</div>
				</div>

				<div class="row g-5 mb-5">
					<div class="col-lg-4">
						<div class="mb-4 footer-logo-wrap"><a href="#" class="footer-logo">Motel<span>.</span></a></div>
					<p class="mb-4">
						Việc tìm được nơi ở lý tưởng không chỉ giúp bạn
						tiết kiệm chi phí mà còn tạo điều kiện tốt cho việc học tập và
						phát triển bản thân. Hãy dành thời gian nghiên cứu và xem xét kỹ
						lưỡng trước khi đưa ra quyết định cuối cùng. Chúc bạn may mắn
						trong việc tìm được một nơi ở thoải mái và phù hợp với nhu cầu của
						mình!
					</p>

					<ul class="list-unstyled custom-social">
							<li><a href="#"><span class="fa fa-brands fa-facebook-f"></span></a></li>
							<li><a href="#"><span class="fa fa-brands fa-twitter"></span></a></li>
							<li><a href="#"><span class="fa fa-brands fa-instagram"></span></a></li>
							<li><a href="#"><span class="fa fa-brands fa-linkedin"></span></a></li>
						</ul>
					</div>

					<div class="col-lg-8">
						<div class="row links-wrap">
							<div class="col-6 col-sm-6 col-md-3">
								<ul class="list-unstyled">
									<li><a href="#">About us</a></li>
									<li><a href="#">Services</a></li>
									<li><a href="#">Blog</a></li>
									<li><a href="#">Contact us</a></li>
								</ul>
							</div>

							<div class="col-6 col-sm-6 col-md-3">
								<ul class="list-unstyled">
									<li><a href="#">Support</a></li>
									<li><a href="#">Knowledge base</a></li>
									<li><a href="#">Live chat</a></li>
								</ul>
							</div>

							<div class="col-6 col-sm-6 col-md-3">
								<ul class="list-unstyled">
									<li><a href="#">Jobs</a></li>
									<li><a href="#">Our team</a></li>
									<li><a href="#">Leadership</a></li>
									<li><a href="#">Privacy Policy</a></li>
								</ul>
							</div>

							<div class="col-6 col-sm-6 col-md-3">
								<ul class="list-unstyled">
									<li><a href="#">Nordic Chair</a></li>
									<li><a href="#">Kruzo Aero</a></li>
									<li><a href="#">Ergonomic Chair</a></li>
								</ul>
							</div>
						</div>
					</div>

				</div>

				<div class="border-top copyright">
					<div class="row pt-4">
						<div class="col-lg-6">
							<p class="mb-2 text-center text-lg-start">Copyright &copy;<script>document.write(new Date().getFullYear());</script>. All Rights Reserved. &mdash; Designed with love by <a href="https://untree.co">Untree.co</a> Distributed By <a hreff="https://themewagon.com">ThemeWagon</a>  <!-- License information: https://untree.co/license/ -->
            </p>
						</div>

						<div class="col-lg-6 text-center text-lg-end">
							<ul class="list-unstyled d-inline-flex ms-auto">
								<li class="me-4"><a href="#">Terms &amp; Conditions</a></li>
								<li><a href="#">Privacy Policy</a></li>
							</ul>
						</div>

					</div>
				</div>

			</div>
		</footer>
		<!-- End Footer Section -->	
		<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>

		<script>
		    $(document).ready(function () {
		        // Bắt sự kiện khi combobox quận thay đổi
		        $("#districtSelect").change(function () {
		            var selectedDistrict = $(this).val();
		
		            // Gửi yêu cầu Ajax để lấy danh sách phường
		            $.ajax({
		                url: "<%= request.getContextPath() %>/FilterMotel_Controller",
		                method: "GET",
		                data: { action: "selectDistrict", selectedDistrict: selectedDistrict },
		                dataType: "json",
		                success: function (data) {
		                	$("#wardSelect").empty();

		                    // Thêm option "--Hãy chọn phường--"
		                    $("#wardSelect").append($('<option>', {
		                        value: '',
		                        text: '--Hãy chọn phường--'
		                    }));
		                    
		                    $.each(data, function (index, ward) {
		                        $("#wardSelect").append($('<option>', {
		                            value: ward.name_ward,
		                            text: ward.name_ward
		                        }));
		                    });
		                },
		                error: function (error) {
		                    console.log("Error: " + error);
		                }
		            });
		        });
		    });
		</script>





		<script src="<%=request.getContextPath()%>/View/js/bootstrap.bundle.min.js"></script>
		<script src="<%=request.getContextPath()%>/View/js/tiny-slider.js"></script>
		<script src="<%=request.getContextPath()%>/View/js/custom.js"></script>
	</body>

</html>
