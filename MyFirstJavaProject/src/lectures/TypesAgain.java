package lectures;

class TypesAgain {

	public static void main(String[] args) {
		byte byteVar = 123;  
		short shortVar = 1234;  
		int intVar = 123456;         
		long longVar = 1874632572L; 	// Must end with l or L
		float floatVar = 123.45f; 		// Must end with f or F
		double doubleVar = 345.1234d; 	// d or D is optional 
		double doubleVar2 = 125.67;
		boolean booleanVar = true;   
		char charVar = 65; 				// code for A 
		char charVar2 = 'C';

		// Incorrect declaration
		// long longVar2 = 34287; 		// Must end with l or L
		// float floatVar2 = 123.45; 	// Must end with f or F

		// myType is of Object (Reference) type
		TypesAgain myType = new TypesAgain(); 

		System.out.println("byteVar = " + byteVar);  
		System.out.println("shortVar = " + shortVar); 
		System.out.println("intVar = " + intVar); 
		System.out.println("longVar = " + longVar); 
		System.out.println("floatVar = " + floatVar);    
		System.out.println("doubleVar = " + doubleVar);
		System.out.println("doubleVar2 = " + doubleVar2);   
		System.out.println("booleanVar = " + booleanVar);     
		System.out.println("charVar = " + charVar);   
		System.out.println("charVar2 = " + charVar2);
		// Here we are not sure of the result - it depends on the system
		System.out.println("myType = "+ myType.toString());
	}

}
