package com.trainingbasket.jeefirst.factory;

import com.trainingbasket.jeefirst.services.LoginService;

public class LoginServiceFactory {
	static LoginService loginService;

	private LoginServiceFactory() {
		loginService = new LoginService();
	}

	public static LoginService getLoginServiceInstance() {
		if (loginService == null) {
			loginService = new LoginService();
		}
		return loginService;

	}
}
