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

@WebServlet(urlPatterns = "/signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	LoginService loginService = LoginServiceFactory.getLoginServiceInstance();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String contact = request.getParameter("contact");
		String email = request.getParameter("email");
		String password = request.getParameter("passwrod");

		UserModal user = new UserModal(name, age, contact, email, password);
		loginService.addUser(user);

		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
	}

}
