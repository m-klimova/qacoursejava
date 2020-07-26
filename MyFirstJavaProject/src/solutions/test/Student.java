package solutions.test;

public class Student {
	private double avgGrade;
	private String name;
	
	Student(double grade) {
		this.avgGrade = grade;
	}
	
	Student(String name) {
		this.name = name;
	}
	
	public static int compare(Student a, Student b) {
		if (a.avgGrade > b.avgGrade) return 1;
		else if (a.avgGrade < b.avgGrade) return -1;
		else return 0;
	}
	public double getGrade() {
		return this.avgGrade;
	}
	
	public String getName() {
		return this.name;
	}

}
