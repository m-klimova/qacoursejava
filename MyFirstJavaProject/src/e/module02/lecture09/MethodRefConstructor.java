package e.module02.lecture09;

@FunctionalInterface 
interface Draw {  
	Rectangle draw(String side);  
}  

class Rectangle {
	public Rectangle(String side){  
		System.out.print(side);  
	}  
}

public class MethodRefConstructor {  
	public static void main(String[] args) { 
		//Method reference to a constructor
		//Rectangle rect = new Rectangle("sdss");
		Draw ref = Rectangle::new;  
	    ref.draw("Interface method");  
	}  
}
