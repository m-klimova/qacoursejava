package lectures;

public class Student {
	// Example of instance variables
	
	private int test = 0;
	
	String name;
	int facultyNumber;
	String courseName;
	float averageGrade;
	
	// Example of static/class variable
	// Common to ALL objects of this class
	// Usually used for constants
	static final String UNIVERSITY = "SU";
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println("Student's name is: " + this.name);
	}
	
	public static void main(String[] args) {
		// Declaration of local variable of class Student
		Student firstStudent = new Student();
		firstStudent.setName("Test Name Student 1");
		
		// Declaration of another local variable of class Student
		Student secondStudent = new Student();
		secondStudent.setName("Test Name Student 2");

		System.out.printf("All students go to university %s\n", Student.UNIVERSITY);
		firstStudent.printName();
		secondStudent.printName();
	}
}
