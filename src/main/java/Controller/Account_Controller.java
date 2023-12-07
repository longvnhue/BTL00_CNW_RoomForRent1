package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BO.Account_BO;
import Model.DAO.District_DAO;
import Model.bean.Account;
import Model.bean.District;

@WebServlet("/Account_Controller")
public class Account_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Account_BO account_BO = new Account_BO();
	District_DAO district_DAO = new District_DAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {		

			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			// thao tác với bo
			Account account = account_BO.isExistAccount(username, password);
			
			if(account != null) {
				if (account.getId_role().equals("1")) {
					RequestDispatcher rd = getServletContext().getRequestDispatcher("/View/Admin/indexAdmin.jsp");
					rd.forward(request, response);
				} else if (account.getId_role().equals("2")) {
					
//					RequestDispatcher rd = getServletContext().getRequestDispatcher("/View/User/filterMotel.jsp");
//					rd.forward(request, response);
//					response.sendRedirect("FilterMotel_Controller");
					response.sendRedirect(request.getContextPath() + "/FilterMotel_Controller?action=home");
				}
			} else {
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/View/Login-Register/login.jsp");
				rd.forward(request, response);
			}
			
	}
}