package lectures;

class Lecture06 {
	// instance variable with name string01 of reference type String
	String string01 = "This is one";
	/*
	 * Reference string01 in Stack memory --> pointing to heap memory in string pool
	 * that contains literal This is one
	 */
	
	String string02 = "This is two";
	
	String string03 = "This is one";
	
	// string01 == string03 --> compare memory addresses
	
	/*
	 * String hello = "Hello You!";
	 * |H|e|l|l|o| |Y|o|u|!|
	 * |0|1|2|3|4|5|6|7|8|9| - indexes
	 * 
	 * 
	 */
}

class Lecture06Demo {
	
	public static void main(String [] args) {
		Lecture06 lecture06 = new Lecture06();
		
		System.out.println(lecture06.string01.charAt(2));
		
		// Arithmetic operators
		int a = 10;
		int b = 20;
		// local variable sum of type int
		int sum = a + b; 
		System.out.println(sum);
		
		int divide = b / a;
		System.out.println(divide);
		int remainder = b % a;
		System.out.println(remainder);
		
		int myInt = 30;
		int test = ++myInt;
		
		// Pre-increment: value of the variable is incremented by 1 and then returned
		// Post-increment: original value of the variable is returned and then incremented by 1
		
		int var01 = 5, var02 = 5;
		System.out.println("Post-increment:" + (var01++));
		System.out.println("New value after post-increment:" + (var01));
		System.out.println("Pre-increment:" + (++var02));
		
		// myInt += 6;
		System.out.println("Test is: " + test);
		
		System.out.println(a == b);
		
		System.out.println(a < b);
		
		// == for String 
		String s1 = "test";
		String s2 = "test1";
		String s3 = "test";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		// s1.equals(s2);

		int bitOne = 60;
		// 00111100
		int bitTwo = 13;
		// 00001101
		
		int result = bitOne & bitTwo;
		// 00001100
		System.out.println(result);
		
		// a = 10; b = 20; myInt = 30
		if(a < b || b < myInt) {
			System.out.println("a < b || b < myInt"); 
		}
		
		if(!(a > b)) {
			System.out.println("!(a > b)");
		}
		
		int resultOne = (a > b) ? 1000 : -1000;
		System.out.println(resultOne);
		
		String testStr = "ksdhsjsdfjhdfj";
		
		System.out.println(testStr instanceof String);
		
		System.out.println(10 + 30 * (2 / 4));
		
		// decision making - if, if-else, switch
		// if - ako uslovieto e true, to izpulni koda v {}
		if(a < b) {
			b = 100; 
			System.out.println("IF statement is TRUE");
		}
		
		// if true - izpulni edno, else izpulni drugo
		if(a > b) {
			System.out.println("IF statement is TRUE");
		} else {
			System.out.println("ELSE statement is FALSE");
		}
		
		int age = 19;
		boolean canDrive = false;
		boolean canDrink = false;
		
		if(age < 18) {
			canDrive = false;
		} else if (age >= 18 && age < 21) {
			canDrive = true;
			canDrink = false;
		} else {
			canDrive = true;
			canDrink = true;
		}
        System.out.println(canDrive + ":" + canDrink);
        
        switch(age) {
        case 19:
        	canDrive = true;
			canDrink = false;
			break;
        case 18:
        	canDrive = false;
			canDrink = false;
			break;
        default:
        	canDrive = true;
			canDrink = true;
        }
        
        System.out.println(canDrive + ":" + canDrink);
        
        // while loop -> condition is at the beginning of the loop
        // if condition is false --> loop may not be executed at all
        
        while(age < 21) {
        	System.out.println("age: " + age);
        	age += 1;
        }
        
        // do - while loop -> executed at least once since condition is checked after the body of the loop
        
        do {
        	System.out.println("do-while: age: " + age);
        	age += 1;
        } while(age < 26);
        
        // for loop
        
        for(int i = 0; i < 15; i++) {
        	if(i == 3) continue;
        	System.out.println("my number is: " + i);
        	if(i == 8) break;
        	// break & continue
        }
        
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        
        for(String dayName : days) {
        	System.out.println("Days ==> "+ dayName);
        }
        
        for(int index = 0; index < days.length; index++) {
        	System.out.println("Normal for: Days ==> "+ days[index]);
        }
        
     }
	
}