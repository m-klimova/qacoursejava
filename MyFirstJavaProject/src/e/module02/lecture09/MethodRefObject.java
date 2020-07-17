package e.module02.lecture09;

@FunctionalInterface 
interface Shape {  
    void draw();  
}  

public class MethodRefObject {

	public void drawNow(){  
		System.out.println("Draw rectangle");  
	} 
	
    public static void main(String[] args) {  
    	MethodRefObject rect = new MethodRefObject();   
		// Method reference using the object of the class
    	Shape ref = rect::drawNow;  
		// Calling the method of functional interface  
		ref.draw();  
	}
}
