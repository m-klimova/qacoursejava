// First line lists the package where this class is
package lectures;

//We may need to import another library or class in our class.
//We use import keyword like this one:
import java.util.Scanner;
import java.util.Arrays;

// This is how we open/declare our class
// This one is public followed by reserved word "class" and valid name
// followed by curly braces "{}"
// We have opening { and closing }
// Everything between them is part of the class
public class Explanations {
	// We declare a class variable:
	// [access modifier] [type] [name];
    public int myAge;
    
    // We can declare and give our variable an initial value on one line:
    public String name = "MyName";

    // We declare a class method:
    // [access modifier] [type-of-returned-value] [name] 
    // and () - this indicates this is a method to the compiler
    // When the brackets () are empty -> our method do not use parameters
    // Again we have opening and closing {}
    public void MyTestMethod()
    {
        // Everything between method's curly braces belongs to the method
    	
    	// Now I will call my other class and create an instance of it
    	// i.e. I will create an object of it
    	MyFirstJavaClass objectOfOuterClass = new MyFirstJavaClass();
    	
    	// If access modifiers allow we can invoke object's properties and methods
    	// and some more:
    	objectOfOuterClass.calculateWeeklyHours();
    	// Not allowed - NAME is private property
    	// objectOfOuterClass.NAME;
    	
    }
} // Closing brace of the class - now the compiler knows our class finishes here
