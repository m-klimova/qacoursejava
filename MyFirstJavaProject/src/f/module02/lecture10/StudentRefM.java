package f.module02.lecture10;

public class StudentRefM {
	
	private double avgGrade;
	private String name;
	
	// Getter for avgGrade private instance variable
	public double getAvgGrade() {
		return this.avgGrade;
	}
	// Getter for name private instance variable
	public String getName() {
		return this.name;
	}
	
	StudentRefM(double avgGrade) {
		this.avgGrade = avgGrade;
	}
	
	StudentRefM(String name) {
		this.name = name;
	}
	
	public static int compareByGrade(StudentRefM a, StudentRefM b) {
		if (a.avgGrade > b.avgGrade) return 1;
		else if (a.avgGrade < b.avgGrade) return -1;
		else
			return 0;
	}

}
