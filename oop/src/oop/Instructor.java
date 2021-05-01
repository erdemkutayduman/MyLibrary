package oop;


public class Instructor extends User {

	public Instructor(int id, String name, String surname, String password, String email) {
		super(id, name, surname, password, email);
		
		super.welcomeSystem();
	}

}