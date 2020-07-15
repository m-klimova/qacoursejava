package test;

import main.Student;

public class TestStudentClass {

	public static void main(String[] args) {

		Student student1 = new Student("My Name", "2 Street One, UK", "FN93278");
		
		student1.addCourse("Math", 5.5);
		student1.addCourse("Chemistry", 4.6);
		student1.addCourse("Bulgarian", 6.0);
		
		student1.printGrades();

	}

}
