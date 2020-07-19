package f.module02.lecture10;

import java.util.Arrays;

public class TestReferenceMethods {

	public static void main(String[] args) {
		StudentRefM[] students = { new StudentRefM(3.4), new StudentRefM(5.6), new StudentRefM(4.5) };
		
		Arrays.sort(students, StudentRefM::compareByGrade);
		
		for(StudentRefM student : students) {
			System.out.println(student.getAvgGrade());
		}
		
		StudentRefM[] studentsByName = { new StudentRefM("Gergana"), new StudentRefM("Diliana"), 
				new StudentRefM("Elinka")};
		
		ComparesObjects object = new ComparesObjects();
		Arrays.sort(studentsByName, object::compareByNames);
		
		for(StudentRefM student : studentsByName) {
			System.out.println(student.getName());
		}
		
		Draw iDraw = Rectangle::new;
		// On line 26 no constructor has been invoked;
		// we just refer to the constructor of class Rectangle and also
		// method draw(double a) of our interface Draw has become factory method for the class Rectangle
		iDraw.draw(3.4);
		// The result of line 30 is invoking the constructor of class Rectangle
		
		IDraw draw = Rectangle::new;
		draw.draw("kjdhfkjds");

	}

}
