package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.*;
import Model.BO.District_BO;
import Model.BO.Ward_BO;
import Model.bean.District;
import Model.bean.Ward;

/**
 * Servlet implementation class FilterMotel_Controller
 */
@WebServlet("/FilterMotel_Controller")
public class FilterMotel_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Ward_BO ward_BO;   
    District_BO district_BO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FilterMotel_Controller() {
        super();
        ward_BO = new Ward_BO();
        district_BO = new District_BO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		
		if (action == null) {
			doPost(request, response);
		}
		
		switch (action) {
			case "selectDistrict": 
				getWardByDistrict(request, response);
				break;
		default:
			doPost(request, response);
		}
	}

	private void getWardByDistrict(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String selectedDistrict = request.getParameter("selectedDistrict");
		ArrayList<Ward> wardList = ward_BO.getWardByDistrict(selectedDistrict);
		
		response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(new Gson().toJson(wardList));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<District> districtList = district_BO.getAllDistrict();
		request.setAttribute("districtList", districtList);
		
		String selectedDistrict = request.getParameter("districtSelect");
		
		ArrayList<Ward> wardList = ward_BO.getWardByDistrict(selectedDistrict);
		request.setAttribute("wardList", wardList);

	    RequestDispatcher rd = getServletContext().getRequestDispatcher("/View/User/filterMotel.jsp");
	    rd.forward(request, response);
	}

}
