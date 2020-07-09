package solutions.test;

import solutions.main.Solution03;

public class TestSolution03 {

	public static void main(String[] args) {
		// Create an object of class Solution02
		// and call its instance methods to test them
		// All instance methods are not static so we have to create an instance of class Solution02
		// to have access to them
		Solution03 solution03 = new Solution03();
		
		int dayOfWeek = 6;
		String weekDay = solution03.checkWhichWeekDay(dayOfWeek);
		System.out.printf("%d : %s\n\n", dayOfWeek, weekDay);
		
		String localString = "This is my test string. Let's see what break will happen";
		solution03.printWordsInString(localString + "\n\n");
		
		String toReverse = "This to be reversed!";
		// Now we will call our method but inside the println method
		// Actually we will call the reverseString() method and print its return value
		System.out.println(solution03.reverseString(toReverse) + "\n\n");
		
		int[] intArray = {0, 34, 567, 15, 9, 56, 30, 34536};
		solution03.manipulateIntArray(intArray);

	}

}
