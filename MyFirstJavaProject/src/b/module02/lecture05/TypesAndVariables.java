package b.module02.lecture05;

public class TypesAndVariables {

	public static void main(String[] args) {
		// This is example of a local variable inside a method
		// It can be accessed and used only in this method
		double numTwo = 23.4345322;
		
		// Boxing: wrapping a primitive type in corresponding wrapper class
		Double boxed = Double.valueOf(numTwo);
		Double fromString = Double.valueOf("3.4");
		
		// Unboxing: extracting value of a Wrapper object
		// and passing it to a primitive type variable
		int a = fromString.intValue();
		
		System.out.println(Integer.MAX_VALUE);
	
		String myString = "Hwoello world";

		String replaced = myString.replaceAll("wo", "--");
		System.out.println(replaced);
		System.out.println(myString.length());
		
		System.out.printf("Print double with 3 precision: %.3f\n And new line", numTwo);
		System.out.printf("Convert Double to int: %d", Double.valueOf(numTwo).intValue());

	}
	
	private void test() {
		// This is example of a local variable inside a method
		int myInt = 0;
		myInt = myInt + 3;
		
		Integer numTwo = 5;
		
	}

}
