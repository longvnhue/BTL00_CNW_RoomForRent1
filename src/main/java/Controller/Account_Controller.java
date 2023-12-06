package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BO.Account_BO;

@WebServlet("/Account_Controller")
public class Account_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Account_BO bo = new Account_BO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String destination = null;

		String action = request.getParameter("action");

		if (action.equals("Login")) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");

			// thao tác với bo

		}

		RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		rd.forward(request, response);
	}
}