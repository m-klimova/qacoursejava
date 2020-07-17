package solutions.main;

public class Solution06 {
	
	// Method takes an int as argument and returns corresponding weekday as String
	public String checkWhichWeekDay(int dayOfWeek) {
		switch(dayOfWeek) {
			case 1:
				return "Monday";
			case 2:
				return "Tuesday";
			case 3:
				return "Wednesday";
			case 4:
				return "Thursday";
			case 5:
				return "Friday";
			case 6:
				return "Saturday";
			case 7:
				return "Sunday";
			default:
				return "Which day!?!??!";
		// closing switch statement
		}
	// closing method body
	}
	
	// Method that prints every single word of a String passed as argument
	// If the word is break, abort the execution
	public static void printWordsInString(String myString) {
		// Create a local variable of type Array of String
		// to hold all words of the argument string which we get by splitting the String by space
		String[] arrayOfWords = myString.split(" ");
		
		// create a local variable index of type int with initial value of 0
		// we will use it to iterate over our Array
		int index = 0;
		// we start a cycle over Array of words
		// its condition is a boolean check of the current word is equal to "break"
		// - if it is: we do not start the cycle iteration
		// - if it is not: we print it
		while(!arrayOfWords[index].equals("break")) {
			System.out.printf("Current word is: %s\n", arrayOfWords[index]);
			// In order to move to the next word in the array we increment our index
			index++;
		}
	}
	
	// Write a method that returns a String in reverse order
	public String reverseString(String myString) {
		
		String result = "";
		
		for(int i = myString.length() - 1; i >= 0; i--) {
			result = result + myString.charAt(i);
		}
		return result;
		
		/*
		 * Another option is to use built-in class StringBuilder:
		 * 
		 * 
		 *  StringBuilder stringBuilder = new StringBuilder();
 			for(int i = myString.length() - 1; i >= 0; i--) {
 				stringBuilder.append(myString.charAt(i));
			}
			return stringBuilder.toString();
			*/
	}
	
	/* Write a method that takes an Array of Int as argument and if a number in the array % 2 == 0, 
	 * multiplies it by 3 and prints it
	 * Hint: 	int ourIntArray = {0, 56, 345, 2, 34, 2};
	 */
	public void manipulateIntArray(int[] intArr) {
		for(int entity : intArr) {
			if(entity % 2 == 0)
				System.out.printf("Old number: %d; New number: %d\n", entity, entity * 3);
		}
	}
	
// closing class body
}
