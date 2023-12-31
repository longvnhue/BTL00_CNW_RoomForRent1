<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Thêm phòng</title>
  <!-- plugins:css -->
  <link rel="stylesheet" href="../../node_modules/mdi/css/materialdesignicons.min.css">
  <link rel="stylesheet" href="../../node_modules/perfect-scrollbar/dist/css/perfect-scrollbar.min.css">
  <!-- endinject -->
  <!-- plugin css for this page -->
  <link rel="stylesheet" href="../../node_modules/font-awesome/css/font-awesome.min.css" />
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <link rel="stylesheet" href="../cssAdmin/style.css">
  <!-- endinject -->
  <link rel="shortcut icon" href="../../images/favicon.png" />
</head>

<body>
  <div class=" container-scroller page-body-wrapper">
    <!-- partial:../../partials/_navbar.html -->
    <nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
      <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
        <a class="navbar-brand brand-logo" href="index.jsp">Motel</a>
        <a class="navbar-brand brand-logo-mini" href="index.html"><img src="images/logo-mini.svg" alt="logo"/></a>
      </div>
      <div class="navbar-menu-wrapper d-flex align-items-stretch">
        <ul class="navbar-nav navbar-nav-right">    
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle nav-profile" id="profileDropdown" href="#" data-toggle="dropdown" aria-expanded="false">
              <img src="../img/Gura.jpg" alt="image">
              <span class="d-none d-lg-inline">CielTan</span>
            </a>
          </li>
          <li class="nav-item nav-logout d-none d-lg-block">
            <a class="nav-link" href="#">
              <i class="mdi mdi-power"></i>
            </a>
          </li>
        </ul>
        <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="offcanvas">
        <span class="mdi mdi-menu"></span>
      </button>
      </div>
    </nav>
    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
      <div class="row row-offcanvas row-offcanvas-right">
        <!-- partial:../../partials/_sidebar.html -->
        <nav class="sidebar sidebar-offcanvas" id="sidebar">
          <ul class="nav">
            <li class="nav-item">
              <a class="nav-link" href="indexAdmin.jsp">
                <span class="menu-title">Trang chủ</span>
                <i class="mdi mdi-home menu-icon"></i>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" data-toggle="collapse" href="insertMotel.jsp" aria-expanded="false" aria-controls="ui-basic">
                <span class="menu-title">Thêm phòng</span>
                <i class="mdi mdi-crosshairs-gps menu-icon"></i>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="updateMotel.jsp">
                <span class="menu-title">Cập nhật phòng</span>
                <i class="mdi mdi-contacts menu-icon"></i>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="deleteMotel.jsp">
                <span class="menu-title">Xóa phòng</span>
                <i class="mdi mdi-format-list-bulleted menu-icon"></i>
              </a>
            </li>
          </ul>
        </nav>
        <!-- partial -->
        <div class="content-wrapper">
          <div class="row">
            <div class="col-lg-12 grid-margin">
              <div class="card">
                <div class="card-body">
                  <div style="display: flex; justify-content: space-between; align-items: center; margin-bottom: 15px;">
                  	<h2 class="card-title" style="margin-bottom: 0;">Danh sách thông tin nhà trọ</h2>
                  	<button class="btn btn-primary"><a href="form_insertMotel.jsp" style="color: white; cursor: pointer; text-decoration: none;">Thêm phòng</a></button>
                  </div>
                  <div class="icons-list row">
                    
                   	<div class="col-sm-6 col-md-4 col-lg-3" style="justify-content: center"><img alt="" src="../img/1.jpg" style="width: auto; height: 200px;"></div>
                    <div class="col-sm-6 col-md-4 col-lg-3">Cho thuê phòng trọ cho 2 - 3 người, giá sinh viên</div>
                    <div class="col-sm-6 col-md-4 col-lg-3">369 Nguyễn Lương Bằng, phường khuê trung, quận cẩm lệ</div>
                    <div class="col-sm-6 col-md-4 col-lg-3">insert mô tả here</div>
                    <div class="col-sm-6 col-md-4 col-lg-3">
                    	Diện tích: 20 m2 <br><br>
                    	Giá: 3 000 000 vnđ<br><br>
                    	Sđt: 0123456789
                    </div>
                    
                    
                   	<div class="col-sm-6 col-md-4 col-lg-3" style="justify-content: center"><img alt="" src="../img/1.jpg" style="width: auto; height: 200px;"></div>
                    <div class="col-sm-6 col-md-4 col-lg-3">Cho thuê phòng trọ cho 2 - 3 người, giá sinh viên</div>
                    <div class="col-sm-6 col-md-4 col-lg-3">369 Nguyễn Lương Bằng, phường khuê trung, quận cẩm lệ</div>
                    <div class="col-sm-6 col-md-4 col-lg-3">insert mô tả here</div>
                    <div class="col-sm-6 col-md-4 col-lg-3">
                    	Diện tích: 20 m2 <br><br>
                    	Giá: 3 000 000 vnđ<br><br>
                    	Sđt: 0123456789
                    </div>
                    
                    
                   	<div class="col-sm-6 col-md-4 col-lg-3" style="justify-content: center"><img alt="" src="../img/1.jpg" style="width: auto; height: 200px;"></div>
                    <div class="col-sm-6 col-md-4 col-lg-3">Cho thuê phòng trọ cho 2 - 3 người, giá sinh viên</div>
                    <div class="col-sm-6 col-md-4 col-lg-3">369 Nguyễn Lương Bằng, phường khuê trung, quận cẩm lệ</div>
                    <div class="col-sm-6 col-md-4 col-lg-3">insert mô tả here</div>
                    <div class="col-sm-6 col-md-4 col-lg-3">
                    	Diện tích: 20 m2 <br><br>
                    	Giá: 3 000 000 vnđ<br><br>
                    	Sđt: 0123456789
                    </div>
                   
                   
                   	<div class="col-sm-6 col-md-4 col-lg-3" style="justify-content: center"><img alt="" src="../img/1.jpg" style="width: auto; height: 200px;"></div>
                    <div class="col-sm-6 col-md-4 col-lg-3">Cho thuê phòng trọ cho 2 - 3 người, giá sinh viên</div>
                    <div class="col-sm-6 col-md-4 col-lg-3">369 Nguyễn Lương Bằng, phường khuê trung, quận cẩm lệ</div>
                    <div class="col-sm-6 col-md-4 col-lg-3">insert mô tả here</div>
                    <div class="col-sm-6 col-md-4 col-lg-3">
                    	Diện tích: 20 m2 <br><br>
                    	Giá: 3 000 000 vnđ<br><br>
                    	Sđt: 0123456789
                    </div>
                    
                    
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- partial:../../partials/_footer.html -->
        <footer class="footer">
          <div class="d-sm-flex justify-content-center justify-content-sm-between">
            <span class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright © 2017 <a href="https://www.bootstrapdash.com/" target="_blank">Bootstrap Dash</a>. All rights reserved.</span>
            <span class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">Hand-crafted & made with <i class="mdi mdi-heart text-danger"></i></span>
          </div>
        </footer>
        <!-- partial -->
      </div>
    </div>
  </div>

  <!-- plugins:js -->
  <script src="../../node_modules/jquery/dist/jquery.min.js"></script>
  <script src="../../node_modules/popper.js/dist/umd/popper.min.js"></script>
  <script src="../../node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
  <script src="../../node_modules/perfect-scrollbar/dist/js/perfect-scrollbar.jquery.min.js"></script>
  <!-- endinject -->
  <!-- Plugin js for this page-->
  <!-- End plugin js for this page-->
  <!-- inject:js -->
  <script src="../js/off-canvas.js"></script>
  <script src="../js/misc.js"></script>
  <!-- endinject -->
  <!-- Custom js for this page-->
  <!-- End custom js for this page-->
</body>

</html>
