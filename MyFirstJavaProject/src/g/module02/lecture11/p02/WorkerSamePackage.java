package g.module02.lecture11.p02;

public class WorkerSamePackage {
	
	public static void main(String[] args) {
		
		Worker worker = new Worker();
		System.out.println(worker.address);
		System.out.println(worker.name);

		System.out.println(worker.salary);
		
		// System.out.println(worker.title); --> it's a private variable

		worker.returnOne();
		worker.returnSalary();
		worker.print();
		// worker.myMethod();  --> it's a private method
	}

}
