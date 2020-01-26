package com.trainingbsaket.jeeFirst.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trainingbasket.jeefirst.factory.LoginServiceFactory;
import com.trainingbasket.jeefirst.modals.UserModal;
import com.trainingbasket.jeefirst.services.LoginService;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

	LoginService service = LoginServiceFactory.getLoginServiceInstance();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = null;
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		UserModal user = new UserModal();
		user.setEmail(email);
		user.setPassword(password);
		if (service.validationLogin(user)) {
			dispatcher = request.getRequestDispatcher("welcome");
			request.setAttribute("msg", "Login successful");
		} else {
			dispatcher = request.getRequestDispatcher("login.jsp");
			request.setAttribute("msg", "Login failed");
		}
		dispatcher.forward(request, response);
	}

////It is for unit testing
//	public static void main(String[] args) {
//		LoginService loginService = new LoginService();
//		UserModal modal = new UserModal("Gopal", 34, "234324", "gopal@gmail.com", "123");
//
//		System.out.println(loginService.validationLogin(modal));
//
//	}

//@WebServlet(urlPatterns="/login.do")
//public class LoginServlet extends HttpServlet {
//
//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>My First EE Lab</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("My First Servlet");
//		out.println("</body>");
//		out.println("</html>");
}
