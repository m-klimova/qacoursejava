package g.module02.lecture11.p03;

import g.module02.lecture11.p02.Worker;

public class WorkerDiffPackageExt extends Worker {
	
	public void testProtectedFromParent() {
		
		System.out.println("Access Parent Public variable: " + this.name);
		System.out.println("Access Parent Protected variable: " + this.address);
		
		// call public method of Parent Class
		this.returnSalary();
		// call protected method of Parent Class
		this.returnOne();
	}

}
