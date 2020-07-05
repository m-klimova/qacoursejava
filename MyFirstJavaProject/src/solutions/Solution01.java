package solutions;

import java.util.Scanner;
import homeworks.*;

public class Solution01 {
	
	public static void main(String[] args) {
		// this calls class Solution01 instance method
		messageAboutMyPet();
		
		// this creates an object of class Homework01
		// and calls its instance method
		Homework01 homework01 = new Homework01();
		homework01.messageAboutMyPet();
		
	}
	
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
