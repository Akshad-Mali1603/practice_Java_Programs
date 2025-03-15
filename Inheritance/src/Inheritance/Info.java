package Inheritance;

public class Info {
	public void Display(Student student) {
		System.out.println("The ID: "+student.getId());
		System.out.println("The Name: "+student.getName());
		System.out.println("The date of birth: "+student.getDateofbirth());
		System.out.println("************************#####*******************");
	}
	public void display(Course course) {
		System.out.println("Trainee ID: "+course.getId());
		System.out.println("Trainee Name: "+course.getName());
		System.out.println("Trainee Duration: "+course.getDuration());
		System.out.println("Trainee Fees: "+course.getFees());
		System.out.println("************************#####***********************");
	}
}
