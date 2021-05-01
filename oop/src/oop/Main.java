package oop;

public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager();
		
		User user1 = new Student(1, "Erdem", " Duman", "1234", "erdem@github.com");
		userManager.showInformation(user1);
		
		User user2 = new Instructor(1, "Kutay", " Duman", "1234", "kutay@github.com");
		userManager.showInformation(user2);
		
		
		
		
		
		InstructorManager instructorManager = new InstructorManager();
		String [] addingCourse1 = {"Java"};
		instructorManager.addCourse(addingCourse1);
		
		StudentManager studentManager = new StudentManager();
		String [] addingCourse2 = {"C#"};
		studentManager.addCourse(addingCourse2);
	}

}
