package homeworks;

import java.util.Scanner;

public final class Homework02 {
	/*
	 * 1. Replace a substring in another string with some text
	 * Example: In string "My Name is Test" replace "Test" with your name
	 * 		use replace(); replaceAll();
	 * 
	 * 2. Compare two strings if they are equal
	 * 		use compareTo(); compareToIgnoreCase(); equals(); equalsIgnoreCase();
	 * 
	 * 3. How many worlds you have in a string?
	 * 		use split();
	 * 		
	 * 4. Combine 2 or more Strings into one and print it
			use concat();
	 */
	
	// Method named replaceMyString(String string) with return type void
	// and public access modifier
	// 1. Replace a substring in another string with some text
	public static String replaceMyString(String myString, String textToReplace, String replacement) {
		// TODO: Your code comes here
		return myString.replaceAll(textToReplace, replacement);
		
	}
	
	/*
	 * How many worlds you have in a string?
	 * 		use split();
	 */
	public static int numberOfWords(String myString) {
		// local variable for method numberOfWords(String myString) of type String[]
		// array of String - masiv ot stringove
		String[] arrayOfString = myString.split(" ");
		
		return arrayOfString.length;
		
	}
	
	// method which returns the sum of its two parameters
	public int sumOfInts(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		// local variable scanner of type Scanner - it is an object of class Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Return number of words in a string
		System.out.println("Enter string to be modified: ");
		String strToCount = scanner.nextLine();
		
		scanner.close();
		
		System.out.println("Number of words in \"" + strToCount + "\" is: " + 
				+ numberOfWords(strToCount));
		
		// Replacing a substring
		// System.out.println("Enter string to be modified: ");
		// local variable for main method strToModify of type String
		// String strToModify = scanner.nextLine();
		//System.out.println("Enter string to be replaced: ");
		//String strToReplace = scanner.nextLine();
		//System.out.println("Enter replacement string: ");
//		String replacement = scanner.nextLine();
//		
//		scanner.close();
//		
//		String result = replaceMyString(strToModify, strToReplace, replacement);
//		
//		System.out.println("The string \"" + strToModify + "\" has been changed to \"" + result + "\"");
//		
	}

}
