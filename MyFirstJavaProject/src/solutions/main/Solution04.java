package solutions.main;

import java.util.Scanner;

public class Solution04 {
	
	// Provide name and favourite action of your pet
	// And print them in a readable manner
	public static void messageAboutMyPet() {
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.println("Enter what is your pet's name:");
		String name = scannerObject.nextLine(); 
				
		System.out.println("Enter what is your pet's favourite activity:");
		String activity = scannerObject.nextLine();
				
		scannerObject.close();
								
		String message = name + (" likes ") + activity;
		System.out.println(message);
		
		// OR
		// System.out.println("%s likes %s", name, activity);
	}
}
