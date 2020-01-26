package com.trainingbasket.jeefirst.modals;

public class UserModal {

	static int tmpId = 0;
	private int id;
	private String name;
	private int age;
	private String contact;
	private String email;
	private String password;

	public UserModal(String name, int age, String contact, String email, String password) {
		super();
		this.id = ++tmpId;
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.email = email;
		this.password = password;
	}

	public UserModal() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean equals(Object obj) {
		UserModal user = (UserModal) obj;
		if (user.getEmail().equals(this.email) && user.getPassword().equals(this.password)) {
			return true;
		}
		return false;
	}

	public int getId() {
		return this.id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
