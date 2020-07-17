package e.module02.lecture09;

import org.omg.CORBA.ARG_IN;

public class TestMyTest {

	public static void main(String[] args) {
		Test myObject = new Test();
		
		AcademicRank ar = AcademicRank.DOCENT;
		
		String text = "Elinka";
		myObject.setName(text);
		
		int num = 10 + 10;
		
		String myName = myObject.getName();
		
		System.out.println(myName);
	}

}
