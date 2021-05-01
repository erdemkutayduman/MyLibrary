package oop;

public class InstructorManager extends UserManager{

	@Override
	public void addCourse(String[] course) {
		System.out.println("Course is added to system");
		super.addCourse(course);
		
	}
}