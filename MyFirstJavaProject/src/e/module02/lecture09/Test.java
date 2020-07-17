package e.module02.lecture09;

public class Test {
	
	String name;
	
	public void getA() {
		AcademicRankTestWithMain myObject = new AcademicRankTestWithMain(AcademicRank.ASSISTANT_PROFESSOR);
		
		myObject.get();
	}
	
	public void setName(String myName) {
		this.name = myName;
	}
	
	public void setName() {
		this.name = "Test";
	}

	public String getName() {
		return this.name;
	}

}
