package main;

public class Multiply {

	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static int multiply(int a, int b, int c) {
		return a * b *c;
	}
	
	public static double multiply(double a, double b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		Multiply multiplyObj = new Multiply();
		
		multiplyObj.multiply(2.3, 2.4);
		multiplyObj.multiply(1, 34);
	}
}
