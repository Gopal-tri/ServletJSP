package com.trainingbsaket.jeeFirst.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trainingbasket.jeefirst.factory.LoginServiceFactory;
import com.trainingbasket.jeefirst.modals.UserModal;
import com.trainingbasket.jeefirst.services.LoginService;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet(urlPatterns = "/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	LoginService loginService = LoginServiceFactory.getLoginServiceInstance();

	public WelcomeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<UserModal> users = loginService.getAllUsers();
		request.setAttribute("users", users);
		RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
		dispatcher.forward(request, response);
	}

}
