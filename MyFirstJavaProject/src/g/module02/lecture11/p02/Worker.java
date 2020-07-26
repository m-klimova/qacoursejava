package g.module02.lecture11.p02;

public class Worker {
	public String name = "name";
	
	protected String address = "address";
	
	double salary = 4589.0; // default access modifier will be applied
	
	private String title = "Mr.";
	
	public double returnSalary() {
		System.out.println("Worker Public method");
		return 3.14;
	}
	
	protected int returnOne() {
		System.out.println("Worker Protected method");
		return 1;
	}
	
	void print() {
		System.out.println("Worker Default method");
	}
	
	private void myMethod() {
		System.out.println("Worker Private method");
	}

}
