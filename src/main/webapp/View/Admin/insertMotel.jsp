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
              <a class="nav-link" href="index.html">
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
                  <h4 class="card-title">New Icons</h4>
                  <div class="icons-list row">
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-address-book"></i>fa fa-address-book </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-address-book-o"></i>fa fa-address-book-o </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-address-card"></i>fa fa-address-card </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-address-card-o"></i>fa fa-address-card-o </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-bandcamp"></i>fa fa-bandcamp </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-bath"></i>fa fa-bath </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-bathtub"></i>fa fa-bathtub </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-drivers-license"></i>fa fa-drivers-license </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-drivers-license-o"></i>fa fa-drivers-license-o </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-eercast"></i>fa fa-eercast </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-envelope-open"></i>fa fa-envelope-open </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-envelope-open-o"></i>fa fa-envelope-open-o </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-etsy"></i>fa fa-etsy </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-free-code-camp"></i>fa fa-free-code-camp </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-grav"></i>fa fa-grav </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-handshake-o"></i>fa fa-handshake-o </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-id-badge"></i>fa fa-id-badge </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-id-card"></i>fa fa-id-card </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-id-card-o"></i>fa fa-id-card-o </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-imdb"></i>fa fa-imdb </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-linode"></i> fa fa-linode </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-meetup"></i>fa fa-meetup </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-microchip"></i>fa fa-microchip </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-podcast"></i>fa fa-podcast </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-quora"></i>fa fa-quora </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-ravelry"></i>fa fa-ravelry </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-s15"></i>fa fa-s15 </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-shower"></i>fa fa-shower </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-snowflake-o"></i>fa fa-snowflake-o </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-superpowers"></i>fa fa-superpowers </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-telegram"></i>fa fa-telegram </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-thermometer"></i>fa fa-thermometer </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-thermometer-0"></i>fa fa-thermometer-0 </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-thermometer-1"></i>fa fa-thermometer-1 </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-thermometer-2"></i>fa fa-thermometer-2 </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-thermometer-3"></i>fa fa-thermometer-3 </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-thermometer-4"></i>fa fa-thermometer-4 </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-thermometer-empty"></i>fa fa-thermometer-empty </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-thermometer-full"></i>fa fa-thermometer-full </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-thermometer-half"></i>fa fa-thermometer-half </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-thermometer-quarter"></i>fa fa-thermometer-quarter </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-thermometer-three-quarters"></i>fa fa-thermometer-three-quarters
                    </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-times-rectangle"></i>fa fa-times-rectangle </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-times-rectangle-o"></i>fa fa-times-rectangle-o </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-user-circle"></i>fa fa-user-circle </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-user-circle-o"></i>fa fa-user-circle-o </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-user-o"></i>fa fa-user-o </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-vcard"></i>fa fa-vcard </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-vcard-o"></i>fa fa-vcard-o </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-window-close"></i>fa fa-window-close </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-window-close-o"></i>fa fa-window-close-o </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-window-maximize"></i>fa fa-window-maximize </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-window-minimize"></i>fa fa-window-minimize </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-window-restore"></i>fa fa-window-restore </div>
                    <div class="col-sm-6 col-md-4 col-lg-3"> <i class="fa fa-wpexplorer"></i>fa fa-wpexplorer </div>
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
