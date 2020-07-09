package solutions.main;

public class Solution02 {

	// Method named replaceMyString(String string) with return type void
	// and public access modifier
	// Replace a substring in another string with some text
	public String replaceMyString(String myString, String textToReplace, String replacement) {
		// TODO: Your code comes here
		return myString.replaceAll(textToReplace, replacement);
	}
	
	/*
	 * How many worlds you have in a string?
	 * 		use split();
	 */
	public int numberOfWords(String myString) {
		// local variable for method numberOfWords(String myString) of type String[]
		// array of String - masiv ot stringove
		String[] arrayOfString = myString.split(" ");
		
		return arrayOfString.length;
	}
	
	/*
	 * Compare two strings if they are equal
	 * 		use compareTo(); compareToIgnoreCase(); equals(); equalsIgnoreCase();
	 */
	public boolean compareStrings(String firstString, String secondString) {
		// We will use a built-in methods for String
		
		// 1. Compare they hold the same text even in different case
		// return firstString.compareToIgnoreCase(secondString);
		
		// 2. Compare and return true only if they match per case as well
		// return firstString.compareTo(secondString);
		
		// 3. Return true if the argument (in this case secondString) is:
		// - not null (empty Object)
		// - of type String
		// - its value is the same (i.e. the sequence of characters that this object holds)
		// - both String values match by case as well
		// return firstString.equals(secondString);
		
		// 4. Return true if the argument (in this case secondString) is:
		// - not null (empty Object)
		// - of type String
		// - its value is the same (i.e. the sequence of characters that this object holds)
		return firstString.equals(secondString);
	}
	
	/*
	 * Combine 2 or more Strings into one and print it
	 *	use concat();
	 */
	public String concatenate(String[] strArray) {
		// Declare local variable of type String
		// Initialise it with "" - empty String
		// it will be returned by this method
		// It is good to start with an empty value to make sure your method operates correctly
		String result = "";
		for(String entity: strArray) {
			// We are adding a space after each String to be more readable
			result = result.concat(entity + " ");
		}
		// With this statement we return a value as a result of our method
		// when a "return" is found, our method stops execution
		return result;
	}

}
