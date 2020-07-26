package solutions.test;

import java.util.Arrays;

public class TestStudent {

	public static void main(String[] args) {
		Student[] students =  { new Student(6.0), new Student(3.4), new Student(5.5), new Student(4.5) };
		
		Arrays.sort(students, Student::compare);
		
		for(Student student : students) {
			System.out.println(student.getGrade());
		}
		
		Student[] studentsByName =  { new Student("Elinka"), new Student("Voyko"), new Student("Tzvetlena") };
		
		CompareByNames comparator = new CompareByNames();
		Arrays.sort(studentsByName, comparator::compareByNames);
		for(Student student : studentsByName) {
			System.out.println(student.getName());
		}
	}
}
