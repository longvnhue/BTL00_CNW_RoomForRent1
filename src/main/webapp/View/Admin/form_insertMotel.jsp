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
                  <h2 class="card-title" style="text-align: center;">Thêm phòng</h2>
					
				  <form action="" method="post">
					  <table class="table">
					    <tr>
					      <td>Ảnh phòng: </td>
					      <td>
					        <input type="file" class="form-input" name="img">
					      </td>
					    </tr>
					    <tr>
					      <td>Tiêu đề: </td>
					      <td>
					        <input type="text" class="form-input" style="width: 100%;" name="title">
					      </td>
					    </tr>
					    <tr>
					      <td>Diện tích: </td>
					      <td>
					        <input type="text" class="form-input" name="area">
					      </td>
					    </tr>
					    <tr>
					      <td>Mô tả: </td>
					      <td>
					        <textarea rows="" cols="" class="form-input" name="description"></textarea>
					      </td>
					    </tr>
					    <tr>
					      <td>Giá tiền: </td>
					      <td>
					        <input type="text" class="form-input" name="price">
					      </td>
					    </tr>
					    <tr>
					      <td>Số điện thoại: </td>
					      <td>
					        <input type="text" class="form-input" name="phone_number">
					      </td>
					    </tr>
					    <tr>
					      <td>Địa chỉ: </td>
					      <td>
					        <input type="text" class="form-input" name="address">
					      </td>
					    </tr>
					    <tr>
					      <td>Phường: </td>
					      <td style="display:flex; justify-content: space-between;">
					        <select class="form-select" name="ward">
					          <option>--Hãy chọn phường--</option>
					          <option>Khuê Trung</option>
					          <option>Khuê Trung</option>
					          <option>Khuê Trung</option>
					        </select>
					        <div style="width: 300px; display: flex; justify-content: space-between;">
					        	Quận:                   
						        <select class="form-select" name="district">
						          <option>--Hãy chọn quận--</option>
						          <option>Khuê Trung</option>
						          <option>Khuê Trung</option>
						          <option>Khuê Trung</option>
						        </select>
					        </div>
					      </td>
					    </tr>
					  </table>
					  <div style="margin: 50px 250px 0; display: flex; justify-content: space-between; align-items: center;">
					  	<input type="submit" value="Thêm" class="btn btn-primary" style="cursor: pointer;">
					 	<input type="reset" value="Cancel" class="btn btn-primary" style="cursor: pointer;">
					  </div>
					</form>
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
