package oop;

public class Student extends User{

	public Student(int id, String name, String surname, String password, String email) {
		super(id, name, surname, password, email);
		
		super.welcomeSystem();
	}

}