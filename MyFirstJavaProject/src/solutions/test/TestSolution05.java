package solutions.test;

import solutions.main.Solution05;

public class TestSolution05 {

	public static void main(String[] args) {

		// Create an object of class Solution02
		// and call its instance methods to test them
		// All instance methods are not static so we have to create an instance of class Solution02
		// to have access to them
		Solution05 solution02 = new Solution05();
		
		// test method for replacing a text in a String with another text
		String result = solution02.replaceMyString("This is my test string", "test", "JAVA");
		System.out.println(result + "\n");
		
		// test method for returning number of words in a String based on space as delimiter
		int numOfWords = solution02.numberOfWords("This is my test string");
		System.out.printf("Number of words is: %d\n\n", numOfWords);

		
		// test method that compares two Strings:
		// - check implementation of the method to see options of comparison
		boolean areEqual = solution02.compareStrings("This is my test String", "This is NOT my test String");
		System.out.printf("Strings compared result: " + areEqual);
		
		// test method that concatenates several String objects that are passed as
		// argument to the method as Array of String
		// - first: create a local variable of type Array of String
		String[] strArray = {"This is my test", "String", "I'm", "using for my", "homework!"};
		// - second: call the method
		String newString = solution02.concatenate(strArray);
		System.out.printf("\n\nNew string is: \n%s", newString);
	}

}
