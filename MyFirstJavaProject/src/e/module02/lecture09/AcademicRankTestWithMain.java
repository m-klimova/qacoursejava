package e.module02.lecture09;

public class AcademicRankTestWithMain {
	
	// instance variable of type AcademicRank
	AcademicRank academicRank;
	
	// parametrised constructor
	AcademicRankTestWithMain(AcademicRank rank) {
		this.academicRank = rank;
	}
	
	public void get() {
		System.out.println(this.academicRank);
	}

	public static void main(String[] args) {
		AcademicRank ar = AcademicRank.ASSISTANT_PROFESSOR;
		System.out.println(ar.getSalary());
		
		AcademicRankTestWithMain myObject = new AcademicRankTestWithMain(ar);
		//AcademicRankTestWithMain fail = new AcademicRankTestWithMain();
		myObject.get();
		
		for(AcademicRank ar1 : AcademicRank.values()) {
			System.out.println(ar1);
		}
		
	}
		
}