package a.module02.lecture04;

import java.util.Scanner;

public class MyFirstJavaClass {
	
	// This is an instance private variable for our Java class 
	// it cannot be accessed from outside
	private String NAME = "test";
	
	// A Java program has only one starting point - the main method
	// The JVM search for it and executes everything in its body, i.e.
	// all code lines (statements) between { and }
	// main method is always declared the same way - its signature is always the same
	// signature: line 16
	public static void main(String[] args) {
		calculateWeeklyHours();
	}
	
	/*
	 * 1. Enter how many days you are working per week
	 * 2. Enter how many hours you are working per day
	 * 3. Enter your hourly salary
	 * 4. Return and print your weekly salary
	 */
	public static void calculateWeeklyHours() {
		/*
		 * We use built-in Java class System to output, to write some data on the IDE's console.
		 * In order to read from the same console data provided by user we 
		 * are using another built-in class Scanner which can be instantiated.
		 * I.e. we create an object of Scanner class with keyword "new"
		 */
		
		Scanner scannerObject = new Scanner(System.in);
		
		
		System.out.println("Enter how many days you are working per week:");
		int days = scannerObject.nextInt();
				
		System.out.println("Enter how many hours you are working per day:");
		double hoursPerDay = scannerObject.nextDouble();
		
		System.out.println("Enter salary per hour:");
		double salaryPerHour = scannerObject.nextDouble();
		
		System.out.println("Closing the scanner...");
		scannerObject.close();
		
		double salary = days * hoursPerDay * salaryPerHour;
		System.out.println("Our weekly salary is: " + salary);
		
		// Hint for Homework:
		// String petName = scannerObject.nextLine();
		
	}
	
	// this is another method in our Java class file
	private static void test() {
		System.out.println("This is inside TEST method!");
	}

}
