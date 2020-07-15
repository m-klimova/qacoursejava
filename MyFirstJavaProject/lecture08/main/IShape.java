package main;

public interface IShape {
	
	double iCalculateArea(); // this is an abstract method
	// public or abstract
	
	default void draw() {
		// default code
	}
	
	static void myMethod() {
		// your code comes here
	}
}
