package g.module02.lecture11.p01;

public class WorkerOnFirstFloor extends Employee {
	Double salary = 678.89;
	
	WorkerOnFirstFloor() {
		super();
		// code for child constructor goes next
	}
	
	void print() {
		System.out.println("Worker salary: " + this.salary);
		System.out.println("Employee salary: " + super.salary);
	}
	
	void checkIn() {
		super.checkIn();
		System.out.println("checkIn in WorkerOnFirstFloor");
	}
	
}
