package oop;

public class StudentManager extends UserManager {
	
	@Override
	public void addCourse(String[] course) {
		System.out.println("course is added to cart");
		super.addCourse(course);
		
	}

}