package com.trainingbasket.jeefirst.services;

import java.util.ArrayList;
import java.util.List;

import com.trainingbasket.jeefirst.modals.UserModal;

public class LoginService {
	List<UserModal> listOfUsers = new ArrayList<UserModal>();

	public LoginService() {
		listOfUsers.add(new UserModal("Gopal", 22, "7576577", "gopal@gmail.com", "123"));
		listOfUsers.add(new UserModal("Ram", 23, "7576577", "gopal1@gmail.com", "123"));
		listOfUsers.add(new UserModal("Abhi", 24, "7576577", "gopal2@gmail.com", "123"));
		listOfUsers.add(new UserModal("Raj", 25, "7576577", "gopal3@gmail.com", "123"));
		listOfUsers.add(new UserModal("Avnav", 26, "7576577", "gopal4@gmail.com", "123"));
		listOfUsers.add(new UserModal("Veer", 27, "7576577", "gopal5@gmail.com", "123"));
		listOfUsers.add(new UserModal("Pratap", 28, "7576577", "gopal6@gmail.com", "123"));

	}

	public void addUser(UserModal modal) {
		listOfUsers.add(modal);
	}

	public boolean validationLogin(UserModal user) {
		for (UserModal userModal : listOfUsers) {
			if (userModal.equals(user)) {
				return true;
			}
		}
		return false;
	}

	public List<UserModal> getAllUsers() {
		return listOfUsers;

	}
}
