package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BO.Role_BO;

@WebServlet("/Role_Controller")
public class Role_Controller extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	Role_BO bo = new Role_BO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String destination = null;
		
		String action = request.getParameter("action");
		
		if (action.equals("Login")) {
			// thao tác với bo
			
		}
		else {
			
		}
		
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		rd.forward(request, response);
	}
}
