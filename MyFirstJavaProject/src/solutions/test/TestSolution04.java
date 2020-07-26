package solutions.test;

import solutions.main.*;

public class TestSolution04 {

	public static void main(String[] args) {
		
		// Since our Solution01 instance method is a static one
		// we can call it via the class itself
		// i.e. it is not needed to create an instance(object) of this class
		Solution04.messageAboutMyPet();
		
		Solution06.printWordsInString("sdf");
	}
}
